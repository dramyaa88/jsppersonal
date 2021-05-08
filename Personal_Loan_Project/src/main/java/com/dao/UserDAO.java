package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.util.HibernateUtil;
import com.pojo.NewUser;



public class UserDAO {
	
	public void saveUser(NewUser user) {
		Session session = HibernateUtil.openSession();
		Transaction transaction = null;
		try  {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.save(user);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	
	public void updateUser(NewUser user) {
		Session session = HibernateUtil.openSession();
		Transaction transaction = null;
		try  {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.update(user);;
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	
	public void deleteUser(int id) {
		Session session = HibernateUtil.openSession();
		Transaction transaction = null;
		try  {
			// start a transaction
			transaction = session.beginTransaction();

			// Delete a user object
			NewUser user = (NewUser) session.get(NewUser.class, id);
			if (user != null) {
				session.delete(user);
				System.out.println("user is deleted");
			}

			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	
	public NewUser getUser(int id) {
		
		Session session = HibernateUtil.openSession();
		Transaction transaction = null;
		NewUser user = null;
		try  {
			// start a transaction
			transaction = session.beginTransaction();
			// get an user object
			user = (NewUser) session.get(NewUser.class, id);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return user;
	}
	
	@SuppressWarnings("unchecked")
	public List<NewUser> getAllUser() {

		Session session = HibernateUtil.openSession();
		Transaction transaction = null;
		List<NewUser> listOfUser = null;
		try  {
			// start a transaction
			transaction = session.beginTransaction();
			
			
			
			
			
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return listOfUser;
	}

}
//listOfUser = session.createQuery("from login").getResultList();