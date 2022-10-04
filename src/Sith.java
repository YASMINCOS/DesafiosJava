public class Sith extends Jogador{

	public Sith() {
		this.nome="Darth Vader";
		this.pontosForca=15;
		this.nivel=4;
		this.habilidadesSabreDeLuz=123;
		this.maxPontoVida=200;
		this.pontosVida=this.maxPontoVida;
		
	}

	@Override
	public int ataque(Jogador atacado) {
		int dano = 0;
		dano = pontosForca * nivel;
		System.out.println("Está atacando com o Raio da forca");
		System.out.println("Total de dano: "+ dano);

		return dano;
	
	}

	public int ataque2(Jogador atacado) {
		int dano = 0;
		dano = nivel * habilidadesSabreDeLuz;
		System.out.println(dano);
		System.out.println("Jogador "+ this.getNome() +"está atacando com raio");
		System.out.println("WHON");
		System.out.println("Total de dano " + dano);
		return dano;
	}
	
	@SuppressWarnings("unused")
	private void imprimirAtaque(Jogador atacado) {
		System.out.println("Jogador " + this.getNome() + " está atacando o jogador " + atacado.getNome());
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
