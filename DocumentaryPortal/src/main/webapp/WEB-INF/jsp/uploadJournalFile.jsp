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

							 <!--------------------->

				<form id="MyForm" action="./journal/upload.vi" enctype="multipart/form-data" method="post" class="needs-validation" novalidate="">
				<h3 class="header-title">Upload Journal File</h3>

				
				 <input type="type" name="conf_button" id="validationCustom16" class="btn btn-primary btn-lg btn-block" value="submit">
				</form>
			</div>
		</div>
	</div>

    