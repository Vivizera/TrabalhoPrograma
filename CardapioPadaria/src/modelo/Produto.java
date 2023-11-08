package modelo;

public abstract class Produto {
	private Long id;
	private String nome;
	private String sabor;
	private String descricao;
	private Double preco;
	private int codBarras;
	private String valorCodBarras;

	public String getValorCodBarras() {
		return valorCodBarras;
	}

	public void setValorCodBarras(String valorCodBarras) {
		this.valorCodBarras = valorCodBarras;
	}

	public int getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(int codBarras) {
		this.codBarras = codBarras;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Codigo de barras: " + codBarras + " Preco: " + preco;
	}

}
