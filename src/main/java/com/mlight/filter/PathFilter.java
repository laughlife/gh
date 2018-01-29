package com.mlight.filter;

import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.core.io.ClassPathResource;

public class PathFilter implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent sce) {
	}
	
	public void contextInitialized(ServletContextEvent sce) {
		// 读取配置文件
		ServletContext ctx = sce.getServletContext();
		Properties config=new Properties();
		try {
			config.load(new ClassPathResource("path.properties").getInputStream());
			Set set = config.keySet();
			for (Object object : set) {
				String key = String.valueOf(object);
				ctx.setAttribute(key, config.getProperty(key));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
