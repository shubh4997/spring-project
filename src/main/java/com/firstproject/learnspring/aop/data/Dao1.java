package com.firstproject.learnspring.aop.data;

import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {

	public String retrieveSomething() {
		return "Dao1";				
	}
}
