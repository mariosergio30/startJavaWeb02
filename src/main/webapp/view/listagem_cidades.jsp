<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="pt">

<head>
<link rel="stylesheet" type="text/css" href="../css/styles.css">
</head>

<body>
	
	<hr><strong>Exemplo: Response a partir de uma VIEW jsp (MVC)</strong><hr>
		
		
	<!-- atributo simples -->
	Este é seu <span class="destaque alerta">${acesso}º</span> acesso.	
	 
	<hr>	
	
	<h2>Lista de Cidades</h2>
	
	<b>Tabela dinamica com dados do provenientes do backEnd</b><br> 	
	<table border="1">
		<tr>
		    <th>Id</th>			
			<th>Cidade</th>
			<th>UF</th>
			<th>Atrações turisticas</th>			
		</tr>
		
		<!-- estrutura de Repetição -->
		<c:forEach var="cidade" items="${listaCidades}" >  <!-- atributo Lista de Objetos -->
			<tr>
				<td><c:out value="${cidade.id}" /></td>
					
				<!-- estrutura de Decisão -->
				<td <c:if test="${cidade.nome == 'Recife'}">class="forte"</c:if> >				
				<c:out value="${cidade.nome}"/>
				</td>
				
				<td><c:out value="${cidade.uf}" /></td>								
				<td><c:out value="${cidade.atracoes}" /></td>
			</tr>
		</c:forEach>
	</table>


</body>

</html>