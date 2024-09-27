package br.edu.fatecpg.sobrecarga.model;

public class Produto {
private String nome;
private double preco;
private int quantidade;
	public Produto(String nm) {
		this.nome = nm;
	}
	public Produto(String nm,double pr) {
		this.nome = nm;
		this.preco = pr;
	}
	public Produto(String nm,double pr,int qtd) {
		this.nome = nm;
		this.preco = pr;
		this.quantidade = qtd;
	}
	
}
