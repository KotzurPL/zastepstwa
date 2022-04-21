<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table border="1">
    <thead>
        <tr>
            <th>#</th>
            <th>db-id</th>
            <th>Rozpoczęcie</th>
            <th>Zakończenie</th>
            <th>#</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${godziny}" var="godzina" varStatus="status">
            <tr>
                <td>${status.index}</td>
                <td>${godzina.id}</td>
                <td>${godzina.rozpoczecie}</td>
                <td>${godzina.zakonczenie}</td>
                <td><a href="<c:url value="godzina-${status.index}" />">Szczegóły</a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>