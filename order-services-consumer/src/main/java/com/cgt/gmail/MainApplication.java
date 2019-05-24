package com.cgt.gmail;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cgt.service.OrderService;


/** 
* @author : caoguotao
* @date 创建时间：2019年5月24日 上午11:00:07 
* @version 1.0 
* @parameter  
* @since  
* @return  
*/
public class MainApplication {

	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext applicationContext =  new ClassPathXmlApplicationContext("consumer.xml");
		OrderService orderService = applicationContext.getBean(OrderService.class);
		orderService.initOrder("1");
		
		System.in.read();
	}

}
