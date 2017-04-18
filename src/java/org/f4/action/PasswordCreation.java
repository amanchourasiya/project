package org.f4.action;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author shyamli
 */
public class PasswordCreation extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String email=request.getParameter("email");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>\n" +
"\n" +
"    <meta charset=\"utf-8\">\n" +
"    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
"    <meta name=\"description\" content=\"\">\n" +
"    <meta name=\"author\" content=\"\">\n" +
"\n" +
"    <title>Shiksha Portal - A step towards free education.</title>\n" +
"\n" +
"    <!-- Bootstrap Core CSS -->\n" +
"    <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\n" +
"\n" +
"    <!-- Custom CSS -->\n" +
"	<link rel=\"stylesheet\" href=\"css/main.css\">\n" +
"    <link href=\"css/custom.css\" rel=\"stylesheet\">\n" +
"	\n" +
"	<script src=\"//use.edgefonts.net/bebas-neue.js\"></script>\n" +
"\n" +
"    <!-- Custom Fonts & Icons -->\n" +
"    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,600,800' rel='stylesheet' type='text/css'>\n" +
"	<link rel=\"stylesheet\" href=\"css/icomoon-social.css\">\n" +
"	<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n" +
"	\n" +
"	<script src=\"js/modernizr-2.6.2-respond-1.1.0.min.js\"></script>\n" +
"	\n" +
"\n" +
"</head>");
           
            out.println("<header class=\"navbar navbar-inverse navbar-fixed-top\" role=\"banner\">\n" +
"        <div class=\"container\">\n" +
"            <div class=\"navbar-header\">\n" +
"                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n" +
"                    <span class=\"sr-only\">Toggle navigation</span>\n" +
"                    <span class=\"icon-bar\"></span>\n" +
"                    <span class=\"icon-bar\"></span>\n" +
"                    <span class=\"icon-bar\"></span>\n" +
"                </button>\n" +
"                <a class=\"navbar-brand\" href=\"index.html\"><img src=\"img/logo.png\" alt=\"Basica\"></a>\n" +
"            </div>\n" +
"            <div class=\"collapse navbar-collapse\">\n" +
"                <ul class=\"nav navbar-nav navbar-right\">\n" +
"                    <li><a href=\"index.html\">Home</a></li>\n" +
"                    <li><a href=\"about-us.html\">About Us</a></li>\n" +
"                    <li><a href=\"services.html\">Services</a></li>\n" +
"                    <li><a href='portfolio.html'>Portfolio</a></li>\n" +
"                    <li class=\"active\"><a href=\"login.html\">Login</a></li>\n" +
"                    <li class=\"dropdown\">\n" +
"                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Pages <i class=\"icon-angle-down\"></i></a>\n" +
"                        <ul class=\"dropdown-menu\">\n" +
"                            <li><a href=\"#\">Dropdown Menu 1</a></li>\n" +
"                            <li><a href=\"#\">Dropdown Menu 2</a></li>\n" +
"                            <li><a href=\"#\">Dropdown Menu 3</a></li>\n" +
"                            <li><a href=\"#\">Dropdown Menu 4</a></li>\n" +
"                            <li><a href=\"#\">Dropdown Menu 5</a></li>\n" +
"                            <li class=\"divider\"></li>\n" +
"                            <li><a href=\"#\">Privacy Policy</a></li>\n" +
"                            <li><a href=\"#\">Terms of Use</a></li>\n" +
"                        </ul>\n" +
"                    </li>\n" +
"                    <li><a href=\"blog.html\">Blog</a></li> \n" +
"                    <li><a href=\"contact-us.html\">Contact</a></li>\n" +
"                </ul>\n" +
"            </div>\n" +
"        </div>\n" +
"    </header><!--/header-->\n" +
"");
            out.println("<div class=\"section section-breadcrumbs\">\n" +
"			<div class=\"container\">\n" +
"				<div class=\"row\">\n" +
"					<div class=\"col-md-12\">\n" +
"						<h1>Password Creation</h1>\n" +
"					</div>\n" +
"				</div>\n" +
"			</div>\n" +
"		</div>");
            out.println("<form name='passwordform' action='passwordsubmit'>");
            out.println("<lable>Password");
            out.println("<input type='password' name='password' maxlength='20' required/>");
            out.println("</lable>");
            out.println("<p>");
            out.println("<lable>Confirm Password");
            out.println("<input type='password' name='confirmpassword' maxlength='20' required/>");
           
            out.println("</lable>");
            out.println("<input type='hidden' value='"+email+"' name='email'>");
            out.println("</p>");
            out.println("<p>");
            out.println("<input type='submit' value='Submit'/>");
            out.println("</p>");
            out.println("</form>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
