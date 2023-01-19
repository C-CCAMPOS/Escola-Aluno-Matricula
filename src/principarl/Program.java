package principarl;

import java.util.Scanner;

import entitieis.Aluno;
import entitieis.Cargo;
import entitieis.Filial;
import entitieis.Funcionario;
import entitieis.Livro;
import entitieis.Modulo;
import entitieis.Sala;
import entitieis.Turma;

public class Program {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("---------------------------------------");
		System.out.println("     SISTEMA DE CONTROLE ACADÊMICO     ");
		System.out.println("             MENU PRINCIPAL            ");
		System.out.print("---------------------------------------");

		int opcao = 0;

		do {

			System.out.println("\nDigite uma opção válida");
			System.out.println("---------------------------------------");
			System.out.println("|1| Escola. \n|2| Alunos. \n|3| Pedagógico.");
			System.out.println("--------------------------------------- ");
			System.out.print("Selecione a opção desejada: ");

			opcao = Integer.parseInt(scanner.nextLine());

			switch (opcao) {

			case 1:

				int opcao1 = 0;

				do {

					System.out.println("\n\n\n\n--------------------------------------- ");
					System.out.println("***********  OPÇÃO ESCOLA  *************");
					System.out.println("-----------------------------------------");
					System.out.println("|1| Filial \n|2| Cargo \n|3| Funcionário \n\n|0| Tela Inicial");
					System.out.println("--------------------------------------- ");
					System.out.print("Digite a opção desejada: ");

					opcao1 = Integer.parseInt(scanner.nextLine());

					System.out.print("\n\n\n\n");

					if (opcao1 == 0) {
						Program.main(args);

					} else

						switch (opcao1) {

						case 1:

							Filial filial = new Filial();
							filial.CadastroFilial();

							System.out.println("\n\n\n\n---------------------------------------");
							System.out.println(">>> Retornando ao Menu Principal <<<");
							System.out.print("---------------------------------------\n\n\n\n");

							Program.main(args);

						case 2:

							Cargo cargo = new Cargo();
							cargo.CadastroCargo();

							System.out.println("\n\n\n\n---------------------------------------");
							System.out.println(">>> Retornando ao Menu Principal <<<");
							System.out.print("---------------------------------------\n\n\n\n");

							Program.main(args);

						case 3:

							Funcionario funcionario = new Funcionario();
							funcionario.CadastroFuncionario();

							System.out.println("\n\n\n\n---------------------------------------");
							System.out.println(">>> Retornando ao Menu Principal <<<");
							System.out.print("---------------------------------------\n\n\n\n");

							Program.main(args);
						}
				} while (opcao1 > 3);

			case 2:

				Aluno aluno = new Aluno();
				aluno.CadastroAluno();

				System.out.println("\n\n\n\n---------------------------------------");
				System.out.println(">>> Retornando ao Menu Principal <<<");
				System.out.print("---------------------------------------\n\n\n\n");

				Program.main(args);

			case 3:

				int opcao2 = 0;

				do {

					System.out.println("\n\n\n\n--------------------------------------- ");
					System.out.println("***********  OPÇÃO PEDAGÓGICO  *************");
					System.out.println("-----------------------------------------");
					System.out.println("|1| Livros \n|2| Módulos \n|3| Salas \n|4| Turma \n\n|0| Tela Inicial");
					System.out.println("--------------------------------------- ");
					System.out.print("Digite a opção desejada: ");

					opcao2 = Integer.parseInt(scanner.nextLine());

					System.out.print("\n\n\n\n");

					if (opcao2 == 0) {
						Program.main(args);

					} else

						switch (opcao2) {

						case 1:

							Livro livro = new Livro();
							livro.CadastroLivro();

							System.out.println("\n\n\n\n---------------------------------------");
							System.out.println(">>> Retornando ao Menu Principal <<<");
							System.out.print("---------------------------------------\n\n\n\n");

							Program.main(args);

						case 2:

							Modulo modulo = new Modulo();
							modulo.CadastroModulo();

							System.out.println("\n\n\n\n---------------------------------------");
							System.out.println(">>> Retornando ao Menu Principal <<<");
							System.out.print("---------------------------------------\n\n\n\n");

							Program.main(args);

						case 3:

							Sala sala = new Sala();
							sala.CadastroSala();

							System.out.println("\n\n\n\n---------------------------------------");
							System.out.println(">>> Retornando ao Menu Principal <<<");
							System.out.print("---------------------------------------\n\n\n\n");

							Program.main(args);

						case 4:

							Turma turma = new Turma();
							turma.CadastroTurma();

							System.out.println("\n\n\n\n---------------------------------------");
							System.out.println(">>> Retornando ao Menu Principal <<<");
							System.out.print("---------------------------------------\n\n\n\n");
							
							Program.main(args);
							
						}

				} while (opcao2 > 4);

			}
		} while (opcao > 3);

	}
}