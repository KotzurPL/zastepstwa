<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
                    <f:form method="POST" modelAttribute="zastepstwoDto">
            <table border="1">
                <tbody>
                    <tr>
                        <th colspan="3" align="right">Data nieobecności:</th>
                        <td colspan="3"><f:input type="date" path="dataZastepstwa" /></td>
                    </tr>
                    <tr>
                        <th colspan="3" align="right">Nauczyciel nieobecny:</th>
                        <td colspan="3">
                            <select name="nieobecny" id="pet-select">
                                <option value="">--wybierz nieobecnego--</option>
                                <c:forEach items="${nauczyciele}" var="nauczyciel" varStatus="status" >
                                    <option value="${nauczyciel.id}">${nauczyciel.nazwisko} ${nauczyciel.imie}</option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <th colspan="6">
                           <hr />
                        </th>
                    </tr>
                    <tr>
                        <th>Nr</th>
                        <th>Czas</th>
                        <th>Klasa</th>
                        <th>Przedmiot pierwotny</th>
                        <th>Nauczyciel zastępujący</th>
                        <th>Przedmiot docelowy</th>
                    </tr>
                <c:forEach items="${godziny}" var="godzina" varStatus="status" >
                    <tr>
                        <th>${godzina.id}</th>
                        <td>${godzina.rozpoczecie}-${godzina.zakonczenie}</td>
                        <td align="right">
                            <select name="listaZast[${godzina.id}].klasaID" id="klasa">
                                <option value="">--wybierz klasę--</option>
                                <c:forEach items="${klasy}" var="klasa" varStatus="status" >
                                    <option value="${klasa.id}">${klasa.poziom}${klasa.symbol}</option>
                                </c:forEach>
                            </select>
                        </td>
                        <td>
                            <select name="listaZast[${godzina.id}].pierwotnyID" id="pierwotny">
                                <option value="">--wybierz przedmiot--</option>
                                <c:forEach items="${przedmioty}" var="przedmiot" varStatus="status" >
                                    <option value="${przedmiot.id}">${przedmiot.nazwa}</option>
                                </c:forEach>
                            </select>
                        </td>
                        <td align="right">
                            <select name="listaZast[${godzina.id}].zastepujacyID" id="zastepujacy">
                                <option value="">--wybierz zastępującego--</option>
                                <c:forEach items="${nauczyciele}" var="nauczyciel" varStatus="status" >
                                    <option value="${nauczyciel.id}">${nauczyciel.nazwisko} ${nauczyciel.imie}</option>
                                </c:forEach>
                            </select>
                        </td>
                        <td align="right">
                            <select name="listaZast[${godzina.id}].docelowyID" id="docelowy">
                                <option value="">--wybierz przedmiot--</option>
                                <c:forEach items="${przedmioty}" var="przedmiot" varStatus="status" >
                                    <option value="${przedmiot.id}">${przedmiot.nazwa}</option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                </c:forEach>

                    <tr>
                        <td colspan="6" align="right">
                            <!--button type="button" class="btn btn-primary">Wyświetl</button-->
                            <input type="submit" class="btn btn-success" value="Dodaj">
                            <!--button type="button" class="btn btn-info">Dodaj</button-->
                            <a class="btn btn-warning" href="listaZastepstw">Anuluj</a>
                            <!--button type="button" class="btn btn-danger">Usuń / Nie</button-->
                            <!--input type="submit" value="Dodaj" class="btn btn-info"/-->
                        </td>
                    </tr>
		</tbody>
            </table>
	</f:form>