package com.tool.utils.beetl;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.beetl.ext.servlet.ServletGroupTemplate;

import com.google.common.collect.Maps;

public class IndexServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -236447856572017275L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
	    //模板直接访问users
	    request.setAttribute("users", getMockerUsers());
	    request.setAttribute("ctxPath", request.getContextPath());
	    
	    ServletGroupTemplate.instance().render("/WEB-INF/template/index.html", request, response);
	}

	private Map getMockerUsers() {
		Map map = Maps.newHashMap();
		map.put("id", 1);
		map.put("name", "曹操");
		map.put("description", "一名枭雄");
		return map;
	}
	
}