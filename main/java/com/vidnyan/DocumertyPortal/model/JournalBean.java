package com.vidnyan.DocumertyPortal.model;



public class JournalBean {
	private String joun_number;
	private String emp_ID;
	private String joun_name;
	private String joun_title;
	private String joun_indexing1;
	private String joun_indexing2;
	private String joun_indexing3;
	private String joun_impactfactor;
	private String joun_volumenumber;
	private String joun_publishername;
	private String joun_date;
	
	private String journalpath;
	public JournalBean() {
	}
	public JournalBean(String joun_number,String emp_ID,String joun_name, String joun_title, String joun_indexing1,
			String joun_indexing2, String joun_indexing3, String joun_impactfactor, String joun_volumenumber,
			String joun_publishername, String joun_date,String journalpath) {
		super();
		this.joun_number = joun_number;
		this.joun_name = joun_name;
		this.joun_title = joun_title;
		this.joun_indexing1 = joun_indexing1;
		this.joun_indexing2 = joun_indexing2;
		this.joun_indexing3 = joun_indexing3;
		this.joun_impactfactor = joun_impactfactor;
		this.joun_volumenumber = joun_volumenumber;
		this.joun_publishername = joun_publishername;
		this.joun_date = joun_date;
		this.emp_ID = emp_ID;
		this.journalpath = journalpath;
	}

	public String getJoun_number() {
		return joun_number;
	}

	public void setJoun_number(String joun_number) {
		this.joun_number = joun_number;
	}

	public String getJoun_name() {
		return joun_name;
	}

	public void setJoun_name(String joun_name) {
		this.joun_name = joun_name;
	}

	public String getJoun_title() {
		return joun_title;
	}

	public void setJoun_title(String joun_title) {
		this.joun_title = joun_title;
	}

	public String getJoun_indexing1() {
		return joun_indexing1;
	}

	public void setJoun_indexing1(String joun_indexing1) {
		this.joun_indexing1 = joun_indexing1;
	}

	public String getJoun_indexing2() {
		return joun_indexing2;
	}

	public void setJoun_indexing2(String joun_indexing2) {
		this.joun_indexing2 = joun_indexing2;
	}

	public String getJoun_indexing3() {
		return joun_indexing3;
	}

	public void setJoun_indexing3(String joun_indexing3) {
		this.joun_indexing3 = joun_indexing3;
	}

	public String getJoun_impactfactor() {
		return joun_impactfactor;
	}

	public void setJoun_impactfactor(String joun_impactfactor) {
		this.joun_impactfactor = joun_impactfactor;
	}

	public String getJoun_volumenumber() {
		return joun_volumenumber;
	}

	public void setJoun_volumenumber(String joun_volumenumber) {
		this.joun_volumenumber = joun_volumenumber;
	}

	public String getJoun_publishername() {
		return joun_publishername;
	}

	public void setJoun_publishername(String joun_publishername) {
		this.joun_publishername = joun_publishername;
	}

	public String getJoun_date() {
		return joun_date;
	}

	public void setJoun_date(String joun_date) {
		this.joun_date = joun_date;
	}
	public String getEmp_ID() {
		return emp_ID;
	}

	public void setEmp_ID(String emp_ID) {
		this.emp_ID = emp_ID;
	}

	public String getJournalpath() {
		return journalpath;
	}

	public void setJournalpath(String journalpath) {
		this.journalpath = journalpath;
	}

	@Override
	public String toString() {
		return "JournalBean [joun_number=" + joun_number + ", emp_ID=" + emp_ID +", joun_name=" + joun_name + ", joun_title=" + joun_title
				+ ", joun_indexing1=" + joun_indexing1 + ", joun_indexing2=" + joun_indexing2 + ", joun_indexing3="
				+ joun_indexing3 + ", joun_impactfactor=" + joun_impactfactor + ", joun_volumenumber="
				+ joun_volumenumber + ", joun_publishername=" + joun_publishername + ", joun_date=" + joun_date
				+ ", journalpath=" + journalpath + "]";
	}
	
}
