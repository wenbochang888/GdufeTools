package com.test;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class TestInterceptor implements HandlerInterceptor {

	/**
	 * �÷�����Ŀ�귽��֮ǰ����
	 * ��Ϊtrue����������ú������������Ŀ�귽��
	 * ����false����ֹͣ����
	 */
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object arg2) throws Exception {

		Cookie[] cookies = req.getCookies();
		if (cookies.length <= 1) {
			res.sendRedirect("login");
			return false;
		}
		for (Cookie cookie : cookies) {
			System.out.println(cookie.getName() + "  " + cookie.getValue());
		}
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView mv)
			throws Exception {
	}
	
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		System.out.println("afterCompletion");
	}
}

