<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="statement" method="get">
	Enter profileId: <input name="profileId"/><br/>
	<input type="submit"/>
</form>
<table>
<tr>
                <th>statement_id</th>
                <th>amount</th>
                <th>date_time</th>
                <th>order_id</th>
                <th>transaction_remarks</th>
                <th>transaction_type</th>
                <th>profile_id</th>
            </tr>
            <jstl:forEach var="statements" items="${statements}">
			<tr>
				<td>${statements.statementId}</td>
				<td>${statements.amount}</td>
				<td>${statements.dateTime}</td>
				<td>${statements.orderId}</td>
				<td>${statements.transactionRemarks}</td>
				<td>${statements.transactionType}</td>
				<td>1</td>
			</tr>
		</jstl:forEach>
            
</table>
</body>
</html>