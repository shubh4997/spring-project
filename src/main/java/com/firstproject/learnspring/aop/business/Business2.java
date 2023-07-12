package com.firstproject.learnspring.aop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstproject.learnspring.aop.data.Dao2;

@Service
public class Business2 {
	
	@Autowired
	Dao2 dao2;
	public String calculate() {
		return dao2.retrieveSomething();
	}
}
