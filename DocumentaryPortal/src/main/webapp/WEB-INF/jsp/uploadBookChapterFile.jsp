<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<% String name=(String)session.getAttribute("userID");
if(name==null)
{
   response.sendRedirect("./login.vi");
}
%>

<div class="row">
	<div class="col-12 mt-5">
		<div class="card-body">



			<form id="MyForm" action="./book/upload.vi" method="post"
				enctype="multipart/form-data" class="needs-validation" novalidate="">
				<h3 class="header-title">Upload BookChapter file</h3>



				<div class="input-group mb-3">
					<div class="custom-file">
						<input type="file" class="custom-file-input" value=""
							name="conf_file_upload" id="validationCustom13"> <label
							class="custom-file-label" for="inputGroupFile02">Choose
							file</label>
					</div>
					<div class="input-group-append">
						<span class="input-group-text">Upload</span>
					</div>
				</div>

				<input type="submit" name="conf_button" id="validationCustom16"
					class="btn btn-primary btn-lg btn-block" value="submit">


			</form>
		</div>
	</div>
</div>
