<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %>  
<%@ page import = "java.util.*"  %> 
<%@ page import = "com.login.ContactPojo" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dashboard</title>
</head>
<body>
<% if (session.getAttribute("username")==null){
	response.sendRedirect("Login.jsp");
}
%>
<div class="table-container">
                   <h1 class="table-name">Active Requests</h1>
                   <table class="table">
                       <th>Full Name</th>
                       <th>E-mail</th>
                       <th>Message</th>
                       <th>Status</th>
                       <th>Change Status</th>
                        <%
                       List<ContactPojo> req = (ArrayList<ContactPojo>) request.getAttribute("requestList");

                       for(ContactPojo request: req) {
                           if(request.getStatus().equals(1)){
                        %>
                           <TR>
                               <TD> <%=  request.getName() %></TD>
                               <TD> <%=  request.getEmail()%></TD>
                               <TD> <%= request.getMessage()%></TD>
                               <TD> <%=  request.getStatus()%></TD>
                                <td>
                                <form action="dashboard" method="post">
                                     <button class="btn" value="<%= getStatus() %>" name="id">Archive</button> 
                                </form>
                            </td>
                          </TR>
                           <%
                           }
                            }
                           %>

                   </table>
               </div>



</body>
</html>