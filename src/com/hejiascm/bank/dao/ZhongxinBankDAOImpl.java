package com.hejiascm.bank.dao;

import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;
import org.springframework.xml.transform.StringResult;
import org.springframework.xml.transform.StringSource;

import com.hejiascm.bank.domain.BankTransferRequest;
import com.hejiascm.bank.domain.GeneralBankResponse;

@Component("BankDAO")
public class ZhongxinBankDAOImpl implements BankDAO {
	String url = "https://selfsolve.apple.com/wcResults.do";
	
	@Autowired
	private Jaxb2Marshaller marshaller;
	
	public String transfer(BankTransferRequest btr){

		HttpClient client = HttpClientBuilder.create().build();
		HttpPost post = new HttpPost(url);

		// add header
		post.setHeader("Content-Type", "application/xml");
		String xmlString = marshal(btr);
		String result = null;
        
		try {
	        StringEntity entity = new StringEntity(xmlString);
	        post.setEntity((org.apache.http.HttpEntity) entity);
	        HttpResponse response;
			response = client.execute(post);
			result = EntityUtils.toString(response.getEntity());
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		result = "<?xml version='1.0' encoding='UTF-8'?>"
				+ "<stream><status>good</status><statusText>goodEnough</statusText></stream>";
		System.out.println(result);
		GeneralBankResponse gbr = (GeneralBankResponse)unmarshal(result);

		System.out.println(gbr.getStatusText());
		
		return null;
	}
	
	public Object unmarshal(String xmlString) {
		return marshaller.unmarshal(new StringSource(xmlString));
	}
	
	public String marshal(Object o) {
		try {
				StringResult result = new StringResult();
				marshaller.marshal(o, result);
				System.out.println(result.toString());
				return result.toString();
			} catch (Exception e) {
				throw new IllegalStateException(e);
			}
	}
}
