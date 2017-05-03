package com.hejiascm.util;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import com.ibm.crl.bc.hejia.sdk.GlobalConf;
import com.ibm.crl.bc.hejia.sdk.RedisConf;

public class InstantiationTracingBeanPostProcessor implements ApplicationListener<ContextRefreshedEvent> {
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		if(event.getApplicationContext().getParent() == null){
			String host = "192.168.20.141";//141,106
			GlobalConf.setInstance(new RedisConf(host));
			System.out.println("Note: Redis host has been set to:" + host);
			System.out.println(System.getenv(GlobalConf.SDK_ENV));
		}
	}
}