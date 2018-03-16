package ex_conta_corrigida;

public class Principal {

	public static void main(String[] args) {
		Conta c =  new Conta("João de Deus", 0144, "0144-9", 100);
		
		c.imprimeDados();
		
		c.deposita(100);
		System.out.println("Depositando... Saldo: "+c.getSaldo());
		
		c.saca(10);
		System.out.println("Sacou... Saldo: "+c.getSaldo());
		System.out.println("Rendimento mensal: R$"+c.calculaRendimento());
		
	}
}
