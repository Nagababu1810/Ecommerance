package com.ecommerence.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	Properties p;
	FileInputStream fi;
	
public ReadConfig()  {
	
	try {
		fi= new FileInputStream(".//Config.properties\\Config.properties");
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	p= new Properties();
	try {
		p.load(fi);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

	public String geturl() {
	
	String url=p.getProperty("url");
	return url;
	
}
	public String getusername() {
		
		String username=p.getProperty("username");
		return username;
	}
	public String getpassword() {
	
	String pwd=p.getProperty("password");
	return pwd;
}

	public String getchropath() {
	
	String chropath=p.getProperty("chrome");
	return chropath;
}

	public String getfirefoxpath() {
	
	String firefoxpath=p.getProperty("firefox");
	return firefoxpath;
}

	public String getedgepath() {
	String edgepath=p.getProperty("edge");
	return edgepath;
}

}
