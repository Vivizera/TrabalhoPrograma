package controle;

import java.util.ArrayList;

import modelo.Bebida;
import modelo.Doce;
import modelo.Produto;
import modelo.Salgado;

public class ProdutoDAO {

	private static ProdutoDAO instancia;

	/*
	 * "Simula" um banco de dados ja que ainda nao vimos este conteudo Usamos o
	 * arraylist como um banco de dados para guardar as infos
	 */
	private static ArrayList<Salgado> salgados;
	private static ArrayList<Doce> doces;
	private static ArrayList<Bebida> bebidas;

	private ProdutoDAO() {
	}

	public static ProdutoDAO getInstancia() {

		if (instancia == null) {
			instancia = new ProdutoDAO();
			salgados = new ArrayList<>();
			doces = new ArrayList<>();
			bebidas = new ArrayList<>();

			Bebida Guarana = new Bebida();
			Guarana.setCodBarras(1000);
			Guarana.setNome("Refrigerantes");
			Guarana.setSabor("Guarana");
			Guarana.setPreco(5.00);
			Guarana.setTipo("Guarana");

			Bebida CocaCola = new Bebida();
			CocaCola.setCodBarras(1200);
			CocaCola.setNome("Refrigerantes");
			CocaCola.setSabor("Sabor Coca-Cola");
			CocaCola.setPreco(5.00);
			CocaCola.setTipo("CocaCola");

			Bebida CafeLeite = new Bebida();
			CafeLeite.setCodBarras(1300);
			CafeLeite.setNome("Cafe");
			CafeLeite.setSabor("Com leite");
			CafeLeite.setDescricao("leite e cafe");
			CafeLeite.setPreco(3.00);
			CafeLeite.setTipo("Café com leite");

			Bebida CafePuro = new Bebida();
			CafePuro.setCodBarras(1400);
			CafePuro.setNome("Cafe");
			CafePuro.setSabor("Puro");
			CafePuro.setDescricao("cafe");
			CafePuro.setPreco(3.00);
			CafePuro.setTipo("Café sem leite");

			Bebida AguaGas = new Bebida();
			AguaGas.setCodBarras(1500);
			AguaGas.setNome("Água");
			AguaGas.setSabor("Com gas");
			AguaGas.setDescricao("água e gas");
			AguaGas.setPreco(2.00);
			AguaGas.setTipo("Agua com gás");

			Bebida AguaSem = new Bebida();
			AguaSem.setCodBarras(1600);
			AguaSem.setNome("Água");
			AguaSem.setSabor("Sem gas");
			AguaSem.setDescricao("água");
			AguaSem.setPreco(2.00);
			AguaSem.setTipo("Agua sem gás");

			bebidas.add(Guarana);
			bebidas.add(CocaCola);
			bebidas.add(CafeLeite);
			bebidas.add(CafePuro);
			bebidas.add(AguaGas);
			bebidas.add(AguaSem);

			Doce Brigadeiro = new Doce();
			Brigadeiro.setCodBarras(555);
			Brigadeiro.setNome("Brigadeiro");
			Brigadeiro.setSabor("Sabor Chocolate");
			Brigadeiro.setDescricao("leite condensado, manteiga, e Nescau.");
			Brigadeiro.setPreco(3.00);
			Brigadeiro.setTipo("Brigadeiro de chocolate");

			Doce BrigadeiroLeite = new Doce();
			BrigadeiroLeite.setCodBarras(666);
			BrigadeiroLeite.setNome("Brigadeiro");
			BrigadeiroLeite.setSabor("Doce de Leite");
			BrigadeiroLeite.setDescricao("leite condensado, manteiga, e Nescau.");
			BrigadeiroLeite.setPreco(3.00);
			BrigadeiroLeite.setTipo("Brigadeiro de doce de leite");

			Doce Acai = new Doce();
			Acai.setCodBarras(777);
			Acai.setNome("Açaí");
			Acai.setSabor("Sabor açaí");
			Acai.setDescricao(" fruta açaí e açucar.");
			Acai.setPreco(6.00);
			Acai.setTipo("Açaí");

			Doce BoloChoco = new Doce();
			BoloChoco.setCodBarras(888);
			BoloChoco.setNome("Bolo");
			BoloChoco.setSabor("Sabor chocolate");
			BoloChoco.setDescricao("ovos, manteiga, açucar, leite, chocolate em pó, farinha de trigo e fermento");
			BoloChoco.setPreco(6.00);
			BoloChoco.setTipo("Bolo de chocolate");

			Doce BoloCeno = new Doce();
			BoloCeno.setCodBarras(999);
			BoloCeno.setNome("Bolo");
			BoloCeno.setSabor("Sabor cenoura");
			BoloCeno.setDescricao("ovos, manteiga, açucar, leite, chocolate em pó, farinha de trigo e fermento");
			BoloCeno.setPreco(6.00);
			BoloCeno.setTipo("Bolo de cenoura");

			doces.add(Brigadeiro);
			doces.add(BrigadeiroLeite);
			doces.add(Acai);
			doces.add(BoloChoco);
			doces.add(BoloCeno);

			Salgado pastelFrango = new Salgado();
			pastelFrango.setCodBarras(111);
			pastelFrango.setNome("Pastel");
			pastelFrango.setSabor("Sabor Frango");
			pastelFrango.setDescricao(" frango, molho, farinha de trigo, óleo, sal, ovo e água.");
			pastelFrango.setPreco(6.00);
			pastelFrango.setTipo("pastel de frango");

			Salgado pastelCarne = new Salgado();
			pastelCarne.setCodBarras(222);
			pastelCarne.setNome("Pastel");
			pastelCarne.setSabor("Sabor Carne");
			pastelCarne.setDescricao(" carne, molho, farinha de trigo, óleo, sal, ovo e água.");
			pastelCarne.setPreco(6.00);
			pastelCarne.setTipo("pastel de carne");

			Salgado bolinhoCarne = new Salgado();
			bolinhoCarne.setCodBarras(333);
			bolinhoCarne.setNome("Bolinho");
			bolinhoCarne.setSabor("Sabor Carne");
			bolinhoCarne.setDescricao(" carne moída, cebola, ovo, farinha de trigo e alho");
			bolinhoCarne.setPreco(4.0);
			bolinhoCarne.setTipo("bolinho de carne");

			Salgado coxinhaFrango = new Salgado();
			coxinhaFrango.setCodBarras(444);
			coxinhaFrango.setNome("Coxinha");
			coxinhaFrango.setSabor("Sabor Frango");
			coxinhaFrango.setDescricao(
					"água, manteiga, sal, cubinhos de caldo de galinha esfarelados, farinha de trigo, azeite, alho, peito de frango, salsinha picadinha, ovo, leite e farinha de rosca");
			coxinhaFrango.setPreco(5.00);
			coxinhaFrango.setTipo("coxinha de frango");

			salgados.add(pastelFrango);
			salgados.add(pastelCarne);
			salgados.add(bolinhoCarne);
		}

		return instancia;
	}

