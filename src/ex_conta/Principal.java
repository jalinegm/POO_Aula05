package ex_conta;

public class Principal {

	public static void main(String[] args) {
		Conta c =  new Conta();
		c.setTitular("João de Deus");
		c.setNumeroConta(0144);
		c.setAgencia("0144-9");
		c.setData("02/10/2017");
		
		c.imprimeDados();
		
		c.deposita(100);
		System.out.println("Depositando... Saldo: "+c.getSaldo());
		
		c.saca(10);
		System.out.println("Sacou... Saldo: "+c.getSaldo());
		c.setSaldo(900);
		System.out.println("Rendimento mensal: R$"+c.calculaRendimento());
		
	}
}
