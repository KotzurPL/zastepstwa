<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table border="1">
    <thead>
        <tr>
            <th>#</th>
            <th>db-id</th>
            <th>Poziom</th>
            <th>Symbol</th>
            <th>Typ</th>
            <th>Aktywna</th>
            <th>Długość</th>
            <th>#</th>
        </tr>
    </thead>
    <tbody>
				<c:forEach items="${klasy}" var="klasa" varStatus="status">
				<tr>
					<td>${status.index}</td>
                                        <td>${klasa.id}</td>
					<td>${klasa.poziom}</td>
					<td>${klasa.symbol}</td>
                                        <td>
                                            <c:if test="${klasa.typ.equals('o')}">oddział</c:if>
                                            <c:if test="${klasa.typ.equals('w')}">wirtualna</c:if>
                                        </td>
                                        <td>
                                            <c:if test="${klasa.aktywna}">TAK</c:if>
                                            <c:if test="${!klasa.aktywna}">NIE</c:if>
                                        </td>
                                        <td>${klasa.dlugosc}</td>
                                        <td><a href="<c:url value="przedmiot-${status.index}" />">Szczegóły</a></td>
				</tr>
				</c:forEach>
			</tbody>
</table>