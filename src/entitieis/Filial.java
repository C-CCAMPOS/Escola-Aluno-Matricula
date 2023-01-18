package entitieis;

import java.util.Scanner;

public class Filial {
	
	

	public String cnpj;
	public String razaoSocial;
	public String cep;
	public String logradouro;
	public Integer numero;
	public String complemento;
	public String cidade;
	public String estado;
	public String telefone;

public void Cnpj(String cnpj) {
	this.cnpj = cnpj;
}

public void RazaoSocial(String razaoSocial) {
	this.razaoSocial = razaoSocial;
}
	
public void Cep(String cep) {
	this.cep = cep;
}

public void Logradouro(String logradouro) {
	this.logradouro = logradouro;
}

public void Numero(Integer numero) {
	this.numero = numero;
}

public void Complemento(String complemento) {
	this.complemento = complemento;
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

public void Cadastro() {
	
	
	Scanner scanner = new Scanner (System.in);

System.out.println("\n|FILIAL| \n--------------------------------------- ");

System.out.print("Digite O CNPJ da empresa........: ");
Cnpj(scanner.nextLine());

System.out.print("Digite O Razão Social da empresa: ");
RazaoSocial(scanner.nextLine());

System.out.print("Digite O CEP da empresa.........: ");
Cep(scanner.nextLine());

System.out.print("Digite O Logradouro da empresa..: ");
Logradouro(scanner.nextLine());

System.out.print("Digite O Numero da empresa......: ");
Numero(Integer.parseInt(scanner.nextLine()));

System.out.print("Digite O Complemento da empresa.: ");
Complemento(scanner.nextLine());

System.out.print("Digite O Cidade da empresa......: ");
Cidade(scanner.nextLine());

System.out.print("Digite O Estado da empresa......: ");
Estado(scanner.nextLine());

System.out.print("Digite O Telefone da empresa....: ");
Telefone(scanner.nextLine());


}
}