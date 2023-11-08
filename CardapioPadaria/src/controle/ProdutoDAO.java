package controle;

import java.util.ArrayList;

import modelo.Bebida;
import modelo.Doce;
import modelo.IProdutoDAO;
import modelo.Produto;
import modelo.Salgado;

public class ProdutoDAO implements IProdutoDAO {

	private static ArrayList<Produto> tabelaProdutos;
	private static ProdutoDAO instancia;
	private static ArrayList<Salgado> salgados = new ArrayList<>();
	private static ArrayList<Doce> doces = new ArrayList<>();
	private static ArrayList<Bebida> bebidas = new ArrayList<>();

	/**
	 * Torna o construtor da classe privado Para impedir que a classe seja
	 * instanciada
	 */
	private ProdutoDAO() {
	}

	/**
	 * Metodo utilizando padrao Singleton impossibilitando que se criem diversos
	 * objetos em memoria RAM apenas se crie um uma unica vez e se manipule o mesmo
	 * 
	 * 
	 * @return
	 */
	public static ProdutoDAO getInstancia() {

		if (instancia == null) {
			instancia = new ProdutoDAO();
			tabelaProdutos = new ArrayList<>();
		}

		return instancia;
	}

	@Override
	public boolean inserir(Produto p) {
		if (p != null) {
			tabelaProdutos.add(p);
			
			return true;
		}
		return false;
	}

	@Override
	public boolean alterar(Produto p) {
		for (Produto produtos : tabelaProdutos) {

			if (produtos.getId() == p.getId()) {
				produtos.setNome(p.getNome());
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean excluir(Produto p) {
		for (Produto produtos : tabelaProdutos) {
			if (produtos.getId() == p.getId()) {
				tabelaProdutos.remove(produtos);
				return true;
			}
		}

		return false;
	}

	@Override
	public ArrayList<Produto> listarProdutos() {
		return tabelaProdutos;
	}

}
