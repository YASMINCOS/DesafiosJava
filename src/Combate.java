import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Combate {
	
	static Jogador jogador01= null;
	static Jogador jogador02 = null;
	static List<Jogador> jogadoresEmCombate = new ArrayList<>();
	
	public static void main(String[] args) {
		
		
		Jogador jedi = new Jedi("Allara", 10, 9, 15, 239);
		Jogador sith = new Sith("Darth Vader", 10, 19, 14, 325);
		Jogador cacadorRecompensa= new CacadorRecompensas("Xedi",10,2);
		
		List<Jogador> listaDeEsperaJogadores = Arrays.asList(jedi, sith,cacadorRecompensa);
		
		
		jogador01 = escolheJogadorDeLista(listaDeEsperaJogadores);
		jogador02= escolheJogadorDeLista(listaDeEsperaJogadores);
		
		while(jogador01.getPontosVida() >0 && jogador02.getPontosVida() >0) {
			
			jogador01.ataque(jogador02);
			
			System.out.println("Pontos de vida atual do jogador atacado: " + jogador02.getPontosVida());
			System.out.println("Pontos de vida atual do jogador atacante: " + jogador01.getPontosVida());
			
			if(jogador02.getPontosVida() > 0) {
				Combate.jogador02.ataque(jogador01);
				System.out.println("Jogadores de combate:" + jogadoresEmCombate);
			}
			
		}
	}

	private static Jogador escolheJogadorDeLista(List<Jogador> listaDeEsperaJogadores) {
		Jogador jogador = listaDeEsperaJogadores.get(new Random().nextInt(listaDeEsperaJogadores.size()));
		if(Combate.jogadoresEmCombate.indexOf(jogador) < 0) {
			Combate.jogadoresEmCombate.add(jogador);
			
			return jogador;
			
		}
		
		return escolheJogadorDeLista(listaDeEsperaJogadores);
		
	}
	
}
