
public class Jedi extends Jogador{
	


	public Jedi() {
		this.nome="Allara";
		this.pontosForca=23;
		this.nivel=4;
		this.habilidadesSabreDeLuz=7;
		this.maxPontoVida=320;
		this.pontosVida=this.maxPontoVida;
	}

	public void ataque(Jogador atacado) {
		int dano=0;
		imprimirAtaque(atacado);
		System.out.println("Empurrao da forca");
		dano = pontosForca;
	}

	private void imprimirAtaque(Jogador atacado) {
		System.out.println("Jogador " + this.getNome() + " está atacando o jogador " + atacado.getNome());
	}

	public void ataqueSabreDeLuz(Jogador atacado) {
		System.out.println("Jogador "+ this.getNome() +"está atacando com forca");
		System.out.println("WHON");
		
	}

	public Integer getHabilidadesSabreDeLuz() {
		return habilidadesSabreDeLuz;
	}

	public void setHabilidadesSabreDeLuz(Integer habilidadesSabreDeLuz) {
		this.habilidadesSabreDeLuz = habilidadesSabreDeLuz;
	}


	public Integer getPontosForca() {
		return pontosForca;
	}

	public void setPontosForca(Integer pontosForca) {
		this.pontosForca = pontosForca;
	}

	public Integer getPontosVidasAtuais() {
		return getPontosVidasAtuais();
	}


	@Override
	public int obterVidasAtuais(int dano) {
		return pontosVida;
	}
	
	@Override
	public int informarVidasAtuais(int dano) {
		
		pontosVida = pontosVida - dano;
		
		return pontosVida;
	}
	
}
