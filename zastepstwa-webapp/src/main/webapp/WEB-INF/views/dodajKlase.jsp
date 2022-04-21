<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<f:form method="POST" modelAttribute="klasaDto">
    <table border="1">
        <tbody>
            <tr>
                <th>Poziom</th>
                <td>
                    <f:input type="text" path="poziom" />
                    <c:if test="${pageContext.request.method=='POST'}">
                        <f:errors path="poziom" />
                    </c:if>
                </td>
                <td>(1, 2, 3 lub 4)</td>
            </tr>
            <tr>
                <th>Symbol</th>
                <td>
                    <f:input type="text" path="symbol" />
                    <c:if test="${pageContext.request.method=='POST'}">
                        <f:errors path="symbol" />
                    </c:if>
                </td>
                <td>(A, B, C lub D)</td>
            </tr>
            <tr>
                <th>Typ</th>
                <td>
                    <f:radiobutton value="o" path="typ" /> oddział&nbsp;&nbsp;&nbsp;
                    <f:radiobutton value="w" path="typ" /> wirtualna
                    <c:if test="${pageContext.request.method=='POST'}">
                        <f:errors path="typ" />
                    </c:if>
                </td>
                <td></td>
            </tr>
            <tr>
                <th>Aktywna</th>
                <td>
                    <f:checkbox path="aktywna" />
                    <c:if test="${pageContext.request.method=='POST'}">
                        <!--f:errors path="aktywna" /-->
                    </c:if>
                </td>
                <td></td>
            </tr>
            <tr>
                <th>Długość</th>
                <td>
                    <f:input type="text" path="dlugosc" />
                    <c:if test="${pageContext.request.method=='POST'}">
                        <f:errors path="dlugosc" />
                    </c:if>
                </td>
                <td>(3 lub 4)</td>
            </tr>
            <tr>
                <td colspan="3" align="right">
                    <input type="submit" value="Dodaj" class="btn btn-success" />
                    <a class="btn btn-warning" href="listaKlas">Anuluj</a>
                </td>
            </tr>
        </tbody>
    </table>
</f:form>
