package com.vidnyan.DocumertyPortal.model;

public class Bookbean {
	private String id=null;
	private String title=null;
	private String typebook;
	private String bookname=null;
	private String serise=null;
	private String index1=null;
	private String index2=null;
	private String index3=null;
	private String pub_date=null;
	private String pub_name=null;
	private String path=null;
	private String empid=null;
	


	public Bookbean(String id,String title, String typebook, String bookname, String serise, String index1,
			String index2, String index3, String pub_date, String pub_name,String path,String empid) {
		super();
		this.id = id;
		this.title = title;
		this.typebook = typebook;
		this.bookname = bookname;
		this.serise = serise;
		this.index1 = index1;
		this.index2 = index2;
		this.index3 = index3;
		this.pub_date = pub_date;
		this.pub_name = pub_name;
		this.path = path;
		this.empid = empid;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getTypebook() {
		return typebook;
	}



	public void setTypebook(String typebook) {
		this.typebook = typebook;
	}



	public String getBookname() {
		return bookname;
	}



	public void setBookname(String bookname) {
		this.bookname = bookname;
	}



	public String getSerise() {
		return serise;
	}



	public void setSerise(String serise) {
		this.serise = serise;
	}



	public String getIndex1() {
		return index1;
	}



	public void setIndex1(String index1) {
		this.index1 = index1;
	}



	public String getIndex2() {
		return index2;
	}



	public void setIndex2(String index2) {
		this.index2 = index2;
	}



	public String getIndex3() {
		return index3;
	}



	public void setIndex3(String index3) {
		this.index3 = index3;
	}



	public String getPub_date() {
		return pub_date;
	}



	public void setPub_date(String pub_date) {
		this.pub_date = pub_date;
	}



	public String getPub_name() {
		return pub_name;
	}



	public void setPub_name(String pub_name) {
		this.pub_name = pub_name;
	}



	public String getPath() {
		return path;
	}



	public void setPath(String path) {
		this.path = path;
	}



	public String getEmpid() {
		return empid;
	}



	public void setEmpid(String empid) {
		this.empid = empid;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Bookbean [id=" + id + ", title=" + title + ", typebook=" + typebook + ", bookname=" + bookname
				+ ", serise=" + serise + ", index1=" + index1 + ", index2=" + index2 + ", index3=" + index3
				+ ", pub_date=" + pub_date + ", pub_name=" + pub_name + ", path=" + path + ", empid=" + empid + "]";
	}


	

}
