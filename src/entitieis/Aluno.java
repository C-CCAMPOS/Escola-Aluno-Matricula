package entitieis;

import java.util.Scanner;

public class Aluno {
	
	public Integer id;
	public String nome;
	public String dataNascimento;
	public String rg;
	public String cpf;
	public String telefone;
	public String email;
	
	public void Id(Integer id) {
		this.id = id;
	}
	
	public void Nome(String nome) {
		this.nome = nome;
	}
	
	public void DataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public void Rg(String rg) {
		this.rg = rg;
	}
	public void Cpf(String cpf) {
		this.cpf = cpf;
	}
	public void Telefone(String telefone) {
		this.telefone = telefone;
	}
	public void Email(String email) {
		this.email = email;
	}
	
	
	public void CadastroAluno() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\n\n\n\n--------------------------------------- ");
		System.out.println("OPÇÃO |ALUNO|");
		System.out.println("---------------------------------------");

		System.out.print("Digite O Id do aluno.....................: ");
		Id(Integer.parseInt(scanner.nextLine()));
		
		System.out.print("Digite o Nome do aluno...................: ");
		Nome(scanner.nextLine());
		
		System.out.print("Digite a Data de Nascimento do aluno.....: ");
		DataNascimento(scanner.nextLine());

		System.out.print("Digite o RG do aluno.....................: ");
		Rg(scanner.nextLine());
		
		System.out.print("Digite o CPF do aluno....................: ");
		Cpf(scanner.nextLine());
		
		System.out.print("Digite o Telefone do aluno...............: ");
		Telefone(scanner.nextLine());
		
		System.out.print("Digite o Email do aluno..................: ");
		Email(scanner.nextLine());
		
		
	}
	
	
	
	
}
