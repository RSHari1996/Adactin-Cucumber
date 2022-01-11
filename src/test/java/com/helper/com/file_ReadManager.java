package com.helper.com;

public class file_ReadManager {
	


public static  file_ReadManager getInstanceFR() {
	 file_ReadManager fr = new  file_ReadManager();
	return fr;
}

public  connfiguration_Reader getInstanceCR() throws Throwable {
	connfiguration_Reader cr = new connfiguration_Reader();
	return cr;

}

}
