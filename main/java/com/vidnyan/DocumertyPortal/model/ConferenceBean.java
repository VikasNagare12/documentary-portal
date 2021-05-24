package com.vidnyan.DocumertyPortal.model;

public class ConferenceBean {

	
		private String ID;
		private String empID;
		private String title;
		private String name;
		private String publisher;
		private String indexing1;
		private String indexing2;
		private String indexing3;
		private String organizing;
		private String city;
		private String webadd;
		private String startdate;
		private String enddate;
		private String shortdesc;
		private String paperPath;
		/**
		 * @return the iD
		 */
		
		
		
		
		
		
		
		
		public String getID() {
			return ID;
		}
		public ConferenceBean() {
			super();
			// TODO Auto-generated constructor stub
		}
		public ConferenceBean(String iD, String empID, String title, String name, String publisher, String indexing1, String indexing2,
				String indexing3, String organizing, String city, String webadd, String startdate, String enddate,
				String shortdesc, String paperPath) {
			super();
			ID = iD;
			this.empID = empID;
			this.title = title;
			this.name = name;
			this.publisher = publisher;
			this.indexing1 = indexing1;
			this.indexing2 = indexing2;
			this.indexing3 = indexing3;
			this.organizing = organizing;
			this.city = city;
			this.webadd = webadd;
			this.startdate = startdate;
			this.enddate = enddate;
			this.shortdesc = shortdesc;
			this.paperPath = paperPath;
		}
		
		/**
		 * @param iD the iD to set
		 */
		public void setID(String iD) {
			ID = iD;
		}
		/**
		 * @return the title
		 */
		public String getTitle() {
			return title;
		}
		/**
		 * @param title the title to set
		 */
		public void setTitle(String title) {
			this.title = title;
		}
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}
		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}
		/**
		 * @return the publisher
		 */
		public String getPublisher() {
			return publisher;
		}
		/**
		 * @param publisher the publisher to set
		 */
		public void setPublisher(String publisher) {
			this.publisher = publisher;
		}
		/**
		 * @return the indexing1
		 */
		public String getIndexing1() {
			return indexing1;
		}
		/**
		 * @param indexing1 the indexing1 to set
		 */
		public void setIndexing1(String indexing1) {
			this.indexing1 = indexing1;
		}
		/**
		 * @return the indexing2
		 */
		public String getIndexing2() {
			return indexing2;
		}
		/**
		 * @param indexing2 the indexing2 to set
		 */
		public void setIndexing2(String indexing2) {
			this.indexing2 = indexing2;
		}
		/**
		 * @return the indexing3
		 */
		public String getIndexing3() {
			return indexing3;
		}
		/**
		 * @param indexing3 the indexing3 to set
		 */
		public void setIndexing3(String indexing3) {
			this.indexing3 = indexing3;
		}
		/**
		 * @return the organizing
		 */
		public String getOrganizing() {
			return organizing;
		}
		/**
		 * @param organizing the organizing to set
		 */
		public void setOrganizing(String organizing) {
			this.organizing = organizing;
		}
		/**
		 * @return the city
		 */
		public String getCity() {
			return city;
		}
		/**
		 * @param city the city to set
		 */
		public void setCity(String city) {
			this.city = city;
		}
		/**
		 * @return the webadd
		 */
		public String getWebadd() {
			return webadd;
		}
		/**
		 * @param webadd the webadd to set
		 */
		public void setWebadd(String webadd) {
			this.webadd = webadd;
		}
		/**
		 * @return the startdate
		 */
		public String getStartdate() {
			return startdate;
		}
		/**
		 * @param startdate the startdate to set
		 */
		public void setStartdate(String startdate) {
			this.startdate = startdate;
		}
		/**
		 * @return the enddate
		 */
		public String getEnddate() {
			return enddate;
		}
		/**
		 * @param enddate the enddate to set
		 */
		public void setEnddate(String enddate) {
			this.enddate = enddate;
		}
		/**
		 * @return the shortdesc
		 */
		public String getShortdesc() {
			return shortdesc;
		}
		/**
		 * @param shortdesc the shortdesc to set
		 */
		public void setShortdesc(String shortdesc) {
			this.shortdesc = shortdesc;
		}
		/**
		 * @return the paperPath
		 */
		public String getPaperPath() {
			return paperPath;
		}
		/**
		 * @param paperPath the paperPath to set
		 */
		public void setPaperPath(String paperPath) {
			this.paperPath = paperPath;
		}
		public String getEmpID() {
			return empID;
		}
		public void setEmpID(String empID) {
			this.empID = empID;
		}
		@Override
		public String toString() {
			return "ConferenceBean [ID=" + ID + ", empID=" + empID + ", title=" + title + ", name=" + name
					+ ", publisher=" + publisher + ", indexing1=" + indexing1 + ", indexing2=" + indexing2
					+ ", indexing3=" + indexing3 + ", organizing=" + organizing + ", city=" + city + ", webadd="
					+ webadd + ", startdate=" + startdate + ", enddate=" + enddate + ", shortdesc=" + shortdesc
					+ ", paperPath=" + paperPath + ", getID()=" + getID() + ", getTitle()=" + getTitle()
					+ ", getName()=" + getName() + ", getPublisher()=" + getPublisher() + ", getIndexing1()="
					+ getIndexing1() + ", getIndexing2()=" + getIndexing2() + ", getIndexing3()=" + getIndexing3()
					+ ", getOrganizing()=" + getOrganizing() + ", getCity()=" + getCity() + ", getWebadd()="
					+ getWebadd() + ", getStartdate()=" + getStartdate() + ", getEnddate()=" + getEnddate()
					+ ", getShortdesc()=" + getShortdesc() + ", getPaperPath()=" + getPaperPath() + ", getEmpID()="
					+ getEmpID() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}
	

}
