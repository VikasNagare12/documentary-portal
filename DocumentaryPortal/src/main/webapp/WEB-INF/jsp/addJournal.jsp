<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
	String name = (String) session.getAttribute("userID");
	if (name == null) {
		response.sendRedirect("./login.vi");
	}
%>

<div  class="row">
<div class="col-2"></div>
<div class="card-body">
	
	<div class="col-9">
					<form action="./journal/add.vi" method="post"
						class="needs-validation" novalidate="">
					<div class="card">

						<h4 class="header-title">Journal Details</h4>
						<div class="form-group">
							<label for="validationCustom05">Journal Number :</label> <input
								type="text" name="joun_number" class="form-control"
								id="validationCustom05" required="">
							<div class="invalid-feedback">Please provide a Number.</div>

						</div>

						<div class="form-group">
							<label for="validationCustom05">Journal Name :</label> <input
								type="text" name="joun_name" class="form-control"
								id="validationCustom05" required="">
							<div class="invalid-feedback">Please provide a valid
								Journal Name</div>

						</div>


						<div class="form-group">
							<label for="validationCustom05">Paper Title :</label> <input
								type="text" name="joun_title" class="form-control"
								id="validationCustom05" required="">
							<div class="invalid-feedback">Please provide a valid Paper
								Name</div>

						</div>


						<div class="form-group">
							<label for="validationCustom05">Indexing</label> <input
								type="text" name="joun_indexing1" class="form-control"
								id="validationCustom05" required="">
							<div class="invalid-feedback">Please provide a valid
								Indexing.</div>

						</div>

						<div class="form-group">
							<label for="validationCustom05">Indexing</label> <input
								type="text" name="joun_indexing2" class="form-control"
								id="validationCustom05" required="">
							<div class="invalid-feedback">Please provide a valid
								Indexing.</div>

						</div>

						<div class="form-group">
							<label for="validationCustom05">Indexing</label> <input
								type="text" name="joun_indexing3" class="form-control"
								id="validationCustom05" required="">
							<div class="invalid-feedback">Please provide a valid
								Indexing.</div>

						</div>

						<div class="form-group">
							<label for="validationCustom05">Impact Factor :</label> <input
								type="text" name="joun_impactfactor" class="form-control"
								id="validationCustom05" required="">
							<div class="invalid-feedback">Please provide a Impact
								Factor</div>

						</div>

						<div class="form-group">
							<label for="validationCustom05">Volume Number :</label> <input
								type="text" name="joun_volumenumber" class="form-control"
								id="validationCustom05" required="">
							<div class="invalid-feedback">Please provide a valid Volume
								Number</div>

						</div>

						<div class="form-group">
							<label for="validationCustom05">Publisher Name :</label> <input
								type="text" name="joun_publishername" class="form-control"
								id="validationCustom05" required="">
							<div class="invalid-feedback">Please provide a Publisher
								name.</div>
						</div>

						<div class="form-group">
							<label for="validationCustom05" class="col-form-label">Date
								Of Publication :</label> <input class="form-control" name="joun_date"
								type="date" value="" id="validationCustom05" required="">
							<div class="invalid-feedback">Please provide date.</div>
						</div>
						<input type="submit" name="conf_button" id="validationCustom16"
							class="btn btn-primary btn-lg btn-block" value="submit">
						</div>
					</form>
				</div>
			</div>
			</div>
			
	