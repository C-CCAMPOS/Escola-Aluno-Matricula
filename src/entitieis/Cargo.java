package entitieis;

import java.util.Scanner;

public class Cargo {

	public Integer id;
	public String descricao;

	public void Id(Integer id) {
		this.id = id;
	}

	public void Descricao(String descricao) {
		this.descricao = descricao;
	}

	public void CadastroCargo() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("\n|CARGO| \n--------------------------------------- ");
		
		System.out.print("Digite o Id do cargo.......: ");
		Id(Integer.parseInt(scanner.nextLine()));
		
		System.out.print("Digite a Descrição do cargo: ");
		Descricao(scanner.nextLine());
		
	}
}
