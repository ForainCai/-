package com.zking.util;


import java.io.File;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.FileUploadBase.SizeLimitExceededException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import sun.util.resources.CalendarData;


public class Tools {
	public final static String cut(String uri){
		return uri.substring(uri.lastIndexOf("/"),uri.lastIndexOf("."));
	}
	
	//MD5加密
	public final static String MD5(String pwd){
		return MD5("bookManager@jerry"+pwd);
	}
	

	
	//获得验证码
	public final static boolean getVerifyImage(HttpServletRequest request,HttpServletResponse response){
		try {
			VerifyImage.getImage(request, response);
		} catch (Exception e) {
			return false;
		}
		return true;
		
	}
	
	
	//时间格式化
	public final static String formatDate(Date date){
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		if (date!=null) {
			return format.format(date);
		} else {
			return "无数据";
		}
	}
	
	//分页打表
	public final static <T> String json(List<T> list){
		JsonObject json = new JsonObject();
		json.addProperty("totalCount", list.size());
		json.add("jsonRoot", new Gson().toJsonTree(list));
		return json.toString();
	}
	
	//图片上传
	public final static JsonObject upload(HttpServletRequest request,HttpServletResponse response){
		JsonObject json = new JsonObject();
		boolean flag = false;
		try{  
	        final long MAX_SIZE = 3 * 1024 * 1024;// 设置上传文件最大为 3M  
	        // 允许上传的文件格式的列表  
	        final String[] allowedExt = new String[] { "jpg", "jpeg", "gif", "txt",  
	                "doc", "docx", "mp3", "wma", "m4a" };  
	        response.setContentType("text/html");  
	        // 设置字符编码为UTF-8, 这样支持汉字显示  
	        response.setCharacterEncoding("UTF-8");  
	        // 实例化一个硬盘文件工厂,用来配置上传组件ServletFileUpload  
	        DiskFileItemFactory dfif = new DiskFileItemFactory();  
	        dfif.setSizeThreshold(4096);// 设置上传文件时用于临时存放文件的内存大小,这里是4K.多于的部分将临时存在硬盘  
	        dfif.setRepository(new File(request.getRealPath("/")  
	                + "res/book"));// 设置存放临时文件的目录,web根目录下的imgs目录  
	        // 用以上工厂实例化上传组件  
	        ServletFileUpload sfu = new ServletFileUpload(dfif);  
	        // 设置最大上传尺寸  
	        sfu.setSizeMax(MAX_SIZE);  
	        PrintWriter out = response.getWriter();  
	        // 从request得到 所有 上传域的列表  
	        List fileList = null;  
	        try {  
	            fileList = sfu.parseRequest(request);  
	        } catch (FileUploadException e) {// 处理文件尺寸过大异常  
	            if (e instanceof SizeLimitExceededException) {  
	            	json.addProperty("result", "-1");
	            	json.addProperty("msg","文件尺寸超过规定大小:" + MAX_SIZE + "字节");
	                return json;  
	            }  
	            e.printStackTrace();  
	        }  
	        // 没有文件上传  
	        if (fileList == null || fileList.size() == 0) {  
	        	json.addProperty("result", "-1");
	        	json.addProperty("msg", "请选择上传文件");
	            return json;  
	        }  
	        // 得到所有上传的文件  
	        Iterator fileItr = fileList.iterator();  
	        // 循环处理所有文件  
	        while (fileItr.hasNext()) {  
	            FileItem fileItem = null;  
	            String path1 = null;  
	            long size = 0;  
	            // 得到当前文件  
	            fileItem = (FileItem) fileItr.next();  
	            // 忽略简单form字段而不是上传域的文件域(<input type="text" />等)  
	            if (fileItem == null || fileItem.isFormField()) {  
	                continue;  
	            }  
	            // 得到文件的完整路径  
	            path1 = fileItem.getName();  
	            // 得到文件的大小  
	            size = fileItem.getSize();  
	            if ("".equals(path1) || size == 0) {  
	            	json.addProperty("result", "-1");
	            	json.addProperty("msg", "请选择上传文件");
	                return json;  
	            }  
	            // 得到去除路径的文件名  
	            String t_name = path1.substring(path1.lastIndexOf("//") + 1);  
	            // 得到文件的扩展名(无扩展名时将得到全名)  
	            String t_ext = t_name.substring(t_name.lastIndexOf(".") + 1);  
	            // 拒绝接受规定文件格式之外的文件类型  
	            int allowFlag = 0;  
	            int allowedExtCount = allowedExt.length;  
	            for (; allowFlag < allowedExtCount; allowFlag++) {  
	                if (allowedExt[allowFlag].equals(t_ext))  
	                    break;  
	            }  
	            if (allowFlag == allowedExtCount) {  
	            	StringBuffer sb = new StringBuffer();
	                out.println("请上传以下类型的文件<p />");  
	                for (allowFlag = 0; allowFlag < allowedExtCount; allowFlag++)  
	                	sb.append("*." + allowedExt[allowFlag]  + "   ");
	                json.addProperty("result", "-1");
	            	json.addProperty("msg", sb.toString());
	                return json;  
	            }  
	            long now = System.currentTimeMillis();  
	            // 根据系统时间生成上传后保存的文件名  
	            String prefix = String.valueOf(now);  
	            // 保存的最终文件完整路径,保存在web根目录下的ImagesUploaded目录下  
	            String u_name = request.getRealPath("/") + "res/book/"  
	                    + prefix + "." + t_ext;  
	            try {  
	                File file = new File(u_name);  
//	              if(!file.exists()){  
//	                  System.out.print(file.mkdirs());  
//	                  System.out.print(file.mkdir());  
//	              }  
	                // 保存文件  
	                fileItem.write(file);  
	                flag = true;
	                json.addProperty("result", "-1");
	            	json.addProperty("msg","文件上传成功. 已保存为: " + prefix + "." + t_ext  
	                        + "   文件大小: " + size + "字节" );
	            	json.addProperty("src", "res/book/"+prefix+ "." + t_ext);
	            	return json;  
	            } catch (Exception e) {  
	                e.printStackTrace();  
	            }  
	        }  
	        }catch(Exception e){  
	            e.printStackTrace();  
	        }  
		return json;
	}
}
