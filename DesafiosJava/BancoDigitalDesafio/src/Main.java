
public class Main {

	public static void main(String[] args) {
		Cliente yasmin = new Cliente();
		yasmin.setNome("Yasmin");
		
		Conta cc = new ContaCorrente(yasmin);
		Conta poupanca = new ContaPoupanca(yasmin);

		cc.depositar(1200);
		cc.transferir(550, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}