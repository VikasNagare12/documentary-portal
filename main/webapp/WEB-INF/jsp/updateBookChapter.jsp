<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.vidnyan.DocumertyPortal.model.Bookbean"%>
<%
	Bookbean book = (Bookbean) session.getAttribute("Book");
	System.out.println(book);
%>


<%
	String name = (String) session.getAttribute("userID");
	if (name == null) {
		response.sendRedirect("./login.vi");
	}
%>
<div  class="row">

	<div class="col-2"></div>
	<div class="col-8">

					<!--------------------->
					<div class="row">
						<div class="col-4">

							<button data-inline="true" id="edit" onclick="edit()"
								class="btn btn-primary btn-lg btn-block">Edit details</button>
						</div>
						<div class="col-4">
							<button type="button" id="delete"
								onclick="window.location='./delete.vi?id=<%=book.getId()%>';"
								class="btn btn-danger btn-lg btn-block">Delete</button>
						</div>
						<div class="col-4">
							<button type="button" id="download" onclick=""
								class="btn btn-dark btn-lg btn-block">Download file</button>
						</div></div>
			<form id="MyForm" class="needs-validation" novalidate=""
				action="./book/update.vi" " method="post">
			<div class="card">
				<h4 class="header-title">Book Chapter</h4>
				<div class="form-group">
					<label for="validationCustom05">Book number</label> <input
						type="text" name="bookid" class="form-control"
						id="validationCustom05" value="<%=book.getId()%>" required="">
					<div class="invalid-feedback">Please provide a Title.</div>

				</div>

				<div class="form-group">
					<label for="validationCustom05">Title Of Paper</label> <input
						type="text" name="title" class="form-control"
						id="validationCustom05" value="<%=book.getTitle()%>" required="">
					<div class="invalid-feedback">Please provide a Title.</div>

				</div>



				<div class="form-group">
					<label for="validationCustom05">Type of Book Chapter</label> <select
						name="typebook" class="form-control" value=<%=book.getTypebook()%>>
						<option value="t_conf">through conference</option>
						<option value="invited">invited book chapter</option>

					</select>

				</div>
				<div class="form-group">
					<label for="validationCustom05">Book Name</label> <input
						type="text" name="Bookname" class="form-control"
						id="validationCustom05" value="<%=book.getBookname()%>"
						required="">
					<div class="invalid-feedback">Please provide a valid Book
						Name</div>

				</div>
				<div class="form-group">
					<label for="validationCustom05">Serise Name of Book</label> <input
						type="text" name="serise" class="form-control"
						id="validationCustom05" value="<%=book.getSerise()%>" required="">
					<div class="invalid-feedback">Please provide a valid Serise</div>
				</div>
				<div class="form-group">
					<label for="validationCustom05">Indexing1</label> <input
						type="text" name="indexing1" class="form-control"
						id="validationCustom05" value="<%=book.getIndex1()%>" required="">
					<div class="invalid-feedback">Please provide a valid
						Indexing.</div>
				</div>
				<div class="form-group">
					<label for="validationCustom05">Indexing2</label> <input
						type="text" name="indexing2" class="form-control"
						id="validationCustom05" value="<%=book.getIndex2()%>" required="">
					<div class="invalid-feedback">Please provide a valid
						Indexing.</div>
				</div>
				<div class="form-group">
					<label for="validationCustom05">Indexing3</label> <input
						type="text" name="indexing3" class="form-control"
						id="validationCustom05" value="<%=book.getIndex3()%>" required="">
					<div class="invalid-feedback">Please provide a valid
						Indexing.</div>
				</div>
				<div class="form-group">
					<label for="validationCustom05" class="col-form-label">Date
						Of Publication</label> <input class="form-control" name="pub_date"
						type="date" value="" id="validationCustom05"
						value="<%=book.getPub_date()%>" required="">
					<div class="invalid-feedback">Please provide date.</div>
				</div>
				<div class="form-group">
					<label for="validationCustom05">Book Publisher Name</label> <input
						type="text" name="pub_name" class="form-control"
						id="validationCustom05" value="<%=book.getPub_name()%>"
						required="">
					<div class="invalid-feedback">Please provide a Publisher
						name.</div>
				</div>
				<input type="submit" name="conf_button" id="validationCustom16"
					class="btn btn-primary btn-lg btn-block" value="submit">
				</div>
		</form>



<form id="MyForm2" action="./book/upload.vi" method="post"
	class="needs-validation" novalidate="">


	<div class="input-group mb-3">
		<div class="custom-file">
			<input type="file" id="validationCustom17" class="custom-file-input"
				value="" name="conf_file_upload" id="validationCustom13"> <label
				class="custom-file-label" for="inputGroupFile02">Choose file</label>
		</div>
		<div class="input-group-append">
			<span class="input-group-text">Upload</span>
		</div>
	</div>
	<input type="submit" name="conf_button" id="validationCustom18"
		class="btn btn-primary btn-lg btn-block" value="submit">

</form>

</div></div>