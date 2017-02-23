package com.hejiascm.blockchain;

import java.util.List;

import com.ibm.crl.bc.hejia.sdk.accounting.SingleAccountingApplication;

public interface BcSingleAccAppDAO {
		List<SingleAccountingApplication>	getSingleAccountingApplications(String queryCondition);
}
