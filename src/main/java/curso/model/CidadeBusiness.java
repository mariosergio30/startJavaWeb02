package curso.model;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Component;

public class CidadeBusiness {


	public List<Cidade> getListaCidades() {

		Cidade c0 = new Cidade(1,  "São Paulo", "SP", "shows, música, parques, Teatro");
		Cidade c1 = new Cidade(8,  "Recife", "PE", "praias, museus, cultura, história");
		Cidade c2 = new Cidade(5,  "Brasilia", "DF", "história, parques, cultura");
		Cidade c3 = new Cidade(11, "Rio de Janeiro", "RJ", "praias, belezas naturais, religião, Teatro");

		List<Cidade> lista = new ArrayList<Cidade>();
		lista.add(c0);
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);

		return lista;		
	}


}
