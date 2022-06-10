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
	  <h2>Cadastramento de candidatos</h2>

	  <c:if test="${not empty mensagem}">
		<div class="alert alert-success">
		  <strong>Confirmação!</strong> ${mensagem}
		</div>	  
	  </c:if>

	  <form action="/candidato" method="get">
	    <button type="submit" class="btn btn-primary">Novo</button>
	  </form>
	  
	  <hr>
	<c:if test="${not empty lista}">		
		  <h2>Total de candidatos: ${lista.size()}</h2>
		<table class="table table-striped">
		    <thead>
		      <tr>
		        <th>ID</th>
		        <th>nome</th>
		        <th>numero</th>
				<th>Eleição</th>
		        <th>Votos</th>
		        <th></th>
		      </tr>
		    </thead>
		    <tbody>
		      <c:forEach var="c" items="${lista}">
			      <tr>
			        <td>${c.id}</td>
			        <td>${c.nome}</td>
			        <td>${c.numero}</td>
					<td>${c.eleicao.descricao}</td>
			        <td>${c.votos.size()}</td>
		        	<td><a href="/candidato/${c.id}/excluir">excluir</a></td>
			      </tr>
		      </c:forEach>		      
		    </tbody>
	  	</table>
    </c:if>	  	  

	<c:if test="${empty lista}">		
	  <h2>Não existem candidato cadastrados!!!</h2>
	</c:if>

	</div>
</body>
</html>