<%-- 
    Document   : Controlador
    Created on : 26/08/2022, 07:34:36 PM
    Author     : johan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body> 
        <form>
             <form action="Controlador.jsp" method="get">
            <p>Peticion: <input type="text" name="texto"><br></p>
            
        <input type="submit" value="ok">
        
            
        </form>
         <%@ page import = "Logica.Logi" %>
        <% String desicion = request.getParameter("texto");
        
        Logica.Logi  log = new Logi();
        log.chat(desicion);
        out.print(log.chat(desicion));
        %>
        
        
        
        
        
       
    </body>
    
</html>
