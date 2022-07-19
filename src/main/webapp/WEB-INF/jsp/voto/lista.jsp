<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>
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
	  <h2>Cadastramento de votos</h2>

	  <c:if test="${not empty mensagem}">
		<div class="alert alert-success">
		  <strong>Confirmação!</strong> ${mensagem}
		</div>	  
	  </c:if>
	<security:authorize access="hasRole('ADMIN')">
	  <form action="/voto" method="get">
			<label>Eleições:</label>
		  	<select class="form-control" name="idEleicao">
		    	<c:forEach var="e" items="${eleicoes}">
		    	<option value="${e.id}">${e.descricao}</option>
		    	</c:forEach>
		  	</select>
			<button type="submit" class="btn btn-primary">Novo</button>
	  </form>
	  </security:authorize>
	  <hr>
	<c:if test="${not empty lista}">		
		  <h2>Total de votos: ${lista.size()}</h2>
		<table class="table table-striped">
		    <thead>
		      <tr>
		        <th>ID</th>
		        <th>Data</th>
		        <th>Localização</th>
		        <th>Eleitor</th>
		        <th>Eleição</th>
		        <th>Candidato</th>
		        <th></th>
		      </tr>
		    </thead>
		    <tbody>
		      <c:forEach var="v" items="${lista}">
			      <tr>
			        <td>${v.id}</td>
			        <td>${v.data}</td>
			        <td>${v.localizacao}</td>
			        <td>${v.eleitor.nome}</td>
			        <td>${v.eleicao.descricao}</td>
			        <td>${v.candidato.nome}</td>
			        <security:authorize access="hasRole('ADMIN')">
			        <td><a href="/voto/${v.id}/excluir">excluir</a></td>
			        </security:authorize>
			      </tr>
		      </c:forEach>		      
		    </tbody>
	  	</table>
    </c:if>	  	  

	<c:if test="${empty lista}">		
	  <h2>Não existem votos cadastrados!!!</h2>
	</c:if>

	</div>
</body>
</html>