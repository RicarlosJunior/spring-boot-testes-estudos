package br.com.junit;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
	
	private String nome;
	private LocalDate nascimento;
	
	public Pessoa(String nome, LocalDate idade) {
		this.nome = nome;
		this.nascimento = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	
	public int getIdade() {
		return (int) ChronoUnit.YEARS.between(nascimento, LocalDate.now());
	}
	
	
	public boolean maiorDeIdade() {
		return getIdade() >= 18;
	}
}