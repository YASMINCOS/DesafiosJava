import java.util.ArrayList;
import java.util.List;

public class Main {
	
	List<Porco> porcos = new ArrayList<>();

	public static void main(String[] args) {
		
		Porco porquinho = new Porco("porquinho", SexoPorcoEnum.MACHO,8, 40);
		Porco porquinhoA = new Porco("porquinhoA", SexoPorcoEnum.FEMEA,6, 50);
		
		
		
		Porco[] porcos = {porquinho, porquinhoA};
		
		Chiqueiro chiqueiro = new Chiqueiro();
		
		chiqueiro.adicionarPorco(porcos);
		
		Porco porquinhoB = new Porco("porquinhoB", SexoPorcoEnum.MACHO, 7, 60);
		chiqueiro.adicionarPorco(porquinhoB);
		Porco porquinhoC = new Porco("porquinhoC", SexoPorcoEnum.MACHO, 8, 77);
		chiqueiro.adicionarPorco(porquinhoC);
		Porco porquinhoD = new Porco("porquinhoD", SexoPorcoEnum.FEMEA, 9, 76);
		chiqueiro.adicionarPorco(porquinhoD);
		
		System.out.println("Media Peso Geral: " + chiqueiro.mediaPesoPorcosGeral);
		System.out.println("Porco fêmea mais pesada: " + chiqueiro.porcoMaisPesadoFemea);
		System.out.println("Quantidade de porcos machos: "+ chiqueiro.quantidadePorcosMacho);
		System.out.println("Quantidade de porcos femeas: "+ chiqueiro.quantidadePorcosFemea);
		System.out.println("Quantidade de porcos entre 50 e 80 kg : "+ chiqueiro.quantidadePorcosEntre50e80);
		System.out.println("Quantidade de porcos com mais de 80kg: "+ chiqueiro.quantidadePorcosComMais80);
		System.out.println("Porco mais Pesado: "+ chiqueiro.porcoMaisPesado);
		System.out.println("Porco mais Leve: "+ chiqueiro.porcoMaisLeve);
		System.out.println("Total de peso dos porcos machos: "+ chiqueiro.totalPesoPorcoMacho);
		System.out.println("Porco mais pesado macho: "+ chiqueiro.porcoMaisPesadoMacho);
		System.out.println("Media de peso dos porcos machos:"+ chiqueiro.mediaPesoPorcosMacho);
		System.out.println("Total de peso dos porcos femea: "+ chiqueiro.totalPesoPorcoFemea);
		System.out.println("Media de peso dos porcos femea:"+ chiqueiro.mediaPesoPorcosFemea);
		System.out.println("Porco mais pesado femea: "+ chiqueiro.porcoMaisPesadoFemea);

		System.out.println("Quantidade de porcos pronto para o abate: "+chiqueiro.quantidadePorcosProntosProAbate);






	}
	
}
