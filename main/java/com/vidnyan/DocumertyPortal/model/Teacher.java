/**
 * 
 */
package com.vidnyan.DocumertyPortal.model;

/**
 * @author vikasnagare
 *
 */
public class Teacher {
	private String empId;
	private String email;
	private String pwd;
	private String fName;
	private String lname;
	private String mobile;
	private String qualification;
	private String profilePic;
	private String mopSociety;
	private String gender;
	private String designation;
	
	
	
	
	
	
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	public Teacher(String empId, String email, String pwd, String fName, String lname, String mobile,
			String qualification, String profilePic, String mopSociety, String gender, String designation) {
		super();
		this.empId = empId;
		this.email = email;
		this.pwd = pwd;
		this.fName = fName;
		this.lname = lname;
		this.mobile = mobile;
		this.qualification = qualification;
		this.profilePic = profilePic;
		this.mopSociety = mopSociety;
		this.gender = gender;
		this.designation = designation;
	}




	public Teacher(String fname2, String lname2, String empId2, String mobile2, String email2, String desig,String pwd1) {
		fName=fname2;
		lname=lname2;
		email=email2;
		empId=empId2;
		mobile=mobile2;
		pwd=pwd1;
		designation=desig;
	
	}
	/**
	 * 
	 */
	/**
	 * @return the fName
	 */
	public String getfName() {
		return fName;
	}
	/**
	 * @param fName the fName to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}
	/**
	 * @return the lname
	 */
	public String getLname() {
		return lname;
	}
	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}
	/**
	 * @return the empId
	 */
	public String getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	/**
	 * @return the mopSociety
	 */
	public String getMopSociety() {
		return mopSociety;
	}
	/**
	 * @param mopSociety the mopSociety to set
	 */
	public void setMopSociety(String mopSociety) {
		this.mopSociety = mopSociety;
	}
	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the pwd
	 */
	public String getPwd() {
		return pwd;
	}
	/**
	 * @param pwd the pwd to set
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	/**
	 * @return the qualification
	 */
	public String getQualification() {
		return qualification;
	}
	/**
	 * @param qualification the qualification to set
	 */
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}
	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	/**
	 * @return the profilePic
	 */
	public String getProfilePic() {
		return profilePic;
	}
	/**
	 * @param profilePic the profilePic to set
	 */
	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Teacher [fName=" + fName + ", lname=" + lname + ", empId=" + empId + ", mopSociety=" + mopSociety
				+ ", mobile=" + mobile + ", email=" + email + ", pwd=" + pwd + ", qualification=" + qualification
				+ ", gender=" + gender + ", designation=" + designation + ", profilePic=" + profilePic + "]";
	}

	
	
	

}
