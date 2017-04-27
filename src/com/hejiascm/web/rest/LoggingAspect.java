package com.hejiascm.web.rest;

import org.apache.log4j.Logger;  
import org.aspectj.lang.ProceedingJoinPoint;  
import org.aspectj.lang.Signature;  
import org.aspectj.lang.annotation.Around;  
import org.aspectj.lang.annotation.Aspect;  
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;  
  
/** 
 *  使用Aspect统计方法调用的时间 
 * @author dufy 
 * @Date 2016-03-02 
 * @version 1.0 
 * 
 */  
  
@Aspect  
@Component  
public class LoggingAspect {  
    //日志记录  
    public Logger log = Logger.getLogger("reqTime_logger");  
      
    /** 
     * 统计Service中方法调用的时间 
     * @param joinPoint 
     * @throws Throwable 
     */  
    @Around("execution(* com.hejiascm.blockchain.impl..*DAOImpl.*(..))")  
    //@Around("execution(* com.ibm.crl.bc.hejia.sdk.SdkFactory.*(..))")
    public Object logServiceMethodAccess(ProceedingJoinPoint joinPoint) throws Throwable {  
        //long start = System.currentTimeMillis(); 
    	StopWatch sw = new StopWatch();
    	sw.start();
        Object object = joinPoint.proceed();  
        //long end = System.currentTimeMillis();  
        sw.stop();
        //long t = end - start;  
//        if(t>=0){  
//            String tmp = joinPoint.getSignature().toString();  
//            log.info(String.format("class:%s,invoke_time:%s",tmp,t));  
//        }  
        String tmp = joinPoint.getSignature().toString();  
        log.info(String.format("class:%s,invoke_time:%s",tmp, sw.getTotalTimeMillis()));  
        return object;  
    }  
}  
