<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<f:form method="POST" modelAttribute="przedmiotDto">
    <table border="1">
        <tbody>
            <tr>
                <th>Nazwa</th>
                <td>
                    <f:input type="text" path="nazwa" />
                    <c:if test="${pageContext.request.method=='POST'}">
                        <f:errors path="nazwa" />
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
