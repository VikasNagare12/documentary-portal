<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html class="no-js" lang="en">
<head>
<meta charset="utf-8" content="">
<title>Sign up</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="shortcut icon" type="image/png"
	href="assets/images/icon/favicon.ico">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/std/assets/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/std/assets/css/font-awesome.min.css">
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
<!-- modernizr css -->
<script
	src="${pageContext.request.contextPath}/std/assets/js/vendor/modernizr-2.8.3.min.js"
	type="text/javascript"></script>
</head>
<body>
	<h1></h1>
	<div id="preloader">
		<div class="loader"></div>
	</div>
	<div class="login-area login-bg">
		<div class="container" style="margin-top: -70px;">
			<div class="login-box ptb--100">
				<form
					action="${pageContext.request.contextPath}/teacher/register.vi"
					method="post">
					<div class="login-form-head">
						<h4>Sign up</h4>
						<p>Hello there, Sign up and Join with Us</p>
					</div>
					<div class="login-form-body">
						<div class="row">
							<div class="col-6">
								<div class="form-gp">
									<label for="validationCustom05">First Name</label> <input
										type="text" id="validationCustom01" name="fname"
										value=<%if (request.getParameter("fname") != null) {
				out.println(request.getParameter("fname"));
				
			}%>>
			<div class="invalid-feedback">
				Please Provide a First Name 
				</div>
									<i class="ti-user"> </i> <span style="color: red;"> <%
 	if (request.getAttribute("fname") != null) {
 		out.println(request.getAttribute("fname"));
 		request.removeAttribute("fname");
 	}
 %>
									</span>
								</div>
							</div>
							<div class="col-6">
								<div class="form-gp">
									<label for="validationCustom05">Last Name</label> <input
										type="text" id="validationCustom02" name="lname"
										value=<%if (request.getParameter("lname") != null) {
				out.println(request.getParameter("lname"));
			}%>>
			<div class="invalid-feedback">
				Please Provide a Last Name 
				</div>
									<i class="ti-user"></i> <span style="color: red;"> <%
 	if (request.getAttribute("lname") != null) {
 		out.println(request.getAttribute("lname"));
 		request.removeAttribute("lname");
 	}
 %>
									</span>
								</div>
							</div>
						</div>
						<div class="form-gp">
							<label for="validationCustom05">Employee Id</label> <input
								type="text" id="validationCustom03" name="empid"
								value=<%if (request.getParameter("empid") != null) {
				out.println(request.getParameter("empid"));
			}%>>
			<div class="invalid-feedback">
				Please Provide a Employee Id 
				</div>
							<i class="ti-user"></i> <span style="color: red;"> <%
 	if (request.getAttribute("empId") != null) {
 		out.println(request.getAttribute("empId"));
 		request.removeAttribute("empId");
 	}
 %>
							</span>
						</div>
						<div class="form-gp">
							<label for="validationCustom05">Mobile Number</label> <input
								type="text" id="validationCustom04" name="mob"
								value=<%if (request.getParameter("mob") != null) {
				out.println(request.getParameter("mob"));
			}%>>
			<div class="invalid-feedback">
				Please Provide a Mobile No. 
				</div>
							<i class="ti-mobile"></i> <span style="color: red;"> <%
 	if (request.getAttribute("mob") != null) {
 		out.println(request.getAttribute("mob"));
 		request.removeAttribute("mob");
 	}
 %>
							</span>
						</div>
						<div class="form-gp">
							<label for="validationCustom05">Email address</label> <input
								type="email" id="validationCustom05"" name="email"
								value=<%if (request.getParameter("email") != null) {
				out.println(request.getParameter("email"));
			}%>>
			<div class="invalid-feedback">
				Please Provide a Email address 
				</div>
							<i class="ti-email"></i> <span style="color: red;"> <%
 	if (request.getAttribute("email") != null) {
 		out.println(request.getAttribute("email"));
 		request.removeAttribute("email");
 	}
 %>
							</span>
						</div>
						<div class="form-group">
                        <label class="validationCustom05">Designation</label>
                                            <select class="form-control"  id="validationCustom06" name="designation">
                                                <option value="Faculty">Faculty</option>
                                                <option value="HOD">HOD</option>
                                            </select>
					<div class="invalid-feedback">
				Please Provide a Designation 
				</div>
					</div>
						<div class="form-gp">
							<label for="validationCustom05">Password</label> <input
								type="password" id="validationCustom07" name="pwd1">
							<i class="ti-lock"></i> <span style="color: red;"> 
							<div class="invalid-feedback">
				Please Provide a Password 
				</div>
							<%
 	if (request.getAttribute("pwd1") != null) {
 		out.println(request.getAttribute("pwd1"));
 		request.removeAttribute("pwd1");
 	}
 %>
							</span>
						</div>
						<div class="form-gp">
							<label for="validationCustom05">Confirm Password</label> <input
								type="password" id="validationCustom08" name="pwd2">
							<i class="ti-lock"></i> <span style="color: red;"> 
							<div class="invalid-feedback">
				Please Provide a Confirm Password 
				</div>
							<%
 	if (request.getAttribute("pwd2") != null) {
 		out.println(request.getAttribute("pwd2"));
 		request.removeAttribute("pwd2");
 	}
 %>
							</span>
						</div>
						<div class="submit-btn-area">
							<button id="form_submit" type="submit">
								Submit <i class="ti-arrow-right"></i>
							</button>
						</div>
						<div class="form-footer text-center mt-5">
							<p class="text-muted">
								Don't have an account? <a href="${pageContext.request.contextPath}/login.vi">Sign in</a>
							</p>
						</div>
					</div>
				</form>
			</div>
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
</body>
</html>