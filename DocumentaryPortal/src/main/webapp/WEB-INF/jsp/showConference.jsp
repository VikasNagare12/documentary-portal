<%@page import="com.vidnyan.DocumertyPortal.doa.ConferenceDoa"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ page import= "com.vidnyan.DocumertyPortal.model.ConferenceBean" %>
<%@ page import= "com.vidnyan.DocumertyPortal.doa.ConferenceDoa" %>
<!doctype html>
<html class="no-js" lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Conference Details</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="shortcut icon" type="image/png" href="assets/images/icon/favicon.ico">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/std/assets/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/std/assets/css/font-awesome.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/std/assets/css/themify-icons.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/std/assets/css/metisMenu.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/std/assets/css/owl.carousel.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/std/assets/css/slicknav.min.css">
    <!-- amcharts css -->
    <link rel="stylesheet" href="https://www.amcharts.com/lib/3/plugins/export/export.css" type="text/css" media="all" />
    <!-- Start datatable css -->
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.css">
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.18/css/dataTables.bootstrap4.min.css">
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/responsive/2.2.3/css/responsive.bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/responsive/2.2.3/css/responsive.jqueryui.min.css">
    <!-- style css -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/std/assets/css/typography.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/std/assets/css/default-css.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/std/assets/css/styles.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/std/assets/css/responsive.css">
    <!-- modernizr css -->
    <script src="${pageContext.request.contextPath}/std/assets/js/vendor/modernizr-2.8.3.min.js"></script>
</head>

<body>
           <!-- page title area end -->
            <div class="main-content-inner">
                <div class="row">
            
                    <!-- Dark table start -->
                    <div class="col-12 mt-5">
                        <div class="card">
                            <div class="card-body">
                                <h4 class="header-title">Conference Detail Table</h4>
                                <div class="data-tables datatable-dark">
                                    <table id="dataTable3" class="text-center table-hover">
                                        <thead class="text-capitalize">
                                            <tr>
                                            	<th>Conference Title</th>
                                            	<th>Conference Name</th>
                                                <th>Publisher</th>
                                                <th>Indexing</th>
                                                <th>Date</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                        <% String name=(String)session.getAttribute("userID");
                                           if(name==null)
                                           {
                                        	   response.sendRedirect("./login.vi");
                                           }
                                           //ArrayList conferenceDetails=(ArrayList)session.getAttribute("conferenceDetails");
                                        ArrayList conferenceDetails= ConferenceDoa.getAllConferenceDetails(name);
                                         ConferenceBean conferenece = null;
                                        for(Object obj : conferenceDetails){
                                        conferenece = (ConferenceBean)obj;
                                        
                                        		
                                        	
                                        %>
                                        <tr onclick="window.location='./conference/getUpdate.vi?id=<%= conferenece.getID() %>';" style='cursor: pointer;'>
                                            	<td><%= conferenece.getTitle() %></td>
                                                <td><%=  conferenece.getName()%></td>
                                                <td><%= conferenece.getPublisher() %></td>
                                                <td><%=  conferenece.getIndexing1()%></td>
                                                <td><%=  conferenece.getStartdate()%></td>
										</tr>
                                            
                                            <%} %>
                                                                   
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- Dark table end -->
                </div>
            </div>

    <script src="${pageContext.request.contextPath}/std/assets/js/vendor/jquery-2.2.4.min.js"></script>
    <!-- bootstrap 4 js -->
    <script src="${pageContext.request.contextPath}/std/assets/js/popper.min.js"></script>
    <script src="${pageContext.request.contextPath}/std/assets/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/std/assets/js/owl.carousel.min.js"></script>
    <script src="${pageContext.request.contextPath}/std/assets/js/metisMenu.min.js"></script>
    <script src="${pageContext.request.contextPath}/std/assets/js/jquery.slimscroll.min.js"></script>
    <script src="${pageContext.request.contextPath}/std/assets/js/jquery.slicknav.min.js"></script>

    <!-- Start datatable js -->
    <script src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.js"></script>
    <script src="https://cdn.datatables.net/1.10.18/js/jquery.dataTables.min.js"></script>
    <script src="https://cdn.datatables.net/1.10.18/js/dataTables.bootstrap4.min.js"></script>
    <script src="https://cdn.datatables.net/responsive/2.2.3/js/dataTables.responsive.min.js"></script>
    <script src="https://cdn.datatables.net/responsive/2.2.3/js/responsive.bootstrap.min.js"></script>
    <!-- others plugins -->
    <script src="${pageContext.request.contextPath}/std/assets/js/plugins.js"></script>
    <script src="${pageContext.request.contextPath}/std/assets/js/scripts.js"></script>
</body>

</html>
