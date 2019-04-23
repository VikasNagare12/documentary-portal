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
					<form action="./conference/add.vi" method="post"
						class="needs-validation" novalidate="">
					<div class="card">
						<h4 class="header-title">Add new conference</h4>
						<div class="form-group">
							<label for="validationCustom05">Title</label> <input type="text"
								name="conf_title" class="form-control" id="validationCustom05"
								required="">
							<div class="invalid-feedback">Please provide a Title.</div>
						</div>
						<div class="form-group">
							<label for="validationCustom05">Conference Name</label> <input
								type="text" name="conf_name" class="form-control"
								id="validationCustom05" required="">
							<div class="invalid-feedback">Please provide a valid
								Conference Name.</div>
						</div>
						<div class="form-group">
							<label for="validationCustom05">Conference proceeding
								publisher</label> <input type="text" name="conf_proceding"
								class="form-control" id="validationCustom05" required="">
							<div class="invalid-feedback">Please provide a valid
								Conference proceeding publisher.</div>
						</div>
						<div class="form-group">
							<label for="validationCustom05">Indexing</label> <input
								type="text" name="conf_indexing1" class="form-control"
								id="validationCustom05" required="">
							<div class="invalid-feedback">Please provide a valid
								Indexing.</div>
						</div>
						<div class="form-group">
							<label for="example-text-input" class="col-form-label">Indexing
								2(Optional)</label> <input class="form-control" type="text"
								name="conf_indexing2" value="" id="example-text-input">
						</div>
						<div class="form-group">
							<label for="example-text-input" class="col-form-label">Indexing
								3(Optional)</label> <input class="form-control" type="text"
								name="conf_indexing3" value="" id="example-text-input">
						</div>
						<div class="form-group">
							<label for="validationCustom05">Organizing Society</label> <input
								type="text" name="org_soc" class="form-control"
								id="validationCustom05" required="">
							<div class="invalid-feedback">Please provide a valid
								Organizing Society.</div>
						</div>
						<div class="form-group">
							<label for="validationCustom05">City</label> <input type="text"
								name="conf_city" class="form-control" id="validationCustom05"
								placeholder="Enter City" required="">
							<div class="invalid-feedback">Please provide a valid City.</div>
						</div>
						`
						<div class="form-group">
							<label for="example-url-input" class="col-form-label">Website
								Address </label> <input class="form-control" type="url" name="conf_web"
								value="" id="example-url-input">
						</div>
						<div class="form-group">
							<label for="validationCustom05" class="col-form-label">Conference
								Start Date</label> <input class="form-control" name="conf_st_date"
								type="date" value="" id="validationCustom05" required="">
							<div class="invalid-feedback">Please provide Conference
								start date.</div>
						</div>
						<div class="form-group">
							<label for="validationCustom05" class="col-form-label">Last
								day of conference</label> <input class="form-control"
								name="conf_end_date" type="date" value=""
								id="validationCustom05" required="">
							<div class="invalid-feedback">Please provide Last day of
								conference.</div>
						</div>
						<div class="form-group">
							<div class="input-group-prepend">
								<span class="input-group-text">Short Description Of Event</span>
							</div>
							<textarea class="form-control" name="conf_txt_area"
								area-label="With textarea"></textarea>
						</div>

						<div class="form-group">
							<div class="form-check">
								<input class="form-check-input" type="checkbox" value=""
									id="invalidCheck" required=""> <label
									class="form-check-label" for="invalidCheck"> Agree to
									terms and conditions </label>
								<div class="invalid-feedback">You must agree before
									submitting.</div>
							</div>
						</div>
						<input type="submit" name="conf_button" id="validationCustom16"
							class="btn btn-primary btn-lg btn-block" value="submit">
					</div>
					</form>
				</div>
			</div>
			</div>



<span></span>

<script>
	$("#uploadj").submit(function(event) {
		if ($("input:first").val() === "correct") {
			$("span").text("Validated...").show();
			return;
		}

		$("span").text("Not valid!").show().fadeOut(1000);
		event.preventDefault();
	});
</script>