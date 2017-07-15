package com.zking.util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class TimeUtil {
	/** 
	  * 得到完整的时间戳，格式:yyyyMMddHHmmssSSS(年月日时分秒毫秒) 
	  * @return 完整的时间戳 
	  */ 
	
	public static String getFullTimeStamp(){
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		return format.format(new Date());
	}
	
	public static String getFullTimeStamps(){
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return format.format(new Date());
	}
	
	
	public static Timestamp getFullTime(){
		
		java.util.Date date = new java.util.Date();          // 获取一个Date对象
        Timestamp timeStamp = new Timestamp(date.getTime());     //   讲日期时间转换为数据库中的timestamp类型
		return timeStamp;
		
	}
	
//	
//	public static void main(String[] args) {
//		System.out.println(TimeUtil.getFullTimeStamps());
//	}
}
