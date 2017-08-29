/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ravan
 */
@WebServlet(name = "JurosSimplesServlets", urlPatterns = {"/juros-simples"})
public class JurosSimplesServlets extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet JurosSimplesServlets</title>");            
            out.println("</head>");
            out.println("<body>");
            //entrada das variaveis
            double capital = 0;
            double taxa = 0;
            double juros = 0; 
            int tempo = 0;
            double monte = 0;
            //tratamento da variavel capital
            try{
                if(request.getParameter("capital")!= null){
                capital = Double.parseDouble(request.getParameter("capital"));
                }
            }
            catch(Exception ex){
                out.println("<span style='color:red;'>Você entrou com um número no formato inválido no campo de capital. Tente novamente: </span><br>");
            }
            //tratamento de erro da variavel taxa
            try{
                if(request.getParameter("taxa")!= null){
                taxa = Double.parseDouble(request.getParameter("taxa"));
                }
            }
            catch(Exception ex){
                out.println("<span style='color:red;'>Você entrou com um número no formato inválido no campo da taxa de juros. Tente novamente: </span><br>");
            }
            //tratamento de erro da variavel tempo
            try{
                if(request.getParameter("tempo")!= null){
                tempo = Integer.parseInt(request.getParameter("tempo"));
                }
            }
            catch(Exception ex){
                out.println("<span style='color:red;'>Você entrou com um número no formato inválido no campo de tempo. Tente novamente: </span><br>");
            }
            
            //campos e calculos
            out.println("<h1>Calculo juros simple</h1>");
            out.println("<br>");
            out.println("<div>");
            out.println("<p><strong>Preencha os campos abaixo</strong></p>");
            out.println("<form>");
            out.println("Capital: " + "<input type ='number' step='0.01' required min='0' name = 'capital' value = '"+capital+"'/>");
            out.println("<br>");
            out.println("Taxa de juros: " + "<input type ='number' step='0.01' required min='0' name = 'taxa' value = '"+taxa+"'/>");
            out.println("<br>");
            out.println("Tempo: " + "<input type ='number' required min='0' name = 'tempo' value = '"+tempo+"'/>");
            out.println("<input type='submit' value='Calcular'/>");
            
            out.println("</form>");
            //calculo do juros e exibição
            juros = (capital * (taxa/100) * tempo);
            out.println("<h2>Juros de: "+juros+"</h2>");
            //calculo do montantee exibição
            monte = capital+juros;
            out.println("<h2>Montante de: "+monte+"</h2>");
            out.println("</div>");
            out.println("</body>");
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
