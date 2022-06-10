<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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

	  <form action="/voto/incluir" method="post">
	   <div class="form-group">
		  	<c:if test="${not empty eleitores}">
		  	<label>Eleitor:</label>
		  	<select class="form-control" name="eleitor.id">
		    	<c:forEach var="e" items="${eleitores}">
		    	<option value="${e.id}">${e.nome}</option>
		    	</c:forEach>
		  	</select>
		  	</c:if>
		  <c:if test="${empty eleitores}">
				<c:set var="botao" value="disabled"/>
		  		<label>Não existem cadastrados!!!</label>
		  	</c:if>
			
		</div>
		
	  	<div class="mb-3 mt-3">
	      <label>Eleição:</label>
	      <input type="text" class="form-control" value="${eleicao.descricao }" readonly>
	    </div>
	    
	    <div class="form-group">
		  	<c:if test="${not empty candidatos}">
		  	<label>Candidato:</label>
		  	<select class="form-control" name="candidato.id">
		    	<c:forEach var="c" items="${candidatos}">
		    	<option value="${c.id}">${c.nome}</option>
		    	</c:forEach>
		  	</select>
		  	</c:if>
		  
			<c:if test="${empty candidatos}">
				<c:set var="botao" value="disabled"/>
		  		<label>Não existem candidatos!!!</label>
		  	</c:if>
		</div>
		<input type="hidden" name="eleicao" value="${eleicao.id}">
	    <div class="mb-3 mt-3">
	      <label>localizacao:</label>
	      <input type="text" class="form-control" placeholder="Entre com a localizacao" name="localizacao" value="rua primeira">
	    </div>


	    <button type="submit" class="btn btn-primary">Cadastrar</button>
	  </form>
	</div>

</body>
</html>