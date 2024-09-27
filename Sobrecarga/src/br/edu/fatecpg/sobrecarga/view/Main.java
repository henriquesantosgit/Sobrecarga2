package br.edu.fatecpg.sobrecarga.view;

import br.edu.fatecpg.sobrecarga.model.Produto;

// Crie uma classe chamada Produto com três construtores sobrecarregados:

//O primeiro deve receber um nome do produto (String).

//O segundo deve receber um nome e um preço (double).

//O terceiro deve receber um nome, um preço e uma quantidade em estoque (int).

//Instancie objetos da classe Produto utilizando cada um dos construtores e 
//imprima as informações dos produtos.
public class Main {

	public static void main(String[] args) {
		int qtd = 10;
		double preco = 3.50;
		String nome = "Caneta";
		
		Produto produto = new Produto(nome,preco);
		System.out.println(produto);
	}

}
