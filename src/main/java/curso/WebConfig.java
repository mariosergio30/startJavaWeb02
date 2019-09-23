package curso;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.ResourceBundleViewResolver;


/* A implementação de uma WebMvcConfigurer permite ao Spring MVC 
 * encontrar os arquivos das VIEWS (neste caso JSP)
 * 
 *  Assim, sempre que escrevermos o retorno de um métudo (return) dentro do Controler
 * o Spring MVC consegue encontrar o arquivo (html,jsp,...) com o nome correspondente  
 * e então retornado ao browser o contéudo HTML desse arquivo. 
 */

@Configuration
@EnableWebMvc
@ComponentScan
public class WebConfig implements WebMvcConfigurer {
		
	/* Esta classe é utilizada para permitir ao Spring 
	 * onde encontrar os arquivos das VIEWS 
	*/
	
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}  

	@Bean	
	public ViewResolver internalResourceViewResolver() {
	    InternalResourceViewResolver bean = new InternalResourceViewResolver();
	    bean.setViewClass(JstlView.class);
	    bean.setPrefix("/view/");
	    bean.setSuffix(".jsp");  // se o prefixo for omitido, a extensão do arquivo deve ser informada return do Controler
	   // bean.setOrder(0);
	    return bean;
	}
	
		
}
