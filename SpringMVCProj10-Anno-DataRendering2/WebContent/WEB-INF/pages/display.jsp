<%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h2 style="color:red;text-align:center">Display Page</h2>
  <c:choose>
  <c:when test="${studList ne null && !empty studList }">
      <table border="1" align="center">
             <tr> <th>sno</th><th>sname</th><th>sadd </th><th>avg</th></tr>
             <c:forEach var="dto"  items="${studList}">
                <tr>
                   <td>${dto.sno} </td>
                   <td>${dto.sname} </td>
                   <td>${dto.sadd} </td>
                   <td>${dto.avg}</td>
                </tr>
             </c:forEach>
      </table>
  </c:when>
</c:choose>
<%-- <b>names  are </b> <br>   
    <c:forEach var="name" items="${namesInfo}">
           ${name} <br>
    </c:forEach> 
    <hr>
  <b>fruits are </b> <br>   
   <c:forEach var="fruit" items="${fruitsInfo}">
           ${fruit} <br>
   </c:forEach>
   <hr>
   <b>phones are </b> <br>   
   <c:forEach var="ph" items="${phonesInfo}">
           ${ph} <br>
   </c:forEach>
   <hr>
   <b>ages </b> <br>   
   <c:forEach var="age" items="${agesInfo}">
           ${age.key} --->  ${age.value}  <br>
   </c:forEach>  --%>
