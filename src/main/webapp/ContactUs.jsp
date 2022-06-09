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
<table>
<tr><td>Full Name:</td><td> <input type ="text" name ="name" required></td></tr><br>
<tr><td>E-mail:</td> <td><input type="email" name="email" required></td></tr><br>
<tr><td>Message:</td><td> <textarea rows="5" cols="30" name= "message"required></textarea></td><tr><br>
<tr> <td><button type="submit">Submit</button></td></tr>
</table>
</form>
</body>
</html>