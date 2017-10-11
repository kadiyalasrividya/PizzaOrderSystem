package com.yash.daoimpl;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.yash.dao.UserDetailsDao;
import com.yash.util.HibernateUtil;
import com.yash.model.UserDetails;

public class UserDetailsDaoImpl implements UserDetailsDao {

	@Override
	public boolean insertUser(UserDetails userDetails) {
		Session session = HibernateUtil.openSession();
		if (isUserExist(userDetails))
			return false;
		Transaction tx = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			session.saveOrUpdate(userDetails);
			tx.commit();
		} catch (HibernateException ex) {
			if (tx != null) {
				tx.rollback();
			}
			ex.printStackTrace();
		} finally {
			session.close();
		}
		return true;
	}

	@Override
	public boolean isUserExist(UserDetails userDetails) {
		Session session = HibernateUtil.openSession();
		boolean result = false;
		Transaction tx = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			Query query = session.createQuery("from UserDetails where loginName='" + userDetails.getLoginName() + "'");
			UserDetails user = (UserDetails) query.uniqueResult();
			tx.commit();
			if (user!= null)
				result = true;
		} catch (HibernateException ex) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}
		return result;
	}

	@Override
	public UserDetails getUserById(String loginName) {
		Session session = HibernateUtil.openSession();
		Transaction tx = null;
		UserDetails userDetails = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			Query query = session.createQuery("from UserDetails where loginName='" + loginName + "'");
			userDetails = (UserDetails) query.uniqueResult();
			tx.commit();
		} catch (HibernateException ex) {
			if (tx != null) {
				tx.rollback();
			}
			ex.printStackTrace();
		} finally {
			session.close();
		}
		return userDetails;
	}

}
