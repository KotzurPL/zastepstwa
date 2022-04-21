<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<f:form method="POST" modelAttribute="nauczycielDto">
    <table border="1">
        <tbody>
            <tr>
                <th>Imię</th>
                <td>
                    <f:input type="text" path="imie" />
                    <c:if test="${pageContext.request.method=='POST'}">
                        <f:errors path="imie" />
                    </c:if>
                </td>
            </tr>
            <tr>
                <th>Nazwisko</th>
                <td>
                    <f:input type="text" path="nazwisko" />
                    <c:if test="${pageContext.request.method=='POST'}">
                        <f:errors path="nazwisko" />
                    </c:if>
                </td>
            </tr>
            <tr>
                <th>Skrót</th>
                <td>
                    <f:input type="text" path="skrot" />
                    <c:if test="${pageContext.request.method=='POST'}">
                        <f:errors path="skrot" />
                    </c:if>
                </td>
            </tr>			
            <tr>
                <td colspan="2" align="right">
                    <input type="submit" value="Dodaj" class="btn btn-primary" />
                </td>
            </tr>
        </tbody>
    </table>
</f:form>
