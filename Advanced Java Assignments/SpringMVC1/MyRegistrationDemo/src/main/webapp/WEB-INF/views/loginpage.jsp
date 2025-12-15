<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <h3>${message}</h3>
   
   <form action = "/spring-mvc-registration/login/validateuser" method="post">
    User name : <input type="text" name="uname" id="un"></br>
    Password : <input type="password" name ="password" id="ps"></br>
    <button type="submit" name="login" id="login" value="login">Login</button>
   </form>
   <a href="registerme">Register me?</a>/<a href="#">Forgot Password</a>

</body>
</html>