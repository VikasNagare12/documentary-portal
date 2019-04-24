package com.vidnyan.DocumertyPortal.doa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vidnyan.DocumertyPortal.model.JournalBean;

public class JournalDoa {
	private static String JOURNAL_INSERT ="INSERT INTO JOURNAL VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
	private static String JOURNAL_SELECET ="SELECT * FROM JOURNAL where emp_ID=?";
	private static String JOURNAL_SELECETH ="SELECT * FROM JOURNAL";
	private static String JOURNAL_DELETE ="DELETE FROM JOURNAL WHERE joun_number=?";
	private static String QUERY_GET ="SELECT * FROM JOURNAL WHERE joun_number=?";
	private static String JOURNAL_UPDATE ="UPDATE JOURNAL SET joun_title=?" + 
			",joun_name=?" + 
			",joun_indexing1=?" + 
			",joun_indexing2=?" +
			",joun_indexing3=?" +
			",joun_impactfactor=?" + 
			",joun_volumenumber=?" + 
			",joun_publishname=?" + 	
			",joun_date=?"+
			"WHERE joun_number=?";

	public static int saveJournal(JournalBean journal) {
		Connection con = null;
		PreparedStatement pstmt = null;
		PreparedStatement pstmt1 = null;
		ResultSet rs = null;
		int result = 0;
		try {
			con = getConnection();
			System.out.println(journal);
			pstmt = con.prepareStatement(JOURNAL_INSERT);
			pstmt.setString(1,journal.getJoun_number());
			pstmt.setString(2,journal.getEmp_ID());
			pstmt.setString(3,journal.getJoun_name());
			pstmt.setString(4,journal.getJoun_title());
			pstmt.setString(5,journal.getJoun_indexing1());
			pstmt.setString(6,journal.getJoun_indexing2());
			pstmt.setString(7,journal.getJoun_indexing3());
			pstmt.setString(8,journal.getJoun_impactfactor());
			pstmt.setString(9,journal.getJoun_volumenumber());
			pstmt.setString(10, journal.getJoun_publishername());
			pstmt.setString(11,journal.getJoun_date());
			pstmt.setString(12,journal.getEmp_ID());
		//	pstmt.setString(13,journal.getJournalpath());
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
	
	public static int updateJournal(JournalBean journal) {
		Connection con = null;
		PreparedStatement pstmt = null;
		PreparedStatement pstmt1 = null;
		ResultSet rs = null;
		int result = 0;
		try {
			con = getConnection();
			
			pstmt = con.prepareStatement(JOURNAL_UPDATE);
			
			
			
			pstmt.setString(1, journal.getJoun_title());
			pstmt.setString(2, journal.getJoun_name());
			pstmt.setString(3, journal.getJoun_indexing1());
			pstmt.setString(4, journal.getJoun_indexing2());
			pstmt.setString(5, journal.getJoun_indexing3());
			pstmt.setString(6, journal.getJoun_impactfactor());
			pstmt.setString(7, journal.getJoun_volumenumber());
			pstmt.setString(8, journal.getJoun_publishername());
			pstmt.setString(9,journal.getJoun_date());
			pstmt.setString(10, journal.getJoun_number());
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
	public static int deleteJournal(String cid) {
		Connection con=null;
		int result=0;
		PreparedStatement stmt=null;
		try {
			con=getConnection();
			stmt=con.prepareStatement(JOURNAL_DELETE);
			stmt.setString(1, cid);
			result =stmt.executeUpdate();
			System.out.println("delete result"+result);
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
	public static ArrayList getAllJournalDetails(String empid) {
		Connection con=null;
		PreparedStatement stmt=null;
		ArrayList journalDetails = new ArrayList();
		JournalBean journal = null;
		ResultSet rs =  null;
		
		try {
			con=getConnection();
			stmt=con.prepareStatement(JOURNAL_SELECET);
			stmt.setString(1, empid);
			rs = stmt.executeQuery();
			
			while(rs.next())
			{
				journal=new JournalBean(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12));
				journalDetails.add(journal);
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

	public static JournalBean getjournalDeatails(String joun_number) {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement stmt=null;
		JournalBean journal = null;
		ResultSet rs =  null;
		
		try {
			con=getConnection();
			stmt=con.prepareStatement(QUERY_GET);
			stmt.setString(1,joun_number);
			rs = stmt.executeQuery();
			System.out.println(joun_number);
			while(rs.next())
			{
				journal=new JournalBean(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12));
				System.out.println("yes");
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
		return journal;	
	}
	
	
	public static ArrayList getAllJournalDetailsH() {
		Connection con=null;
		PreparedStatement stmt=null;
		ArrayList journalDetails = new ArrayList();
		JournalBean journal = null;
		ResultSet rs =  null;
		
		try {
			con=getConnection();
			stmt=con.prepareStatement(JOURNAL_SELECETH);
			rs = stmt.executeQuery();
			
			while(rs.next())
			{
				journal=new JournalBean(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12));
				journalDetails.add(journal);
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
