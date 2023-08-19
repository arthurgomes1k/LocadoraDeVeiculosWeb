<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Locadora de Veículos</title>
<link rel="stylesheet" href="style.css">
<link rel="icon" href="imagens/favicon.ico">
</head>
<body>
	<h1>Cadastro de veículos</h1>
	<form name="frmVeiculo" action="incluir">
		<table>
			<tr>
				<td><input type="text" name="nome" placeholder="Nome" class="Caixa1"></td>
			</tr>
			<tr>
				<td><input type="text" name="marca" placeholder="Marca" class="Caixa1"></td>
			</tr>
		</table>
		<input type="button" value="Adicionar" class="botao1" onclick="validar()">
		<a href="voltar" class="botao1">Voltar</a>
	</form>
<script type="text/javascript" src="scripts/validador.js"></script>
</body>
</html>