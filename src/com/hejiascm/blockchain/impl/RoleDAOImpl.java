package com.hejiascm.blockchain.impl;

import java.io.IOException;

import com.hejiascm.blockchain.interfaces.RoleDAO;
import com.ibm.crl.bc.hejia.sdk.SdkFactory;
import com.ibm.crl.bc.hejia.sdk.common.BlockchainException;
import com.ibm.crl.bc.hejia.sdk.user.RoleProxy;
import com.ibm.crl.bc.hejia.sdk.user.UserRole;

public class RoleDAOImpl implements RoleDAO {

	public RoleDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public UserRole define(String orgId, UserRole role) {
		UserRole r = null;
		String username = "admin";
		try(RoleProxy roleProxy = SdkFactory.getInstance().getRoleProxy(username)){
			r = roleProxy.define(orgId, role.getName(), role.getPermissions());
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return r;
	}

	@Override
	public UserRole[] getGlobals() {
		UserRole[] roles = null;
		String username = "admin";
		try(RoleProxy roleProxy = SdkFactory.getInstance().getRoleProxy(username)){
			roles = roleProxy.getGlobals();
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return roles;
	}

	@Override
	public UserRole[] getInternals(String orgId) {
		UserRole[] roles = null;
		String username = "admin";
		try(RoleProxy roleProxy = SdkFactory.getInstance().getRoleProxy(username)){
			roles = roleProxy.getInternals(orgId);
		}catch(BlockchainException | IOException e){
			e.printStackTrace();
		}
		return roles;
	}

}
