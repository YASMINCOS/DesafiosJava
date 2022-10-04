import java.util.Objects;

public abstract class Jogador {

	protected String nome;
	protected Integer nivel;
	protected Integer pontosVida;
	protected Integer maxPontoVida;
	protected Integer pontosForca;
	protected Integer habilidadesSabreDeLuz;
	
	public abstract void ataque(Jogador atacado);
	public abstract int obterVidasAtuais(int dano);
	public abstract int informarVidasAtuais(int dano) ;
	


	public Integer getNivel() {
		return nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getPontosVida() {
		return pontosVida;
	}

	public void setPontosVida(Integer pontosVida) {
		this.pontosVida = pontosVida;
	}

	


		
}
