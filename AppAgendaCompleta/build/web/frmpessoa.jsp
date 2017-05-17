<%-- 
    Document   : index
    Created on : 04/05/2017, 20:44:13
    Author     : Leogodoi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Agenda</h1>
    <legend> Digite </legend>
    <form action="PessoaSV" method="get">
        <input type="hidden" name="action" value="salvar"/>
        <input type="hidden" name="id" value="${objPessoa.id}"/>
        Nome: <input type="text" name="nome" size="40"value="${objPessoa.nome}"/></br>
        Email <input type="text" name="email" size="40" value="${objPessoa.email}"/></br>
        Telefone: <input type="text" name="telefone" size="10" value="${objPessoa.telefone}"/></br>
        EndereÃ§o: <input type="text" name="endereco" size="50" value="${objPessoa.endereco}"/></br>        
        <input type="submit" name="btn" value="Salvar"/>
        <input type="reset" name="btn" value="Cancelar"/> 
        <input type="button" value="Home" onclick="window.location.href='index.jsp'"/>
    </form>
    <fieldset>
        ${msg}    
    </fieldset>
</body>
</html>
