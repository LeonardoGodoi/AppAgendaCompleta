<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista de Pessoas!</h1>
        <fieldset>
            <table border="1" width="1" cellspacing="1" cellpadding="1">
                <tr style="background-color: cadetblue; font-weight: bold;">
                    <td>Nome</td>
                    <td>Email</td>
                    <td>Telefone</td>
                    <td>Endereço</td>
                    <td>Editar</td>
                    <td>Excluir</td>
                </tr>
                <c:forEach items="${lstPessoas}" var="item">
                    <tr>
                        <td>${item.nome}</td>
                        <td>${item.email}</td>
                        <td>${item.telefone}</td>
                        <td>${item.endereco}</td>
                        <td><input type="button" value="Editar" name="btn" 
                                   onclick="window.location.href='PessoaSV?action=editar&id=${item.id}'" /></td>
                        <td><input type="button" value="Excluir" name="btn" 
                                   onclick="window.location.href='PessoaSV?action=excluir&id=${item.id}'" /></td>
                        <td></td>
                    </tr>
                </c:forEach>
                <tr>
                    <td colspan="6">
                        Quantidade de Pessoas cadastradas: ${fn:length(lstPessoas)}
                    </td>
                </tr>
                <tr>
                    <td colspan="6">
                        <input type="button" value="Home" name="btn" 
                                   onclick="window.location.href='index.jsp'" />
                        <input type="button" value="Novo" name="btn" 
                                   onclick="window.location.href='PessoaSV?action=novo'" />
                    </td>
                </tr>
            </table>

        </fieldset>
    </body>
</html>
