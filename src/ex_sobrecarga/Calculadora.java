package ex_sobrecarga;

public class Calculadora {
		
	public double somar(double valor1, double valor2) {
		// TODO implement me
		System.out.println("Entrou no double");
		return valor1 + valor2;	
	}
	
	public int somar(int valor1, int valor2) {
		// TODO implement me
		System.out.println("Entrou no int");
		return valor1 + valor2;	
	}
	
	public String somar(int valor1, String valor2) {
		// TODO implement me
		System.out.println("Entrou no String");
		return valor1 + valor2;	
	}
	
	public String somar(String valor2, int valor1) {
		// TODO implement me
		System.out.println("Entrou no String com int");
		return valor2 + valor1;	
	}
	

}
