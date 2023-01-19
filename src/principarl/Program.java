package principarl;

import java.util.Scanner;

import entitieis.Aluno;
import entitieis.Cargo;
import entitieis.Filial;
import entitieis.Funcionario;
import entitieis.Livro;

public class Program {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("--------------------------------------- " + "\n            BEM VINDOª AO "
				+ "\nSISTEMA PARA CURSOS PROFISSIONALIZANTES " + "\n---------------------------------------\n\n\n ");

		System.out.println("\n--------------------------------------- " + "\n|1| Escola \n|2| Alunos \n|3| Pedagógico"
				+ "\n--------------------------------------- " + "\nSelecione a opção desejada:  ");

		Integer opcao1 = 0;

		opcao1 = Integer.parseInt(scanner.nextLine());

		while (opcao1 > 3) {

			System.out.print(
					"--------------------------------------- \nOpção Inválida! \n\n\n\n\n\nRepita a operação!\n--------------------------------------- \n**************  ESCOLA  *************** \n--------------------------------------- "
							+ "\n|1| Escola \n|2| Alunos \n|3| Pedagógico\n\n---------------------------------------\nSelecione a opção desejada:  ");

			opcao1 = Integer.parseInt(scanner.nextLine());

			switch (opcao1) {

			case 1:

				System.out.println(
						"\n\n\n--------------------------------------- \n**************  ESCOLA  *************** \n--------------------------------------- \n|1| Filial \n|2| Cargo \n|3| Funcionário \n\n|0|Ecolha novamente");

				System.out
						.print("\n\n--------------------------------------- \nDigite a opção que desejada cadastrar: ");

				Integer opcao2 = 0;
				opcao2 = Integer.parseInt(scanner.nextLine());
				switch (opcao2) {

				case 1:
					Filial filial = new Filial();

					filial.CadastroFilial();
					
					
				case 2:

					Cargo cargo = new Cargo();

					cargo.CadastroCargo();

				case 3:

					Funcionario funcionario = new Funcionario();

					funcionario.CadastroFuncionario();

				}

			case 2:

				System.out.println(
						"\n\n\n--------------------------------------- \n**************  ALUNOS  *************** \n---------------------------------------");

				Aluno aluno = new Aluno();

				aluno.CadastroAluno();

			case 3:

				System.out.println(
						"\n\n\n--------------------------------------- \n************  PEDAGÓGICO  ************* \n---------------------------------------");

				System.out.print("|1| Livro \n|2| Módulo \n|3| Salas \n|4| Horários");

				System.out
						.print("\n\n--------------------------------------- \nDigite a opção que desejada cadastrar: ");

				Integer opcao3 = 0;
				opcao3 = Integer.parseInt(scanner.nextLine());

				switch (opcao3) {

				case 1:

					Livro livro = new Livro();

					livro.CadastroLivro();

				case 2:

				case 3:

				case 4:

				}

			}
		}
	}

}
