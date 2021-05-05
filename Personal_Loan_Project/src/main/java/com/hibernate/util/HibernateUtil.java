package com.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.SessionFactoryRegistry;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.pojo.login;

//import demo.model.Admin;

public class HibernateUtil {
	static Configuration con;
	static ServiceRegistry sr;
	static SessionFactory sf;
	static Session session;
 
    static {
        try {
        	
        	con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(login.class);
        	sr = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        	sf =con.buildSessionFactory(sr);
    		System.out.println("session is created....");
    		
        } catch (Throwable ex) {
        	
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
            
        }
    }
 
    public static Session openSession() {
        return sf.openSession();
    }
}
