<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table border="1">
    <thead>
        <tr>
            <th>#</th>
            <th>db-id</th>
            <th>Nazwisko</th>
            <th>Imię</th>
            <th>Skrót</th>
            <th>#</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${nauczyciele}" var="nauczyciel" varStatus="status">
            <tr>
                <td>${status.index}</td>
                <td>${nauczyciel.id}</td>
                <td>${nauczyciel.nazwisko}</td>
                <td>${nauczyciel.imie}</td>
                <td>${nauczyciel.skrot}</td>
                <td><a href="<c:url value="nauczyciel-${nauczyciel.id}" />">Szczegóły</a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>