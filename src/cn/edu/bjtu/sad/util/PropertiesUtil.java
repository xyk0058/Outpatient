package cn.edu.bjtu.sad.util;


import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {
	private static String path = null;
	private static String appId = null;
	private static String appsecret = null;
	private static String URL = null;
	private static String savePath = null;
	
	public static String getSavePath(){
		if(savePath == null){
			loadProperties();
		}
		return savePath;
	}
	
	public static String getPath(){
		if(path == null){
			loadProperties();
		}
		return path;
	}

	private static void loadProperties() {
		Properties prop = new Properties();
		try {
			InputStream is = PropertiesUtil.class.getResourceAsStream("init.properties");
			prop.load(is);
			savePath = prop.getProperty("savePath");
			path = prop.getProperty("path");
			appId = prop.getProperty("appId");
			appsecret = prop.getProperty("appsecret");
			URL = prop.getProperty("URL");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}              
	}
	
	
	public static String getAppId(){
		if(appId == null){
			loadProperties();
		}
		return appId;
	}
	
	public static String getAppsecret(){
		if(appsecret == null){
			loadProperties();
		}
		return appsecret;
	}
	
	
	public static String getURL(){
		if(URL == null){
			loadProperties();
		}
		return URL;
	}
	
	
	public static String getToken(){
		Properties prop = new Properties();
		try {
			InputStream is = PropertiesUtil.class.getResourceAsStream("init.properties");
			prop.load(is);
			return prop.getProperty("token");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}              
	}
}
