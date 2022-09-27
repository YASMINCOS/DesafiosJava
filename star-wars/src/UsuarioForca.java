
public abstract class UsuarioForca extends Jogador{

	private Integer nivel;
	private Integer pontosForça;
	private Integer habilidadeSabreDeLuz;	
	private Integer dano;
	
	
	public UsuarioForca(String nome, 
			Integer totalPontos, 
			Integer pontosVidaAtual,
			Integer nivel, 
			Integer pontosForça, 
			Integer habilidadeSabreDeLuz) {
		
		this.setNome(nome);
		this.setTotalPontos(totalPontos);
		this.setPontosVidaAtual(pontosVidaAtual);
		
		this.nivel = nivel;
		this.pontosForça = pontosForça;
		this.habilidadeSabreDeLuz = habilidadeSabreDeLuz;
	}
	public abstract void ataque(UsuarioForca usuarioForca);

	public abstract void ataqueSabreDeLuz(UsuarioForca usuarioForca);

	public Integer getNivel() {
		return nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	public Integer getPontosForça() {
		return pontosForça;
	}

	public void setPontosForça(Integer pontosForça) {
		this.pontosForça = pontosForça;
	}

	public Integer getHabildiadeSabreDeLuz() {
		return habilidadeSabreDeLuz;
	}

	public void setHabildiadeSabreDeLuz(Integer habilidadeSabreDeLuz) {
		this.habilidadeSabreDeLuz = habilidadeSabreDeLuz;
	}

	public Integer getDano() {
		return dano;
	}

	public void setDano(Integer dano) {
		this.dano = dano;
	}
	public void setPositionInCombate(int nextInt) {
		
		
	}
	public int getPositionInCombate() {
		
		return 0;
	}
	public void setPositionInCombat(int i) {
		
		
	}
	
}
