package com.cgt.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgt.bean.UserAddress;
import com.cgt.service.OrderService;
import com.cgt.service.UserService;


/** 
* @author : caoguotao
* @date 创建时间：2019年5月24日 上午10:07:26 
* @version 1.0 
* @parameter  
* @since  
* @return  
*/
/**
 * 1. 将服务提供者注册到注册中心
 * 		1）导入dubbo依赖
 * 2. 让服务消费者去注册中心订阅服务提供者的服务 
 * @author 16213
 *
 */
@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
	UserService userService;
	public void initOrder(String userId) {
		System.out.println("用户ID:" + userId);
		//1.查询用户的收货地址
		List<UserAddress> addressList = userService.getUserAddressList(userId);
		for (UserAddress userAddress : addressList) {
			System.out.println(userAddress.getUserAddress());
		}
		
		
	}

}
