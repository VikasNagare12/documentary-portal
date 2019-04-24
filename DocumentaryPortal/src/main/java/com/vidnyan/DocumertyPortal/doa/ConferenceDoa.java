package com.vidnyan.DocumertyPortal.doa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vidnyan.DocumertyPortal.model.ConferenceBean;

public class ConferenceDoa {

	private static String CONFERANCE_INSERT ="INSERT INTO CONFERANCE VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	private static String QUERY_GET="SELECT * FROM CONFERANCE WHERE id=?";
	private static String CONFERANCE_SELECET ="SELECT * FROM CONFERANCE where empID=?";
	private static String CONFERANCE_SELECETH ="SELECT * FROM CONFERANCE";
	
	private static String CONFERANCE_DELETE ="DELETE FROM CONFERANCE WHERE id=?";
	private static String CONFERANCE_UPDATE ="UPDATE CONFERANCE SET title=?" + 
			",name=?" + 
			",publisher=?" + 
			",indexing1=?" + 
			",indexing2=?" +
			",indexing3=?" +
			",orgnanizing=?" + 
			",city=?" + 
			",webadd=?" + 
			",startdate=?" + 
			",enddate=?" + 
			",shortdesc=?" + 
			//"PaperPath=?" +*/
			"WHERE id=?";

	public static int saveConference(ConferenceBean conferance) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		ResultSet rs = null;
		int result = 0;
		try {
			
			System.out.println(conferance);
			con= getConnection();
			pstmt = con.prepareStatement(CONFERANCE_INSERT);
			pstmt.setString(1, conferance.getID());
			pstmt.setString(2, conferance.getEmpID());
			pstmt.setString(3, conferance.getTitle());
			pstmt.setString(4, conferance.getName());
			pstmt.setString(5, conferance.getPublisher());
			pstmt.setString(6, conferance.getIndexing1());
			pstmt.setString(7, conferance.getIndexing2());
			pstmt.setString(8, conferance.getIndexing3());
			pstmt.setString(9, conferance.getOrganizing());
			pstmt.setString(10, conferance.getCity());
			pstmt.setString(11, conferance.getWebadd());
			pstmt.setString(12, conferance.getStartdate());
			pstmt.setString(13, conferance.getEnddate());
			pstmt.setString(14, conferance.getShortdesc());
			pstmt.setString(15, conferance.getPaperPath());
			
			
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
	
	public static int updateConference(ConferenceBean conferance) {
		Connection con = null;
		PreparedStatement pstmt = null;
		PreparedStatement pstmt1 = null;
		ResultSet rs = null;
		int result = 0;
		try {
			con = getConnection();
			
			pstmt = con.prepareStatement(CONFERANCE_UPDATE);
			
			pstmt.setString(1, conferance.getTitle());
			pstmt.setString(2, conferance.getName());
			pstmt.setString(3, conferance.getPublisher());
			pstmt.setString(4, conferance.getIndexing1());
			pstmt.setString(5, conferance.getIndexing2());
			pstmt.setString(6, conferance.getIndexing3());
			pstmt.setString(7, conferance.getOrganizing());
			pstmt.setString(8, conferance.getCity());
			pstmt.setString(9, conferance.getWebadd());
			pstmt.setString(10, conferance.getStartdate());
			pstmt.setString(11, conferance.getEnddate());
			pstmt.setString(12, conferance.getShortdesc());
			//pstmt.setString(13, conferance.getPaperPath());
			pstmt.setString(13, conferance.getID());
			
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
	
	
	
	
	
	public static int deleteConference(String cid) {
		Connection con=null;
		int result=0;
		PreparedStatement stmt=null;
		try {
			con=getConnection();
			stmt=con.prepareStatement(CONFERANCE_DELETE);
			stmt.setString(1, cid);
			result =stmt.executeUpdate();
			if(result==1)
				return result;
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (Exception e2) {
				System.out.println("close select");
			}
		}
		
		
		
		return result;
	}
	
	
	
	public static ArrayList getAllConferenceDetails(String empid) {
		Connection con=null;
		PreparedStatement stmt=null;
		
		ArrayList<ConferenceBean> conferenceDetails = new ArrayList();
		ConferenceBean conference = null;
		ResultSet rs =  null;
		
		try {
			con=getConnection();
			stmt=con.prepareStatement(CONFERANCE_SELECET);
			stmt.setString(1, empid);
			rs = stmt.executeQuery();
			while(rs.next())
			{
				conference=new ConferenceBean(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15));
				conferenceDetails.add(conference);
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
		
		
		
		return conferenceDetails;
	}
	
	
	
	
	
	public static ArrayList getAllConferenceDetailsH() {
		Connection con=null;
		PreparedStatement stmt=null;
		ArrayList conferenceDetails = new ArrayList();
		ConferenceBean conference = null;
		ResultSet rs =  null;
		
		try {
			con=getConnection();
			stmt=con.prepareStatement(CONFERANCE_SELECETH);
			rs = stmt.executeQuery();
			while(rs.next())
			{
				conference=new ConferenceBean(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15));
				conferenceDetails.add(conference);
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
		
		
		
		return conferenceDetails;
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

	public static String getID() {
		Connection con=null;
		ResultSet rs = null;
		String id = null;
		int result=0;
		PreparedStatement stmt=null;
		PreparedStatement stmt1=null;
		try {
			con=getConnection();
			stmt=con.prepareStatement("SELECT * FROM ID");
			
			rs =stmt.executeQuery();
			if(rs.next())
				id= rs.getString(1);
			stmt1 = con.prepareStatement("UPDATE ID SET id = ?");
			result = Integer.parseInt(id);
			result = result+1;
			
			stmt1.setString(1, result+"");
			stmt1.executeUpdate();
			return id;
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (Exception e2) {
				System.out.println("close select");
			}
		}
		
		
		
		return id;
	}

	public static ConferenceBean getConferenceDetails(String id) {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement stmt=null;
		
		ConferenceBean conference = null;
		ResultSet rs =  null;
		
		try {
			con=getConnection();
			stmt=con.prepareStatement(QUERY_GET);
			stmt.setString(1, id);
			rs = stmt.executeQuery();
			
			while(rs.next())
			{
				conference=new ConferenceBean(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15));
				
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
		
		
		
		return conference;
	}

}

