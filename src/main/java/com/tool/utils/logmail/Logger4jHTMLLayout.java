package com.tool.utils.logmail;

import org.apache.log4j.HTMLLayout;

public class Logger4jHTMLLayout extends HTMLLayout {
 
	@Override
    public String getContentType() {
        return "text/html;charset=utf-8"; 
    }

}