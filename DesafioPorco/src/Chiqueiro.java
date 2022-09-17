import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Chiqueiro {

	
	private List<Porco> porcos = new ArrayList<>();
	public Short quantidadePorcosMacho = 0;
	public Short quantidadePorcosFemea = 0;
	public Short quantidadePorcosEntre50e80 = 0;
	public Short quantidadePorcosComMais80 = 0;
	public Integer porcoMaisPesado = Integer.MIN_VALUE;
	public Integer porcoMaisLeve = Integer.MAX_VALUE;
	public Integer totalPesoPorcos = 0;
	public Integer totalPesoPorcoMacho=0;
	public Integer totalPesoPorcoFemea=0;
	public Double mediaPesoPorcosGeral = 0d;
	public Double mediaPesoPorcosMacho = 0d;
	public Double mediaPesoPorcosFemea = 0d;
	public Integer porcoMaisPesadoMacho = 0;
	public Integer porcoMaisPesadoFemea = 0;
	public Integer porcoMaisLeveMacho = 0;
	public Integer porcoMaisLeveFemea = 0;
	public Integer quantidadePorcosProntosProAbate = 0;
	
	
	public void adicionarPorco(Porco[] porcos){
		
		for (Porco porco : porcos) {
			if(porco.getSexo().equals(SexoPorcoEnum.MACHO)) {
				quantidadePorcosMacho++;
				totalPesoPorcoMacho+=porco.getPeso();
			}else {
				quantidadePorcosFemea++;
				totalPesoPorcoFemea+=porco.getPeso();
			}
			
			if(porco.getPeso() >= 50 && porco.getPeso() <= 80) {
				quantidadePorcosEntre50e80++;
			}else if(porco.getPeso() > 80) {
				quantidadePorcosComMais80++;
			}
			
			if(porco.getPeso() > porcoMaisPesado) {
				porcoMaisPesado = porco.getPeso();
				
				if(porco.getSexo().equals(SexoPorcoEnum.MACHO)) {
					porcoMaisPesadoMacho = porco.getPeso();
				}else {
					porcoMaisPesadoFemea = porco.getPeso();
				}
			}
			
			if(porco.getPeso() < porcoMaisLeve) {
				porcoMaisLeve = porco.getPeso();
				
				if(porco.getSexo().equals(SexoPorcoEnum.MACHO)) {
					porcoMaisLeveMacho = porco.getPeso();
				}else {
					porcoMaisLeveFemea = porco.getPeso();
				}
			}
			
			if(porco.getIdade() > 6 && porco.getPeso()>75) {
				quantidadePorcosProntosProAbate++;
			}
			
			totalPesoPorcos += porco.getPeso();
			
			this.porcos.add(porco);
			
		}
		
		
		mediaPesoPorcosGeral = (double) (totalPesoPorcos / porcos.length);
		mediaPesoPorcosFemea = (double) (totalPesoPorcoFemea / quantidadePorcosFemea);
		mediaPesoPorcosMacho = (double) (totalPesoPorcoMacho / quantidadePorcosMacho);
		
	}
	
	public void adicionarPorco(List<Porco> porcos) {
		for (Porco porco : porcos) {
			if(porco.getSexo().equals(SexoPorcoEnum.MACHO)) {
				quantidadePorcosMacho++;
				totalPesoPorcoMacho+=porco.getPeso();
			}else {
				quantidadePorcosFemea++;
				totalPesoPorcoFemea+=porco.getPeso();
			}
			
			if(porco.getPeso() >= 50 && porco.getPeso() <= 80) {
				quantidadePorcosEntre50e80++;
			}else if(porco.getPeso() > 80) {
				quantidadePorcosComMais80++;
			}
			
			if(porco.getPeso() > porcoMaisPesado) {
				porcoMaisPesado = porco.getPeso();
				
				if(porco.getSexo().equals(SexoPorcoEnum.MACHO)) {
					porcoMaisPesadoMacho = porco.getPeso();
				}else {
					porcoMaisPesadoFemea = porco.getPeso();
				}
			}
			
			if(porco.getPeso() < porcoMaisLeve) {
				porcoMaisLeve = porco.getPeso();
				
				if(porco.getSexo().equals(SexoPorcoEnum.MACHO)) {
					porcoMaisLeveMacho = porco.getPeso();
				}else {
					porcoMaisLeveFemea = porco.getPeso();
				}
			}
			
			totalPesoPorcos += porco.getPeso();
			
			this.porcos.add(porco);
			if(porco.getIdade() > 6 && porco.getPeso()>75) {
				quantidadePorcosProntosProAbate++;
			}
			
			totalPesoPorcos += porco.getPeso();
			
			this.porcos.add(porco);
			
		}
		
		mediaPesoPorcosGeral = (double) (totalPesoPorcos / porcos.size());
		mediaPesoPorcosFemea = (double) (totalPesoPorcoFemea / quantidadePorcosFemea);
		mediaPesoPorcosMacho = (double) (totalPesoPorcoMacho / quantidadePorcosMacho);
	}
	
	public void adicionarPorco(Porco porco) {
		if(porco.getSexo().equals(SexoPorcoEnum.MACHO)) {
			quantidadePorcosMacho++;
			totalPesoPorcoMacho+=porco.getPeso();
		}else {
			quantidadePorcosFemea++;
			totalPesoPorcoFemea+=porco.getPeso();
		}
		
		if(porco.getPeso() >= 50 && porco.getPeso() <= 80) {
			quantidadePorcosEntre50e80++;
		}else if(porco.getPeso() > 80) {
			quantidadePorcosComMais80++;
		}
		
		if(porco.getPeso() > porcoMaisPesado) {
			porcoMaisPesado = porco.getPeso();
			
			if(porco.getSexo().equals(SexoPorcoEnum.MACHO)) {
				porcoMaisPesadoMacho = porco.getPeso();
			}else {
				porcoMaisPesadoFemea = porco.getPeso();
			}
		}
		
		if(porco.getPeso() < porcoMaisLeve) {
			porcoMaisLeve = porco.getPeso();
			
			if(porco.getSexo().equals(SexoPorcoEnum.MACHO)) {
				porcoMaisLeveMacho = porco.getPeso();
			}else {
				porcoMaisLeveFemea = porco.getPeso();
			}
		}
		if(porco.getIdade() > 6 && porco.getPeso()>75) {
			quantidadePorcosProntosProAbate++;
		}
		
		totalPesoPorcos += porco.getPeso();
		
		this.porcos.add(porco);
		
		totalPesoPorcos += porco.getPeso();
		
		this.porcos.add(porco);
		
		mediaPesoPorcosGeral = (double) (totalPesoPorcos / porcos.size());
		mediaPesoPorcosFemea = (double) (totalPesoPorcoFemea / quantidadePorcosFemea);
		mediaPesoPorcosMacho = (double) (totalPesoPorcoMacho / quantidadePorcosMacho);
	}
	
	
	public void ordenarPorNome(){
		Collections.sort(this.porcos, new Comparator<Porco>() {
			public int compare(Porco o1, Porco o2) {
				return o1.getNome().compareTo(o2.getNome());
			}
		});
	}
	
	public void ordenarPorIdade(){
		Collections.sort(this.porcos, new Comparator<Porco>() {
			public int compare(Porco o1, Porco o2) {
				return o1.getIdade().compareTo(o2.getIdade());
			}
		});
	}
	
	public void ordenarPorSexo(){
		Collections.sort(this.porcos, new Comparator<Porco>() {
			public int compare(Porco o1, Porco o2) {
				return o1.getSexo().compareTo(o2.getSexo());
			}
		});
	}
	
}
