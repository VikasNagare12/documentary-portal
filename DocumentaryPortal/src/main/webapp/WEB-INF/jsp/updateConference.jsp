<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ page import= "com.vidnyan.DocumertyPortal.model.ConferenceBean" %>
<%ConferenceBean conference  =(ConferenceBean)session.getAttribute("conference"); 
System.out.println(conference);
%>

<% String name=(String)session.getAttribute("userID");
if(name==null)
{
   response.sendRedirect("./login.vi");
}
%>
<div  class="row">

	<div class="col-2"></div>
	<div class="col-8">
							
							
								<div class="row">
								<div class="col-4">
						   
									<button data-inline="true" id="edit" onclick="edit()" class="btn btn-primary btn-lg btn-block">Edit details</button>
								</div>	<div class="col-4"><button type="button"  id="delete" onclick="window.location='./conference/delete.vi?id=<%=conference.getID() %>';" class="btn btn-danger btn-lg btn-block"> Delete details</button>
									</div>	<div class="col-4"><button type="button"  id="download" onclick="" class="btn btn-dark btn-lg btn-block"> Download file</button>

							</div>
						</div>
                
				<form id="MyForm" action="./conference/update.vi" method="post"  class="needs-validation" novalidate="">
				<div class="card">
				<h3 class="header-title">Manage Conference Details</h3>
                 
				 <input type = "hidden" name = "id" value="<%=conference.getID() %>">
				 <div class="form-group">
					<label for="validationCustom05">Title</label>
					<input type="text" name="conf_title" value="<%=conference.getTitle() %>" class="form-control" id="validationCustom01" required="">
					<div class="invalid-feedback">
					   Please provide a Title.
					</div>
				 </div>
				 <div class="form-group">
					<label for="validationCustom05">Conference Name</label>
					<input type="text" name="conf_name" value="<%=conference.getName() %>" class="form-control" id="validationCustom02" required="">
					<div class="invalid-feedback">
					   Please provide a valid Conference Name.
					</div>
				 </div>
				 <div class="form-group">
					<label for="validationCustom05">Conference proceeding publisher</label>
					<input type="text" name="conf_proceding" value="<%=conference.getPublisher()%>" class="form-control" id="validationCustom03" required="">
					<div class="invalid-feedback">
					   Please provide a valid Conference proceeding publisher.
					</div>
				 </div>
				 <div class="form-group">
					<label for="validationCustom05">Indexing</label>
					<input type="text" name="conf_indexing1" value="<%=conference.getIndexing1()%>" class="form-control" id="validationCustom04" required="">
					<div class="invalid-feedback">
					   Please provide a valid Indexing.
					</div>
				 </div>
				 <div class="form-group">
					<label for="example-text-input" class="col-form-label">Indexing 2(Optional)</label>
					<input class="form-control" type="text" value="<%=conference.getIndexing2()%>" name="conf_indexing2" value="" id="validationCustom05">
				 </div>
				 <div class="form-group">
					<label for="example-text-input" class="col-form-label">Indexing 3(Optional)</label>
					<input class="form-control" type="text" value="<%=conference.getIndexing3()%>" name="conf_indexing3" value="" id="validationCustom06">
				 </div>
				 <div class="form-group">
					<label for="validationCustom05">Organizing Society</label>
					<input type="text" name="org_soc" value="<%=conference.getOrganizing()%>" class="form-control" id="validationCustom07" required="">
					<div class="invalid-feedback">
					   Please provide a valid Organizing Society.
					</div>
				 </div>
				 <div class="form-group">
					<label for="validationCustom05">City</label>
					<input type="text" name="conf_city" value="<%=conference.getCity()%>" class="form-control" id="validationCustom08"
					   placeholder="Enter City" required="">
					<div class="invalid-feedback">
					   Please provide a valid City.
					</div>
				 </div>
				 `
				 <div class="form-group">
					<label for="example-url-input" class="col-form-label">Website Address </label>
					<input class="form-control" type="url" name="conf_web" value="<%=conference.getWebadd()%>" id="validationCustom09">
				 </div>
				 <div class="form-group">
					<label for="validationCustom05" class="col-form-label">Conference Start Date</label>
					<input class="form-control" name="conf_st_date" type="date" value="<%=conference.getStartdate()%>" id="validationCustom010"
					   required="">
					<div class="invalid-feedback">
					   Please provide Conference start date.
					</div>
				 </div>
				 <div class="form-group">
					<label for="validationCustom05" class="col-form-label">Last day of conference</label>
					<input class="form-control" name="conf_end_date" type="date" value="<%=conference.getEnddate()%>" id="validationCustom11"
					   required="">
					<div class="invalid-feedback">
					   Please provide Last day of conference.
					</div>
				 </div>
				 <div class="form-group">
					<div class="input-group-prepend">
					   <span class="input-group-text">Short Description Of Event</span>
					</div>
					<textarea class="form-control" name="conf_txt_area" value="<%=conference.getShortdesc()%>" id="validationCustom12" area-label="With textarea"></textarea>
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
				<form id="MyForm2" action="./conference/upload.vi"  method="post"  class="needs-validation" novalidate="">
				
				
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
		</div>
	</div>
	