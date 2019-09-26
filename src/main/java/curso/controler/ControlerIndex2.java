package curso.controler;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/* @Controller indica que essa a clase é um controlador WEB (expõe os métodos da classe como recursos web)  
 * Em outras palavras: faz com que essa classe fique escutando as requisições web que chegam a neste endereço localhost:8080  
 */


@RestController
@EnableAutoConfiguration
public class ControlerIndex2 {
	

	  @RequestMapping("startloginSTATICO")
	    public String startlogin(@RequestParam( value="aluno", required=false) String nome) {
	    	
	    	/* caso desejasemos que o parametro 'aluno' fosse obrigatório, poderiamos declarar apenas assim:
	    	   public String basico3(@RequestParam("aluno") String nome) 
	    	*/

	    	StringBuilder resposta = new StringBuilder();    	
	    	
	    	resposta.append("<hr><strong>Exemplo: Response direto dentro do Controler</strong><hr>");

	    	resposta.append("<head><link rel=\"stylesheet\" type=\"text/css\" href=\"../css/styles.css\"></head>");

	    	resposta.append("<img src=\"../img/logomarca.png\" width=\"150\" >");    	    	
	    	
	    	resposta.append("<h2>Formação Profissional</h2>");
	    	    	
	    	resposta.append("Aluno: <b>" + nome + "</b>");
	    	resposta.append("<hr>");
	    	
	    	if (nome != null && !nome.equals("")) {
	    		resposta.append("<div class=\"destaque normal\">");
	    		resposta.append("Caro participante <i>" + nome + "</i>, seja Bem Vindo !");
	    		resposta.append("</div>");
	    	}
	    	else  {
	    		resposta.append("<div class=\"destaque alerta\">");
	    		resposta.append("Caro participante, por favor inclua seu nome na url no formato: ?aluno=...");
	    		resposta.append("</div>");
	    	}
	    	resposta.append("<hr>");
	    	    	
	    	resposta.append("<h3>Os Skills abordados no projeto Start 2019 são:</h3>");
	    	resposta.append("<hr>");
	    	resposta.append("<ul>");
	    	resposta.append("<li>Abap</li><li>Cobol</li><li><strong>Java (back-end)</strong></li><li>Java Script (front-end)</li>");
	    	resposta.append("</ul>");
	    	resposta.append("<hr>");
	    	    	
	    	resposta.append("Saiba mais: ");
	    	resposta.append("<a href=\"https://www.accenture.com/br-pt/company-cidadania-corporativa\">Cidadania Coorporativa</a>");
	    	    	
	        return resposta.toString();
	    }
	    

    
}
