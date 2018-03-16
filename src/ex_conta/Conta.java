package ex_conta;

import java.util.Calendar;

public class Conta {
	private String titular;
	private int numeroConta;
	private String agencia;
	private double saldo;
	private String data;
    
	
     public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	void saca(double valor) {
    	 saldo-=valor;
     }

     void deposita(double valor) {
    	 saldo+=valor;
     }

     double calculaRendimento() {
         return saldo*0.1;
     }
     
     void imprimeDados() {
    	 System.out.println(
    			 "Titular: "+titular
    			 +"\n Agência: "+getAgencia()
    			 +"\t Conta: "+getNumeroConta()
    			 +"\n Data de criação: "+getData()
    			 +"\n --------------------------"
    			 +"\n SALDO: R$"+getSaldo()
    			 );
     }
}
