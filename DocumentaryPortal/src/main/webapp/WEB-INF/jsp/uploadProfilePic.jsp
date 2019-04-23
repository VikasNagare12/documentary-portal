<% String name=(String)session.getAttribute("userID");
if(name==null)
{
   response.sendRedirect("./login.vi");
}
%>

<div class="row">
	<div class="col-12 mt-5">
			<div class="card-body">
				
                      
				<form id="MyForm" action="./teacher/update.vi" enctype="multipart/form-data"class="needs-validation" novalidate="">
				<h3 class="header-title">Upload Profile Pic</h3>
                 
				 
				 <div class="form-group">
                    <label for="validationCustom05">Profile Pic</label>
				 <div class="input-group mb-3">
					<div class="custom-file">
					   <input type="file" class="custom-file-input" name="profilePic" id="inputGroupFile02">
					   <label class="custom-file-label" for="inputGroupFile02">Choose file</label>
					</div>
					<div class="input-group-append">
					   <span class="input-group-text">Upload</span>
					</div>
				 </div>
				<input type="submit" name="conf_button" id="validationCustom16" class="btn btn-primary btn-lg btn-block" value="submit">
			   
				
				</form>
			</div>
		</div>
	</div>
	
	
	
	
	
	
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
		
<script
	src="${pageContext.request.contextPath}/std/assets/loader.js"
	type="text/javascript"></script>
		
</body>

</html>