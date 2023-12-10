package com.javabykiran.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javabykiran.dao.LoginDAO;
import com.javabykiran.entity.User;

@Service
public class LoginService {

	@Autowired
	LoginDAO dao;

	public boolean validate(User user) {
		String dbPassword = dao.getPassword(user.getUsername());
		if (dbPassword == null)
			return false;

		if (dbPassword.equals(user.getPassword())) {
			return true;
		} else {
			return false;
		}
	}

}