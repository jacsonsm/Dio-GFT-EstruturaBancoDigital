
public class Main {
	public static void main(String[] args) {
		Cliente  Medeiros = new Cliente();
		Medeiros.setNome("Medeiros");
		
		Conta cc  = new ContaCorrente(Medeiros);
		Conta poupanca = new ContaPoupanca(Medeiros);
		
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();	
	}

}

/*=== Extrato Conta Corrente ===
Titular: Medeiros
Agencia: 1
Numero: 1
Saldo: 0,00
===Extrato Conta Poupança ===
Titular: Medeiros
Agencia: 1
Numero: 2
Saldo: 100,00*/

