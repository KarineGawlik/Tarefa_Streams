package br.com.karineg;

public class Pessoa {
	private String nome;
	private String sexo;
	
	public Pessoa(String nome, String sexo) {
		super();
		this.nome = nome;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String toString() {
		return "Nome: " + nome + " - " + "Sexo: " + sexo;
	}
}

