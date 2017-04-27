package com.hejiascm.blockchain.interfaces;

import com.ibm.crl.bc.hejia.sdk.user.UserRole;

public interface RoleDAO {
	UserRole define(String orgId, UserRole role);
	
	UserRole[] getGlobals();
	
	UserRole[] getInternals(String orgId);
}
