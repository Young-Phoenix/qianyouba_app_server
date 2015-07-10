package com.qianyouba.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qianyouba.dao.UserDao;
import com.qianyouba.dao.impl.UserDaoImpl;
import com.qianyouba.entity.Area;
import com.qianyouba.entity.City;
import com.qianyouba.entity.Message;
import com.qianyouba.entity.Province;
import com.qianyouba.entity.User;

public class LoginServlet extends HttpServlet {
	private JsonGenerator jsonGenerator;
	private ObjectMapper objMapper;
	/**
	 * 
	 */
	private static final long serialVersionUID = 898243426693587876L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		UserDao dao = new UserDaoImpl();
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		StringWriter writer = new StringWriter();
		
		
		Province province = new Province(1, 1001, "河南省", "省");
		City city = new City(1,2001,"新乡市",province);
		Area area = new Area(1,3001,"红旗区",city);
		User u = new User(1, "phoenix", "123456", "18503739999", "新易贷", "新乡市红旗区", "466461334", "2015-07-01", 1000, 0, "192.168.0.150", "raines_lcf@163.com", "410781198801018888", "男", 27, "http://d.lanrentuku.com/down/png/1503/male-avatars/cool-male-avatars-08.png", area, city, province, "王思聪", "我是一个低调的富二代");
		Message msg;
		if (u != null) {
			msg = new Message<User>();
			msg.setResultCode(200);
			msg.setData(u);
		} else {
			msg = new Message<String>();
			msg.setResultCode(400);
			msg.setData("用户名或密码错误");
		}
		objMapper.writeValue(writer, msg);
		out.print(writer.toString());
		out.flush();
		out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	public void init() throws ServletException {
		objMapper = new ObjectMapper();
	}

	public LoginServlet() {
		super();
	}

	public void destroy() {
		super.destroy();
	}

}
