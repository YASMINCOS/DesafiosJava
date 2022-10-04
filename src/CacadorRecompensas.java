

public class CacadorRecompensas extends Jogador{


	public CacadorRecompensas() {
		this.nome="Xedi";
		this.nivel=3;
		this.maxPontoVida=239;
		this.pontosVida=this.maxPontoVida;
	}
	public Integer getPontosVidasAtuais() {
		return getPontosVidasAtuais();
	}

	@Override
	public void ataque(Jogador atacado) {
			System.out.println("Jogador " + this.getNome() + " está atacando o jogador " + atacado.getNome());
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
	

	
