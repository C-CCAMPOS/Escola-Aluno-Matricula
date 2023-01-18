package principarl;

import java.util.Scanner;

import entitieis.Aluno;
import entitieis.Filial;

public class Program {

	public static void main(String[] args) {

		System.out.println(
				"--------------------------------------- \nSISTEMA PARA CURSOS PROFISSIONALIZANTES \n--------------------------------------- \n|1| Escola \n|2| Alunos \n|3| Contratos");

		Scanner scanner = new Scanner(System.in);

		System.out.print("\n\n--------------------------------------- \nDigite a opção desejada: ");

		Integer opcao1 = 0;
		opcao1 = Integer.parseInt(scanner.nextLine());
		System.out.print("---------------------------------------");

		switch (opcao1) {

		case 1:

			System.out.println(
					"\n\n\n--------------------------------------- \n**************  ESCOLA  *************** \n---------------------------------------");

			System.out.print(
					"|1| Filial \n|2| Cargo \n|3| Funcionário \n|4| Livros \n|5| Módulo \n|6| Salas \n|7| Horários \n|8| Turmas ");

			System.out.print("\n\n--------------------------------------- \nDigite a opção que desejada cadastrar: ");

			Integer opcao2 = 0;
			opcao2 = Integer.parseInt(scanner.nextLine());

			switch (opcao2) {

			case 1:

				Filial filial = new Filial();

				filial.Cadastro();

			case 2:

			case 3:

			case 4:

			case 5:

			case 6:

			case 7:

			case 8:

			}

		case 2:

			System.out.println(
					"\n\n\n--------------------------------------- \n**************  ALUNOS  *************** \n---------------------------------------");

			Aluno aluno = new Aluno();

			aluno.CadastroAluno();

		case 3:

		}
	}

}
