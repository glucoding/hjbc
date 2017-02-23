package com.hejiascm.blockchain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.hejiascm.domain.User;
import com.ibm.crl.bc.hejia.sdk.SdkFactory;
import com.ibm.crl.bc.hejia.sdk.common.BlockchainException;
import com.ibm.crl.bc.hejia.sdk.common.Property;
import com.ibm.crl.bc.hejia.sdk.user.UserInfo;
import com.ibm.crl.bc.hejia.sdk.user.UserProxy;
import com.ibm.crl.bc.hejia.sdk.util.PropertySerializer;

@Component("BcUserDAO")
public class BcUserDAOImpl implements BcUserDAO {

	@Override
	public int bcAdd(User u) {
		// get the organization proxy object for 平台管理员
        UserProxy userProxy = null;
        UserInfo ui = null;
         Map<String,String> propMap = new HashMap<String,String>();
         propMap.put("toBeDecided", u.getToBeDecided());
        Property[] properties = PropertySerializer.toProperties(propMap);
        
        
		try {
			userProxy = SdkFactory.instance.getUserProxy("admin");
			ui = userProxy.add(u.getName(), 
																	  u.getOrgId(), 
																	  u.getRoles(), 
																	  properties);
		} catch (BlockchainException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(ui != null)
			return 1;
		return 0;
	}

	@Override
	public void bcDelete(String orgId, String name) {
		try {
			UserProxy userProxy = SdkFactory.instance.getUserProxy("admin");
			userProxy.delete(orgId, name);
		} catch (BlockchainException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<User> bcGetAll(String orgId) {
		// get the organization proxy object for 平台管理员
        UserProxy userProxy = null;
        UserInfo ui = null;
        UserInfo[] uis = null;
		try {
			userProxy = SdkFactory.instance.getUserProxy("admin");
			uis = userProxy.getAll(orgId);
		} catch (BlockchainException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<User> us = new ArrayList<User>();
		for(int i = 0; i < uis.length-1; i++){
			User u = new User();
			u.setName(uis[i].getName());
			u.setOrgId(uis[i].getOrgId());
			u.setRoles(uis[i].getRoles());
			Map<String, String> map = PropertySerializer.fromProperties(uis[i].getProperties());
			u.setName(map.get("toBeDecided"));
			us.add(u);
		}
		
		return us;
	}

	@Override
	public User bcGetOne(String orgId, String name) {
		// get the organization proxy object for 平台管理员
        UserProxy userProxy = null;
        UserInfo ui = null;
		try {
			userProxy = SdkFactory.instance.getUserProxy("admin");
			ui = userProxy.getOne(orgId, name);
		} catch (BlockchainException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		User u = null;
		if(ui != null){
			u = new User();
			u.setName(ui.getName());
			u.setOrgId(ui.getOrgId());
			u.setRoles(ui.getRoles());
			Map<String, String> map = PropertySerializer.fromProperties(ui.getProperties());
			u.setName(map.get("toBeDecided"));
		}
		
		return u;
	}

	@Override
	public int update(User u) {
		// TODO Auto-generated method stub
		return 0;
	}

}
