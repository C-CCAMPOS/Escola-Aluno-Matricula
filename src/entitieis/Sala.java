package entitieis;

import java.util.Scanner;

public class Sala {

	public Integer id;
	public Integer qtAlunos;

	public void Id(Integer id) {
		this.id = id;
	}

	public void QtAlunos(Integer qtAlunos) {
		this.qtAlunos = qtAlunos;
	}
	
	public void CadastroSala() {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("OPÇÃO|SALAS|");
		System.out.println("---------------------------------------");

		System.out.print("Digite o ID da sala: ");
		Id(Integer.parseInt(scanner.nextLine()));
		
		System.out.print("Digite a Quantidade de Alunos em sala: ");
		QtAlunos(Integer.parseInt(scanner.nextLine()));
	}
	
	
	
}
