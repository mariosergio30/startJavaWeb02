package curso.controler;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/* @Controller indica que essa a clase é um controlador WEB (expõe os métodos da classe como recursos web)  
 * Em outras palavras: faz com que essa classe fique escutando as requisições web que chegam a neste endereço localhost:8080  
 */


@Controller
@EnableAutoConfiguration
public class ControlerIndex {
	
	/*  MAPEAMENTO RAIZ: será acionado sempre a url informada contiver  apenas o endereço do servidor
	 *  ex: http://localhost:8080
	*/
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
				
	     return "index";  // responde ao browser com a view index.jsp (ver WebConfig)
	}
	
	
}
