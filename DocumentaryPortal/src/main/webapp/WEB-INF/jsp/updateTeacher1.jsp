<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ page import= "com.vidnyan.DocumertyPortal.model.Teacher" %>
  
 <% Teacher teacher=(Teacher)session.getAttribute("user"); 
System.out.print(teacher);
%>

<% String name=(String)session.getAttribute("userID");
if(name==null)
{
   response.sendRedirect("./login.vi");
}
%>
	<script type="text/javascript">
    $(document).ready(function(){
        $("#MyForm :input").prop("disabled", true);
        $("#MyForm2 :input").prop("disabled", true);
		$("#validationCustom15").hide();
		$("#validationCustom16").hide();
		$("#validationCustom14").hide();
    });
	</script>
	<script type="text/javascript">
    function edit() {
    alert("edit your details");
     $("#MyForm :input").prop("disabled", false);
     $("#MyForm2 :input").prop("disabled", false);
	 $("#validationCustom15").show();
	 $("#validationCustom16").show();
	 $("#validationCustom14").show();
	 $("#edit").hide();
	 $("#delete").hide();
	 $("#download").hide();
	 $("#row").hide();
}
	</script>
	




<div class="row">
	<div class="col-12 mt-5">
			<div class="card-body">
				
                        <div class="row">
							<div class="col-3">
							</div>
							
							<div class="col-6">
							
								<!--------------------->
								<div class="row">
								<div class="col-12">
						   
									<button data-inline="true" id="edit" onclick="edit()"  class="btn btn-primary btn-lg btn-block">Edit details</button>
								</div>	</div>
								 <!--------------------->
							</div>
						</div>
						
				    <form id="MyForm" class="needs-validation" novalidate="" action="./update.vi"" method="post" enctype="multipart/form-data">
        <div class="card">
            
               <Center> <h4 class="header-title">Your Profile</h4></Center>

				 <h3 class="header-title">Your Profile</h3>
                 
				 
				 <div class="form-group">
					<label for="validationCustom05">First Name</label>
					<input type="text" name="fName" value="<%=teacher.getfName() %>" class="form-control" id="validationCustom01" required="">
					<div class="invalid-feedback">
					   Please provide your First Name
					</div>
				 </div>
				 <div class="form-group">
					<label for="validationCustom05">Last Name</label>
					<input type="text" name="lName" value="<%=teacher.getLname() %>" class="form-control" id="validationCustom02" required="">
					<div class="invalid-feedback">
					   Please provide your Last Name.
					</div>
				 </div>
				 <div class="form-group">
					<label for="validationCustom05">Members Of Professional Society</label>
					<input type="text" name="mopSociety" value="<%=teacher.getMopSociety() %>" class="form-control" id="validationCustom03" required="">
					<div class="invalid-feedback">
					   Please provide valid entries like ICE, ICM
					</div>
				 </div>
				 <div class="form-group">
					<label for="validationCustom05">Qualification</label>
					<input type="text" name="qualification" value="<%=teacher.getQualification() %>" class="form-control" id="validationCustom05" required="">
					<div class="invalid-feedback">
					   Please provide your Qualification
					</div>
				 </div>
				 <div class="form-group">
                    <label for="validationCustom05">Email</label>
                    <input type="email" name="email" value="<%=teacher.getEmail() %>" class="form-control" id="validationCustom05" required="">
                     <i class="ti-email"></i>
                    </div>
					<div class="form-group">
					<label for="validationCustom05">Mobile Number</label>
					<input type="text" name="mobile" value="<%=teacher.getMobile() %>" class="form-control" id="validationCustom05" required="">
					<div class="invalid-feedback">
					   Please provide your Mobile Number
					</div>
				 </div>
				 <div class="form-group">
					<label for="validationCustom05">password</label>
					<input type="text" name="pwd" value="<%=teacher.getPwd() %>" class="form-control" id="validationCustom05" required="">
					<div class="invalid-feedback">
					   Please provide your password
					</div>
				 </div>
					<div class="form-group">
                        <label class="col-form-label">Gender</label>
                                            <select class="form-control" name="gender" value="<%=teacher.getGender() %>">
                                                <option>Male</option>
                                                <option>Female</option>
                                            </select>
					</div>
					<div class="form-group">
                        <label class="col-form-label">Designation</label>
                                            <select class="form-control" name="desg" value="<%=teacher.getDesignation() %>">
                                                <option>Faculty</option>
                                                <option>HOD</option>
                                            </select>
					</div>
					
				 <div class="form-group">
					<div class="form-check">
					   <input class="form-check-input" type="checkbox" value="" id="validationCustom14" required="">
					   <label class="form-check-label" id="validationCustom15"  for="invalidCheck">
					   Agree to terms and conditions
					   </label>
					   <div class="invalid-feedback">
						  You must agree before submitting.
					   </div>
					</div>
				 </div>
             

                <input type="submit" name="conf_button" id="validationCustom16" class="btn btn-primary btn-lg btn-block" value="submit">
            </div>
        </form>
        </div>
        </div>

        </div>
    <div class="card">
                
				<form id="MyForm2" action="./book/upload.vi"  method="post"  class="needs-validation" novalidate="">
				
				
				<div class="input-group mb-3">
					<div class="custom-file">
					   <input type="file" id="validationCustom17" class="custom-file-input" value="" name="conf_file_upload" id="validationCustom13">
					   <label class="custom-file-label" for="inputGroupFile02">Choose file</label>
					</div>
					<div class="input-group-append">
					   <span class="input-group-text">Upload</span>
					</div>
				 </div>
				 <input type="submit" name="conf_button" id="validationCustom18" class="btn btn-primary btn-lg btn-block" value="submit">
				
				</form>
				
				
				
	</div>		
	
	
	
	
	
	
	
