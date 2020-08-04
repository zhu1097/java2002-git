<%--
  Created by IntelliJ IDEA.
  User: 10974
  Date: 2020/7/20
  Time: 9:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
         <table width="500" border="1" align="center">
             <tr>
                 <th>编号</th>
                 <th>姓名</th>
             </tr>
             <c:forEach items="${users}" var="user">
                 <tr>
                     <td>${user.id}</td>
                     <td>${user.name}</td>
                 </tr>
             </c:forEach>

         </table>
</body>
</html>
