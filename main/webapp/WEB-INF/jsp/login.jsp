<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="x-ua-compatible" content="ie=edge">
<title>Login - srtdash</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="shortcut icon" type="image/png"
	href="assets/images/icon/favicon.ico">
<link rel="stylesheet" href="./std/assets/css/bootstrap.min.css">
<link rel="stylesheet" href="./std/assets/css/font-awesome.min.css">
<link rel="stylesheet" href="./std/assets/css/themify-icons.css">
<link rel="stylesheet" href="./std/assets/css/metisMenu.css">
<link rel="stylesheet" href="./std/assets/css/owl.carousel.min.css">
<link rel="stylesheet" href="./std/assets/css/slicknav.min.css">

<link rel="stylesheet" href="./std/assets/css/typography.css">
<link rel="stylesheet" href="./std/assets/css/default-css.css">
<link rel="stylesheet" href="./std/assets/css/styles.css">
<link rel="stylesheet" href="./std/assets/css/responsive.css">
<!-- modernizr css -->
<script src="./std/assets/js/vendor/modernizr-2.8.3.min.js"></script>
</head>

<body>

	<div id="preloader">
		<div class="loader"></div>
	</div>
	<!-- preloader area end -->
	<!-- login area start -->
	<div class="login-area login-bg">
		<div class="container">
			<div class="login-box ptb--100">
				<form action="./teacher/login.vi" class="needs-validation" novalidate="" method="post">
					<div class="login-form-head">
						<h4>Sign In</h4>
						<p>Hello Welcome to Documentry Portal</p>
					</div>
					<div class="login-form-body">
						<div class="form-group">
							<label for="validationCustom05">Email Address :</label> <input
								type="text" name="email" class="form-control"
								id="validationCustom01" required="">
							<div class="invalid-feedback">Please provide a Email address.</div>

						</div>
						<div class="form-group">
							<label for="validationCustom05">Password :</label> <input
								type="password" name="pwd1" class="form-control"
								id="validationCustom02" required="">
							<div class="invalid-feedback">Please provide a password.</div>

						</div>

						<div class="row mb-4 rmber-area">
							<div class="col-6">
								<div class="custom-control custom-checkbox mr-sm-2">
									<input type="checkbox" class="custom-control-input"
										id="customControlAutosizing"> <label
										class="custom-control-label" for="customControlAutosizing">Remember
										Me</label>
								</div>
							</div>
							<div class="col-6 text-right">
								<a href="#">Forgot Password?</a>
							</div>
						</div>
						<div class="submit-btn-area">
							<button id="form_submit" type="submit">
								Submit <i class="ti-arrow-right"></i>
							</button>
						</div>
						<div class="form-footer text-center mt-5">
							<p class="text-muted">
								Don't have an account? <a href="./register.vi">Sign up</a>
							</p>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
	<!-- login area end -->

	<!-- jquery latest version -->
	<script src="./std/assets/js/vendor/jquery-2.2.4.min.js"></script>
	<!-- bootstrap 4 js -->
	<script src="./std/assets/js/popper.min.js"></script>
	<script src="./std/assets/js/bootstrap.min.js"></script>
	<script src="./std/assets/js/owl.carousel.min.js"></script>
	<script src="./std/assets/js/metisMenu.min.js"></script>
	<script src="./std/assets/js/jquery.slimscroll.min.js"></script>
	<script src="./std/assets/js/jquery.slicknav.min.js"></script>

	<!-- others plugins -->
	<script src="./std/assets/js/plugins.js"></script>
	<script src="./std/assets/js/scripts.js"></script>
</body>

</html>