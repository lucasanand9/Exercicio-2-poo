package dados;
import java.util.Scanner;
public class Dono {
	Scanner scanDono = new Scanner(System.in);
	private String nome;
	private Endereco endereco;
	private String cpf;
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return this.endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + ", endereco=" + endereco + ", cpf=" + cpf;
	}
	
	
	
}
