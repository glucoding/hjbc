package com.hejiascm.blockchain;

import java.util.List;

import com.hejiascm.domain.Paymentapplication;

public interface BcPaymentDAO {
	public String bcSubmitPaymentApplication();
	
	public void bcConfirmPaymentApplication(String appId, String remarks);
	
	public void bcConfirmPaymentRecord(String recId, String remarks, String submitterId);
	
	public void deletePaymentApplication(String appId, String submitterId);
	
	public List<Paymentapplication> bcGetPaymentApplications(String query);
	
	
}
