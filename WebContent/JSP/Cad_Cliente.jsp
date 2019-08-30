<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import= "java.sql.*"%> 
<%@page import="java.io.File"%> 
<%@page import="java.lang.String"%> 
<%@page import="java.io.FileWriter"%> 
<%@page import="java.io.PrintWriter"%> 
<%@page import="java.io.FileReader"%> 
<%@page import="java.io.BufferedReader"%>
<%@page import="javax.servlet.ServletException"%>
<%@page import="javax.servlet.http.HttpServletRequest"%>
<%@page import="javax.servlet.http.HttpServletResponse"%>
<%@page import="gravar.GravaDados"%>
<%@page import="acessar.Conexao"%>

<html>
	<head>
		<meta charset="utf-8">
		<title>Gaia Services</title>
	
	  		<!-- Favicons -->
		<link href="../imagem/favicon.png" rel="icon">
		<link href="../imagem/apple-touch-icon.png" rel="apple-touch-icon">
	
	  		<!-- Google Fonts -->
		<link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i|Poppins:300,400,500,700" rel="stylesheet">
	
	  		<!-- Bootstrap CSS File -->
		<link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet">
	
	  		<!-- Libraries CSS Files -->
		<link href="../fonte/css/font-awesome.min.css" rel="stylesheet">
		<link href="../animate/animate.min.css" rel="stylesheet">
	
	  		<!-- Main Stylesheet File -->
		<link href="../design.css" rel="stylesheet">
	  
	  		<!-- JavaScript Libraries -->
		<script src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
		<script src="../bootstrap/js/bootstrap.bundle.min.js"></script>
		<script src="../js/facilita.min.js"></script>
		<script src="../js/wow.min.js"></script>
		<script src="../js/waypoints.min.js"></script>
		<script src="../js/counterup.min.js"></script>
		<script src="../js/hoverIntent.js"></script>
		<script src="../js/superfish.min.js"></script>
		<script src="../js/Script-exibe.js"></script>
		<script src="../js/Script-menu.js"></script>
	
	 		<!-- Valida Campos -->
		<script src="../js/valida.js"></script>
	  
	 		<!-- Contact Form JavaScript File -->
		<script src="../js/faleconosco.js"></script>
	
			<!-- Template Main Javascript File -->
		<script src="../js/principal.js"></script>
	</head>
	<body>
		<section id="ja-cadastrado">
			<div class="container wow fadeIn">
				<div class="row">
          			<div class="col-lg-9 text-center">
	          			<h3 class="cta-title" id="modalLabel"></h3>
						<br>
						<table style="text-align:center; border-collapse: separate; mso-table-lspace: 0; mso-table-rspace: 0; width: 100%;">
	                   		<tbody>
		                    	<tr><td style="vertical-align: top;">
		                       		<input type="submit" class="cta-btn align-middle" onclick="location.href='telaMenu.html'" value="Recuperar senha">
		                     	</td>
		                  			<td>&nbsp;</td>
		                     	<td style="vertical-align: top;">
		                       		<input type="submit" class="cta-btn align-middle" onclick="location.href='telaInicial-cad.html'" value="Faça seu login">
		                     	</td></tr>
	                   		</tbody>
               			</table>
       	  			</div>
       	  		</div>
       		 </div>
		</section>
		
	<%
	//Recebe os dados 
	String cad_nomeCliente = request.getParameter("cad_nome_cliente");
	String cad_emailCliente = request.getParameter("cad_email_cliente");
	String cad_telefoneCliente = request.getParameter("cad_telefone_cliente");	
	String cad_cpfCliente = request.getParameter("cad_cpf_cliente");
	String cad_senhaCliente = request.getParameter("cad_senha_cliente");
	String cad_senhaConfCliente = request.getParameter("cad_senhaConf_cliente");
		
	//Cache
	session.setAttribute("Nome: ",cad_nomeCliente);
	session.setAttribute("E-mail: ",cad_emailCliente);
	session.setAttribute("Telefone: ",cad_telefoneCliente);
	session.setAttribute("CPF: ",cad_cpfCliente);
	session.setAttribute("Senha: ",cad_senhaCliente);
	session.setAttribute("SenhaConf: ",cad_senhaConfCliente);
     
	Conexao conecta = new Conexao();

    
    String insere = "INSERT INTO CLIENTE ('cad_nomeCliente','cad_emailCliente','cad_telefoneCliente','cad_cpfCliente','cad_senhaCliente','cad_senhaConfCliente')" 
      		+ "value ('cad_nomeCliente','cad_emailCliente','cad_telefoneCliente','cad_cpfCliente','cad_senhaCliente','cad_senhaConfCliente')";
    
    response.sendRedirect("gaiaservices.com.br");
	%>
		
	</body>
</html>