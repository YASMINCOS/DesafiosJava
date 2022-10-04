
public class Sith extends Jogador{

	public Sith() {
		this.nome="Darth Vader";
		this.pontosForca=45;
		this.nivel=4;
		this.habilidadesSabreDeLuz=123;
		this.maxPontoVida=200;
		this.pontosVida=this.maxPontoVida;
		
	}

	@Override
	public void ataque(Jogador atacado) {
		int dano = 0;
		dano = pontosForca * nivel;
		System.out.println("Raio da forca");
	
	}

	public void ataqueSabreDeLuz(Jogador atacado) {
		int dano = 0;
		dano = nivel * habilidadesSabreDeLuz;
		System.out.println(dano);
		System.out.println("Jogador "+ this.getNome() +"está atacando com raio");
		System.out.println("WHON");
	}
	
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
	public int obterVidasAtuais(int dano) {
		return pontosVida;
	}
	
	@Override
	public int informarVidasAtuais(int dano) {
		
		pontosVida = pontosVida - dano;
		
		return pontosVida;
	}

	
	
}
