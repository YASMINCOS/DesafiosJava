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
	 private static UsuarioForca Combate(UsuarioForca atacante,UsuarioForca atacado) {
		 Random random= new Random();
		 atacante.setPositionInCombate(random.nextInt(2));
		 atacado.setPositionInCombat(atacante.getPositionInCombate() == 1 ? 2 : 1);
		 return atacante;
	 }
	 

	 
	public static void main(String[] args) {
		
		CacadorRecompensa cacador =  new CacadorRecompensa("Caçador", 0, 100, 0 );
		UsuarioForca jedi = new Jedi("Jedi", 2, 100, 10, 10, 5 );
		UsuarioForca sith = new Sith("Sith", 1, 90, 10, 10, 5 );
		
	
		
		
		System.out.println("Jogador 1:"+escolher() + " Jogador 2:"+escolher());
		System.out.println("Atacante:"+Combate(jedi, sith));
		System.out.println("Atacado :"+Combate(jedi, sith));
		System.out.println("Atacado :"+sith.getNome());
		System.out.println("Nivel do atacado:"+sith.getNivel());
		System.out.println("Total de pontos atacado:"+sith.getTotalPontos());
		System.out.println("Atacante :"+jedi.getNome());
		System.out.println("Total de pontos atacante:"+jedi.getTotalPontos());
		System.out.println("Nivel do atacante: "+jedi.getNivel());


	
		
		while(true) {
			
			jedi.ataque(sith);
		
			if(sith.getPontosVidaAtual()>0){
				sith=jedi;
				System.out.println("Pontos de vida: "+ jedi.getPontosVidaAtual());
				break;
			}
			
			if(sith.getPontosVidaAtual()<=0) {
				System.out.println(sith.getPontosVidaAtual());
				break;
			}

		}
		
		
	}
	 
	
}
