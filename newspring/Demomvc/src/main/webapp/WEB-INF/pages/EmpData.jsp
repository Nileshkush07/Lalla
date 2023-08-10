<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Employee List</title>
	<style>
		body {
			font-family: Arial, sans-serif;
			margin: 0;
			padding: 20px;
			background-color: #f5f5f5;
		}

		h1 {
			text-align: center;
			color: #333333;
		}

		table {
			width: 100%;
			border-collapse: collapse;
			background-color: white;
			border: 1px solid #cccccc;
		}

		th, td {
			padding: 10px;
			border: 1px solid #cccccc;
			text-align: left;
		}

		th {
			background-color: #f2f2f2;
			font-weight: bold;
		}

		a {
			text-decoration: none;
			color: #333333;
		}

		button {
			padding: 5px 10px;
			border: none;
			border-radius: 3px;
			background-color: #4caf50;
			color: white;
			cursor: pointer;
		}

		button a {
			color: white;
		}

		button.edit {
			background-color: #2196f3;
		}

		button.delete {
			background-color: #f44336;
		}
	</style>
</head>
<body>
	<h1>Employee List</h1>
	<button><a href="/show">Add Employee</a></button>
	<table>
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>CITY</th>
			<th>ACTIONS</th>
		</tr>
		<c:forEach var="obj" items="${list}">
			<tr>
				<td>${obj.empId}</td>
				<td>${obj.empName}</td>
				<td>${obj.empcity}</td>
				<td>
					<button class="edit"><a href="/edit/${obj.empId}">Edit</a></button>
					<button class="delete"><a href="/delete/${obj.empId}">Delete</a></button>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
