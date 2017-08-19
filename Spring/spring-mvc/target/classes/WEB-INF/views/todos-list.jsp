<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="UTF-8">
<title>spring mvc</title>
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body class="container">

	<div class="page-header">spring mvc : learn</div>


	<div class="panel panel-default">
		<div class="panel panel-heading">All Todos - ${comp}</div>
		<div class="panel-body">

			<table class="table">
				<c:forEach var="todo" items="${todos}">
					<tr>
						<td>${todo.id}</td>
						<td>${todo.title}</td>
						<td>${todo.completed}</td>
					</tr>
				</c:forEach>
			</table>

		</div>
	</div>


</body>
</html>