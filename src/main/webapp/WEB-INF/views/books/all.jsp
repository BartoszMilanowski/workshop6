<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

    <title>Lista książek</title>
</head>

<body>
<h1>Lista książek</h1>
<table>
    <thead>
    <tr>
        <th>#</th>
        <th>Tytuł: </th>
        <th>Autor: </th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${books}" var="book">
        <tr>
        <td>${book.id}</td>
        <td>${book.title}</td>
        <td>${book.author}</td>
            <td><a href="/book/${book.id}">Szczegóły</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>