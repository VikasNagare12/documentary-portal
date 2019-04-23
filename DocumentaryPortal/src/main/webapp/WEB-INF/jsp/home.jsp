<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Home</title>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="shortcut icon" type="image/png"
	href="assets/images/icon/favicon.ico">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/std/assets/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/std/assets/css/font-awesome.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/std/assets/css/float.css">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/std/assets/css/themify-icons.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/std/assets/css/metisMenu.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/std/assets/css/owl.carousel.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/std/assets/css/slicknav.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/std/assets/css/typography.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/std/assets/css/default-css.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/std/assets/css/styles.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/std/assets/css/responsive.css">
<link rel="stylesheet"
	href="https://www.amcharts.com/lib/3/plugins/export/export.css"
	type="text/css" media="all" />

<!-- modernizr css -->
<script src="${pageContext.request.contextPath}/std/assets/loader.js"
	type="text/javascript"></script>
<script
	src="${pageContext.request.contextPath}/std/assets/js/vendor/modernizr-2.8.3.min.js"
	type="text/javascript"></script>


<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#MyForm :input").prop("disabled", true);
		$("#MyForm2 :input").prop("disabled", true);
		$("#validationCustom15").hide();
		$("#validationCustom16").hide();
		$("#validationCustom14").hide();
	});
</script>
<script type="text/javascript">
	function edit() {
		alert("edit your details");
		$("#MyForm :input").prop("disabled", false);
		$("#MyForm2 :input").prop("disabled", false);
		$("#validationCustom15").show();
		$("#validationCustom16").show();
		$("#validationCustom14").show();
		$("#edit").hide();
		$("#delete").hide();
		$("#download").hide();
		$("#row").hide();
	}
</script>

<style>
body:before {
	content: '';
	position: fixed;
	background-image: url("./bb.jpg");
	width: 100vw;
	height: 100vh;
	background-position: center center;
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: cover;
	-webkit-filter: blur(px);
	-moz-filter: blur(px);
	-o-filter: blur(px);
	-ms-filter: blur(px);
	filter: blur(px);
	margin-left: 0px;
	margin-top: 71px;
}

body, html {
	height: 100%;
	margin: 0;
}

* {
	box-sizing: border-box;
}

.bg-image222 {
	/* The image used */
	background-image: url("./bb.jpg");
	/* Add the blur effect */
	filter: blur(2px);
	-webkit-filter: blur(2px);
	/* Full height */
	height: 100%;
	margin-bottom: -50;
	margin-left: -50;
	margin-right: -50;
	/* Center and scale the image nicely */
	background-position: center;
	background-repeat: no-repeat;
	background-size: cover;
	
}

/* Position text in the middle of the page/image */
.bg-text222 {
	font-family: Arial, Helvetica, sans-serif;
	background-color: rgb(0, 0, 0); /* Fallback color */
	background-color: rgba(0, 0, 0, 0.4); /* Black w/opacity/see-through */
	color: white;
	font-weight: bold;
	border: 0px solid #f1f1f1;
	position: absolute;
	top: 60%;
	left: 50%;
	transform: translate(-50%, -50%);
	z-index: 2;
	width: 100%;
	padding: 35px;
	text-align: center;
}
</style>


