package com.hejiascm.blockchain.interfaces;

import com.hejiascm.domains.user._UserInfo;
import com.ibm.crl.bc.hejia.sdk.user.UserInfo;

public interface UserDAO {
	UserInfo add(_UserInfo u, String operator);
	
	String delete(String orgId, String name, String operator);
	
	_UserInfo[] getAll(String orgId, String operator);
	
	_UserInfo getOne(String orgId, String userName, String operator);
	
	String getUserOrgId(String userName, String operator);
	
	_UserInfo update(_UserInfo u, String operator);
}
