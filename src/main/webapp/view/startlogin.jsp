<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="pt">
<head>
<link rel="stylesheet" type="text/css" href="../css/styles.css">
</head>


<html><body>

	<hr>
	<strong>Exemplo: Response a partir de uma VIEW jsp (MVC)</strong>
	<hr>
	<img src="../img/logoAccenture.PNG" width="150">
	<h2>Formação Profissional</h2>


			<!-- atributo simples --> <!-- atributo Objeto -->
	Aluno:	<b>${nomedoaluno}</b>        (${skill.titulo})
	<hr>

	<!-- estrutura condicional -->
	<c:if test="${nomedoaluno != null && nomedoaluno != ''}">
		<div class="destaque normal">Caro participante ${nomedoaluno},
			seja Bem Vindo !</div>
	</c:if>

	<c:if test="${nomedoaluno == null || nomedoaluno == ''}">
		<div class="destaque alerta">Caro participante, por favor inclua
			seu nome na url no formato: ?aluno=...</div>
	</c:if>

	<h3>Os Skills abordados no projeto Start 2019 são:</h3>
	<hr>
	<ul>
		<li>Abap</li>
		<li>Cobol</li>
		<li><strong>Java (back-end)</strong></li>
		<li>Java Script (front-end)</li>
	</ul>
	<hr>
	Saiba mais:
	<a href="https://www.accenture.com/br-pt/company-cidadania-corporativa">Cidadania
		Coorporativa</a>

</body></html>