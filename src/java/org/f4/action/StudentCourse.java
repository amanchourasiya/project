/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.f4.action;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Autobot
 */
public class StudentCourse extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           request.getRequestDispatcher("header.jsp").include(request, response);
           out.print("<br/><br/><br/><br/><br/><br/><br/>");
           if(request.getAttribute("message")!=null){
           
               out.println("<h3>"+request.getAttribute("message")+"</h3>");
           }
           out.print(" <div style=\"float: right\">");
           if(request.getParameter("video")==null){
           out.println(" <video src=\"video/collections/video5.mp4\" controls=\"true\"  alt=\"Video not available\" height=\"600\" width=\"900\"></video>");
               
           }
           else{
               String video=request.getParameter("video");
               System.out.println(request.getParameter("video"));
           
               out.println(" <video src=video/collections/"+video +" style=\"padding:50px\" controls=\"true\"  alt=\"Video not available\" height=\"600\" width=\"900\"></video>");
           }
           out.println("</div>");
           out.println("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href=\"studentcourse?video=video1.mp4\">Lecture1</a><br/><br/>\n" +
"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href=\"studentcourse?video=video2.mp4\" >Lecture2</a><br/><br/>\n" +
"  \n" +
" &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  <a href=\"studentcourse?video=video3.mp4\">Lecture3</a><br/><br/>\n" +
"  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  <a href=\"studentcourse?video=video4.mp4\">Lecture4</a><br/><br/>\n" +
"  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   <a href=\"studentcourse?video=video5.mp4\">Lecture5</a><br/><br/>\n" +
"  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    <a href=\"studentcourse?video=video6.mp4\">Lecture6</a><br/><br/>\n" +
"   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    <a href=\"studentcourse?video=video7.mp4.mp4\">Lecture7</a><br/><br/>\n" +
"  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;      <a href=\"studentcourse?video=video8.mp4\">Lecture8</a><br/><br/>\n" +
"   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;      <a href=\"studentcourse?video=video9.mp4\">Lecture9</a><br/><br/>\n" +
"   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;       <a href=\"studentcourse?video=video10.mp4\">Lecture10</a><br/><br/>\n" +
"   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;                 <a href=\"studentcourse?video=video11.mp4\">Lecture11</a> <br/><br/>\n" +
"   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;                 <a href=\"studentcourse?video=video12.mp4\">Lecture12</a><br/><br/>\n" +
"    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;                 <a href=\"studentcourse?video=video13.mp4\">Lecture13</a><br/><br/>\n" +
"    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;                  <a href=\"studentcourse?video=video14.mp4\">Lecture14</a><br/><br/>\n" +
"    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;                   <a href=\"studentcourse?video=video15.mp4\">Lecture15</a><br/><br/>\n" +
"     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;                   <a href=\"studentcourse?video=video16.mp4\">Lecture16</a><br/><br/>\n" +
"      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;                   <a href=\"studentcourse?video=video17.mp4\">Lecture17</a><br/><br/>\n" +
"      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;                    <a href=\"studentcourse?video=video18.mp4\">Lecture18</a><br/><br/>\n" +
"\n" +
"          ");
        }
        request.getRequestDispatcher("footer.jsp").include(request, response);
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
