/**
 * 
 */
package com.vidnyan.DocumertyPortal.contaneer;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.vidnyan.DocumertyPortal.doa.TeacherDoa;
//import com.vidnyan.DocumertyPortal.doa.TeacherDoa;
import com.vidnyan.DocumertyPortal.model.Teacher;
import com.vidnyan.DocumertyPortal.servise.TeacherService;


/**
 * @author vikasnagare
 *
 */
@WebServlet("/teacher/*")
public class TeacherContainer extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	
	public TeacherContainer() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uri = null;
		String fname = null;
		String lname = null;
		String empId = null;
		String mobile = null;
		String email = null;
		String pwd1 = null;
		String pwd2 = null;
		String mops = null;
		String qualification = null;
		String gender = null;
		String profilePic = null;
		String designation=null;
		Teacher teacher = null;
		int result = 0;
		boolean redirect = false;
		RequestDispatcher rd = null;
		try {
			resp.setContentType("text/html");
			PrintWriter pw = resp.getWriter();
			uri = req.getRequestURI().substring(25);
			HttpSession session =req.getSession(true);
			switch (uri) {
			case "register.vi":
				fname = (req.getParameter("fname").length() >= 1 ? req.getParameter("fname") : null);
				lname = (req.getParameter("lname").length() >= 1 ? req.getParameter("lname") : null);
				empId = (req.getParameter("empid").length() >= 1 ? req.getParameter("empid") : null);
				mobile = (req.getParameter("mob").length() >= 1 ? req.getParameter("mob") : null);
				email = (req.getParameter("email").length() >= 1 ? req.getParameter("email") : null);
				pwd1 = (req.getParameter("pwd1").length() >= 1 ? req.getParameter("pwd1") : null);
				pwd2 = (req.getParameter("pwd2").length() >= 1 ? req.getParameter("pwd2") : null);
				//how to get data from combobaox
				designation=req.getParameterValues("designation")[0];

				rd = getServletContext().getRequestDispatcher("/register.vi");
				if (fname == null) {
					redirect = true;
					req.setAttribute("fname", "Please Enter Frist Name");
				}
				if (lname == null) {
					redirect = true;
					req.setAttribute("lname", "Please Enter Last Name");
				}
				if (empId == null) {
					redirect = true;
					req.setAttribute("empId", "Please Enter Employee ID");
				}
				if (email == null) {
					redirect = true;
					req.setAttribute("email", "Please Enter Email");
				}
				if (mobile == null || mobile.length() < 10) {
					redirect = true;
					req.setAttribute("mob", "Please Enter Valied Mobile no");
				}
				if (pwd1 == null || pwd1.length() < 6) {
					redirect = true;
					req.setAttribute("pwd1", "Please Enter Password");
				}
				if (pwd2 == null) {
					redirect = true;
					req.setAttribute("pwd2", "Please Enter Password");
				} else if (!pwd2.equals(pwd1)) {
					redirect = true;
					req.setAttribute("pwd1", "Password does not match");
				}
				if (redirect) {
					redirect = false;
					rd.forward(req, resp);
				} else {
					result = TeacherDoa.SaveTeacher(new Teacher(fname, lname, empId, mobile, email,designation, pwd1));
					if (result== 1) {
						pwd1=null;
						pwd2=null;
						//call to service class to create folder to user
						TeacherService.createTeacher(empId);
						resp.sendRedirect(resp.encodeRedirectURL(req.getContextPath()+"/teacher/home.vi"));
					} else if (result == 2) {
						req.setAttribute("email", "Email Already exits");
						req.setAttribute("empId", "Already exits");
						// resp.sendRedirect(resp.encodeRedirectURL(req.getContextPath() +
						// "/register.vi"));
						rd.forward(req, resp);
					} else {
						// 404
						resp.sendRedirect("./html/404.html");
					}
				}
				break;
			case "login.vi":
				email = req.getParameter("email");
				pwd1 = req.getParameter("pwd1");
				System.out.println(email+ "   "+pwd1);
				if (email == null) {
					redirect = true;
					session.setAttribute("email", "Please Enter Valied Email Address");
				}
				if (pwd1 == null || pwd1.length() < 6) {
					redirect = true;
					session.setAttribute("pwd1", "Please Enter Valied Password");
				}
				if(redirect) {
					redirect=false;
					resp.sendRedirect("../login.vi");
				}
				else {
					teacher=TeacherDoa.loginTeacher(email,pwd1);
					System.out.println(teacher);
					if(teacher!=null) {
						if(teacher.getDesignation().equalsIgnoreCase("HOD")) {
							session.setAttribute("hod",teacher.getDesignation());
						}
						session.setAttribute("userID", teacher.getEmpId());
						session.setAttribute("Uname", teacher.getfName()+" "+teacher.getLname());
						session.setAttribute("user", teacher);
						resp.sendRedirect("../home.vi");
					}
					else{
						
						session.setAttribute("pwd1", "Wrong PAssword");
						session.setAttribute("email", "Wrong Email Address");
						resp.sendRedirect("../login.vi");
					}
				}
				break;
			case "home.vi":
				//create session
				session=req.getSession();
				//session.setAttribute("user", TeacherDoa.getTeacher(email));
				pw.println("<h1>hiiii");		
				break;
				
			case "update.vi":
				empId=req.getParameter("empId");
				fname=req.getParameter("fName");
				lname=req.getParameter("lName");
				mops=req.getParameter("mopSociety");
				qualification=req.getParameter("qualification");
				email=req.getParameter("email");
				mobile=req.getParameter("mobile");
				pwd1=req.getParameter("pwd");
				//gender=req.getParameter("gender");
				//designation=req.getParameter("desg");
				profilePic=req.getParameter("profilePic");
				empId=(String)session.getAttribute("userID");
				teacher= new Teacher(empId,fname,lname,mops,qualification,email,mobile,pwd1,gender,designation,profilePic);
				result=TeacherDoa.updateTeacher(teacher);
			case "vikas":
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
