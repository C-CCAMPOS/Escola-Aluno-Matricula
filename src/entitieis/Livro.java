package entitieis;

import java.util.Scanner;

public class Livro {

	public Integer id;
	public String nome;
	public Integer qtCapitulos;
	

	public void Id(Integer id) {
		this.id = id;
	}

	public void Nome(String nome) {
		this.nome = nome;
	}

	public void QtCapitulos(Integer qtCapitulos) {
		this.qtCapitulos = qtCapitulos;
	}

	
	public void CadastroLivro() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("OPÇÃO|LIVRO|");
		System.out.println("---------------------------------------");

		System.out.print("Digite o ID do livro: ");
		Id(Integer.parseInt(scanner.nextLine()));

		System.out.print("Digite o Nome do livro: ");
		Nome(scanner.nextLine());

		System.out.print("Digite a quantidade de Capítulos do livro: ");
		QtCapitulos(Integer.parseInt(scanner.nextLine()));
				
	}
}