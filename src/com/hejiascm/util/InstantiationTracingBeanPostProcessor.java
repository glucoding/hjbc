package com.hejiascm.util;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import com.ibm.crl.bc.hejia.sdk.GlobalConf;
import com.ibm.crl.bc.hejia.sdk.RedisConf;

public class InstantiationTracingBeanPostProcessor implements ApplicationListener<ContextRefreshedEvent> {
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		if(event.getApplicationContext().getParent() == null){//root application context 没有parent，他就是老大.
			String host = "192.168.20.106";//141,106
			GlobalConf.setInstance(new RedisConf(host));
			System.out.println("Note: Redis host has been set to:" + host);
		}
	}
}