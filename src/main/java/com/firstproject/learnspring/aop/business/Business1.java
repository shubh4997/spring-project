package com.firstproject.learnspring.aop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstproject.learnspring.aop.data.Dao1;

@Service
public class Business1 {
	
	@Autowired
	Dao1 dao1;
	public String calculate() {
		return dao1.retrieveSomething();
	}
}