</head>
<body>
	<div class="page-container">
		<!-- sidebar menu area start -->
		<div class="sidebar-menu">

			<div class="sidebar-header">
				<div class="user-profile">
					<img class="avatar user-thumb"
						src="${pageContext.request.contextPath}/std/assets/images/author/avatar.png"
						alt="avatar">
				</div>
				<%
					if (session.getAttribute("userID") == null) {
						response.sendRedirect("./login.vi");
					}
				%>
				<h4 id="up"><a  href="#" id="up"><%=session.getAttribute("Uname")%></a></h4>
			</div>
			<div class="main-menu">
				<div class="menu-inner">
					<nav>
					<ul class="metismenu" id="menu">
					<% if(session.getAttribute("hod")!=null){
					%>
					<li class="active">
                                <a href="allTeacher.vi" aria-expanded="true"><i class="ti-dashboard"></i><span>Teacher</span></a>
                            </li>
                            <li class="active">
                                <a href="allConference.vi" aria-expanded="true"><i class="ti-dashboard"></i><span>All Conference</span></a>
                            </li>
                            <li class="active">
                                <a href="allJournal.vi" aria-expanded="true"><i class="ti-dashboard"></i><span>All Journal</span></a>
                            </li>
                            <li class="active">
                                <a href="allBook.vi" aria-expanded="true"><i class="ti-dashboard"></i><span>All Book Chapter</span></a>
                            </li>	
					<%} %>
						<li><a href="#" aria-expanded="true"><i
								class="ti-layout-sidebar-left"></i><span>Conference </span></a>
							<ul class="collapse">
								<li id="addConference"><a href="#">Add Conference</a>
									<ul class="collapse"></ul></li>

								<li id=""><a href="showConference.htm">My
										Conference Details</a></li>

							</ul></li>
						<li><a href="javascript:void(0)" aria-expanded="true"><i
								class="ti-pie-chart"></i><span>Journal</span></a>
							<ul class="collapse">
								<li id="addJournal"><a href="#">Add Journal Details</a>
									<ul class="collapse"></ul></li>
								<li id=""><a href="showJournal.htm">My Journal Details</a></li>

							</ul></li>

						<li><a href="javascript:void(0)" aria-expanded="true"><i
								class="ti-pie-chart"></i><span>Book Chapter</span></a>
							<ul class="collapse">
								<li id="addBook"><a href="#">Add Book Chapter</a>
									<ul class="collapse"></ul></li>
								<li><a href="showBook.htm">My Book Chapter</a></li>
							</ul></li>
					</ul>
					</nav>
				</div>
			</div>
		</div>
		<!-- sidebar menu area end -->
		<!-- main content area start -->
		<div class="main-content">
			<!-- header area start -->
			<div class="header-area">
				<div class="row align-items-center">
					<!-- nav and search button -->
					<div class="col-md-6 col-sm-8 clearfix">
						<div class="nav-btn pull-left">
							<span></span> <span></span> <span></span>
						</div>
						<div class="search-box pull-left">
							<form action="#">
								<input type="text" name="search" placeholder="Search..."
									required> <i class="ti-search"></i>
							</form>
						</div>
					</div>
					<!-- profile info & task notification -->
					<div class="col-md-6 col-sm-4 clearfix">
						<ul class="notification-area pull-right">
							<li class="dropdown"><i class="ti-bell dropdown-toggle"
								data-toggle="dropdown"> <span>2</span>
							</i>
							</li>
							<li class="dropdown">
								
							<li class="dropdown">
								<div>
									<a class="dropdown-item" href="/DocumertyPortal/jsp/logout.jsp">Log Out</a>
								</div>
							</li>
						</ul>
					</div>
				</div>
			</div>
			<!-- header area end -->
			<!-- page title area start -->
			<div class="page-title-area">
				<div class="row align-items-center">
					<div class="col-sm-6 clearfix"></div>
				</div>
			</div>
			<!-- page title area end -->
			<div class="main-content-inner" id="loadFile">


				<%
					String conferenceUpdate = (String) session.getAttribute("conferenceUpdate");
					if (conferenceUpdate != null) {
						if (conferenceUpdate.equals("showConference")) {
							session.setAttribute("conferenceUpdate", null);
				%>
				<jsp:include page="/updateConference.htm" />
				<%
					} else if (conferenceUpdate.equals("showjournal")) {
							session.setAttribute("conferenceUpdate", null);
				%>
				<jsp:include page="/updateJournal.htm" />
				<%
					}else if(conferenceUpdate.equals("showBook")) {
						session.setAttribute("conferenceUpdate", null);
						
					
				%>
					<jsp:include page="/updateBook.htm" />

				<%
					} else {
				%>
				<jsp:include page="/jsp/myhompage.html" />
				<%
					}
					}
				%>



			</div>
			<!-- main content area end -->
			<!-- footer area start-->
			<footer>
			<div class="footer-area">
				<p>
					© Copyright 2019. All right reserved. Vidnyan Co</a>.
				</p>
			</div>
			</footer>
			<!-- footer area end-->
		</div>
	</div>


	<!-- jquery latest version -->
	<script
		src="${pageContext.request.contextPath}/std/assets/js/vendor/jquery-2.2.4.min.js"
		type="text/javascript"></script>
	<!-- bootstrap 4 js -->
	<script
		src="${pageContext.request.contextPath}/std/assets/js/popper.min.js"
		type="text/javascript"></script>
	<script
		src="${pageContext.request.contextPath}/std/assets/js/bootstrap.min.js"
		type="text/javascript"></script>
	<script
		src="${pageContext.request.contextPath}/std/assets/js/owl.carousel.min.js"
		type="text/javascript"></script>
	<script
		src="${pageContext.request.contextPath}/std/assets/js/metisMenu.min.js"
		type="text/javascript"></script>
	<script
		src="${pageContext.request.contextPath}/std/assets/js/jquery.slimscroll.min.js"
		type="text/javascript"></script>
	<script
		src="${pageContext.request.contextPath}/std/assets/js/jquery.slicknav.min.js"
		type="text/javascript"></script>


	<!-- others plugins -->
	<script
		src="${pageContext.request.contextPath}/std/assets/js/plugins.js"
		type="text/javascript"></script>
	<script
		src="${pageContext.request.contextPath}/std/assets/js/scripts.js"
		type="text/javascript"></script>

	<script src="${pageContext.request.contextPath}/std/assets/loader.js"
		type="text/javascript"></script>


</body>
</html>