package ex_funcionario;

import java.util.Scanner;

public class Endereco {
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private String pais;
	private String cep;
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String toString() {
		String end = "Rua "+getLogradouro()+", "+getNumero()+" "+getComplemento()
		+" - "+getBairro()+"\n"+getCidade()+"/"+getEstado()+"\n"+getPais()
		+" CEP: "+getCep();
		return end;
	}
	
	
	void cadastraEndereco() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Logradouro: ");
		setLogradouro(sc.nextLine());
		
		System.out.print("Número: ");
		setNumero(sc.nextLine());
		
		System.out.print("Complemento: ");
		setComplemento(sc.nextLine());
		
		System.out.print("Bairro: ");
		setBairro(sc.nextLine());
		
		System.out.print("Cidade: ");
		setCidade(sc.nextLine());
		
		System.out.print("Estado: ");
		setEstado(sc.nextLine());
		
		System.out.print("País: ");
		setPais(sc.nextLine());
		
		System.out.print("CEP: ");
		setPais(sc.nextLine());
		
	}
	
}
