package dados;
import java.util.Scanner;
public class Animal {
	Scanner scanAni = new Scanner(System.in);
	private String nome;
	private	String especie;
	private String descricao;
	private Dono dono;
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecie() {
		return this.especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getDescricao() {
		return this.descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Dono getDono() {
		return this.dono;
	}
	public void setDono(Dono dono) {
		this.dono = dono;
	}
	@Override
	public String toString() {
		return "Nome: " + nome + ", especie: " + especie + ", descricao: " + descricao
				+ ", dono: " + dono ;
	}
	
	
	

}
