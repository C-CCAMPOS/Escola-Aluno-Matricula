package entitieis;

import java.util.Scanner;

public class Turma {

Scanner scanner = new Scanner(System.in);
	
	
	public Integer id;
	public String diaSemana;
	public Double hora;
	

	public void Id(Integer id) {
		this.id = id;
	}

	public void DiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}

	
	

	public void Hora(Double hora) {
		this.hora = hora;
	}
	
	
	

	public void CadastroTurma() {

	

	System.out.println("OPÇÃO|HTURMA|");
	System.out.println("---------------------------------------");

	System.out.print("Digite o ID da turma: ");
	Id(Integer.parseInt(scanner.nextLine()));
	
	System.out.print("Digite o Nome da turma: ");
	DiaSemana(scanner.nextLine());
		
	System.out.print("Digite o Horário da turma: ");
	Hora(Double.parseDouble(scanner.nextLine()));
}
}
