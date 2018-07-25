package com.tool.utils.logmail;

import org.apache.log4j.Logger;

public class CheckLog4j1 {
	private static Logger info = Logger.getLogger("InfoLogger");  
    private static Logger error = Logger.getLogger("ErrorLogger");  
	public static void main(String[] args) {
		
		error.error("sdadfwf");
	}
}