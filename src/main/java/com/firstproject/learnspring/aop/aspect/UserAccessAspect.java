package com.firstproject.learnspring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import com.firstproject.learnspring.LearnAopApplication;

@Aspect
@Configuration
public class UserAccessAspect {

	private Logger logger= LoggerFactory.getLogger(this.getClass());
	
	@Before("execution(* com.firstproject.learnspring.aop.business.*.*(..))")
	public void before(JoinPoint joinPoint) {
		//advice
		//combination of point cut and advice is called aspect
		logger.info("Check for user access");
		logger.info("Intercepted method call -{}", joinPoint);
	}
}
