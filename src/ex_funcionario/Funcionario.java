package ex_funcionario;

public class Funcionario {
	private String nome;
	private int identificacao;
	private Endereco endereco;
	private String telefone;
	private double salario;

	public Funcionario( String nome, int identificacao, double salario){
		this.nome = nome;
		this.identificacao  = identificacao;
		this.salario = salario;
	}
	
	public Funcionario( String nome, int identificacao, Endereco endereco, double salario){
		this.nome = nome;
		this.identificacao  = identificacao;
		this.endereco = endereco;
		this.telefone = telefone;
		this.salario = salario;
	}

	public Funcionario( String nome, int identificacao, Endereco endereco, String telefone, double salario){
		this.nome = nome;
		this.identificacao  = identificacao;
		this.endereco = endereco;
		this.telefone = telefone;
		this.salario = salario;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public int getIdentificacao() {
		return identificacao;
	}
	
	
	
}
