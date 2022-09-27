
public class Sith extends UsuarioForca{

	public Sith(String nome, Integer totalPontos, Integer pontosVidaAtual, Integer nivel, Integer pontosForça,
			Integer habilidadeSabreDeLuz) {
		super(nome, totalPontos, pontosVidaAtual, nivel, pontosForça, habilidadeSabreDeLuz);
	}

	@Override
	public void ataqueSabreDeLuz(UsuarioForca usuarioForca) {
		usuarioForca.setDano(getNivel() * getHabildiadeSabreDeLuz());
		System.out.println("WHON");
	}
	@Override

	public void ataque(UsuarioForca usuarioForca) {
		usuarioForca.setDano(getPontosForça() * getNivel());
	}

}
