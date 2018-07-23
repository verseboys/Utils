package com.test.beelt;

import java.io.File;
import java.io.IOException;

import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;
import org.beetl.core.resource.FileResourceLoader;
import org.beetl.core.resource.StringTemplateResourceLoader;

public class Test {
	
	public static void main(String[] args) throws IOException {
		test2();
	}
	
	private static void test1() throws IOException {
		StringTemplateResourceLoader resourceLoader = new StringTemplateResourceLoader();//StringTemplateResourceLoader：字符串模板加载器，用于加载字符串模板，如本例所示
		Configuration cfg = Configuration.defaultConfiguration();
		GroupTemplate gt = new GroupTemplate(resourceLoader, cfg);
		Template t = gt.getTemplate("hello,${name}");
		t.binding("name", "beetl");
		String str = t.render();//tempalte.render() 返回渲染结果，如本例所示
		System.out.println(str);
	}
	
	private static void test2() throws IOException {
		String root = System.getProperty("user.dir")+File.separator+"template";
		FileResourceLoader resourceLoader = new FileResourceLoader(root,"utf-8");
		Configuration cfg = Configuration.defaultConfiguration();
		GroupTemplate gt = new GroupTemplate(resourceLoader, cfg);
		Template t = gt.getTemplate("/s01/hello.txt");
		String str = t.render();
		System.out.println(str);
	}
	
}