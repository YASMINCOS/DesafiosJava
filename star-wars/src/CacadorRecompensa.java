import java.util.Random;

public class CacadorRecompensa extends Jogador{
	
	private Integer dano;
	private int ataque;

	private final int DANO_LEVE_PISTOLA_LASER = 5;
	private final int DANO_MAXIMO_PISTOLA_LASER = 10;
	private final int DANO_GRANADA = 20;
	

	public CacadorRecompensa(String nome, 
			Integer totalPontos, 
			Integer pontosVidaAtual, 
			Integer dano) {
		this.setNome(nome);
		this.setTotalPontos(totalPontos);
		this.setPontosVidaAtual(pontosVidaAtual);
		this.dano = dano;
	}
	
	public void ataque(AtaqueCacadorEnum tipoAtaque) {
		if(tipoAtaque.equals(AtaqueCacadorEnum.PISTOLA_A_LASER)) {
			ataque = new Random().ints(DANO_LEVE_PISTOLA_LASER, DANO_MAXIMO_PISTOLA_LASER+1).findAny().getAsInt();
			System.out.println("Dano ataque pistola " + ataque);
		}else if(tipoAtaque.equals(AtaqueCacadorEnum.GRANADA_TERMAL)) {
			ataque = DANO_GRANADA;
			setDano(DANO_GRANADA);
			System.out.println("Dano ataque pistola " + ataque);
		}
	}

	public Integer getDano() {
		return dano;
	}

	public void setDano(Integer dano) {
		this.dano = dano;
	}
	
}
