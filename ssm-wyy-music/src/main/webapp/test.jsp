<%--
  Created by IntelliJ IDEA.
  User: 10974
  Date: 2020/7/21
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" session="true" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    pageContext.getRequest().setAttribute("request","request.value");

    HttpSession session1 = pageContext.getSession();
    out.write(session1.getId());
    session1.invalidate();
%>
</body>
</html>
