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
	  <h2>Cadastramento de eleitor</h2>
	  
	  <c:if test="${not empty mensagem}">
		<div class="alert alert-success">
		  <strong>Confirmação!</strong> ${mensagem}
		</div>	  
	  </c:if>

	  <form action="/eleitor/incluir" method="post">
	    <div class="mb-3 mt-3">
	      <label>codigo:</label>
	      <input type="text" class="form-control" placeholder="Entre com o seu codigo" name="codigo" value="45878">
	    </div>

	    <div class="mb-3 mt-3">
	      <label>nome:</label>
	      <input type="text" class="form-control" placeholder="Entre com o seu nome" name="nome" value="luan bruno">
	    </div>

	    <div class="mb-3 mt-3">
	      <label>email:</label>
	      <input type="email" class="form-control" placeholder="Entre com o seu email" name="email" value="lua@luan">
	    </div>

	    <div class="mb-3 mt-3">
	      <label>telefone:</label>
	      <input type="text" class="form-control" placeholder="Entre com a marca da bebida" name="telefone" value="1578-8995">
	    </div>
		<div class="mb-3 mt-3">
	      <label>token:</label>
	      <input type="text" class="form-control" placeholder="Entre com o token" name="token" value="fefdd8784">
	    </div>
		

	    <button type="submit" class="btn btn-primary">Cadastrar</button>
	  </form>
	</div>

</body>
</html>