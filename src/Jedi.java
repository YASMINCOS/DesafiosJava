

public class Jedi extends Jogador{
	


	public Jedi() {
		this.nome="Allara";
		this.pontosForca=23;
		this.nivel=4;
		this.habilidadesSabreDeLuz=7;
		this.maxPontoVida=320;
		this.pontosVida=this.maxPontoVida;
	}

	public int ataque(Jogador atacado) {
		@SuppressWarnings("unused")
		int dano=0;
		imprimirAtaque(atacado);
		System.out.println("Esta atacacando com o empurrao da forca");
		dano = pontosForca;
		System.out.println("Total de dano"+ dano);
		return dano;
	}

	private void imprimirAtaque(Jogador atacado) {
		System.out.println("Jogador " + this.getNome() + " está atacando o jogador " + atacado.getNome());
	}

	public int ataque2(Jogador atacado) {
		System.out.println("Jogador "+ this.getNome() +"está atacando com forca");
		System.out.println("Total de dano"+ habilidadesSabreDeLuz);
		System.out.println("WHON");
		return habilidadesSabreDeLuz;
		
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
	public int obterVidasAtuais() {
		return pontosVida;
	}
	
	@Override
	public int informarVidasAtuais(int dano) {		
		pontosVida = pontosVida - dano;
		return pontosVida;
	}
	
}
