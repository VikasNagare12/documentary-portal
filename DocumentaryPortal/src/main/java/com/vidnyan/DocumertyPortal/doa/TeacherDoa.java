/**
 * 
 */
package com.vidnyan.DocumertyPortal.doa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vidnyan.DocumertyPortal.model.JournalBean;
import com.vidnyan.DocumertyPortal.model.Teacher;

/**
 * @author vikasnagare
 *
 */
public class TeacherDoa {
	private static String QUERY_INSERT = "insert into teacher(empid,email,pwd,fname,lname,mob,designation) values(?,?,?,?,?,?,?)";
	private static String QUERY_SELECT_CHECK = "select * from teacher where empid=?";
	private static String QUERY_LOGIN = "select * from teacher where email=? and pwd=?";
	private static String QUERY_SELECT_ALL_DETAILS = "select * from teacher where empid=?";
	private static String QUERY_SELECT_ALL_DETAILSH = "select * from teacher";
	private static String QUERY_UPDATE="update teacher set "+
	
			",email=?" +
			",pwd=?" +
			",fname=?" +
			",lname=?" +
			",mob=?" +
			",qualification=?" +
			",pic=?" +
			",mops=?" +
			",gender=?" +
			",designation=?" +
			"where empid=?"
			;
	private static String QUERY_DELETE="delete from teacher where empid=?";
	/**
	 * 
	 */
	public TeacherDoa() {
		// TODO Auto-generated constructor stub
	}

	public static int SaveTeacher(Teacher teacher) {
		Connection con = null;
		PreparedStatement pstmt = null;
		PreparedStatement pstmt1 = null;
		ResultSet rs = null;
		int result = 0;
		try {
			con = getConnection();
			pstmt1 = con.prepareStatement(QUERY_SELECT_CHECK);
			pstmt1.setString(1, teacher.getEmpId());
			rs = pstmt1.executeQuery();
			if (rs.next()) {
				return 2;
			}
			pstmt1.close();
			System.out.println(teacher);
			pstmt = con.prepareStatement(QUERY_INSERT);
			pstmt.setString(1, teacher.getEmpId());
			pstmt.setString(2, teacher.getEmail());
			pstmt.setString(3, teacher.getPwd());
			pstmt.setString(4, teacher.getfName());
			pstmt.setString(5, teacher.getLname());
			pstmt.setString(6, teacher.getMobile());
			pstmt.setString(7, teacher.getDesignation());
			result = pstmt.executeUpdate();
			if (result == 1) {
				return 1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				System.out.println("Register finally");
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return 3;
	}

	private static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/documentryportal", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return con;

	}

	public static Teacher loginTeacher(String email, String pwd1) {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Teacher teacher=null;
		try {
			con = getConnection();
			stmt = con.prepareStatement(QUERY_LOGIN);
			stmt.setString(1, email);
			stmt.setString(2, pwd1);
			rs = stmt.executeQuery();
			if (rs.next())
				teacher=new Teacher(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11));
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				System.out.println("login finally");
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return teacher;
	}
	public static Teacher getTeacher(String empId) {
		Connection con=null;
		PreparedStatement stmt=null;
		try {
			con=getConnection();
			stmt=con.prepareStatement(QUERY_SELECT_ALL_DETAILS);
			stmt.setString(1, empId);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (Exception e2) {
				System.out.println("close select");
			}
		}	
		return null;
	}

	public static int updateTeacher(Teacher teacher) {
	
		Connection con = null;
		PreparedStatement pstmt = null;
		PreparedStatement pstmt1 = null;
		ResultSet rs = null;
		int result = 0;
		try {
			con = getConnection();
			pstmt = con.prepareStatement(QUERY_UPDATE);
			pstmt.setString(1,teacher.getEmail());
			pstmt.setString(2,teacher.getPwd());
			pstmt.setString(3,teacher.getfName());
			pstmt.setString(4,teacher.getLname());
			pstmt.setString(5,teacher.getMobile());
			pstmt.setString(6,teacher.getQualification());
			pstmt.setString(7,teacher.getProfilePic());
			pstmt.setString(8,teacher.getMopSociety());
			pstmt.setString(9,teacher.getGender());
			pstmt.setString(10,teacher.getDesignation());
			result = pstmt.executeUpdate();
			
			if(result == 1) {
				return 1;
			}
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				System.out.println("Register finally");
				con.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		return 3;
	}

	
	public static int deleteTeacher(String empid)
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		PreparedStatement pstmt1 = null;
		ResultSet rs = null;
		int result=0;
		try
		{
			con = getConnection();
			pstmt = con.prepareStatement(QUERY_DELETE);
			result = pstmt.executeUpdate();
			return result;
			
		}
		catch(Exception e) {
			
		}
		return 1;
	}
	
	
	
	public static ArrayList getAllTeacherDetailsH() {
		Connection con=null;
		PreparedStatement stmt=null;
		ArrayList journalDetails = new ArrayList();
		Teacher teacher = null;
		ResultSet rs =  null;
		
		try {
			con=getConnection();
			stmt=con.prepareStatement(QUERY_SELECT_ALL_DETAILSH);
			rs = stmt.executeQuery();
			
			while(rs.next())
			{teacher=new Teacher(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11));
				journalDetails.add(teacher);
			}	
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (Exception e2) {
				System.out.println("close select");
			}
		}
		return journalDetails;
	}
}
