<%@page contentType="text/html; charset=utf-8" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Dodaj książkę</title>
</head>

<body>
<h1>Dodaj książkę</h1>
<form:form modelAttribute="book" method="post">
    Tytuł: <form:input path="title"/><form:errors path="title"/><br/>
    Autor: <form:input path="author"/><form:errors path="author"/><br/>
    Wydawca: <form:input path="publisher"/><form:errors path="publisher"/><br/>
    Numer ISBN: <form:input path="isbn"/><form:errors path="publisher"/><br/>
    Gatunek: <form:input path="type"/><form:errors path="type"/><br/><br/>
    <input type="submit" value="Dodaj książkę">
</form:form>
<br/><br/><br/>
</body>
</html>