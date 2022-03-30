<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Książka</title>
</head>
<body>
<h1>${book.id} <i>${book.title}</i></h1>
Autor: ${book.author}<br/>
Wydawca: ${book.publisher}<br/>
Numer ISBN: ${book.isbn}<br/>
<br/><br/><br/>
<a href="/">Wróć</a>
</body>
</html>