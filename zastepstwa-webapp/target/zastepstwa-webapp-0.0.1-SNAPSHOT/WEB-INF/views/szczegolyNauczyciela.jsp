<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Zastępstwa::Szczegóły nauczyciela</title>
	</head>
	<body>
		<a href="listaNauczycieli">Powrót do listy nauczycieli</a><br />
		<table border="1">
			<tbody>
				<tr>
					<th>Imię</th>
					<td>${nauczyciel.imie}</td>
				</tr>
				<!-- tr>
					<th>Data urodzenia</th>
					<td><fmt:formatDate pattern="dd.MM.yyyy" value="${kot.dataUrodzenia}" /></td>
				</tr -->
				<!-- tr>
					<th>Waga</th>
					<td><fmt:formatNumber type="number" minFractionDigits="2" maxFractionDigits="2" value="${kot.waga}" /> kg</td>
				</tr -->
				<tr>
					<th>Nazwisko</th>
					<td>${nauczyciel.nazwisko}</td>
				</tr>
                                <tr>
					<th>Skrót</th>
					<td>${nauczyciel.skrot}</td>
				</tr>
                                <tr>
					<th>id-db</th>
					<td>${nauczyciel.id}</td>
				</tr>
                                <tr>
					<th>e-mail</th>
					<td>${nauczyciel.e_mail}</td>
				</tr>
			</tbody>
		</table>
		<br />
		<hr />
		Uwaga! W kontekście użycia HTML oraz sposobu budowania stron, te rozwiązania są bardziej antyprzykładem niż materiałem do nauki!<br />
		Jeśli chciałabyś także tworzyć same widoki i pisac poprawny, dobrze skonstruowany kod HTML, zachęcamy do zapoznania się np. z frameworkiem <a href="http://getbootstrap.com" target="_blank">Bootstrap</a>.
	</body>
</html>