	public boolean inserirDoce(Doce p) {
		if (p != null) {

			doces.add(p);

			return true;
		}
		return false;
	}

	public boolean inserirBebida(Bebida p) {
		if (p != null) {

			bebidas.add(p);

			return true;
		}
		return false;
	}

	public boolean inserirSalgado(Salgado p) {
		if (p != null) {
			salgados.add(p);

			return true;
		}
		return false;
	}

	public boolean alterarSalgado(Salgado salgadoNovosDados) {
		for (Produto salgadoDadosAntigos : salgados) {

			if (salgadoDadosAntigos.getId() == salgadoNovosDados.getId()) {
				salgadoDadosAntigos.setNome(salgadoNovosDados.getNome());
				return true;
			}
		}
		return false;
	}

	public boolean alterarBebida(Bebida bebidaNovosDados) {
		for (Produto bebidaDadosAntigos : bebidas) {

			if (bebidaDadosAntigos.getId() == bebidaNovosDados.getId()) {
				bebidaDadosAntigos.setNome(bebidaNovosDados.getNome());
				return true;
			}
		}
		return false;
	}

	public boolean alterarDoce(Doce doceNovosDados) {
		for (Produto doceDadosAntigos : doces) {

			if (doceDadosAntigos.getId() == doceNovosDados.getId()) {
				doceDadosAntigos.setNome(doceNovosDados.getNome());
				return true;
			}
		}
		return false;
	}

	public boolean excluirDoce(int CodBarras) {
		int index=0;
		for (Doce doceDadosAntigos : doces) {
			if (doceDadosAntigos.getId() == CodBarras) {
				doces.remove(index);
				return true;
			}
			index++;
		}

		return false;
	}
	
	public void listar() {
        for (Doce doce : doces) {
            System.out.println(doce.getId());

        }
    }

	public boolean excluirSalgado(Salgado salgadoNovosDados) {
		for (Salgado salgadoDadosAntigos : salgados) {
			if (salgadoDadosAntigos.getId() == salgadoNovosDados.getId()) {
				salgados.remove(salgadoDadosAntigos);
				return true;
			}
		}

		return false;
	}

	public boolean excluirBebida(Bebida bebidaNovosDados) {
		for (Bebida bebidaDadosAntigos : bebidas) {
			if (bebidaDadosAntigos.getId() == bebidaNovosDados.getId()) {
				bebidas.remove(bebidaDadosAntigos);
				return true;
			}
		}

		return false;
	}

	public ArrayList<Doce> listarDoces() {

		return doces;
	}

	public ArrayList<Bebida> listarBebidas() {

		return bebidas;
	}

	public ArrayList<Salgado> listarSalgados() {

		return salgados;
	}

}
