package com.tis.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tis.dao.FileOccurDao;


/**
 * Servlet implementation class FilePropController
 */
@WebServlet("/FileOccurrController")
public class FileOccurrController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String LIST_USER = "/File_Occurrence.jsp";
	private FileOccurDao dao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FileOccurrController() {
        super();
        
        dao = new FileOccurDao();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String forward = "";
		String action = request.getParameter("action");
        System.out.println("action : "+action);
        
        if (action.equalsIgnoreCase("listUser")) {
			forward = LIST_USER;
			
			request.setAttribute("FileOccurrview", dao.getAllUsers());

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
