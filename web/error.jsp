<%-- 
    Document   : error
    Created on : 13 Apr, 2017, 1:15:02 AM
    Author     : jarvis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <jsp:include page="header.jsp" />
    <br /> <br /> <br /> <br /> <br /> <br />
    <%if(session.getAttribute("message")!=null){%>
    <%=session.getAttribute("message")%>
    <%}%>
    <br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br />
    <jsp:include page="footer.jsp" />
</html>
