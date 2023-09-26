<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.css" />
<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.2.1.js"></script>
<script type="text/javascript"
	src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Blergh</title>


	<script>
$(document).ready(function(){
	$.getJSON('http://localhost:8080/projetoMongoDB/listar', function (data){
		str='';
		str="<table border='1'><tr><td>codigo</td><td>Nome</td>"+"<td>Email</td><td>Sexo</td><td>Salario</td></tr>";
		for (let item of data){
        str+="<tr><td>"+ item.codigo + "</td>"+
        "<td>" +item.nome + "</td>"+
        "<td>"+ item.email + "</td>"+
        "<td>"+ item.sexo + "</td>"+
        "<td>"+ item.salario + "</td></tr>";
			}
		str+="</table>";
		$("#resposta").html(str); //hashtag sem pre busca ID
			});
});


</script>
</head>
<body>
<h2>Bem vindo ao ajax</h2>

<form method="post" action="gravar">
<br/>Codigo<Br/>
<input type="number" name="codigo" id="codigo" />

<br/>Nome<Br/>
<input type="text" name="nome" id="nome" />

<br/>email<Br/>
<input type="email" name="email" id="email" />

<br/>Sexo<Br/>
<input type="text" name="sexo" id="sexo" />

<br/>Salario<Br/>
<input type="number" name="salario" id="salario" />
<br/>
<button type="submit">GRAVAR</button>

</form>





<div id="resposta">
</div>
</body>
</html>