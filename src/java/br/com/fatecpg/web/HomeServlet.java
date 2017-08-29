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
@WebServlet(name = "HomeServlet", urlPatterns = {"/home"})
public class HomeServlet extends HttpServlet {

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
"<!DOCTYPE html><!DOCTYPE html>\n" +
"<html lang=\"UTF-8\">\n" +
"<head>\n" +
"	<meta charset=\"UTF-8\">\n" +
"	<title>Cont</title>\n" +
" 	<style>"+
"       body{\n" +
"	margin:0;\n" +
"	width: 100%;\n" +
"	height:100%;\n" +
"	min-width: 1024px;\n" +
"	min-height: 1024px;\n" +
"       font-family: \"Roboto\", sans-serif;\n"+
"	background-color:#3f444c;\n" +
"	background: url(\'http://www.excellencesolucoes.com.br/images/banner08-empresa-escritorio-contabilidade-morumbi-sp-sao-paulo-empresarial-excellence-solucoes-contabeis-tributarias-fiscal-empresas-referencia-escritorios-zona-oeste-leste-norte-sul-melhor.jpg\')no-repeat;\n "+
"    	background-size: cover;\n" +
"	background-attachment: fixed;}\n"+ 
                    
".container{\n" +
"	\n" +
"	margin-left: 3%;\n" +
"	margin-right: 3%;\n" +
"	position: static;\n" +
"}\n" +
                    
"header{\n" +
"	width: 100%;\n" +
"	height: 150px;\n" +
"	\n" +
"	background-color:#3f444c;\n" +
"	color: white;\n" +
"\n" +
"}\n" +
"#cabecalho{\n" +
"\n" +
"	font-size: 30px;\n" +
"	padding: 2% 0% 0% 5%;\n" +
"}\n" +
"nav{\n" +
"\n" +
"	width: 100%;\n" +
"	height: 100%;\n" +
"\n" +
"	background-color:#3f444c;\n" +
"\n" +
"}\n" +
"nav ul li{\n" +
"	float: left;\n" +
"	margin: 20px;\n" +
"	font-size: 20px;\n" +
"	list-style-type: none;\n" +
"}\n" +
" nav ul li a:link{\n" +
"	text-decoration: none;\n" +
"	color: white;\n" +
"}" +
" nav ul li a:visited{\n" +
"	text-decoration: none;\n" +
"	color: white;\n" +
"}" +                    
"\n" +
"section#banner{\n" +
"	position:relative;\n" +
"	width: 100%;\n" +
"	height: 60%;\n" +
"	min-width: 1024px;\n" +
"	min-height: 700px;\n" +
"	background-color:#38414f;\n" +
"	background: url(\'http://www.excellencesolucoes.com.br/images/banner08-empresa-escritorio-contabilidade-morumbi-sp-sao-paulo-empresarial-excellence-solucoes-contabeis-tributarias-fiscal-empresas-referencia-escritorios-zona-oeste-leste-norte-sul-melhor.jpg\');\n "+
"	background-size: cover;\n"+ 
"       background-attachment: fixed;"+
"}\n" +
"\n" +
".container-ban{\n" +
"\n" +
"	width: 100%;\n" +
"	height: 100%;\n" +
"}\n" +
"\n" +
"#categoria1{\n" +
"	\n" +
"	background-color: #fff;\n" +
"	text-align:center;\n" +
"	margin-left:8%; \n" +
"       background:url(\"http://f.i.uol.com.br/folha/mercado/images/16019220.jpeg\") no-repeat;\n"+                    
"       background-size:cover;"+
"	background-position: center;\n" +
"}\n" +
"#categoria2{\n" +
"	\n" +
"	background-color: #fff;\n" +
"       background:url(\"http://oprimorico.com.br/wp-content/uploads/2017/03/taxas-de-juros-saiba-como-usar-o-cdi-selic-ipca-e-igpm-a-seu-favor-933x445.jpeg\") no-repeat;\n"+                    
"       background-size:cover;"+
"	text-align:center;\n" +
"	background-position: center;\n" +
"}\n" +
"#novaCategoria{\n" +
"	background-color: #fff;\n" +
"	text-align:center;\n" +
"       background:url(\"http://conceito.de/wp-content/uploads/2014/03/cognitivismo.jpg\") no-repeat;\n"+                    
"       background-size:cover;"+
"	text-align:center;\n" +
"	background-position: center;\n" +
"}\n" +
".botao{\n"+                    
"width:90%; height:70px; background:white; color:black; padding-top:30px; border-radius:5px; box-shadow:5px 5px 4px 4px;\n"+                     
"}\n"+                    
".option{\n" +
"	float: left;\n" +
"	margin-top:14%;\n" +
"	margin-left: 2%;\n" +
"	width: 25%;\n" +
"	height: 100%;\n" +
"	min-height: 330px;\n" +
"	border-radius: 10px;\n" +
"	padding-top:10px;\n" +
"	padding-left: 10px; \n" +
"}\n" +
"\n" +
"footer{\n" +
"	background-color: #fff;\n" +
"	padding: 50px;\n" +
"}\n" +
"\n" +
".explicacao{\n" +
"	width: 100%;\n"+
"	height: 400px;\n"+
"	background-color: #fff;\n"+
"	margin-bottom: 100px;\n"+
"	background-attachment: fixed;\n" +
"}\n" +
".container-exp{\n" +
"	float: left;\n" +
"	width: 50%;\n" +
"	height: 100%;\n" +
"	background-color: #fff;\n" +
"}\n" +
".titulo{\n" +
"	padding: 50px;\n" +
"}\n" +
".conteudo{text-align:justify;\n" +
"	padding-left:50px;\n" +
"	padding-right:50px;\n" +
"}\n" +
"iframe{\n" +
"	float: left;\n" +
"}\n" +
".formula{\n" +
"	float: left;\n" +
"	padding-top: 100px; \n" +
"	font-size: 20px;\n" +
"	width:40%;\n" +
"	background-color: #fff;\n" +
"}</style>\n" +
"</head>\n" +
"<body>\n" +
"	<div class=\"container\">\n" +
"		<header><!--Inicio Cabeçalho-->\n" +
"			<div id=\"cabecalho\">JAVA EE PROJECT</div><!--Nome a direita-->\n" +
"			<HR><nav>\n" +
"				<ul><!--Itens do menu-->\n" +
"					<li><a href='home'> Principal</a></li>\n" +
"					<li><a href='juros-simples'> Juros Simples</a></li>\n" +
"					<li><a href='juros-composto'>  Juros Composto</a></li>\n" +
"					<li><a href='#explicacao'> Conceito</a></li>\n" +
"					<li><a href='#footer'> Equipe</a></li>\n" +
"				</ul>\n" +
"			</nav>\n" +
"		</header><!--Fim cabeçalho-->\n" +
"	</div>\n" +
"		<section id='banner'><!--categorias-->\n" +
"			<div class=\"container-ban\"><!--Container dos intens de categorias-->\n" +
"				<a href='juros-simples'>\n" +
"				<div class=\"option\" id=\"categoria1\"><!--Juros Simples-->\n" +
"					<h1 class='botao'>Juros <br> Simples</h1>\n" +
"				</div>\n" +
"				</a>\n" +
"				<a href='juros-composto'>\n" +
"				<div class=\"option\" id=\"categoria2\"><!--Juros Compostos-->\n" +
"					<h1 class='botao'>Juros <br> Composto</h1> \n" +
"				</div>\n" +
"				</a>	\n" +
"				<div class=\"option\" id=\"novaCategoria\"><!-- Cadastro de nova categoria-->\n" +
"					<h1 class='botao'>Conceito<br> </h1> \n" +
"				</div>\n" +
"			</div>	\n" +
"		</section><!--fim categorias-->\n" +
"		<div class=\"explicacao\">\n" +
"			<div class=\"container-exp\">\n" +
"				<div class=\"titulo\">\n" +
"					<h1>Juros</h1>\n" +
"				</div>\n" +
"				<div class=\"conteudo\">\n" +
"					<p>Podemos definir juros como o rendimento de uma aplicação financeira, valor referente ao atraso no pagamento de uma prestação ou a quantia paga pelo empréstimo de um capital. Atualmente, o sistema financeiro utiliza o regime de juros compostos, por ser mais lucrativo. Os juros simples eram utilizados nas situações de curto prazo. Hoje não utilizamos a capitalização baseada no regime simples, mas, de qualquer forma, vamos entender como ele funciona.</p>\n" +
"				</div>\n" +
"			</div>\n" +
"			<iframe width=\"45%\" height=\"100%\" src=\"https://www.youtube.com/embed/NS1AVfrVAgQ\" frameborder=\"0\" allowfullscreen></iframe>\n" +
"		</div>\n" +
"				<div class=\"explicacao\">\n" +
"				<div class=\"container-exp\">\n" +
"					<div class=\"titulo\">\n" +
"						<h1>Juros Simples</h1>\n" +
"					</div>\n" +
"					<div class=\"conteudo\">\n" +
"						<p>Juros simples: como calcular\n" +
"\n" +
"				No sistema de capitalização simples, os juros são calculados com base no valor da dívida ou da aplicação. Dessa forma, o valor dos juros é igual no período de aplicação ou composição da dívida.A expressão matemática utilizada para o cálculo das situações envolvendo juros simples é a seguinte:		\n" +
"				<br></p>\n" +
"					</div>\n" +
"				</div>\n" +
"				<div class=\"formula\">\n" +
"					 <code>\n" +
"					J =	 C * i * t<br>\n" +
"					J = juros<br>\n" +
"					C = capital<br>\n" +
"					i = taxa de juros<br>\n" +
"					t = tempo de aplicação (mês, bimestre, trimestre, semestre, ano...)<br>\n" +
"					<hr>\n" +
"					  	Ao somarmos os juros ao valor principal temos o montante.<br>\n" +
"   						Montante = Principal + Juros<br>\n" +
"   						Montante = Principal + ( Principal x Taxa de juros x Número de períodos ) <br>\n" +
"						M = P . ( 1 + ( i . n ) )<br>\n" +
"					</code>\n" +
"\n" +
"				 </div>\n" +
"				</div>\n" +
"\n" +
"					<div class=\"explicacao\">\n" +
"				<div class=\"container-exp\">\n" +
"					<div class=\"titulo\">\n" +
"						<h1>Juros Composto</h1>\n" +
"					</div>\n" +
"					<div class=\"conteudo\">\n" +
"						<p>Os juros compostos são a prática de juros sobre juros. Eles são muito utilizados pelo sistema financeiro, pois oferecem maior rentabilidade se comparados ao juro simples.\n" +
"						O atual sistema financeiro utiliza o regime de juros compostos, pois ele oferece uma maior rentabilidade se comparado com o regime de juros simples, em que o valor dos rendimentos torna-se fixo. O juro composto incide mês a mês de acordo com o somatório acumulativo do capital com o rendimento mensal, isto é, prática do juro sobre juro. As modalidades de investimentos e financiamentos são calculadas de acordo com esse modelo de investimento, pois ele oferece um maior rendimento, originando mais lucro.\n" +
"						</p>\n" +
"\n" +
"					</div>\n" +
"				</div>\n" +
"				<div class=\"formula\">\n" +
"					 <code>\n" +
"						M = C * (1 + i)t<br>\n" +
"						M: montante<br>\n" +
"						C: capital<br>\n" +
"						i: taxa de juros<br>\n" +
"						t: tempo de aplicação<br>\n" +
"						\n" +
"					</code>\n" +
"\n" +
"				 </div>\n" +
"				</div>\n" +
"\n" +
"		\n" +
"		<footer>\n" +
"			<p><b>ADS 3ºciclo Vespertino</b></p>\n" +
"            Integrantes: Gabriel Colombo Araujo<br>\n" +
"            Gabriel Daichi Kadota <br>\n" +
"            João Victor Sebastian Marques<br>\n" +
"            Rodrigo Garcia Moreira<br>\n" +
"            Saulo Pedro da Silva <br>\n" +
"\n" +
"		</footer>\n" +
"	\n" +
"</body>\n" +
"</html>");
         
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
