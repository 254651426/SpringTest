package com.yangjie.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yangjie.service.UserService;

public class Test extends Thread {

	@Override
	public void run() {
		final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-*.xml");
		context.start();
		UserService user = (UserService) context.getBean(UserService.class);
		// System.out.println(UserService.class);
		// System.out.println(context.containsBean("user"));
		// 创建一个静态钥匙
//		Object ob = "aa";// 值是任意的
//		synchronized (ob) {
			if (user.show()) {
				user.add();
			} else {
				System.out.println("已存在添加失败");
			}
//		}

	}

	public static void main(String[] args) {
		
		new Test().start();
		new Test().start();
		new Test().start();
		new Test().start();
		new Test().start();
		new Test().start();
		new Test().start();
		new Test().start();
	}
}
