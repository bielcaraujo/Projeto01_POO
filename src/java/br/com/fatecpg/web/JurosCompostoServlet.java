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
 * @author Gabriel
 */
@WebServlet(name = "JurosCompostoServlet", urlPatterns = {"/juros-composto"})
public class JurosCompostoServlet extends HttpServlet {

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
            out.println("<title>Juros Composto</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Gerador de tabuada</h1>");
            //inicialização das variaveis
            int capital = 1;
            int taxaJ = 1;
            int tempo = 1;
            //tratamento de erro da variavel capital
            try{
                if(request.getParameter("capital")!= null){
                capital = Integer.parseInt(request.getParameter("capital"));
                }
            }
            catch(Exception ex){
                out.println("<span style='color:red;'>Você entrou com um número no formato inválido no campo de capital. Tente novamente: </span><br>");
            }
            //tratamento de erro da variavel taxaJ
            try{
                if(request.getParameter("taxaJ")!= null){
                taxaJ = Integer.parseInt(request.getParameter("taxaJ"));
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
            //inicio do form de entrada de dados do usuário
            out.println("<form>");
            out.println("Capital inicial" + "<input type ='text' name = 'capital' value = '"+capital+"'/><br>");
            out.println("Taxa de juros" + "<input type ='text' name = 'taxaJ' value = '"+taxaJ+"'/><br>");
            out.println("Taxa de juros" + "<input type ='text' name = 'tempo' value = '"+tempo+"'/><br>");
            out.println("<input type='submit' value='Gerar'/>");
            out.println("</form>");
            //final do form de entrada de dados do usuário
            out.println("<hr/>");
            //inicio da tabela
            out.println("<table border='1'>");
            //cabeçalho da tabela
            out.println("<tr>");
            out.println("<th>Mês</th>");
            out.println("<th>Capital</th>");
            out.println("<th>Montante</th>");
            out.println("</tr>");
            //for para utilziar os dados do usuario
            int montante = capital;
            taxaJ = taxaJ / 100;
            for(int i=1; i<=tempo; i++){
                //inicio da tabela de resposta
                out.println("<tr>");
                //coluna do Tempo
                out.println("<td>"+i+"</td>");
                //coluna do Capital
                out.println("<td>"+capital+"</td>");
                //coluna do montante
                out.println("<td>"+montante+"</td>");
                montante = capital*(1+taxaJ)^1 ;
                capital = montante;
                out.println("</tr>");
            }
            out.println("</table>");
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
