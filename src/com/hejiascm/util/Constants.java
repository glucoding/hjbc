package com.hejiascm.util;

public interface Constants {
	String server = "localhost";//"192.168.20.115";
	String uploadDir =  "//usr//local//tomcat//webapps//ROOT//uploads//";
	//String uploadDir = "C:\\apache-tomcat-7.0.75\\webapps\\HejiaSCM\\uploads\\";
	String bankFrontServer = "http://192.168.113.2:6789";
	String defaultpwd = "123456";
	String inPostfix = "入金附属账户";
	String outPostfix = "出金附属账户";
	String preNewAccount = "<?xml version='1.0' encoding='GBK'?><stream>"
			+ "<action>DLBREGSN</action>"
			+ "<userName>JTDSCS</userName>"
			+ "<mainAccNo>8110701014300006043</mainAccNo>"
			+ "<appFlag>2</appFlag>"
			+ "<accGenType>0</accGenType>"
			+ "<subAccNo>0</subAccNo>"
			+ "<subAccNm>宣威市众泰能源有限公司</subAccNm>"
			+ "<accType>03</accType>"
			+ "<calInterestFlag>2</calInterestFlag>"
			+ "<interestRate>0</interestRate>"
			+ "<overFlag>0</overFlag>"
			+ "<overAmt>0</overAmt>"
			+ "<overRate>0</overRate>"
			+ "<autoAssignInterestFlag>1</autoAssignInterestFlag>"
			+ "<autoAssignTranFeeFlag>1</autoAssignTranFeeFlag>"
			+ "<feeType>1</feeType>"
			+ "<realNameParm>2</realNameParm>"
			+ "<subAccPrintParm>1</subAccPrintParm>"
			+ "<mngNode>230101</mngNode>"
			+ "<vtlCustNm>宣威市众泰能源有限公司</vtlCustNm>"
			+ "<legalPersonNm>夏春丽</legalPersonNm>"
			+ "<custCertType>0</custCertType>"
			+ "<custCertNo>530112198810150539</custCertNo>"
			+ "<branch>01</branch>"
			+ "<commAddress>云南省昆明市西山区日新中路九天集团16F</commAddress>"
			+ "<list name='VilcstDataList'>"
			+ "<row>"
			+ "<contactName>汪鑫</contactName>"
			+ "<contactPhone>13888955045</contactPhone>"
			+ "<mailAddress>77639022@qq.com</mailAddress>"
			+ "</row>"
			+ "</list>"
			+ "</stream>";
}
