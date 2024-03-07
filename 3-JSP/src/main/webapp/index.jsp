<!-- How JSP works
    hello.jsp -> hello_jsp.java -> hello_jsp.class -> [ web container ]
-->
<!-- Import
        <%@ page import="java.io.*" %>
        <%@ page errorPage="./ErrorPage.jsp" %>
-->
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
        <%@ include file="NavBar.jspx"%>
<h1>
    <!-- Expressions  -->
        <%= "Hello World!" %>

    <!-- Declaration (we can only create a function in the jsp:declaration) + (we can create global variable) -->
        <%!
            int num = 5;
            public static  String name;
        %>

    <!-- Scriptlets (we can create local variable)  -->
        <%
            name = "Ayman";
            for (int i =0; i<5 ; i++){
                num += 1;
            }
        %>
</h1>

<br/>
<a href="hello-servlet">Hello <%= name %>  <%= num %></a>
</body>
</html>