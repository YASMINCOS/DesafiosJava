import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

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
	public Integer porcoMaisPesadoMacho = Integer.MIN_VALUE;
	public Integer porcoMaisPesadoFemea = Integer.MIN_VALUE;
	public Integer porcoMaisLeveMacho = Integer.MAX_VALUE;
	public Integer porcoMaisLeveFemea = Integer.MAX_VALUE;
	public Integer quantidadePorcosProntosProAbate = 0;
	
	public void adicionarPorco(Porco porco) {
		List<Porco> porcos = new ArrayList<>();
		porcos.add(porco);
		processarPorco(porcos);
	}
	
	public void adicionarPorco(Porco[] porcos) {
		List<Porco> procosAProcessar = Arrays.asList(porcos);
		processarPorco(procosAProcessar);
	}
	
	public void adicionarPorco(List<Porco> porcos) {
		processarPorco(porcos);
	}
	
	private void processarPorco(List<Porco> porcos) {
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
			}
			if(porco.getPeso()>porcoMaisPesadoMacho && porco.getSexo()==(SexoPorcoEnum.MACHO)) {
				porcoMaisPesadoMacho=porco.getPeso();
			}
			if(porco.getPeso()>porcoMaisPesadoFemea && porco.getSexo()==(SexoPorcoEnum.FEMEA)) {
				porcoMaisPesadoFemea=porco.getPeso();	
			}
			
			if(porco.getPeso() < porcoMaisLeve) {
				porcoMaisLeve = porco.getPeso();
			}
			if(porco.getPeso()<porcoMaisLeveMacho && porco.getSexo()==(SexoPorcoEnum.MACHO)) {
				porcoMaisLeveMacho=porco.getPeso();
			}
			if(porco.getPeso()<porcoMaisLeveFemea && porco.getSexo()==(SexoPorcoEnum.FEMEA)) {
				porcoMaisLeveFemea=porco.getPeso();
			}
			
			
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
//	
//	
//	public void adicionarPorco(Porco[] porcos){
//		
//		for (Porco porco : porcos) {
//			if(porco.getSexo().equals(SexoPorcoEnum.MACHO)) {
//				quantidadePorcosMacho++;
//				totalPesoPorcoMacho+=porco.getPeso();
//			}else {
//				quantidadePorcosFemea++;
//				totalPesoPorcoFemea+=porco.getPeso();
//			}
//			
//			if(porco.getPeso() >= 50 && porco.getPeso() <= 80) {
//				quantidadePorcosEntre50e80++;
//			}else if(porco.getPeso() > 80) {
//				quantidadePorcosComMais80++;
//			}
//			
//			if(porco.getPeso() > porcoMaisPesado) {
//				porcoMaisPesado = porco.getPeso();
//				
//				if(porco.getSexo().equals(SexoPorcoEnum.MACHO)) {
//					porcoMaisPesadoMacho = porco.getPeso();
//				}else {
//					porcoMaisPesadoFemea = porco.getPeso();
//				}
//			}
//			
//			if(porco.getPeso() < porcoMaisLeve) {
//				porcoMaisLeve = porco.getPeso();
//				
//				if(porco.getSexo().equals(SexoPorcoEnum.MACHO)) {
//					porcoMaisLeveMacho = porco.getPeso();
//				}else {
//					porcoMaisLeveFemea = porco.getPeso();
//				}
//			}
//			
//			if(porco.getIdade() > 6 && porco.getPeso()>75) {
//				quantidadePorcosProntosProAbate++;
//			}
//			
//			totalPesoPorcos += porco.getPeso();
//			
//			this.porcos.add(porco);
//			
//		}
//		
//		
//		mediaPesoPorcosGeral = (double) (totalPesoPorcos / porcos.length);
//		mediaPesoPorcosFemea = (double) (totalPesoPorcoFemea / quantidadePorcosFemea);
//		mediaPesoPorcosMacho = (double) (totalPesoPorcoMacho / quantidadePorcosMacho);
//		
//	}
//	
//	public void adicionarPorco(List<Porco> porcos) {
//		for (Porco porco : porcos) {
//			if(porco.getSexo().equals(SexoPorcoEnum.MACHO)) {
//				quantidadePorcosMacho++;
//				totalPesoPorcoMacho+=porco.getPeso();
//			}else {
//				quantidadePorcosFemea++;
//				totalPesoPorcoFemea+=porco.getPeso();
//			}
//			
//			if(porco.getPeso() >= 50 && porco.getPeso() <= 80) {
//				quantidadePorcosEntre50e80++;
//			}else if(porco.getPeso() > 80) {
//				quantidadePorcosComMais80++;
//			}
//			
//			if(porco.getPeso() > porcoMaisPesado) {
//				porcoMaisPesado = porco.getPeso();
//				
//				if(porco.getSexo().equals(SexoPorcoEnum.MACHO)) {
//					porcoMaisPesadoMacho = porco.getPeso();
//				}else {
//					porcoMaisPesadoFemea = porco.getPeso();
//				}
//			}
//			
//			if(porco.getPeso() < porcoMaisLeve) {
//				porcoMaisLeve = porco.getPeso();
//				
//				if(porco.getSexo().equals(SexoPorcoEnum.MACHO)) {
//					porcoMaisLeveMacho = porco.getPeso();
//				}else {
//					porcoMaisLeveFemea = porco.getPeso();
//				}
//			}
//			
//			totalPesoPorcos += porco.getPeso();
//			
//			this.porcos.add(porco);
//			if(porco.getIdade() > 6 && porco.getPeso()>75) {
//				quantidadePorcosProntosProAbate++;
//			}
//			
//			totalPesoPorcos += porco.getPeso();
//			
//			this.porcos.add(porco);
//			
//		}
//		
//		mediaPesoPorcosGeral = (double) (totalPesoPorcos / porcos.size());
//		mediaPesoPorcosFemea = (double) (totalPesoPorcoFemea / quantidadePorcosFemea);
//		mediaPesoPorcosMacho = (double) (totalPesoPorcoMacho / quantidadePorcosMacho);
//	}
//	
//	public void adicionarPorco(Porco porco) {
//		if(porco.getSexo().equals(SexoPorcoEnum.MACHO)) {
//			quantidadePorcosMacho++;
//			totalPesoPorcoMacho+=porco.getPeso();
//		}else {
//			quantidadePorcosFemea++;
//			totalPesoPorcoFemea+=porco.getPeso();
//		}
//		
//		if(porco.getPeso() >= 50 && porco.getPeso() <= 80) {
//			quantidadePorcosEntre50e80++;
//		}else if(porco.getPeso() > 80) {
//			quantidadePorcosComMais80++;
//		}
//		
//		if(porco.getPeso() > porcoMaisPesado) {
//			porcoMaisPesado = porco.getPeso();
//			
//			if(porco.getSexo().equals(SexoPorcoEnum.MACHO)) {
//				porcoMaisPesadoMacho = porco.getPeso();
//			}else {
//				porcoMaisPesadoFemea = porco.getPeso();
//			}
//		}
//		
//		if(porco.getPeso() < porcoMaisLeve) {
//			porcoMaisLeve = porco.getPeso();
//			
//			if(porco.getSexo().equals(SexoPorcoEnum.MACHO)) {
//				porcoMaisLeveMacho = porco.getPeso();
//			}else {
//				porcoMaisLeveFemea = porco.getPeso();
//			}
//		}
//		if(porco.getIdade() > 6 && porco.getPeso()>75) {
//			quantidadePorcosProntosProAbate++;
//		}
//		
//		totalPesoPorcos += porco.getPeso();
//		
//		this.porcos.add(porco);
//		
//		totalPesoPorcos += porco.getPeso();
//		
//		this.porcos.add(porco);
//		
//		mediaPesoPorcosGeral = (double) (totalPesoPorcos / porcos.size());
//		mediaPesoPorcosFemea = (double) (totalPesoPorcoFemea / quantidadePorcosFemea);
//		mediaPesoPorcosMacho = (double) (totalPesoPorcoMacho / quantidadePorcosMacho);
//	}
	
	
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
