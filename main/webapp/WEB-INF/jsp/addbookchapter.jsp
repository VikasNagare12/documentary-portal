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
					<form class="needs-validation" action="./book/add.vi" method="post">
					<div class="card">
						<h4 class="header-title">Book Chapter</h4>


						<div class="form-group">
							<label for="validationCustom05">Book Number</label> <input
								type="text" name="bookid" class="form-control"
								id="validationCustom05" required="" />
							<div class="invalid-feedback">Please provide a Title.</div>

						</div>

						<div class="form-group">
							<label for="validationCustom05">Title Of Paper</label> <input
								type="text" name="tile" class="form-control"
								id="validationCustom05" required="">
							<div class="invalid-feedback">Please provide a Title.</div>

						</div>



						<div class="form-group">
							<label for="validationCustom05">Type of Book Chapter</label> <select
								class="form-control" name="typebook">
								<option value="t_conf">through conference</option>
								<option value="invited">invited book chapter</option>

							</select>

						</div>
						<div class="form-group">
							<label for="validationCustom05">Book Name</label> <input
								type="text" name="Bookname" class="form-control"
								id="validationCustom05" required="">
							<div class="invalid-feedback">Please provide a valid Book
								Name</div>

						</div>
						<div class="form-group">
							<label for="validationCustom05">Serise Name of Book</label> <input
								type="text" name="serise" class="form-control"
								id="validationCustom05" required="">
							<div class="invalid-feedback">Please provide a valid Serise
							</div>

						</div>

						<div class="form-group">
							<label for="validationCustom05">Indexing1</label> <input
								type="text" name="indexing1" class="form-control"
								id="validationCustom05" required="">
							<div class="invalid-feedback">Please provide a valid
								Indexing.</div>

						</div>
						<div class="form-group">
							<label for="validationCustom05">Indexing2</label> <input
								type="text" name="indexing2" class="form-control"
								id="validationCustom05" required="">
							<div class="invalid-feedback">Please provide a valid
								Indexing.</div>

						</div>
						<div class="form-group">
							<label for="validationCustom05">Indexing3</label> <input
								type="text" name="indexing3" class="form-control"
								id="validationCustom05" required="">
							<div class="invalid-feedback">Please provide a valid
								Indexing.</div>
						</div>
						<div class="form-group">
							<label for="validationCustom05" class="col-form-label">Date
								Of Publication</label> <input class="form-control" name="pub_date"
								type="date" value="" id="validationCustom05" required="">
							<div class="invalid-feedback">Please provide date.</div>
						</div>

						<div class="form-group">
							<label for="validationCustom05">Book Publisher Name</label> <input
								type="text" name="pub_name" class="form-control"
								id="validationCustom05" required="">
							<div class="invalid-feedback">Please provide a Publisher
								name.</div>
						</div>
						<input type="submit" name="conf_button" id="validationCustom16"
							class="btn btn-primary btn-lg btn-block" value="submit">
					</div>
					</form>
				</div>
				</div>
			</div>
		
	