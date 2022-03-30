<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
    <title>${book.title}</title>
</head>
<body>
<h1>${book.id} => ${book.title}</h1>
<h2>Autor: ${book.author}</h2>
Gatunek: ${book.type}<br/>
Wydawca: ${book.publisher}<br/>
Numer ISBN: ${book.isbn}<br/><br/>
<a href="/">Wróć do strony głównej</a>
</body>
</html>