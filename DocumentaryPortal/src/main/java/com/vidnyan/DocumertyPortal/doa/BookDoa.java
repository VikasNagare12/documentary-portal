package com.vidnyan.DocumertyPortal.doa;
import java.sql.*;
import java.util.ArrayList;

import com.vidnyan.DocumertyPortal.model.Bookbean;

public class BookDoa {
	private static String BOOK_INSERT ="INSERT INTO book VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
	private static String QUERY_GET="SELECT * FROM book WHERE bid=?";
	private static String BOOK_SELECET ="SELECT * FROM book where empid=?";
	private static String BOOK_SELECETH ="SELECT * FROM book";
	private static String BOOK_DELETE ="DELETE FROM book WHERE bid=?";
	private static String BOOK_UPDATE ="UPDATE book SET title=?" + 
			",typebook=?" + 
			",bookname=?" + 
			",serise=?" + 		
			",index1=?" + 
			",index2=?" +
			",index3=?" +
			",pub_date=?" + 
			",pub_name=?" + 
			"WHERE bid=?";

	public static int saveBook(Bookbean BOOK) {
		Connection con = null;
		PreparedStatement pstmt = null;
		PreparedStatement pstmt1 = null;
		ResultSet rs = null;
		int result = 0;
		System.out.println(rs);
		try {
			con = getConnection();
			System.out.println(BOOK);
			pstmt = con.prepareStatement(BOOK_INSERT);
			pstmt.setString(1, BOOK.getId());
			pstmt.setString(2, BOOK.getTitle());
			pstmt.setString(3, BOOK.getTypebook());
			pstmt.setString(4, BOOK.getBookname());
			pstmt.setString(5, BOOK.getSerise());
			pstmt.setString(6, BOOK.getIndex1());
			pstmt.setString(7, BOOK.getIndex2());
			pstmt.setString(8, BOOK.getIndex3());
			pstmt.setString(9, BOOK.getPub_date());
			pstmt.setString(10, BOOK.getPub_name());
			pstmt.setString(11, BOOK.getPath());
			pstmt.setString(12, BOOK.getEmpid());	
			
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
	
	public static int updateBook(Bookbean BOOK) {
		Connection con = null;
		PreparedStatement pstmt = null;
		PreparedStatement pstmt1 = null;
		ResultSet rs = null;
		int result = 0;
		try {
			con = getConnection();
			
			pstmt = con.prepareStatement(BOOK_UPDATE);
			
			
			pstmt.setString(1, BOOK.getTitle());
			pstmt.setString(2, BOOK.getTypebook());
			pstmt.setString(3, BOOK.getBookname());
			pstmt.setString(4, BOOK.getSerise());
			pstmt.setString(5, BOOK.getIndex1());
			pstmt.setString(6, BOOK.getIndex2());
			pstmt.setString(7, BOOK.getIndex3());
			pstmt.setString(8, BOOK.getPub_date());
			pstmt.setString(9, BOOK.getPub_name());
			pstmt.setString(10, BOOK.getId());


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
	
	
	
	
	
	public static int deleteBook(String bid) {
		Connection con=null;
		int result=0;
		PreparedStatement stmt=null;
		try {
			con=getConnection();
			stmt=con.prepareStatement(BOOK_DELETE);
			stmt.setString(1, bid);
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
	
	
	
	public static ArrayList getAllBookDetails(String empid) {
		Connection con=null;
		PreparedStatement stmt=null;
		ArrayList BookDetails = new ArrayList();
		Bookbean Book = null;
		ResultSet rs =  null;
		
		try {
			con=getConnection();
			stmt=con.prepareStatement(BOOK_SELECET);
			stmt.setString(1, empid);
			rs = stmt.executeQuery();
			
			while(rs.next())
			{
				Book=new Bookbean(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12));
				BookDetails.add(Book);
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
		
		
		
		return BookDetails;
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

public static Bookbean getBookDetails(String id) {
	// TODO Auto-generated method stub
	Connection con=null;
	
	PreparedStatement stmt=null;
	
	Bookbean Book = null;
	ResultSet rs =  null;
	
	try {
		con=getConnection();
		System.out.println(id);
		stmt=con.prepareStatement(QUERY_GET);
		stmt.setString(1, id);
		rs = stmt.executeQuery();
		
		while(rs.next())
		{
			Book=new Bookbean(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12));
			
		}
		System.out.println(Book);
		
		
		
	}catch (Exception e) {
		e.printStackTrace();
	}finally {
		try {
			con.close();
		} catch (Exception e2) {
			System.out.println("close select");
		}
	}
	
	
	
	return Book;
}
public static ArrayList getAllBookDetailsH() {
	Connection con=null;
	PreparedStatement stmt=null;
	ArrayList BookDetails = new ArrayList();
	Bookbean Book = null;
	ResultSet rs =  null;
	
	try {
		con=getConnection();
		stmt=con.prepareStatement(BOOK_SELECETH);

		rs = stmt.executeQuery();
		
		while(rs.next())
		{
			Book=new Bookbean(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12));
			BookDetails.add(Book);
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
	
	
	
	return BookDetails;
}


}

