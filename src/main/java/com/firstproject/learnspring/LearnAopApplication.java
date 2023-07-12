package com.firstproject.learnspring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.firstproject.learnspring.aop.business.Business1;
import com.firstproject.learnspring.aop.business.Business2;

@SpringBootApplication
public class LearnAopApplication implements CommandLineRunner{

	private Logger logger= LoggerFactory.getLogger(LearnAopApplication.class);
	
	@Autowired
	Business1 business1;
	
	@Autowired
	Business2 business2;
	
	public static void main(String[] args) {
		SpringApplication.run(LearnAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info(business1.calculate());
		logger.info(business2.calculate());
		
	}

}
