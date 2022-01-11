package com.helper.com;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class connfiguration_Reader {

public static Properties j;
	
	public connfiguration_Reader() throws Throwable {
		
		File f=new File("C:\\Users\\rshar\\eclipse-workspace\\ProjectABC\\src\\test\\java\\com\\prop\\com\\testprop.properties");
		FileInputStream Fis=new FileInputStream(f);
		
		 j=new Properties();
		j.load(Fis);	
	}
	public String getbroswer() {
		
	 String u=j.getProperty("browser");
	 return u;
	 
	}
     public String geturl() {
    	 
    	 String f=j.getProperty("url");
    	 return f;
		
	}
     public String username() {
    	 String b=j.getProperty("username");
    	 return b;
		
	}
     public String password() {
    	 String c=j.getProperty("password");
    	 return c;
	}
     
     public String fname() {
    	 String n=j.getProperty("fname");
    	 return n;
     }
     public String lname() {
    	 String m=j.getProperty("lname");
    	 return m;
     }
     public String add() {
    	 String n1=j.getProperty("address");
    	 return n1;
     }
     public String ccnum() {
    	 String m1=j.getProperty("ccnum");
    	 return m1;
     }
     public String cvv() {
    	 String n2=j.getProperty("cvv");
    	 return n2;
     }
	
}
