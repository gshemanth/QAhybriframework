package com.makroproject.genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class FileUtility {
	public String getCommonDataPropertie(String key) throws Throwable {
		FileInputStream fis=new FileInputStream(IPathConstant.propertyfile);
		Properties prop=new Properties();
		prop.load(fis);
		String data = prop.getProperty(key);
		return data;
		
		
	}

}
