<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contact us</title>
</head>
<body>
<h1>Contact Us</h1>
<p>please fill this form in a decent manner</p><br>
<form action="ContactServlet" method="post">
Full Name: <input type ="text" name ="name" required><br>
E-mail: <input type="email" name="email" required><br>
Message: <textarea rows="5" cols="30" name= "message"required></textarea><br>
<button type="submit">Submit</button>
</form>
</body>
</html>