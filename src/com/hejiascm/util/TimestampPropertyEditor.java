package com.hejiascm.util;

import java.beans.PropertyEditorSupport;
import java.sql.Timestamp;
import java.text.ParseException;
import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;

public class TimestampPropertyEditor extends PropertyEditorSupport {

	private String pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'";

	//private String[] formater_pattern = new String[] {"yyyy-MM-dd'T'HH:mm:ss'Z'"};

	/**
	 * 
	 */
	public TimestampPropertyEditor() {
		// TODO Auto-generated constructor stub
	}

	public TimestampPropertyEditor(String pattern) {
		// TODO Auto-generated constructor stub
		this.pattern = pattern;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.beans.PropertyEditorSupport#setAsText(java.lang.String)
	 */
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		if (StringUtils.isEmpty(text)) {
			setValue(null);
		} else {
			try {
				Date date = DateUtils.parseDate(text, pattern);
				Timestamp timestamp = new Timestamp(date.getTime());
				//				设置转换完的值
				setValue(timestamp);
				System.out.println("Property editor did:" + timestamp.toString());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				setValue(null);
			}
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.beans.PropertyEditorSupport#getAsText()
	 */
	@Override
	public String getAsText() {
		// TODO Auto-generated method stub
		//	获取model的值
		Timestamp value = (Timestamp) getValue();
		if (value == null) {
			return "";
		} else {
			try {
				Date date = new Date(value.getTime());
				String str = DateFormatUtils.format(date, pattern);
				System.out.println("Property editor get did:" + str);
				return str;
			} catch (Exception e) {
				return "";
			}
		}

	}

}
