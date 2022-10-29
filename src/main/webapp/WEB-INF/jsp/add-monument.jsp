<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Add Book</title>
    </head>
    <body>
        <c:if test="${success}">
            <div>Successfully added monument </div>
        </c:if>
    
        <c:url var="add_monument_url" value="/monuments/add"/>
        <form:form action="${add_monument_url}" method="post" modelAttribute="monument">

            <form:label path="code">code </form:label> <form:input path="code"/>
            <form:label path="proprietaire"> proprietaire</form:label> <form:input path="proprietaire"/>
            <form:label path="longitude">longitude </form:label> <form:input path="longitude"/>
            <form:label path="latitude">latitude </form:label> <form:input path="latitude"/>
            <form:label path="codeInsee">code insee </form:label> <form:input path="codeInsee"/>


            <input type="submit" value="submit"/>
        </form:form>

        

    </body>
</html>