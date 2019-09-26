package curso.controler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import curso.model.Cidade;
import curso.model.CidadeBusiness;
import curso.model.Disciplina;

/* @Controller indica que essa a classe é um controlador WEB (expõe os métodos da classe como recursos web)  
 * Em outras palavras: faz com que essa classe fique escutando as requisições web que chegam a neste endereço localhost:8080  
 */

@Controller 
@EnableAutoConfiguration
@RequestMapping("/mvc") // Indica o mapeamento inicial para todos os recursos disponiveis neste Controler
public class Controler {
    
	int qtdAcessos = 1;

	
	/* @ResponseBody indica que o valor String retornado no método (return), 
	   deve ser enviado diretamente ao browser no Corpo do Response HTTP,
	   sem passar por qualquer pré-processamento do Spring MVC.
	*/
	 	
	@ResponseBody
	@RequestMapping("startloginteste")   
	public String startloginTeste(Model model, @RequestParam( value="aluno", required=false) String nome) {
	    
		/* como usarmos a anotação @ResponseBody, 
		 	o conteúdo que será enviado como resposta ao navegador, será exatamente a string startlogin
		   (NÃO É O QUE DE FATO PRECISAMOS) 
		*/
		
		return "startlogin";  
	}
		
		
	
	
	/* 	POR ISSO: Observe que nos recursos startlogin e cidades abaixo NÃO COLOCAMOS a anotação @ResponseBody.	 	 
	   	Somente assim, o Spring irá fazer a busca pelo arquivo da view correspondente, 
	   	realizar o processamento do JSP, e por fim enviar a resposta em HTML como resposta ao browser.
	   	(ver configuração no WebConfig) 
	*/
	
	
	// Este recurso será acionado para qualquer metodo de request (GET ou POST)	
	@RequestMapping("startlogin")   
    public String startloginMvc(Model model, @RequestParam( value="aluno", required=false) String nome) {
    	
		// Injeta um atributo Simples na View
    	model.addAttribute("nomedoaluno", nome);  
    	    	
    	// Injeta um atributo Objeto na View
    	Disciplina disciplina = new Disciplina();
    	disciplina.setTitulo("Skil Java");    	      
    	model.addAttribute("skill", disciplina);
    	
        return "startlogin"; // responde ao browser com a view startlogin.jsp (ver WebConfig)
    }
	
				
	
	// Este recurso somente será acionado em caso de requests pelo metodo GET
	@RequestMapping(value = "/cidades", method = RequestMethod.GET)  
    public String listagemCidades(Model model) {
    	    	
		model.addAttribute("acesso", qtdAcessos);    		
    	qtdAcessos++;
    	
    	
    	CidadeBusiness cidadeBusiness = new CidadeBusiness(); 
    	    			    	
    	// injeta uma Lista de Objetos na View 
    	model.addAttribute("listaCidades", cidadeBusiness.getListaCidades()); 
    	
        return "listagem_cidades";  // responde ao browser com a view listagem_cidades.jsp (ver WebConfig)
    }
    
	
	
    
}
