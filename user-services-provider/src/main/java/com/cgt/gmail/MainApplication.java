package com.cgt.gmail;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
* @author : caoguotao
* @date 创建时间：2019年5月24日 上午10:44:37 
* @version 1.0 
* @parameter  
* @since  
* @return  
*/
public class MainApplication {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("provider.xml");
		ioc.start();
		
		System.in.read();
	}

}
