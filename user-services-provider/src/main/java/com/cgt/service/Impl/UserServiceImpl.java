package com.cgt.service.Impl;

import java.util.Arrays;
import java.util.List;

import com.cgt.bean.UserAddress;
import com.cgt.service.UserService;

/** 
* @author : caoguotao
* @date 创建时间：2019年5月24日 上午9:58:44 
* @version 1.0 
* @parameter  
* @since  
* @return  
*/
public class UserServiceImpl implements UserService{

	public List<UserAddress> getUserAddressList(String userId) {
		UserAddress address1 = new UserAddress(1, "北京市", "1", "李老师",
				"010-56253825", "Y");
		UserAddress address2 = new UserAddress(2, "深圳市", "1", "王老师",
				"010-56253835", "Y");
		return Arrays.asList(address1, address2);
	}

}
