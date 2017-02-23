package com.hejiascm.blockchain;

import java.util.List;

import com.hejiascm.domain.Preaccounting;
import com.ibm.crl.bc.hejia.sdk.accounting.PreAccounting;

public interface BcPreAccountingDAO {
	public List<Preaccounting> bcGetPreAccountings();

	public String bcSubmitPreAccounting(Preaccounting pa);
	
	public void bcWithdrawPreAccounting(String preId, String notes);
}
