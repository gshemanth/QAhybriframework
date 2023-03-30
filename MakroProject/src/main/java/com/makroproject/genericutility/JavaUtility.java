package com.makroproject.genericutility;

import java.util.Date;
import java.util.Random;

public class JavaUtility {
	
	
		public int RandomNum() {
		Random ran=new Random();
		int rand = ran.nextInt(1000);
		return rand;
		
	}
		
		public String systemDate() {
			Date date=new Date();
			String systemdate = date.toString().replaceAll(":", "-");
			return systemdate;
		}

}
