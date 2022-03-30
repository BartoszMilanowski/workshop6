<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Edytuj ${book.title}</title>
</head>
<body>
<h1>Edytuj książkę: ${book.title}</h1>

<form:form method="post" modelAttribute="book" action="/book/edit">
    <form:hidden path="id" value="${book.id}"/>
    Tytuł: <form:input path="title" value="${book.title}"/><form:errors path="title"/><br/>
    Autor: <form:input path="author" value="${book.author}"/><form:errors path="author"/><br/>
    Wydawca: <form:input path="publisher" value="${book.publisher}"/><form:errors path="publisher"/><br/>
    Gatunek: <form:input path="type" value="${book.type}"/><form:errors path="type"/><br/>
    Numer ISBN: <form:input path="isbn" value="${book.isbn}"/><form:errors path="isbn"/>
    <br/>
    <input type="submit" value="Edytuj książkę">
    <br/><br/><br/>
</form:form>
</body>
</html>