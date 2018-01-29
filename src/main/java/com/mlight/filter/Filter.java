package com.mlight.filter;

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mlight.utils.CheckUtils;
import org.springframework.jdbc.core.JdbcTemplate;

public class Filter implements javax.servlet.Filter {

	public void destroy() {
		
	}

	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String path1 = request.getContextPath();
		String basePath = request.getSession().getAttribute("basePath").toString();
		if(!CheckUtils.isEmpty(basePath)){
			basePath = request.getScheme() + "://" + request.getServerName()
					+ ":" + request.getServerPort() + path1 + "/";
		}
	}

	public void init(FilterConfig arg0) throws ServletException {

	}


}
