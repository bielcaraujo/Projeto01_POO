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
out.println(""+
"           <!DOCTYPE html>\n" +
"               <html lang=\"UTF-8\">\n" +
"               <head>\n" +
"               <meta charset=\"UTF-8\">\n" +
"               <title>Cont</title>");
            //css
out.println("<style>body{\n" +
"	margin:0;\n" +
"	width: 100%;\n" +
"	height:100%;\n" +
"	min-width: 1024px;\n" +
"	background-color:#3f444c;\n" +
"	font-family: \"Roboto\", sans-serif;\n" +
"	background: url(\"http://www.excellencesolucoes.com.br/images/banner08-empresa-escritorio-contabilidade-morumbi-sp-sao-paulo-empresarial-excellence-solucoes-contabeis-tributarias-fiscal-empresas-referencia-escritorios-zona-oeste-leste-norte-sul-melhor.jpg\") no-repeat;\n" +
"	background-size: cover;\n" +
"	background-attachment: fixed;\n" +
"	}\n" +
"\n" +
".container{	\n" +
"	margin-left: 3%;\n" +
"	margin-right: 3%;\n" +
"	position: static;\n" +
"}\n" +
"\n" +
"header{\n" +
"	width: 100%;\n" +
"	height: 90px;\n" +
"	background-color:#3f444c;\n" +
"	color: white;\n" +
"	margin-bottom: 100px;\n" +
"}\n" +
"\n" +
"\n" +
"#cabecalho{\n" +
"	font-size: 30px;\n" +
"	padding: 2% 0% 0% 5%;\n" +
"}\n" +
"nav{\n" +
"	width: 100%;\n" +
"	height: 100%;\n" +
"	background-color:#3f444c;\n" +
"}\n" +
"nav ul li{\n" +
"	float: left;\n" +
"	margin: 20px;\n" +
"	font-size: 20px;\n" +
"	list-style-type: none;\n" +
"}\n" +
"nav ul li:hover{\n" +
"	background: black; \n" +
"}\n" +
"\n" +
"nav ul li a:link{\n" +
"	text-decoration: none;\n" +
"	color: white;\n" +
"}\n" +
"\n" +
"nav ul li a:visited{\n" +
"	text-decoration: none;\n" +
"	color: white;	\n" +
"}\n" +
".margem{\n" +
"	padding-left:30px; \n" +
"}"+
"section#gerador{\n" +
"	position:relative\n" +
"	width: 100%;\n" +
"	height: 100%;\n" +
"	min-width: 1024px;\n" +
"	min-height: 700px;\n" +
"	background-color:#3f444c;\n" +
"	background: url(\"http://www.excellencesolucoes.com.br/images/banner08-empresa-escritorio-contabilidade-morumbi-sp-sao-paulo-empresarial-excellence-solucoes-contabeis-tributarias-fiscal-empresas-referencia-escritorios-zona-oeste-leste-norte-sul-melhor.jpg\")no-repeat;\n" +
"	background-size: cover;\n" +
"	background-attachment: fixed;\n" +
"}\n" +
"\n" +
".container-ban{\n" +
"position:relative;\n" +
"	width: 100%;\n" +
"	height: 100%;\n" +
"}\n" +
"\n" +
".btnEnviar{width:16%; background-color:green;color:white; margin-top:10px; border-radius:5px; border-shadow:5px 5px 4px 5px; }"+
"footer{\n" +
"	background-color: #fff;\n" +
"	padding: 50px;\n" +
"}\n" +
".titulo{\n" +
"	padding-left: 50px;\n" +
"}\n" +
"\n" +
".explicacao{\n" +
"	width: 100%;\n" +
"	height: 100%;\n" +
"	background-color: #fff;\n" +
"	padding-top: 10px;\n" +
"	margin-bottom: 10px;\n" +
"	background-attachment: fixed;\n" +
"\n" +
"}\n" +
".btnApagar{width:16%; background-color:#e21b21;color:white; margin-top:10px; border-radius:5px; border-shadow:5px 5px 4px 5px; }"+
".container-exp{\n" +
"	width: 40%;\n" +
"	height: 100%;\n" +
"	background-color: #fff;\n" +
"}\n" +
"\n" +
".conteudo{\n" +
"	padding-top: 10px;\n" +
"	padding-bottom: 10px;\n" +
"	height: 100%;\n" +
"	padding-left:50px;\n" +
"	padding-right:50px;\n" +
"}\n" +
"\n" +
"table#tabela{\n" +
"	width: 20%;\n" +
"	height: 100%;\n" +
"}</style>");
            
            //html
