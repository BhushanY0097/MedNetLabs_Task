<%@page import="org.model.Employees"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<title>Insert title here</title>
</head>
<body>
 <div  class="container">
    
    <h5 class="col-md-12 text-success">Welcome</h5>
    
    <div class="row pt-3">
        <div class="col-md-3">
            <% Employees emp=(Employees)session.getAttribute("UserLogin");%>
                 <h4 class="col-md-12 text-info">Hello:<%=emp.getName()%></h4>
        </div> 
    </div>
  
  
      <div class="row pt-3">
            <div class="col-md-3">
              <table border="1"  class="table">
                  <tr>
                  <th>ID</th>
                  <th>NAME</th>
                  <th>GENDER</th>
                  <th>ADDRESS</th>
                  <th>STATE</th>
                  <th>CITY</th>
                  <th>DOB</th>
                  <th>LOGINID</th>
                  <th>CREATED</th>
                  <th>MODEFIED</th>
                  </tr>
                  
                  <tr>
                   <td>
                   		<%=emp.getName()%>
                   </td>
                   <td>
                   		<%=emp.getGender()%>
                   </td>
                  <td>
                   		<%=emp.getState()%>
                   </td>
           			<td>
                   		<%=emp.getCity()%>
                   </td>
                   <td>
                   		<%=emp.getCity()%>
                   </td>
                   <td>
                   		<%=emp.getDob() %>
                   </td>
                   <td>
                   		<%=emp.getLoginId()%>
                   </td>
                   <td>
                   		<%=emp.getCreated()%>
                   </td>
                   <td>
                   		<%=emp.getModefied()%>
                   </td>
                  </tr>
                  
           </table>   
        </div> 
    </div>
  
   
  
  
  
  
  
  
</div>

</body>
</html>