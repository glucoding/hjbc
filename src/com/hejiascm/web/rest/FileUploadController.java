package com.hejiascm.web.rest;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.hejiascm.service.OrginfoService;
import com.hejiascm.util.MiscTool;
@Controller
public class FileUploadController {
	@Autowired
	OrginfoService orginfoService;
	
    @RequestMapping(value="/singleUpload")
    public String singleUpload(){
    	return "singleUpload";
    }
    @RequestMapping(value="/singleSave", method=RequestMethod.POST )
    public @ResponseBody String singleSave(@RequestParam("file") MultipartFile file, HttpServletRequest servletRequest ){
    	System.out.println("File uploading");
    	String fileName = null;
    	if (!file.isEmpty()) {
            try {
                fileName = file.getOriginalFilename();
                //获取文件扩展名
                String ext = fileName.substring(fileName.lastIndexOf(".")+1);	
            	File dir = new File(servletRequest.getServletContext().getRealPath("/uploads"));
            	String netaddress = servletRequest.getServletContext().getContextPath() + "/uploads";
            	String name = String.format("%s.%s", RandomStringUtils.randomAlphanumeric(8), ext);
                byte[] bytes = file.getBytes();
                BufferedOutputStream buffStream = 
                        new BufferedOutputStream(new FileOutputStream(new File(dir, name)));
                buffStream.write(bytes);
                buffStream.close();
                
                //return  "http:/" + dir + "/" + name;
                return "http://" + MiscTool.getAllLocalHostIP()[0] + ":" + servletRequest.getServerPort() + netaddress + "/" + name;
            } catch (Exception e) {
                return "You failed to upload " + fileName + ": " + e.getMessage();
            }
        } else {
            return "Unable to upload. File is empty.";
        }
    }
    
    @RequestMapping(value="/multipleUpload")
    public String multiUpload(){
    	return "multipleUpload";
    }
    
    @RequestMapping(value="/multipleSave", method=RequestMethod.POST )
    public @ResponseBody List<String> multipleSave(@RequestParam("file") MultipartFile[] files, HttpServletRequest servletRequest){
    	String fileName = null;
    	List<String> result = new ArrayList<String>();
    	if (files != null && files.length >0) {
    		for(int i =0 ;i< files.length; i++){
	            try {          
	                fileName = files[i].getOriginalFilename();
	                //获取文件扩展名
	                String ext = fileName.substring(fileName.lastIndexOf(".")+1);	
	            	File dir = new File(servletRequest.getServletContext().getRealPath("/uploads"));
	            	String netaddress = servletRequest.getServletContext().getContextPath() + "/uploads";
	            	String name = String.format("%s.%s", RandomStringUtils.randomAlphanumeric(8), ext);
	                byte[] bytes = files[i].getBytes();
	                BufferedOutputStream buffStream = 
	                        new BufferedOutputStream(new FileOutputStream(new File(dir, name)));
	                buffStream.write(bytes);
	                buffStream.close();
	                
	                result.add("http://" + MiscTool.getAllLocalHostIP()[0] + ":" + servletRequest.getServerPort() + netaddress + "/" + name);
	            } catch (Exception e) {
	            	e.printStackTrace();
	                return null;
	            }
    		}
    		return result;
        } else {
            return null;
        }
    }
} 
