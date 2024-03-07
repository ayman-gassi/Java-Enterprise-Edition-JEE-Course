<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="etu" items="${etudiant}" >
    <p><c:out value="${etudiant.getFname()}"></c:out></p>
    <p><c:out value="${etudiant.getLname()}"></c:out></p>
    <p><c:out value="${etudiant.getPromo()}"></c:out></p>
    <p><c:out value="${etudiant.getPoints()}"></c:out></p>
    <hr>
</c:forEach>
</body>
</html>
