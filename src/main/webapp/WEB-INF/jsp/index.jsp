<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib prefix="sp" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Index Page</title>
</head>

<body>
    <div>
        <c:url value="/resources/text.txt" var="url" />
        <sp:url value="/resources/text.txt" htmlEscape="true" var="springUrl" />
        Spring URL: ${springUrl} at ${time}
        <br />
        JSTL URL: ${url}
        <br />
        Message: ${message}
    </div>
</body>

</html>
