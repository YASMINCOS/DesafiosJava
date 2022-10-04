
import java.util.Random;

public class CacadorRecompensas extends Jogador{

    int dano = 0;

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
    public int ataque(Jogador atacado) {
        int danoMin = 5;
        int danoMax = 10;

        dano = ataqueAleatorio(danoMin,danoMax);
        System.out.println("Ataque com pistola" );



        System.out.println("Jogador " + this.getNome() + " está atacando o jogador " + atacado.getNome());
        return dano;
    }
    public int ataqueAleatorio(int min, int max) {

        Random random = new Random();
        return random.nextInt(max - min) + min;
    }


    @Override
    public int obterVidasAtuais() {
        return pontosVida;
    }

    @Override
    public int informarVidasAtuais(int dano) {

        pontosVida = pontosVida - dano;
		System.out.println("Total de dano"+ dano);

        return pontosVida;
    }
    @Override
    public int ataque2(Jogador atacado) {
        int danoConst = 20;
        System.out.println("Ataque granada termal");
		System.out.println("Total de dano"+ danoConst);
        return 0;
    }



}
