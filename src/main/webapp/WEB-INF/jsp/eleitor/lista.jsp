<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AppMIT</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">
	  <h2>Cadastramento de eleitor</h2>

	  <c:if test="${not empty mensagem}">
		<div class="alert alert-success">
		  <strong>Confirma��o!</strong> ${mensagem}
		</div>	  
	  </c:if>

	  <form action="/eleitor" method="get">
	    <button type="submit" class="btn btn-primary">Novo</button>
	  </form>
	  
	  <hr>
	<c:if test="${not empty lista}">		
		  <h2>Total de eleitores: ${lista.size()}</h2>
		<table class="table table-striped">
		    <thead>
		      <tr>
		        <th>ID</th>
		        <th>codigo</th>
		        <th>nome</th>
		        <th>email</th>
		        <th>telefone</th>
		        <th>token</th>
		        <th>Votos</th>

		        <th></th>
		      </tr>
		    </thead>
		    <tbody>
		      <c:forEach var="el" items="${lista}">
			      <tr>
			        <td>${el.id}</td>
			        <td>${el.codigo}</td>
			        <td>${el.nome}</td>
			        <td>${el.email}</td>
			        <td>${el.telefone}</td>
			        <td>${el.token}</td>
			        <td>${el.votos.size()}</td>

		        	<td><a href="/eleitor/${el.id}/excluir">excluir</a></td>
			      </tr>
		      </c:forEach>		      
		    </tbody>
	  	</table>
    </c:if>	  	  

	<c:if test="${empty lista}">		
	  <h2>N�o existem eleitor cadastrados!!!</h2>
	</c:if>

	</div>
</body>
</html>