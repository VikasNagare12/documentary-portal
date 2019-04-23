<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<div class="row">
	<div class="col-12 mt-5>
		<div class="card">
			<div class="card-body">
			 
				<form class="needs-validation" novalidate="">
				
				 <h4 class="header-title">Your Profile</h4>
				 <div class="form-group">
					<label for="validationCustom05">First Name</label>
					<input type="text" name="prof_fname" class="form-control" id="validationCustom05" required="">
					<div class="invalid-feedback">
					   Please provide your First Name
					</div>
				 </div>
				 <div class="form-group">
					<label for="validationCustom05">Last Name</label>
					<input type="text" name="prof_lname" class="form-control" id="validationCustom05" required="">
					<div class="invalid-feedback">
					   Please provide your Last Name.
					</div>
				 </div>
				 <div class="form-group">
					<label for="validationCustom05">Employee Id</label>
					<input type="text" name="prof_eid" class="form-control" id="validationCustom05" required="">
					<div class="invalid-feedback">
					   Please provide your College Id.
					</div>
				 </div>
				 <div class="form-group">
					<label for="validationCustom05">Members Of Professional Society</label>
					<input type="text" name="prof_mops" class="form-control" id="validationCustom05" required="">
					<div class="invalid-feedback">
					   Please provide valid entries like ICE, ICM.
					</div>
				 </div>
				 <div class="form-group">
					<label for="validationCustom05">Qualification</label>
					<input type="text" name="prof_qualification" class="form-control" id="validationCustom05" required="">
					<div class="invalid-feedback">
					   Please provide your Qualification
					</div>
				 </div>
				 <div class="form-group">
                    <label for="validationCustom05">Email</label>
                    <input type="email" name="prof_email" class="form-control" id="validationCustom05" required="">
                     <i class="ti-email"></i>
                    </div>
					<div class="form-group">
					<label for="validationCustom05">Mobile Number</label>
					<input type="text" name="prof_mobile" class="form-control" id="validationCustom05" required="">
					<div class="invalid-feedback">
					   Please provide your Mobile Number
					</div>
				 </div>
				 <div class="form-group">
					<label for="validationCustom05">password</label>
					<input type="text" name="prof_pwd" class="form-control" id="validationCustom05" required="">
					<div class="invalid-feedback">
					   Please provide your password
					</div>
				 </div>
					<div class="form-group">
                        <label class="col-form-label">Gender</label>
                                            <select class="form-control" name="prof_gender">
                                                <option>Male</option>
                                                <option>Female</option>
                                            </select>
					</div>
					<div class="form-group">
                        <label class="col-form-label">Designation</label>
                                            <select class="form-control" name="prof_desg">
                                                <option>Faculty</option>
                                                <option>HOD</option>
                                            </select>
					</div>
					<div class="form-group">
                    <label for="validationCustom05">Profile Pic</label>
				 <div class="input-group mb-3">
					<div class="custom-file">
					   <input type="file" class="custom-file-input" name="prof_pic_upload" id="inputGroupFile02">
					   <label class="custom-file-label" for="inputGroupFile02">Choose file</label>
					</div>
					<div class="input-group-append">
					   <span class="input-group-text">Upload</span>
					</div>
				 </div>
				 </div>
				 <div class="form-group">
					<div class="form-check">
					   <input class="form-check-input" type="checkbox" value="" id="invalidCheck" required="">
					   <label class="form-check-label" for="invalidCheck">
					   Agree to terms and conditions
					   </label>
					   <div class="invalid-feedback">
						  You must agree before submitting.
					   </div>
					</div>
				 </div>
				 <input type="submit" name="conf_button" id="validationCustom16" class="btn btn-primary btn-lg btn-block" value="submit">
			   
		   
				</form>
			</div>
		</div>
	</div>
</div>

 