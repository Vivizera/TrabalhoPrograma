package ifsc;

import java.util.ArrayList;

public class Produto {
	private ArrayList<String> nome;
	private ArrayList<String> sabor;
	private ArrayList<String> descricao;
	private ArrayList<Double> preco;
	public ArrayList<String> getNome() {
		return nome;
	}
	public void setNome(ArrayList<String> nome) {
		this.nome = nome;
	}
	public ArrayList<String> getSabor() {
		return sabor;
	}
	public void setSabor(ArrayList<String> sabor) {
		this.sabor = sabor;
	}
	public ArrayList<String> getDescricao() {
		return descricao;
	}
	public void setDescricao(ArrayList<String> descricao) {
		this.descricao = descricao;
	}
	public ArrayList<Double> getPreco() {
		return preco;
	}
	public void setPreco(ArrayList<Double> preco) {
		this.preco = preco;
	}

	

}
