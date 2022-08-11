<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "
https://www.w3.org/TR/html4/loose.dtd
">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>First JSP</title>
</head>
<%@ page import="
java.util.Date
" %>
<body>
<h3>HI Mr/Mrs        :  ${userInfo.name} </h3><br></br>
${userInfo.validation()}
<h3>Your card Number :  ${userInfo.getId()} </h3>
<h3> ...........${userInfo.main()}........... </h3>


</body>
</html> 