
public class Porco {

	private String nome;
	private SexoPorcoEnum sexo;
	private Integer idade;
	private Integer peso;

	public Porco(String nome, SexoPorcoEnum sexo, Integer idade, Integer peso){
		this.nome=nome;
		this.sexo=sexo;
		this.idade=idade;
		this.peso=peso;
	}

	public String getNome() {
		return nome;
	}

	public SexoPorcoEnum getSexo() {
		return sexo;
	}

	public Integer getIdade() {
		return idade;
	}

	public Integer getPeso() {
		return peso;
	}
	
	
	
}
