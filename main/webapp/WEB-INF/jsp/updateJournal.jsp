<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.vidnyan.DocumertyPortal.model.JournalBean"%>

<%
	JournalBean journal = (JournalBean) session.getAttribute("journal");
	System.out.print(journal);
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

					<div class="row">
						<div class=" col-4 mt-5">
							<button data-inline="true" id="edit" onclick="edit()"
								class="btn btn-primary btn-lg btn-block">Edit details</button>
						</div>
						<div class=" col-4 mt-5">
							<button type="button" id="delete"
								onclick="window.location.href='./journal/delete.vi?id=<%=journal.getJoun_number()%>';"
								class="btn btn-danger btn-lg btn-block">Delete</button>
						</div>
						<div class=" col-4 mt-5">
							<button type="button" id="download" onclick=""
								class="btn btn-dark btn-lg btn-block">Download file</button>
						</div>
					</div>


					<form id="MyForm" action="./journal/update.vi" method="post"
						class="needs-validation" novalidate="">
					<div class="card">
						<center>
							<h3 class="header-title center">Manage Journal Details</h3>
						</center>
						<input type="hidden" name="id"
							value="<%=journal.getJoun_number()%>">
						<div class="form-group">
							<label for="validationCustom05">Journal Number :</label> <input
								type="text" name="joun_number" class="form-control"
								id="validationCustom05" required=""
								value="<%=journal.getJoun_number()%>">
							<div class="invalid-feedback">Please provide a Number.</div>

						</div>

						<div class="form-group">
							<label for="validationCustom05">Journal Name :</label> <input
								type="text" name="joun_name" class="form-control"
								id="validationCustom05" required=""
								value="<%=journal.getJoun_name()%>">
							<div class="invalid-feedback">Please provide a valid
								Journal Name</div>

						</div>


						<div class="form-group">
							<label for="validationCustom05">Paper Title :</label> <input
								type="text" name="joun_title" class="form-control"
								id="validationCustom05" required=""
								value="<%=journal.getJoun_title()%>">
							<div class="invalid-feedback">Please provide a valid Paper
								Name</div>

						</div>


						<div class="form-group">
							<label for="validationCustom05">Indexing 1</label> <input
								type="text" name="joun_indexing1" class="form-control"
								id="validationCustom05" required=""
								value="<%=journal.getJoun_indexing1()%>">
							<div class="invalid-feedback">Please provide a valid
								Indexing.</div>

						</div>

						<div class="form-group">
							<label for="validationCustom05">Indexing 2</label> <input
								type="text" name="joun_indexing2" class="form-control"
								id="validationCustom05" required=""
								value="<%=journal.getJoun_indexing2()%>">
							<div class="invalid-feedback">Please provide a valid
								Indexing.</div>

						</div>

						<div class="form-group">
							<label for="validationCustom05">Indexing 3</label> <input
								type="text" name="joun_indexing3" class="form-control"
								id="validationCustom05" required=""
								value="<%=journal.getJoun_indexing3()%>">
							<div class="invalid-feedback">Please provide a valid
								Indexing.</div>

						</div>

						<div class="form-group">
							<label for="validationCustom05">Impact Factor :</label> <input
								type="text" name="joun_impactfactor" class="form-control"
								id="validationCustom05" required=""
								value="<%=journal.getJoun_impactfactor()%>">
							<div class="invalid-feedback">Please provide a Impact
								Factor</div>

						</div>

						<div class="form-group">
							<label for="validationCustom05">Volume Number :</label> <input
								type="text" name="joun_volumenumber" class="form-control"
								id="validationCustom05" required=""
								value="<%=journal.getJoun_volumenumber()%>">
							<div class="invalid-feedback">Please provide a valid Volume
								Number</div>

						</div>

						<div class="form-group">
							<label for="validationCustom05">Publisher Name :</label> <input
								type="text" name="joun_publishername" class="form-control"
								id="validationCustom05" required=""
								value="<%=journal.getJoun_publishername()%>">
							<div class="invalid-feedback">Please provide a Publisher
								name.</div>
						</div>

						<div class="form-group">
							<label for="validationCustom05" class="col-form-label">Date
								Of Publication :</label> <input class="form-control" name="joun_date"
								type="date" value="" id="validationCustom05" required=""
								value="<%=journal.getJoun_date()%>">
							<div class="invalid-feedback">Please provide date.</div>
						</div>

						<div class="form-group">
							<div class="form-check">
								<input class="form-check-input" type="checkbox" value=""
									id="validationCustom14" required=""> <label
									class="form-check-label" id="validationCustom15"
									for="invalidCheck"> Agree to terms and conditions </label>
								<div class="invalid-feedback">You must agree before
									submitting.</div>
							</div>
						</div>

						<input type="submit" name="conf_button" id="validationCustom18"
							class="btn btn-primary btn-lg btn-block" value="submit">
					</div>
					</form>
					<div style="margin-top: 50px;">
					<form id="MyForm2" action="./journal/uploaddate.vi" method="post"
						enctype="multipart/form-data" class="needs-validation"
						novalidate="">

						<div class="input-group mb-3">
							<div class="custom-file">
								<input type="file" class="custom-file-input"
									name="conf_file_upload" id="validationCustom17" value="">
								<label class="custom-file-label" for="inputGroupFile02">Choose
									file</label>
							</div>
							<div class="input-group-append">
								<span class="input-group-text">Upload</span>
							</div>
						</div>
						<input type="submit" name="conf_button" id="validationCustom18"
							class="btn btn-primary btn-lg btn-block" value="submit">
					</form>
					</div>
				</div>
			</div>
		