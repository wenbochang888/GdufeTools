package com.service;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.HttpRequest;
import com.dao.UsersDAO;
import com.dto.Book;
import com.dto.Cash;
import com.dto.GradeInfo;
import com.dto.Information;
import com.dto.Schedule;
import com.dto.SuTuo;
import com.dto.TestResult;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.po.Users;

@Service
public class UsersService {

	@Autowired
	UsersDAO usersDAO;

	public List<Users> getListService() {

		List<Users> list = usersDAO.getList();
		List<Users> resList = new ArrayList<>();
		for (Users users : list) {
			if ("root".equals(users.getUsername())) {
				resList.add(users);
			}
		}
		return resList;
	}
	
	public TestResult<Information> getInfo(String sno, String pwd) {
		String url = "http://api.wegdufe.com:82/index.php?r=jw/get-basic";
		String param = "sno=" + sno + "&pwd=" + pwd;
		String res = HttpRequest.sendPost(url, param);
		Gson gson = new Gson();
		Type infoType = new TypeToken<TestResult<Information>>() {}.getType();
		TestResult<Information> infoRes = gson.fromJson(res, infoType);
		
		return infoRes;
	}
	
	public TestResult<GradeInfo[]> getGrade(String sno, String pwd) {
		String url = "http://api.wegdufe.com:82/index.php?r=jw/get-grade";
		String param = "sno=" + sno + "&pwd=" + pwd;
		String res = HttpRequest.sendPost(url, param);
		Gson gson = new Gson();
		Type infoType = new TypeToken<TestResult<GradeInfo[]>>() {}.getType();
		TestResult<GradeInfo[]> infoRes = gson.fromJson(res, infoType);
		
		return infoRes;
	}
	
	public TestResult<Book[]> getBook(String sno, String pwd) {
		String url = "http://api.wegdufe.com:82/index.php?r=opac/current-book";
		String param = "sno=" + sno + "&pwd=" + pwd;
		String res = HttpRequest.sendPost(url, param);
		Gson gson = new Gson();
		Type infoType = new TypeToken<TestResult<Book[]>>() {}.getType();
		TestResult<Book[]> infoRes = gson.fromJson(res, infoType);
		return infoRes;
	}
	
	public TestResult<SuTuo[]> getSuTuo(String sno, String pwd) {
		String url = "http://api.wegdufe.com:82/index.php?r=info/few-sztz";
		String param = "sno=" + sno + "&pwd=" + pwd;
		String res = HttpRequest.sendPost(url, param);
		Gson gson = new Gson();
		Type infoType = new TypeToken<TestResult<SuTuo[]>>() {}.getType();
		TestResult<SuTuo[]> infoRes = gson.fromJson(res, infoType);
		return infoRes;
	}
	
	public TestResult<Cash> getCash(String sno, String pwd) {
		String url = "http://api.wegdufe.com:82/index.php?r=card/current-cash";
		String param = "sno=" + sno + "&pwd=" + pwd;
		String res = HttpRequest.sendPost(url, param);
		Gson gson = new Gson();
		Type infoType = new TypeToken<TestResult<Cash>>() {}.getType();
		TestResult<Cash> infoRes = gson.fromJson(res, infoType);
		System.out.println(infoRes);
		return infoRes;
	}
	
	public TestResult<Schedule[]> getSchedule(String sno, String pwd) {
		String url = "http://api.wegdufe.com:82/index.php?r=jw/get-schedule";
		String param = "sno=" + sno + "&pwd=" + pwd;
		String res = HttpRequest.sendPost(url, param);
		Gson gson = new Gson();
		Type infoType = new TypeToken<TestResult<Schedule[]>>() {}.getType();
		TestResult<Schedule[]> infoRes = gson.fromJson(res, infoType);
		return infoRes;
	}
}











