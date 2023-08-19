<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="br.com.arthur.locadora.Carro"%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Locadora de Veículos</title>
<link rel="stylesheet" href="style.css">
<link rel="icon" href="imagens/favicon.ico">
</head>
<body>
	<h1>Agenda de Contatos</h1>
	<div class="container">
		<a href="cadastro" class="botao2">Novo contato</a>
		<a href="voltar" class="botao2">Home</a>
	</div>
	<table id="tabela">
		<thead>
			<tr>
				<th>Id</th>
				<th>Nome</th>
				<th>Marca</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="li" items="${lista}">
				<tr>
					<td>${li.id}</td>
					<td>${li.nome}</td>
					<td>${li.marca}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div class="container">
		<a href="limpar" class="botao2">Limpar</a>
	</div>
	
</body>
</html>