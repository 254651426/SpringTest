package com.yangjie.test;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yangjie.dao.UserDao;
import com.yangjie.entity.User;
import com.yangjie.service.UserService;

public class Test2 extends Thread {

	public static void main(String[] args) throws Exception {
		final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-*.xml");
		context.start();
		UserService user = context.getBean(UserService.class);
		UserService user1 = context.getBean(UserService.class);
		User u = user.getUser(2);
		User u1 = user1.getUser(2); 
	}

}
