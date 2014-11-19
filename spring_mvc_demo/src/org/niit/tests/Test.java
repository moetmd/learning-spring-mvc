package org.niit.tests;

import org.niit.dao.UserDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext  ctx=new ClassPathXmlApplicationContext("config/applicationContext.xml");
		
		
		UserDAO d=(UserDAO) ctx.getBean("userdao");
		System.out.println(d.findAll());
	}

}
