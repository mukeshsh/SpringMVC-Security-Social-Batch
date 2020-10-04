<%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>

  <h1 style="color: red;text-align: center"> All  ${operation} Info </h1>
<c:choose>
   <c:when test="${listInfo ne null && !empty listInfo }">
         <table align="center" bgcolor="cyan">
          <c:forEach var="country"  items="${listInfo}">
            <tr>
               <td style="color:blue">${country} </td>
             </tr>
            </c:forEach>
         </table>
         <h3 style="color:red"><b> countries count:: ${countriesCount}</b></h3>
   </c:when>
   <c:otherwise>
          <h1 style="color: red;text-align: center;"> No countries found </h1>
   </c:otherwise>
</c:choose>
 <br>
 <br>
   <a href="welcome">home</a>