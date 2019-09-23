package curso.model;

public class Cidade {


    private Integer id;
    private String nome;
    private String uf;
    private String atracoes;
    
    
    
	public Cidade(Integer id, String nome, String uf, String atracoes) {
		super();
		this.id = id;
		this.nome = nome;
		this.uf = uf;
		this.atracoes = atracoes;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getAtracoes() {
		return atracoes;
	}
	public void setAtracoes(String atracoes) {
		this.atracoes = atracoes;
	}
    
    

}
