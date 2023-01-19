package entitieis;

import java.util.Scanner;

public class Modulo {

	Scanner scanner = new Scanner(System.in);
	
	
	public Integer id;
	public String nome;
	public Integer qtAulas;
	public Double qtHoras;

	public void Id(Integer id) {
		this.id = id;
	}

	public void Nome(String nome) {
		this.nome = nome;
	}

	
	

	public void QtAulas(Integer qtAulas) {
		this.qtAulas = qtAulas;
	}
	
	public void QtHoras(Double qtHoras) {
		this.qtHoras = qtHoras;
	}

	public void CadastroModulo() {

	

	System.out.println("OPÇÃO|MODULO|");
	System.out.println("---------------------------------------");

	System.out.print("Digite o ID do módulo: ");
	Id(Integer.parseInt(scanner.nextLine()));
	
	System.out.print("Digite o Nome do módulo: ");
	Nome(scanner.nextLine());
	
	System.out.print("Digite o  do módulo: ");
	QtAulas(Integer.parseInt(scanner.nextLine()));
	
	System.out.print("Digite o  do módulo: ");
	QtHoras(Double.parseDouble(scanner.nextLine()));
}
}
