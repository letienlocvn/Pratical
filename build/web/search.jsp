<%-- 
    Document   : search
    Created on : Nov 9, 2020, 9:40:49 AM
    Author     : WIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search</title>
    </head>
    <body>
        <h1>Search Page</h1>
        Welcome, ${sessionScope.USERNAME}
        <form action="search">
            Search <input type="text" name="txtSearchValue" 
                          value="${param.txtSearchValue}" /><br/>
            <input type="submit" value="Search" name="btAction" />
        </form>
        <c:set var="searchValue" value="${param.txtSearchValue}"/>
        <c:if test="${not empty searchValue}">
            <c:set var="result" value="${requestScope.SEARCHRESULT}"/>
            <c:if test="${not empty result}">
                <table border="1">
                    <thead>
                        <tr>
                            <th>id</th>
                            <th>name</th>
                            <th>decreption</th>
                            <th>price</th>
                            <th>size</th>
                            <th>quanity</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="dto" items="${result}">
                            <tr>
                                <td>
                                    ${dto.id}
                                </td>
                                <td>${dto.name}</td>
                                <td>${dto.descreption}</td>
                                <td>${dto.price}</td>
                                <td>${dto.size}</td>
                                <td>${dto.quantity}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </c:if>
            <c:if test="${empty result}">
                <h4>No Record !!!</h4>
            </c:if>
        </c:if>
        


    </body>
</html>
