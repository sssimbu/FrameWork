package com.tis.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tis.dao.FilePropDao;
import com.tis.dao.FileSearchDao;


/**
 * Servlet implementation class FilePropController
 */
@WebServlet("/FileSearchController")
public class FileSearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String LIST_USER = "/File_Search.jsp";
	private FileSearchDao dao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FileSearchController() {
        super();
        
        dao = new FileSearchDao();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String forward = "";
		String action = request.getParameter("action");
        System.out.println("action : "+action);
        
        if (action.equalsIgnoreCase("listUser")) {
			forward = LIST_USER;
			
			request.setAttribute("FileSearchview", dao.getAllUsers());

		} 
			RequestDispatcher view = request.getRequestDispatcher(forward);
			view.forward(request, response);
		
	}
	
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	

	     
		
	
	
	
	
	
	}

}
