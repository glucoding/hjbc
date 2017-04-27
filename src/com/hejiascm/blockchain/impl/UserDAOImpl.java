package com.hejiascm.blockchain.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.hejiascm.blockchain.interfaces.UserDAO;
import com.hejiascm.domains.org._OrgInfo;
import com.hejiascm.domains.user._UserInfo;
import com.hejiascm.util.FatherToChildUtils;
import com.ibm.crl.bc.hejia.sdk.SdkFactory;
import com.ibm.crl.bc.hejia.sdk.common.BlockchainException;
import com.ibm.crl.bc.hejia.sdk.common.Property;
import com.ibm.crl.bc.hejia.sdk.user.UserInfo;
import com.ibm.crl.bc.hejia.sdk.user.UserProxy;
import com.ibm.crl.bc.hejia.sdk.util.PropertySerializer;

@Component("UserInfoDAO")
public class UserDAOImpl implements UserDAO {

	public UserDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public UserInfo add(_UserInfo u, String operator) {
		Property[] props = new Property[]{
				new Property("password", u.getPassword()),
				new Property("fullName", u.getFullName()),
				new Property("mobile", u.getMobile()),
				new Property("enabled", u.getEnabled())
		};
		UserInfo ubc = null;
		try(UserProxy userProxy = SdkFactory.getInstance().getUserProxy(operator)){
			ubc = userProxy.add(u.getName(),
										   u.getOrgId(), 
										   u.getRoles(), 
										   props);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return ubc;
	}

	@Override
	public String delete(String orgId, String name, String operator) {
		try(UserProxy userProxy = SdkFactory.getInstance().getUserProxy(operator)){
			userProxy.delete(orgId, name);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
			return "删除失败，请联系管理员";
		}
		return "删除成功";
	}

	@Override
	public _UserInfo[] getAll(String orgId, String operator) {
		UserInfo[] ubcs = null;
		_UserInfo[] us = null;
		try(UserProxy userProxy = SdkFactory.getInstance().getUserProxy(operator)){
			ubcs = userProxy.getAll(orgId);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		us = new _UserInfo[ubcs.length];
		int i = 0;
		for(UserInfo ubc : ubcs){
			_UserInfo _user = new _UserInfo();
			//FatherToChildUtils.fatherToChild(ubc, _user);
			_user.setName(ubc.getName());
			_user.setOrgId(ubc.getOrgId());
			_user.setRoles(ubc.getRoles());
			
			Property[] props = ubc.getProperties();
			if(props != null){
				Map<String,String> map = PropertySerializer.fromProperties(props);
				_user.setPassword(map.get("password"));
				_user.setFullName(map.get("fullName"));
				_user.setMobile(map.get("mobile"));
				_user.setEnabled(map.get("enabled"));
				_user.setCode(map.get("code"));
			}
			
			us[i] = _user;
			i++;
		}
		
		return us;
	}

	@Override
	public _UserInfo getOne(String orgId, String userName, String operator) {
		UserInfo ubc = null;
		try(UserProxy userProxy = SdkFactory.getInstance().getUserProxy(operator)){
			ubc = userProxy.getOne(orgId, userName);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		
		_UserInfo _user = new _UserInfo();
		//FatherToChildUtils.fatherToChild(ubc, _user);
		_user.setName(ubc.getName());
		_user.setOrgId(ubc.getOrgId());
		_user.setRoles(ubc.getRoles());
		
		Property[] props = ubc.getProperties();
		if(props != null){
				Map<String,String> map = PropertySerializer.fromProperties(props);
				_user.setPassword(map.get("password"));
				_user.setFullName(map.get("fullName"));
				_user.setMobile(map.get("mobile"));
				_user.setEnabled(map.get("enabled"));
		}
		
		return _user;
	}

	@Override
	public String getUserOrgId(String userName, String operator) {
		String orgId = null;
		try(UserProxy userProxy = SdkFactory.getInstance().getUserProxy(operator)){
			orgId = userProxy.getUserOrgId(userName);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return orgId;
	}

	@Override
	public _UserInfo update(_UserInfo u, String operator) {
		UserInfo ubc = null;
		Property[] props = new Property[]{
				new Property("password", u.getPassword()),
				new Property("fullName", u.getFullName()),
				new Property("mobile", u.getMobile()),
				new Property("enabled", u.getEnabled()),
				new Property("code", u.getCode())
		};

		try(UserProxy userProxy = SdkFactory.getInstance().getUserProxy(operator)){
			ubc = userProxy.update(u.getName(),
					                                        u.getOrgId(), 
					                                        new String[]{"roles","properties"}, 
					                                        u.getRoles(), 
					                                        props);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		
		if(ubc != null){
			return u;	
		}
		return null;
	}

}
