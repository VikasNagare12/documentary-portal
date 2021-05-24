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

import com.vidnyan.DocumertyPortal.doa.JournalDoa;
import com.vidnyan.DocumertyPortal.model.JournalBean;
/**
 * Servlet implementation class JournalContainer
 */
@WebServlet("/journal/*")
public class JournalContainer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JournalContainer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String joun_number = "dsfg";
		String joun_name = null;
		String joun_title = null;
		String joun_indexing1 = null;
		String joun_indexing2 = null;
		String joun_indexing3 = null;
		String joun_impactfactor = null;
		String joun_volumenumber = null;
		String joun_publishername = null;
		String joun_date = null;
		String uri = null;
		String emp_ID = null;
		String journalpath =null;
		boolean redirect = false;
		HttpSession session=null;
		RequestDispatcher rd = null;
		JournalBean journal=null;
		int result;
		String jid;
		try {
			
			session=request.getSession(true);
			 if(session.getAttribute("userID")==null){
				 response.sendRedirect("../login.vi");
			 }
			
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			uri=request.getRequestURI().substring(25);
			System.out.println(uri);
			
			switch(uri) {
			case "add.vi":
				
				//System.out.println(request.getParameter("joun_number"));
				joun_number = request.getParameter("joun_number");
				emp_ID=(String)session.getAttribute("emp_ID");
				joun_name = request.getParameter("joun_name");
				joun_title = request.getParameter("joun_title");
				joun_indexing1 = request.getParameter("joun_indexing1");
				joun_indexing2 = request.getParameter("joun_indexing2");
				joun_indexing3 = request.getParameter("joun_indexing3");
				joun_impactfactor = request.getParameter("joun_impactfactor");
				joun_volumenumber = request.getParameter("joun_volumenumber");
				joun_publishername = request.getParameter("joun_publishername");
				joun_date = request.getParameter("joun_date");
				journalpath = joun_number;
				emp_ID =(String)session.getAttribute("userID");
				journal = new JournalBean(joun_number,emp_ID,joun_name,joun_title,joun_indexing1,joun_indexing2,joun_indexing3,joun_impactfactor,joun_volumenumber,joun_publishername,joun_date,journalpath);
				//saveJournal(journal);
				System.out.println(journal);
				JournalDoa.saveJournal(journal);
				response.sendRedirect("../showJournal.htm");
				break;
				
			case "update.vi":
				
				joun_number = request.getParameter("joun_number");
				//emp_ID=(String)session.getAttribute("emp_ID");
				
				joun_name = request.getParameter("joun_name");
				joun_title = request.getParameter("joun_title");
				joun_indexing1 = request.getParameter("joun_indexing1");
				joun_indexing2 = request.getParameter("joun_indexing2");
				joun_indexing3 = request.getParameter("joun_indexing3");
				joun_impactfactor = request.getParameter("joun_impactfactor");
				joun_volumenumber = request.getParameter("joun_volumenumber");
				joun_publishername = request.getParameter("joun_publishername");
				joun_date = request.getParameter("joun_date");
				//emp_ID=(String)session.getAttribute("emp_ID"); 
				emp_ID=(String)session.getAttribute("userID");
				journal = new JournalBean(joun_number,emp_ID,joun_name,joun_title,joun_indexing1,joun_indexing2,joun_indexing3,joun_impactfactor,joun_volumenumber,joun_publishername,joun_date,journalpath);
				
				int t = JournalDoa.updateJournal(journal);
				System.out.println(t);
				//rd=request.getRequestDispatcher("/getUpdate.vi?id="+joun_number);
				//saveJournal(journal);
				response.sendRedirect("./getUpdate.vi?id="+joun_number);
				
				
				break;
				
			case "delete.vi":
				
				JournalDoa.deleteJournal (request.getParameter("id"));
				response.sendRedirect("../showJournal.htm");
				break;
			case "showJoournal.htm":
				
				break;
				
			case "showJoournalAll.htm":
				
				break;
				
			case "getUpdate.vi":
				
				jid = request.getParameter("id");
				journal = JournalDoa.getjournalDeatails(jid);
				System.out.println(jid);
				session.setAttribute("conferenceUpdate", "showjournal");
		 		session.setAttribute("journal", journal);
		 		response.sendRedirect("../home.vi");

				break;

			}
		}catch(Exception e) { }
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
