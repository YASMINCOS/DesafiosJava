
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Combate {

    static Jogador jogador01= null;
    static Jogador jogador02 = null;
    static List<Jogador> jogadoresEmCombate = new ArrayList<>();


    public static void main(String[] args) {


        Jogador jedi = new Jedi();
        Jogador sith = new Sith();
        Jogador cacadorRecompensa= new CacadorRecompensas();

        List<Jogador> listaDeEsperaJogadores = Arrays.asList(jedi, sith,cacadorRecompensa);


        jogador01 = escolheJogadorDeLista(listaDeEsperaJogadores);
        jogador02= escolheJogadorDeLista(listaDeEsperaJogadores);

        while(jogador01.obterVidasAtuais() >0 && jogador02.obterVidasAtuais() >0) {
            int dano1 = Combate.jogador01.ataque(jogador02);
            int dano2 =Combate.jogador02.ataque(jogador01) ;

            Combate.jogador01.ataque(jogador02);
            if (jogador02.obterVidasAtuais()<= 0 ) {
                Combate.jogador01.ataque(jogador02);	
                
                }

            Combate.jogador01.informarVidasAtuais(dano1);
            Combate.jogador02.informarVidasAtuais(dano2);






            System.out.println("Pontos de vida atual do jogador atacado: " + jogador02.informarVidasAtuais(dano2));
            System.out.println("Pontos de vida atual do jogador atacante: " + jogador01.informarVidasAtuais(dano1));




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