out.println("</head>\n" +
"<body>\n" +
"	<div class=\"container\">\n" +
"		<header><!--Inicio Cabeçalho-->\n" +
"			<div id=\"cabecalho\">JAVA EE PROJECT</div><!--Nome a direita-->\n" +
"			<hr>\n" +
"			<nav>\n" +
"				<ul><!--Itens do menu-->\n" +
"					<li><a href=\"home\">Principal</a></li>\n" +
"					<li><a href=\"juros-simples\">Juros Simples</a></li>\n" +
"					<li><a href=\"juros-composto\">Juros Composto</a></li>\n" +
"				</ul>\n" +
"			</nav>\n" +
"			\n" +
"		</header><!--Fim cabeçalho-->");
           
            //inicialização das variaveis
            double capital = 0;
            double taxaJ = 0;
            int tempo = 0;
            //tratamento de erro da variavel capital
            try{
                if(request.getParameter("capital")!= null){
                capital = Double.parseDouble(request.getParameter("capital"));
                }
            }
            catch(Exception ex){
                out.println("<span style='color:red;'>Você entrou com um número no formato inválido no campo de capital. Tente novamente: </span><br>");
            }
            //tratamento de erro da variavel taxaJ
            try{
                if(request.getParameter("taxaJ")!= null){
                taxaJ = Double.parseDouble(request.getParameter("taxaJ"));
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
            out.println("<section id=\"gerador\"><!--categorias-->\n" +
"			<div class=\"explicacao\" id=\"conceito\">\n" +
"				<!--div class=\"container-exp\"-->\n" +
"					<div class=\"titulo\" align=\"left\">\n" +
"						<h3>Juros Composto</h3>\n" +
"					</div>\n" +
"					<div class=\"conteudo\">");
            
            
            out.println("<form>");
            out.println(" <label for=\"capital\">Capital inicial</label><br>" + "<input type='number' step='0.01' min='1' name = 'capital' value = '"+capital+"'/><br>");
            out.println("  <label for=\"taxaJ\">Taxa de juros</label><br>" + "<input type ='number' step='0.01' min='0' name = 'taxaJ' value = '"+taxaJ+"'/><br>");
            out.println("   <label for=\"tempo\">Tempo</label><br>" + "<input type ='number' step='0.01' required min='1' name = 'tempo' value = '"+tempo+"'/><br>");
            out.println("<input class='btnEnviar' type='submit' value='Gerar'/><br>");
              out.println("<input class='btnApagar' type='reset' value='Apagar'/></input><br><br>");
              out.println("<button>");
            out.println("</form>");
            //final do form de entrada de dados do usuário
            out.println("<hr/>");
            //inicio da tabela
            out.println("<table border='0'>");
            //cabeçalho da tabela
            out.println("<tr>");
            out.println("<th>Mês<hr></th>");
            out.println("<th>Capital<hr></th>");
            out.println("<th>Montante<hr></th>");
            out.println("<th>Juros<hr></th>");
            out.println("</tr>");
            //for para utilziar os dados do usuario
            double montante = capital;
            taxaJ = taxaJ / 100;
            for(int i=1; i<=tempo; i++){
                //inicio da tabela de resposta
                out.println("<tr>");
                //coluna do Tempo
                out.println("<td class=\"margem\">"+i+"<hr></td>");
                //coluna do Capital
                out.println("<td class=\"margem\">"+montante+"<hr></td>");
                //coluna do montante
                montante = capital*(1+taxaJ);
                double juros = montante - capital;
                capital = montante;
                out.println("<td class=\"margem\">"+montante+"<hr></td>");
                out.println("<td class=\"margem\">"+juros+"<hr></td>");
                out.println("</tr>");
            }
            out.println("</table></button>");
            out.println("</div>\n" +
"				</div>\n" +
"			<footer id=\"grupo\">\n" +
"			<p><b>ADS 3ºciclo Vespertino</b></p>\n" +
"            Integrantes: Gabriel Colombo Araujo<br>\n" +
"            Gabriel Daichi Kadota <br>\n" +
"            João Victor Sebastian Marques<br>\n" +
"            Rodrigo Garcia Moreira<br>\n" +
"            Saulo Pedro da Silva <br>\n" +
"			</footer>\n" +
"		</section><!--fim categorias-->\n" +
"	</div>\n" +
"</body>\n" +
"</html>\n" +
"");
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
