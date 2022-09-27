
public class Jedi extends UsuarioForca{

	public Jedi(String nome, Integer totalPontos, Integer pontosVidaAtual, Integer nivel, Integer pontosForça,
			Integer habilidadeSabreDeLuz) {
		super(nome, totalPontos, pontosVidaAtual, nivel, pontosForça, habilidadeSabreDeLuz);
	}

	@Override
	public void ataqueSabreDeLuz(UsuarioForca usuarioForca) {
		usuarioForca.setDano(getNivel() * getHabildiadeSabreDeLuz() + getPontosForça());
		System.out.println("WHON");
	}
	@Override
	public void ataque(UsuarioForca usuarioForca) {
		usuarioForca.setDano(getPontosForça());
	}
	
	

}
