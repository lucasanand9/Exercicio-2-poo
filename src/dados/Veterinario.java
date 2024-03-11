package dados;
import java.util.Arrays;
import java.util.Scanner;
public class Veterinario {
	Scanner scan = new Scanner(System.in);
	private String nome;
	private double salario;
	private Endereco endereco;
	private int numAnimal = 0;
	private Animal animais[] = new Animal[5];
	
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public Endereco getEndereco() {
		return this.endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public int getNumAnimal() {
		return this.numAnimal;
	}
	public void setNumAnimal(int numAnimal) {
		this.numAnimal = numAnimal;
	}
	public Animal[] getAnimais() {
		return animais;
	}
	public void setAnimais(Animal a) {
		if(this.numAnimal < 5) {
			animais[numAnimal] = a;
			numAnimal++;
		}else {
			System.out.println("Não é possivel adicionar mais animais");
		}
	}
	
	
	
	@Override
	public String toString() {
		return "Nome:" + nome + ", salario: " + salario + ", endereco: " + endereco
				+ ", animais: " + Arrays.toString(animais) + "";
	}
	
}
