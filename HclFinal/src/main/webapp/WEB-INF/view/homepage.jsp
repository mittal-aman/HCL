<!DOCTYPE html >
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="sat, 01 Dec 2001 00:00:00 GMT">
<meta name="viewport" content="width=device-width , initial-scale=1" />
<title>Home</title>
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/style.css" rel="stylesheet">

</head>
<body>
	<div class="navbar-wrapper">
		<div class="navbar navbar-inverse navbar-static-top" role="navigation">
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target=".navbar-collapse">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="/welcome">HCL</a>
				</div>
				<div class="collapse navbar-collapse">
					<ul class="nav navbar-nav">
						<li><a href="/login">Login</a></li>
						<li><a href="/register">New Registration</a></li>
						<li><a href="/show-users">All Users</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>


	<div class="container" id="homediv">
		<div class="jumbotron text-center">
			<h1>Welcome to Hcl</h1>
		</div>
	</div>

	<div class="container text-centered">
		<div class="alert alert-success">
			<h4>
				<a href="/add-question"> Add Question </a>
			</h4>
		</div>
	</div>

	<c:choose>
		<c:when test="${mode=='MODE_AddQuestion' }">
			<div class="container text-center">
				<h3>New Question</h3>
				<hr>
			</div>
		</c:when>
	</c:choose>

	<div class="container text-center" id="tasksDiv">
		<h3>All Questions</h3>
		<hr>
		<div class="table-responsive">
			<table class="table table-striped table-bordered">
				<thead>
					<tr>
						<th>number</th>
						<th>question</th>
						<th>answer</th>
						<th>Delete</th>
						<th>Edit</th>
					</tr>
				</thead>
				<%--		<tbody>
							<c:forEach var="user" items="${users }">
								<tr>
									<td>${user.id}</td>
									<td>${user.username}</td>
									<td>${user.firstname}</td>
									<td>${user.lastname}</td>
									<td><a href="/delete-user?id=${user.id }"><span
											class="glyphicon glyphicon-trash"></span></a></td>
									<td><a href="/edit-user?id=${user.id }"><span
											class="glyphicon glyphicon-pencil"></span></a></td>
								</tr>
							</c:forEach> 
						</tbody>   --%>
			</table>
		</div>
	</div>


	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="static/js/jquery-1.11.1.min.js"></script>
	<script src="static/js/bootstrap.min.js"></script>
</body>
</html>