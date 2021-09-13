//package com.ti2cc;

public class Carro {
	private int id;
	private String nome;
	private String marca;
	private char novo;
	
	public Carro() {
		this.id = -1;
		this.nome = "";
		this.marca = "";
		this.novo = '*';
	}
	
	public Carro(int id, String name, String marca, char new_car) {
		this.id = id;
		this.nome = name;
		this.marca = marca;
		this.novo = new_car;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String name) {
		this.nome = name;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public char getNovo() {
		return novo;
	}

	public void setNovo(char new_car) {
		this.novo = new_car;
	}

	@Override
	public String toString() {
		return "Carro [id=" + id + ", nome=" + nome + ", marca=" + marca + ", novo=" + novo + "]";
	}	
}
