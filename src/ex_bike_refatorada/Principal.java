package ex_bike_refatorada;
public class Principal {

	public static void main(String[] args) {
		Bicicleta caloi = new Bicicleta();
		
		caloi.setVelocidade(0);
	
		
		System.out.println("------------ Acelerando -------------");
		caloi.acelerar();
		caloi.acelerar();
		caloi.acelerar();
		
		System.out.println("---- Freiou!----");
		caloi.frear();
		
		System.out.println("---- Reduzindo a marcha----");

		caloi.diminuirMarcha();
		caloi.diminuirMarcha();

		System.out.println("\n***---- STATUS DA BIKE ---***");
		



		System.out.println(" Cor: "+caloi.getCor()+"\n Velocidade: "+caloi.getVelocidade()+"\n Marcha: "+caloi.getMarchaAtual());
		
		Bicicleta b1 = new Bicicleta();
		Bicicleta b2 = new Bicicleta();
		
		System.out.println("Bicicletas instanciadas: "+Bicicleta.totalBikes);
	}
}
