package org.niit.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.niit.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

@Component("userdao")
public class UserDAOImpl implements UserDAO{

	@Autowired
	private SessionFactory sessionFactory;
	private HibernateTemplate ht = null;
	
	public void setSessionFactory( SessionFactory sessionFactory){
		this.sessionFactory =  sessionFactory;
	}
	
//	private HibernateTemplate getHibernateTemplate(){
//		
//		if(ht == null){
//			ht = new HibernateTemplate(sessionFactory);
//		}
//		return ht;
//	}
	
//	public List<User> findAll(){
//		sessionFactory.getCurrentSession();
//		
//		
//		return getHibernateTemplate().find("from User");
//	}
	
	@Override
	public List<User> findAll() {
		
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		List<User> list = session.createCriteria(User.class).list();
		session.getTransaction().commit();
		
		return list;
	}
	
	
	
	
}
