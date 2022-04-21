<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table border="1">
    <thead>
        <tr>
            <th>#</th>
            <th>db-id</th>
            <th>Nazwa</th>
            <th>Skrót</th>
            <th>#</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${przedmioty}" var="przedmiot" varStatus="status">
            <tr>
                <td>${status.index}</td>
                <td>${przedmiot.id}</td>
                <td>${przedmiot.nazwa}</td>
                <td>${przedmiot.skrot}</td>
                <td><a href="<c:url value="przedmiot-${status.index}" />">Szczegóły</a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>