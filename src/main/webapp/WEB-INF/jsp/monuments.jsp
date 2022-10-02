<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <title>monuments</title>
    </head>
    <body>
        <table>
            <thead>
                <tr>
                    <th>code</th>
                    <th>type</th>
                    <th>proprietaire</th>

                    <th>longitude</th>
                    <th>latitude</th>
                    <th>codeInsee</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${monuments}" var="monument">
                    <tr>
                        <td>${monument.code}</td>
                        <td>${monument.type}</td>
                        <td>${monument.proprietaire}</td>
                        <td>${monument.longitude}</td>
                        <td>${monument.latitude}</td>
                        <td>${monument.codeInsee}</td>


                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>