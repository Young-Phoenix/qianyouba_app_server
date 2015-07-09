package com.qianyouba.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.qianyouba.dao.UserDao;
import com.qianyouba.dao.impl.UserDaoImpl;
import com.qianyouba.entity.User;

public class LoginServlet extends HttpServlet {
	private Gson gson;
	/**
	 * 
	 */
	private static final long serialVersionUID = 898243426693587876L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		UserDao dao = new UserDaoImpl();
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		/*
		 * User u = dao.login(username, password); if (u != null) {
		 * out.print("1"); } else { out.print("0"); }
		 */
		User u = new User(
				"18530210331",
				"http://d.lanrentuku.com/down/png/1503/male-avatars/cool-male-avatars-08.png",
				0, "王思聪", "天真无邪", 1, 0,
				"eded789463180edf6c13691398d0cb4c85fb0e23", 0);
		out.print(gson.toJson(u));
		out.flush();
		out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	public void init() throws ServletException {
		gson = new Gson();
	}

	public LoginServlet() {
		super();
	}

	public void destroy() {
		super.destroy();
	}

}
