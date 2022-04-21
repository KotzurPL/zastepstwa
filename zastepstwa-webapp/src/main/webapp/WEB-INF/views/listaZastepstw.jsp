<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>

<f:form method="POST" modelAttribute="dataDto">
    <f:input type="date" path="dataListaZast" value="${dataZast}" />
    <input type="submit" value="Pokaż" class="btn btn-primary" />
</f:form>    

<table border="1">
    <thead>
        <tr>
            <th>#</th>
            <th>db-id</th>
            <th>Data</th>
            <th>Nieobecny</th>
            <th>Godzina</th>
            <th>Klasa</th>
            <th>Pierwotny</th>
            <th>Zastępujący</th>
            <th>Docelowy</th>
            <th>#</th>
	</tr>
    </thead>
    <tbody>
        <c:forEach items="${zastepstwa}" var="zastepstwo" varStatus="status">
            <tr>
                <td>${status.index}</td>
                <td>${zastepstwo.id}</td>
                <td>${zastepstwo.data}</td>
                <td>${zastepstwo.nauczyciel_nieobecny.nazwisko} ${zastepstwo.nauczyciel_nieobecny.imie}</td>
                <td>${zastepstwo.godzina.id}: ${zastepstwo.godzina.rozpoczecie}-${zastepstwo.godzina.zakonczenie}</td>
                <td>${zastepstwo.klasa.poziom}${zastepstwo.klasa.symbol}</td>
                <td>${zastepstwo.przedmiot_pierwotny.nazwa}</td>
                <td>${zastepstwo.nauczyciel_zastepujacy.nazwisko} ${zastepstwo.nauczyciel_zastepujacy.imie}</td>
                <td>${zastepstwo.przedmiot_docelowy.nazwa}</td>
                <td><a href="<c:url value="zastepstwo-${status.index}" />">Szczegóły</a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>