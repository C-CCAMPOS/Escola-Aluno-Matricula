package entitieis;

import java.util.Scanner;

public class Funcionario {

	public Integer id;
	public String nome;
	public String cpf;
	public String cep;
	public String logradouro;
	public String numero;
	public String cidade;
	public String estado;
	public String telefone;

	public void Id(Integer id) {
		this.id = id;
	}

	public void Nome(String nome) {
		this.nome = nome;
	}

	public void Cpf(String cpf) {
		this.cpf = cpf;
	}

	public void Cep(String cep) {
		this.cep = cep;
	}

	public void Logradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public void Numero(String numero) {
		this.numero = numero;
	}
	
	public void Cidade(String cidade) {
		this.cidade = cidade;
	}
	
	public void Estado(String estado) {
		this.estado = estado;
	}
	
	public void Telefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
	
	public void CadastroFuncionario() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("OPÇÃO |FUNCIONÁRIOS|");
		System.out.println("---------------------------------------");
		
		System.out.print("Digiteo o Id do funcionário.....: ");
		Id(Integer.parseInt(scanner.nextLine()));
		
		System.out.print("Digiteo Nome do funcionário.....: ");
		Nome(scanner.nextLine());
		
		System.out.print("Digiteo o CPF do funcionário....: ");
		Cpf(scanner.nextLine());
		
		System.out.print("Digiteo o CEP do funcionário....: ");
		Cep(scanner.nextLine());
		
		System.out.print("Digite o Endereço - Logradouro..: ");
		Logradouro(scanner.next());
		
		System.out.print("                          Número: ");
		Numero(scanner.next());
		
		System.out.print("                         Cidadeo: ");
		Cidade(scanner.next());
		
		System.out.print("                              UF: ");
		Estado(scanner.nextLine());
		
		System.out.print("Digite o Telefone do Funcionário: ");
		Telefone(scanner.nextLine());
	}
	
}
