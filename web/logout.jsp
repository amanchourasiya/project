<%-- 
    Document   : logout
    Created on : Apr 19, 2017, 7:27:55 PM
    Author     : Autobot
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%session.invalidate();%>

<%@include file="login.jsp" %>
