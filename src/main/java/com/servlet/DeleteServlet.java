package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.LoginService;
import com.todo.Todo;
import com.todo.TodoService;

@WebServlet(urlPatterns = "/delete-todo.do")
 

public class DeleteServlet extends HttpServlet {
	
//	private TodoService todoService = new TodoService();
//
//
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws IOException, ServletException {
//		todoService.deleteTodo(new Todo(request.getParameter("todo") , request.getParameter("catego")));
//		response.sendRedirect("/todo.do");
//	}
	
	private static final long serialVersionUID = 1L;
	private TodoService todoService = new TodoService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		todoService.deleteTodo(new Todo(request.getParameter("todo"), request.getParameter("catego")));
		response.sendRedirect("/todo.do");
	}
	
	
	}
	
	





