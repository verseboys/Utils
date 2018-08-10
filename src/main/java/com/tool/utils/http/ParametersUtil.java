package com.tool.utils.http;


import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
 
import javax.servlet.http.HttpServletRequest;
 
/**
 * 此工具类处理http请求过来参数的准确性和唯一性，确保请求参数为有效数据
 * 
 * @author 
 * @version 1.0
 * @create date：2018-02-27
 * 
 */
 
public class ParametersUtil {
 
	private static final String NO_THING = "";
 
	public static String getParameters(HttpServletRequest request,
			String requestName) {
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String requestPar = request.getParameter(requestName);
		if (requestPar == null || requestPar.equals("undefined")) {
			return NO_THING;
		} else
			return requestPar;
	}
 
	/*
	 * 处理String请求参数
	 */
	public static String getParameters(HttpServletRequest request,
			String requestName, String requestCode) {
		String requestPar = getParameters(request, requestName);
 
		if (!requestPar.equals(NO_THING)) {
			return requestPar;
		} else
			return requestCode;
	}
 
	/*
	 * 处理Integer请求参数
	 */
	public static Integer getParameters(HttpServletRequest request,
			String requestName, Integer requestCode) {
		String requestPar = getParameters(request, requestName);
 
		if (!requestPar.equals(NO_THING)) {
			return Integer.parseInt(requestPar);
		} else
			return requestCode;
	}
 
	/*
	 * 处理Float请求参数
	 */
	public static Float getParameters(HttpServletRequest request,
			String requestName, Float requestCode) {
		String requestPar = getParameters(request, requestName);
 
		if (!requestPar.equals(NO_THING)) {
			return Float.parseFloat(requestPar);
		} else
			return requestCode;
	}
 
	/*
	 * 处理Long请求参数
	 */
	public static Long getParameters(HttpServletRequest request,
			String requestName, Long requestCode) {
		String requestPar = getParameters(request, requestName);
 
		if (!requestPar.equals(NO_THING)) {
			return Long.parseLong(requestPar);
		} else
			return requestCode;
	}
 
	/*
	 * 处理Double请求参数
	 */
	public static Double getParameters(HttpServletRequest request,
			String requestName, Double requestCode) {
		String requestPar = getParameters(request, requestName);
 
		if (!requestPar.equals(NO_THING)) {
			return Double.parseDouble(requestPar);
		} else
			return requestCode;
	}
 
	/*
	 * 处理byte[]请求参数
	 */
	public static byte[] getParameters(HttpServletRequest request,
			String requestName, byte[] requestCode) {
		String requestPar = getParameters(request, requestName);
 
		if (!requestPar.equals(NO_THING)) {
			return requestPar.getBytes();
		} else
			return requestCode;
	}
 
	public static Object getParameters(HttpServletRequest request,
			String requestName, Object requestCode) {
		Object requestPar = getParameters(request, requestName);
 
		if (!requestPar.equals(NO_THING)) {
			return requestPar;
		} else
			return requestCode;
	}
 
	/**
	 * 获取所有请求参数
	 * 
	 * @param request
	 * @return Map<String, Object>
	 */
	public static Map<String, Object> getParameters(HttpServletRequest request) {
 
		Map<String, Object> params = new HashMap<String, Object>();
 
		Enumeration<String> paramEnumeration = request.getParameterNames();
 
		while (paramEnumeration.hasMoreElements()) {
 
			String key = paramEnumeration.nextElement();
			String value = request.getParameter(key);
 
			params.put(key, value);
		}
 
		return params;
 
	}
}

