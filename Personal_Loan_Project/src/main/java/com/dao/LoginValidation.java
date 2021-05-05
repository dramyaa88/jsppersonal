package com.dao;

import java.sql.*;

import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.util.HibernateUtil;

import com.pojo.login;

public class LoginValidation {
	
	public boolean authenticateUser(String userId, String password) {
        //login admin = getAdminbyAdminId(userId); 
		Session session = HibernateUtil.openSession();
		session.beginTransaction();
		Query query = session.createQuery("from personal where uname = "+userId);
		login admin = (login) query.uniqueResult();
		session.getTransaction().commit();
        if(admin!=null && admin.getUname().equals(userId) && admin.getPassword().equals(password)){
            return true;
        }else{
            return false;
        }
        
    }
 
//    public login getAdminbyAdminId(String userId) {
//        Session session = HibernateUtil.openSession();
//        Transaction tx = null;
//        login admin = null;
//        try {
//            tx = session.beginTransaction();
//            Query query = session.createQuery("from login where uname="+userId);
//            admin = (login)query.uniqueResult();
//            tx.commit();
//        } catch (Exception e) {
//            
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }
//        return admin;
//    }

}
