package ex_funcionario;


import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		JFrame frame = new JFrame();
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();


		do {
			String nome = JOptionPane.showInputDialog("Nome: ");
			int id =  Integer.parseInt(JOptionPane.showInputDialog("Identificação: "));
			double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário"));
			Endereco endereco = new Endereco();
			endereco.cadastraEndereco();

			funcionarios.add(new Funcionario(nome, id, endereco, salario));

			n = JOptionPane.showConfirmDialog(
					frame,
					"Cadastrar novo funcionário?",
					"CADASTRO",
					JOptionPane.YES_NO_OPTION);
			
			System.out.println(n);

		}while(n == 0);
		
		imprimir(funcionarios);
	}
	
	static void imprimir(ArrayList<Funcionario> funcionarios) {
		for(Funcionario f: funcionarios) {
			System.out.println("Nome: "+f.getNome()+" ID: "+f.getIdentificacao()
			+"\nSalário: "+f.getSalario()+" Telefone: "+f.getTelefone()
			+"\n"+f.getEndereco());
			
		}
	}
}


