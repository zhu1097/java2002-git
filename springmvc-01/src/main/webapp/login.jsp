<%--
  Created by IntelliJ IDEA.
  User: 10974
  Date: 2020/7/18
  Time: 9:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
           <a href="user/login">登录</a><br><br>
           <a href="user/test_ById?id=1001">携带参数id</a><br><br>
           <a href="/user/test_param?id=1002">测试param</a>
           <hr color="red">
           <form action="/user/test_form"><br><br>
               id:<input type="text" name="id"><br><br>
               username:<input type="text" name="username"><br><br>
               password:<input type="password" name="password">
                        <input type="submit" value="提交">
           </form>
           <hr color="red">
           <form action="/user/test_collection"><br><br>
               id:<input type="text" name="id"><br><br>
               username:<input type="text" name="username"><br><br>
               password:<input type="password" name="password"><br><br>
               list:<input type="text" name="list[1].cname"><br><br>
               map:<input type="text" name="map[java].cname"><br><br>
               <input type="submit" value="提交">
           </form>
           <hr color="red">
           <form action="/user/test_date"><br><br>
               id:<input type="text" name="id"><br><br>
               username:<input type="text" name="username"><br><br>
               password:<input type="password" name="password"><br><br>
               list:<input type="text" name="list[1].cname"><br><br>
               map:<input type="text" name="map[java].cname"><br><br>
               date:<input type="text" name="birth">
               <input type="submit" value="提交">
           </form>
           <hr color="red">
           <a href="/user/test_PathVariable/100">test_PathVariable</a><br><br>
           <a href="/user/test_CookieValue">test_CookieValue</a><br><br>
           <a href="/user/test_RequestHeader">test_RequestHeader</a>
           <hr color="red">
           <form action="/user/test_RequestBody" method="post"><br><br>
               id:<input type="text" name="id"><br><br>
               username:<input type="text" name="username"><br><br>
               password:<input type="password" name="password"><br><br>
               <input type="submit" value="提交">
           </form>
           <hr color="red">
           <a href="user/test_ResponseBody">test_ResponseBody</a>
</body>
</html>
