package Negocio;
import java.util.Scanner;

import dados.*;

public class SistemaPetShop {
	private static Veterinario[] veterinarios = new Veterinario[50];
	private static int numVeterinarios = 0;
	static Scanner scan = new Scanner(System.in);
	
	public static void imprimeMenu() {
		System.out.println("Escolha uma opção:");
		System.out.println("0 - Sair");
		System.out.println("1 - Cadastrar veterinario");
		System.out.println("2 - Exibir veterinario");
		System.out.println("3 - Cadastrar endereço do veterinario");
		System.out.println("4 - Cadastrar animal");
		System.out.println("5 - Exibir animal");
		System.out.println("6 - Cadastrar dono");
	}
	
	public static void main(String[] args) {
		int opcao = -1;
		while (opcao != 0) {
			imprimeMenu();
			opcao = Integer.parseInt( scan.nextLine());
			switch(opcao) {
				case 0 :
				break;
				case 1 :
					cadastraVeterinario();
				break;
				
				case 2:
					mostraVeterinarios();
				break;
				case 3:
					cadastroEnderecoVet();
				break;
				case 4:
					cadastroAnimalVet();
				break;
				case 5:
					mostraAnimal();
				break;
				case 6:
					cadastraDonoAnimal();
				break;
				default:
					System.out.println("Opção não valida");
				
			}
		}
	}
	
	
	public static void cadastraVeterinario() {
		if(numVeterinarios < 50) {
			Veterinario v = new Veterinario();
			System.out.println("Digite o nome do veterinario:");
			String nome;
			nome = scan.nextLine();
			v.setNome(nome);
			System.out.println("Digite o salario");
			v.setSalario(Double.parseDouble(scan.nextLine()));
			veterinarios[numVeterinarios] = v;
			numVeterinarios++;
		}
	}
	public static void mostraVeterinarios() {
		for(int i = 0; i < numVeterinarios; i++) {
			System.out.println("Codigo: " + i);
			System.out.println(veterinarios[i].toString()+ "\n");
		}
	}
	public static Veterinario escolheVet() {
		System.out.println("Escolha um veterinario:");
		mostraVeterinarios();
		int escolha = Integer.parseInt(scan.nextLine());
		if(escolha > numVeterinarios) {
			return null;
		}else {
			return veterinarios[escolha];
		}
		
	}
	
	public static void cadastroEnderecoVet() {
		Veterinario vet = escolheVet();
		if(vet != null) {
			vet.setEndereco(cadastroEndereco());
		}
	}
	
	public static Endereco cadastroEndereco() {
		Endereco e = new Endereco();
		System.out.println("Digite sua Rua:");
		e.setRua(scan.nextLine());
		System.out.println("Digite o numero da sua casa:");
		e.setNumero(Integer.parseInt(scan.nextLine()));
		System.out.println("Digite seu bairro:");
		e.setBairro(scan.nextLine());
		System.out.println("Digite sua cidade:");
		e.setCidade(scan.nextLine());
		System.out.println("Digite seu cep");
		e.setCep(scan.nextLine());
		System.out.println("Digite seu estado:");
		e.setEstado(scan.nextLine());
		return e;
	}
	
	public static void cadastroAnimalVet() {
		Veterinario vet = escolheVet();
		if(vet != null) {
			vet.setAnimais(cadastraAnimal());
		}
	}
	
	public static Animal cadastraAnimal() {
		Animal animal = new Animal();
		
		System.out.println("Digite o nome do seu pet:\n");
		animal.setNome(scan.nextLine());
		System.out.println("digite a especie do se pet:\n");
		animal.setEspecie(scan.nextLine());
		System.out.println("Coloque uma descrição:\n");
		animal.setDescricao(scan.nextLine());
		
		return animal;
	}
	
	
	public static Dono cadastraDono() {
		Dono dono = new Dono();
		System.out.println("Digite o nome do dono:");
		dono.setNome(scan.nextLine());
		
		System.out.println("Digite o seu CPF:");
		dono.setCpf(scan.nextLine());
		
		dono.setEndereco(cadastroEndereco());
		
		return dono;
		
	}
	
	public static void mostraAnimal() {
			Veterinario vet = escolheVet();
	
			if(vet != null) {
				for(int i = 0; i < vet.getNumAnimal(); i++) {
					System.out.println("Animal atendido: " + i);
					System.out.println(vet.getAnimais()[i].toString() + "\n");
				}
			}
	}
	
	public static Animal escolherAnimal() {
		Veterinario vet = escolheVet();
		if(vet != null) {
			for(int i = 0; i < vet.getNumAnimal(); i++) {
				System.out.println("Animal atendido: " + i);
				System.out.println(vet.getAnimais()[i].toString());
			}
		
		
			int escolha = Integer.parseInt(scan.nextLine());
			if(escolha >vet.getNumAnimal()) {
				System.out.println("Numero invalido");
				return null;
			}else {
				return vet.getAnimais()[escolha];
			}
		}
		return null;
		}
	
	public static void cadastraDonoAnimal() {
		Animal animal = escolherAnimal();
		if(animal != null) {
			animal.setDono(cadastraDono());
		}
	}
	
	
}
