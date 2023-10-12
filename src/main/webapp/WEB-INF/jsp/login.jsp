<%--
  Created by IntelliJ IDEA.
  User: F_KIRTIL
  Date: 17.08.2023
  Time: 23:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h1>PetClinic Login Page</h1>
    <form action="login" method="post">
        Username:<input type="text" name="username"/><br/>
        Password:<input type="password" name="password"/><br/>
        Remember Me:<input type="checkbox" name="remember-me"><br/>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <input type="submit" value="Login"/>
      <font color="red">
          <c:if test="${not empty param.loginFailed}">
            <c:out value="Login Failed, Incorrect Username or Password"></c:out>
          </c:if>
        </font>
    </form>
</body>
</html>
