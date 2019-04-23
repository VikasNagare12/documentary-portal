package com.vidnyan.DocumertyPortal.contaneer;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;


import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.vidnyan.DocumertyPortal.doa.BookDoa;
import com.vidnyan.DocumertyPortal.doa.ConferenceDoa;
import com.vidnyan.DocumertyPortal.model.Bookbean;

/**
 * Servlet implementation class BookContainer
 */
@WebServlet("/book/*")
public class BookContainer extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public BookContainer() {
        // TODO Auto-generated c5onstructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String title=null;
		String typebook=null;
		String bookname=null;
		String serise=null;
		String index1=null;
		String index2=null;
		String index3=null;
		String pub_date=null;
		String pub_name=null;
		String uri =null;
		String bid =null;
		String empid=null;
		String bookpath =null;
		HttpSession session=null;
		int result=0;
		boolean redirect=false;
		RequestDispatcher rd=null;
		Bookbean Book=null;
		System.out.println("yes");
		try
		{
			session=request.getSession(true);
			 if(session.getAttribute("userID")==null){
				 response.sendRedirect("../login.vi");
			 }
			
			response.setContentType("text/Html");
			PrintWriter pw=response.getWriter();
			uri= request.getRequestURI().substring(22);
			System.out.println(uri);
			switch(uri)
			{
			case "add.vi":
				bid=request.getParameter("bookid");		
				title=request.getParameter("tile");
				typebook=request.getParameterValues("typebook")[0];
				bookname=request.getParameter("Bookname");
				serise=request.getParameter("serise");
				index1=request.getParameter("indexing1");
				index2=request.getParameter("indexing2");
				index3=request.getParameter("indexing3");
				pub_date=request.getParameter("pub_date");
				pub_name=request.getParameter("pub_name");
				empid=(String)session.getAttribute("userID");
				System.out.println(title+"     ");
				empid=(String)session.getAttribute("userID");
				//bookpath=request.getParameter("path");
				//get empid from session
				bookpath=bid;
				Book = new Bookbean(bid,title,typebook,bookname,serise,index1,index2,index3,pub_date,pub_name,bookpath,empid);
				System.out.println("Boob before "+Book);
				//savebook(book);
				System.out.println(Book);
				BookDoa.saveBook(Book);
				System.out.println(Book);		
		 	    response.sendRedirect("../showBook.htm");
				break;
			case "update.vi":
				bid=request.getParameter("bookid");
				title=request.getParameter("title");
				typebook=request.getParameter("typebook");
				bookname=request.getParameter("Bookname");
				serise=request.getParameter("serise");
				index1=request.getParameter("indexing1");
				index2=request.getParameter("indexing2");
				index3=request.getParameter("indexing3");
				pub_date=request.getParameter("pub_date");
				pub_name=request.getParameter("pub_name");
				bookpath=request.getParameter("path");
				empid=(String)session.getAttribute("userID");
				Book = new Bookbean(bid,title,typebook,bookname,serise,index1,index2,index3,pub_date,pub_name,bookpath,empid);
				int t =  BookDoa.updateBook(Book);
		 	    System.out.println(t);
				response.sendRedirect("./getUpdate.vi?id="+bid);
			break;
			case "getUpdate.vi":
		 		
		 		bid =request.getParameter("id");
		 		
		 		Book = BookDoa.getBookDetails(bid);
		 		session.setAttribute("Book", Book);
		 		System.out.println(Book);
		 		session.setAttribute("conferenceUpdate", "showBook");
		 		response.sendRedirect("../home.vi");
		 		break;
		 	case "delete.vi":
		 	BookDoa.deleteBook(request.getParameter("bid"));
		 	response.sendRedirect("../showBook.htm");
		 		break;
		 	case "showAllBook.htm":
		 		
		 		break;
			}
		}
	
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(request.getRequestURI());
		doGet(request, response);
	}

}
