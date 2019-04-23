package com.vidnyan.DocumertyPortal.contaneer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.vidnyan.DocumertyPortal.doa.ConferenceDoa;
import com.vidnyan.DocumertyPortal.idGeneretor.ConferenceIdGenerator;
//import com.vidnyan.DocumertyPortal.doa.ConferenceDoa;
import com.vidnyan.DocumertyPortal.model.ConferenceBean;

/**
 * Servlet implementation class ConferenceContainer
 */
@WebServlet("/conference/*")
public class ConferenceContainer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConferenceContainer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub		
		 String id = ";";
		//ConferenceIdGenerator.idGenerator();
		 String empID = id;
		 String title = null;
		 String name= null;
		 String publisher= null;
		 String indexing1= null;
		 String indexing2= null;
		 String indexing3= null;
		 String organizing= null;	
		 String city= null;
		 String webadd= null;
		 String startdate= null;
		 String enddate= null;
		 String shortdesc= null;
		 String uri=null;
		 HttpSession session=null;
		 String paperPath  =null;
		 int result=0;
		 boolean redirect= false;
		 RequestDispatcher rd = null;
		 ConferenceBean conference = null;		 
		 try {
			 session=request.getSession(true);
			 if(session.getAttribute("userID")==null){
				 response.sendRedirect("../login.vi");
			 }
			 response.setContentType("text/html");
			 PrintWriter pw = response.getWriter();			 
			 uri = request.getRequestURI().substring(28);
			 System.out.println(request.getRequestURI());
			 System.out.println("uri   =  "+uri);			 
			 switch(uri) {
			 	case "add.vi":
			 		id=ConferenceIdGenerator.idGenerator();
			 		title = request.getParameter("conf_title");
			 		//get empID from session
			 		empID= (String)session.getAttribute("empID");			 		
			 		name = request.getParameter("conf_name");
			 		publisher = request.getParameter("conf_proceding");
			 		indexing1 = request.getParameter("conf_indexing1");
			 		indexing2 = request.getParameter("conf_indexing2");
			 		indexing3 = request.getParameter("conf_indexing3");
			 	    organizing = request.getParameter("org_soc");
			 	    city = request.getParameter("conf_city");
			 	    webadd = request.getParameter("conf_web");
			 	    startdate = request.getParameter("conf_st_date");
			 	    enddate = request.getParameter("conf_end_date");
			 	    shortdesc = request.getParameter("conf_txt_area");
			 	    paperPath = id;
			 	    empID=(String)session.getAttribute("userID");
			 	    conference = new ConferenceBean(id,empID,title,name,publisher,indexing1,indexing2,indexing3,organizing,city,webadd,startdate,enddate,shortdesc,paperPath);
			 	    ConferenceDoa.saveConference(conference);
			 	    System.out.println(conference);		
			 	    response.sendRedirect("../showConference.htm");
			 	    break;
			 	case "update.vi":
			 		title = request.getParameter("conf_title");
			 		//empID get from session
			 	
			 		id= request.getParameter("id");
			 		empID = id;
			 		name = request.getParameter("conf_name");
			 		publisher = request.getParameter("conf_proceding");
			 		indexing1 = request.getParameter("conf_indexing1");
			 		indexing2 = request.getParameter("conf_indexing2");
			 		indexing3 = request.getParameter("conf_indexing3");
			 	    organizing = request.getParameter("org_soc");
			 	    city = request.getParameter("conf_city");
			 	    webadd = request.getParameter("conf_web");
			 	    startdate = request.getParameter("conf_st_date");
			 	    enddate = request.getParameter("conf_end_date");
			 	    shortdesc = request.getParameter("conf_txt_area");	
			 	   empID=(String)session.getAttribute("userID");
			 	    conference = new ConferenceBean(id,empID,title,name,publisher,indexing1,indexing2,indexing3,organizing,city,webadd,startdate,enddate,shortdesc,paperPath);			 	    
			 	    int t =  ConferenceDoa.updateConference(conference);
			 	    System.out.println(t);
			 	    response.sendRedirect("./getUpdate.vi?id="+id);
			 		break;
			 	case "getUpdate.vi":
			 		
			 		id =request.getParameter("id");
			 		
			 		conference = ConferenceDoa.getConferenceDetails(id);
			 		session.setAttribute("conferenceUpdate", "showConference");
			 		session.setAttribute("conference", conference);
			 		response.sendRedirect("../home.vi");
			 		
			 		break;
			 	case "delete.vi":
			 	ConferenceDoa.deleteConference(request.getParameter("id"));
			 	response.sendRedirect("../showConference.htm");
			 		break;
			 	case "showAllConference.htm":
			 		break;
			 }
			 
		 }
		 catch (Exception e) {
			// TODO: handle exception
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
