package com.hejiascm.bank.dao;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class ZhongxinBankDAOImpl implements BankDAO {
	String url = "https://selfsolve.apple.com/wcResults.do";
	
	public String transfer(){

		HttpClient client = HttpClientBuilder.create().build();
		HttpPost post = new HttpPost(url);

		// add header
		post.setHeader("User-Agent", "mozilla");
		
		String body = "<xml>xxxx</xml>";

        
		try {
	        ByteArrayEntity entity = new ByteArrayEntity(body.getBytes("UTF-8"));
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
}
