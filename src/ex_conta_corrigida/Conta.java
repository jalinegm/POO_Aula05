package ex_conta_corrigida;

import java.util.Calendar;
import java.util.Date;

public class Conta {
	private String titular;
	private int numeroConta;
	private String agencia;
	private double saldo=0;
	private double limite;
	private Date data;
	
	Conta(String titular, int numeroConta, String agencia, double limite){
		this.titular =  titular;
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.limite = limite;
		this.data = new Date();
	}
	
     public String getTitular() {
		return titular;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getAgencia() {
		return agencia;
	}

	public double getSaldo() {
		return saldo+limite;
	}

	public  Date getData() {
		return data;
	}

	
	void saca(double valor) {
    	 saldo-=valor;
     }

     void deposita(double valor) {
    	 saldo+=valor;
     }

     double calculaRendimento() {
         return saldo*0.01;
     }
     
     void imprimeDados() {
    	 System.out.println(
    			 "Titular: "+titular
    			 +"\n Agência: "+getAgencia()
    			 +"\t Conta: "+getNumeroConta()
    			 +"\n Data de criação: "+getData()
    			 +"\n Limite: R$ "+getLimite()
    			 +"\n --------------------------"
    			 +"\n SALDO DISPONÍVEL: R$"+getSaldo()
    			 );
     }

	private double getLimite() {
		// TODO Auto-generated method stub
		return limite;
	}
}
