<%--
  Created by IntelliJ IDEA.
  User: abhinay
  Date: 5/19/2022
  Time: 6:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Sucess Page</title>
</head>
<div class="container m-auto">

    <body>
    <h3 class="text-center">Date:${date}</h3>
    <h1>You have successfully Registered!!!!</h1>
    <h2>User Details:</h2>
    <%--
    <h3>username: ${userName}</h3>
    <h3>email: ${email}</h3>
    <h3>password: ${password}</h3>
    --%>

    <h3>username: ${user.userName}</h3>
    <h3>email: ${user.email}</h3>
    <h3>password: ${user.password}</h3>
    </body>
</div>
</html>
