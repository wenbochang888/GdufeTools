package com.servlet;

import java.util.Arrays;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dto.Information;
import com.dto.Schedule;
import com.dto.TestResult;
import com.service.UsersService;

@Controller
public class RequestMappingg {

	@Autowired
	UsersService usersService;

	@RequestMapping(value = "/getList")
	public String getList(Map<String, Object> map, 
			@CookieValue(value = "sno") String sno,
			@CookieValue(value = "pwd") String pwd) {
		
		System.out.println("我是service层： " + sno + "  " + pwd);
		// 调用service层
		map.put("UsersList", usersService.getListService());
		return "ShowList";
	}
	
	@RequestMapping(value = "/login")
	public String login(HttpServletRequest req) {
		Cookie[] cookies = req.getCookies();
		if (cookies.length > 1) {
			return "redirect:/information";
		}
		return "login";
	}
	
	@RequestMapping(value = "/doLogin")
	public String saveUsername(String sno, String pwd, HttpServletResponse res) {
		
		Cookie cookieSno = new Cookie("sno", sno);
		Cookie cookiePwd = new Cookie("pwd", pwd);
		cookieSno.setPath("/");
		cookiePwd.setPath("/");
		cookieSno.setMaxAge(10000000);
		cookiePwd.setMaxAge(10000000);
		res.addCookie(cookieSno);
		res.addCookie(cookiePwd);
		return "redirect:/information";
	}
	
	@RequestMapping(value = "/del")
	public String delCookie(HttpServletRequest req, HttpServletResponse res) {
		
		Cookie[] cookies = req.getCookies();
		for (Cookie ck : cookies) {
			if ("sno".equals(ck.getName())) {
				ck.setValue(null);
				ck.setMaxAge(0);
				ck.setPath("/");
				res.addCookie(ck);
			}
			if ("pwd".equals(ck.getName())) {
				ck.setValue(null);
				ck.setMaxAge(0);
				ck.setPath("/");
				res.addCookie(ck);
			}
		}
		return "login";
	}
	
	@RequestMapping(value = "/information")
	public String getInformation(Map<String, Object> map,
			@CookieValue("sno") String sno,
			@CookieValue("pwd") String pwd) {
		
		TestResult<Information> info = usersService.getInfo(sno, pwd);
		if (info.getCode() != 0) {
			map.put("error", "用户名或密码不正确");
			return "forward:/del";
		} else {
			map.put("info", info);
			return "information";
		}
	}
	
	@RequestMapping(value = "/grade")
	public String getGrade(Map<String, Object> map,
			@CookieValue("sno") String sno,
			@CookieValue("pwd") String pwd) {
		
		map.put("grade", usersService.getGrade(sno, pwd));
		return "grade";
	}
	
	@RequestMapping(value = "/book")
	public String getBook(Map<String, Object> map,
			@CookieValue("sno") String sno,
			@CookieValue("pwd") String pwd) {
		
		map.put("book", usersService.getBook(sno, pwd));
		return "book";
	}
	
	@RequestMapping(value = "/sztz")
	public String getSuTuo(Map<String, Object> map,
			@CookieValue("sno") String sno,
			@CookieValue("pwd") String pwd) {
		
		map.put("sztz", usersService.getSuTuo(sno, pwd));
		return "sztz";
	}
	
	@RequestMapping(value = "/cash")
	public String getCash(Map<String, Object> map,
			@CookieValue("sno") String sno,
			@CookieValue("pwd") String pwd) {
		
		map.put("cash", usersService.getCash(sno, pwd));
		return "cash";
	}
	
	@RequestMapping(value = "/schedule")
	public String getSchedule(Map<String, Object> map,
			@CookieValue("sno") String sno,
			@CookieValue("pwd") String pwd) {
		
		Schedule[] schedule = usersService.getSchedule(sno, pwd).data;
		Arrays.sort(schedule, (a, b) -> {
			return a.getDayInWeek().compareTo(b.getDayInWeek());
		});
		map.put("schedule", schedule);
		return "schedule";
	}
}






