package com.hejiascm.util;

import java.net.InetAddress;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.apache.commons.lang3.time.DateUtils;

public abstract class MiscTool {
	public static String getCurrentTime(){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		return df.format(new Date());
	}
	
	public static String getLocalHostName() {
	    String hostName;
	    try {
	        InetAddress addr = InetAddress.getLocalHost();
	        hostName = addr.getHostName();
	    } catch (Exception ex) {
	        hostName = "";
	    }
	    return hostName;
	}
	
	public static String[] getAllLocalHostIP() {
	    String[] ret = null;
	    try {
	        String hostName = getLocalHostName();
	        if (hostName.length() > 0) {
	            InetAddress[] addrs = InetAddress.getAllByName(hostName);
	            if (addrs.length > 0) {
	                ret = new String[addrs.length];
	                for (int i = 0; i < addrs.length; i++) {
	                    ret[i] = addrs[i].getHostAddress();
	                }
	            }
	        }
	 
	    } catch (Exception ex) {
	        ret = null;
	    }
	    return ret;
	}
	
	public static String getRandomString(int length) { //length表示生成字符串的长度  
	    String base = "abcdefghijklmnopqrstuvwxyz0123456789";     
	    Random random = new Random();     
	    StringBuffer sb = new StringBuffer();     
	    for (int i = 0; i < length; i++) {     
	        int number = random.nextInt(base.length());     
	        sb.append(base.charAt(number));     
	    }     
	    return sb.toString();     
	 }
	
	 public static int getRandomInt(int min, int max){
	        Random random = new Random();
	        return random.nextInt(max)%(max-min+1) + min;
	 }
	 
	 public static String timeStampToString(Timestamp tsp){
		 DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		 String tspStr = ""; 
		 tspStr = sdf.format(tsp); 
		 System.out.println("timeStampToString:" + tspStr);
		 return tspStr;
	 }
	 
	 public static Timestamp stringToTimestamp(String str){
		String[] pattern = {"yyyy-MM-dd'T'HH:mm:ss'Z'","yyyy-MM-dd'T'HH:mm:ss.s'Z'"};
		Date date = null;
		try {
			System.out.println(str);
			date = DateUtils.parseDate(str, pattern);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		 return new Timestamp(date.getTime());
	 }
}
