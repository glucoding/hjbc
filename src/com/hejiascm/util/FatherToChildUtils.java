package com.hejiascm.util;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class FatherToChildUtils {

	public FatherToChildUtils() {
		// TODO Auto-generated constructor stub
	}
	
	 public static void fatherToChild (Object father,Object child){  
	        if(!(child.getClass().getSuperclass()==father.getClass())){  
	            System.err.println("child不是father的子类"); 
	        }  
	        Class fatherClass= father.getClass();  
	        Field ff[]= fatherClass.getDeclaredFields();  
	        for(int i=0;i<ff.length;i++){  
	            Field f=ff[i];//取出每一个属性，如deleteDate  
	            Class type=f.getType();  
	            try {
	                Method m = fatherClass.getMethod("get"+upperHeadChar(f.getName()));//方法getDeleteDate 
	                m.setAccessible(true);
	                Object obj=m.invoke(father);//取出属性值     
	                f.setAccessible(true);
	                f.set(child,obj);
	            } catch (SecurityException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            } catch (IllegalArgumentException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            } catch (NoSuchMethodException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            } catch (IllegalAccessException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            } catch (InvocationTargetException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }  
	        }  
	    }  
	    /** 
	    * 首字母大写，in:deleteDate，out:DeleteDate 
	    */  
	    private static String upperHeadChar(String in){  
	        String head=in.substring(0,1);  
	        String out=head.toUpperCase()+in.substring(1,in.length());  
	        return out;  
	    } 

}
