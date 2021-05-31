package com.spring.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		//ApplicationContext 인터페이스 
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"classpath:META-INF/spring.xml"); 
						//id값      //리턴하는타입
		MiTv tv1 = ctx.getBean("mitv", MiTv.class);//주소값을 얻어오는거
		//MiTv tv2 = ctx.getBean("mitv", MiTv.class);//주소값을 얻어오는거
	
		tv1.volumeUp();
		
		
	}

}
