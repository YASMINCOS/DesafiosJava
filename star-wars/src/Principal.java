import java.util.Random;

public class Principal {
	 public enum Jogador {

		 CACADOR_RECOMPENSA(1),
			JEDI(2),
			SITH(3);
			
		 int value;
			
			private Jogador(int value) {
				this.value = value;
			}
					
	    }
	 private static Jogador escolher(){
	        Random random = new Random();
	        int indice = random.nextInt(3);
	        
	        Jogador escolher = Jogador.values()[indice];
	        return escolher;
	    }
	 
	 @SuppressWarnings("unused")
	 private static void Combate(UsuarioForca atacante,UsuarioForca atacado) {
		 Random random= new Random();
		 atacante.setPositionInCombate(random.nextInt(2));
		 atacado.setPositionInCombat(atacante.getPositionInCombate() == 1 ? 2 : 1);
	 }
	 

	 
	public static void main(String[] args) {
		
		CacadorRecompensa cacador =  new CacadorRecompensa("Caçador", 0, 100, 0 );
		UsuarioForca jedi = new Jedi("Jedi", 2, 100, 10, 10, 5 );
		UsuarioForca sith = new Sith("Sith", 1, 90, 10, 10, 5 );
		
	
		
		
		System.out.println("Jogadores"+escolher());
		System.out.println("Atacante:"+Combate(atacante, atacado));
		System.out.println("Atacado :"+Combate(atacante, atacado));
		System.out.println("Atacado :"+atacado.getNome());
		System.out.println("Nivel do atacado:"+atacado.getNivel());
		System.out.println("Total de pontos atacado:"+atacado.getTotalPontos());
		System.out.println("Atacante :"+atacante.getNome());
		System.out.println("Total de pontos atacante:"+atacante.getTotalPontos());
		System.out.println("Nivel do atacante: "+atacante.getNivel());


	
		
		while(true) {
			
			atacante.ataque(atacado);
		
			if(atacado.getPontosVidaAtual()>0){
				atacado=atacante;
				System.out.println("Pontos de vida: "+ atacante.getPontosVidaAtual());
				break;
			}
			
			if(atacado.getPontosVidaAtual()<=0) {
				System.out.println(atacado.getPontosVidaAtual());
				break;
			}

		}
		
		
	}
	 
	
}
