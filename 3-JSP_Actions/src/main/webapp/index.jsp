<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!--  Definition of the bean  -->
<jsp:useBean id="user" class="com.example.jsp_actions.Personne" />
<!--  Setters  -->
<jsp:setProperty name="user" property="id" value="5" />
<jsp:setProperty name="user" property="nom" value="GS" />
<jsp:setProperty name="user" property="prenom" value="Ayman" />
<!--  Getters  -->
<jsp:getProperty name="user" property="prenom"/>
<!DOCTYPE html>
<html>
<head><title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>