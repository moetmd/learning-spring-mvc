package org.niit.dao;

import java.util.List;

import org.niit.entity.User;

public interface UserDAO {
	List<User> findAll();
	
	
}
