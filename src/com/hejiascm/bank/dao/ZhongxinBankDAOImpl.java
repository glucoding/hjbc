package com.hejiascm.bank.dao;

import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import javax.xml.namespace.QName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;
import org.springframework.xml.transform.StringResult;
import org.springframework.xml.transform.StringSource;

import com.hejiascm.bank.domain.BankTransferRequest;

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
		JAXBElement<BankTransferRequest> jaxbElement =  new JAXBElement( 
	            new QName(BankTransferRequest.class.getSimpleName()), BankTransferRequest.class, btr);
		//JAXBContext context = JAXBContext.newInstance(BankTransferRequest.class);
		
		String xmlString = marshal(jaxbElement);

        
		try {
	        StringEntity entity = new StringEntity(xmlString);
	        post.setEntity((org.apache.http.HttpEntity) entity);
	        HttpResponse response;
			response = client.execute(post);
			String result = EntityUtils.toString(response.getEntity());
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		
		return null;
	}
	
	public JAXBElement<?> unmarshal(String xmlString) {
		return (JAXBElement<?>) marshaller.unmarshal(new StringSource(xmlString));
	}
	
	public String marshal(JAXBElement<?> jaxbElement) {
		try {
				StringResult result = new StringResult();
				marshaller.marshal(jaxbElement, result);
				System.out.println(result.toString());
				return result.toString();
			} catch (Exception e) {
				throw new IllegalStateException(e);
			}
	}
}
