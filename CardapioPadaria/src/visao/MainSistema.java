package visao;

import java.util.ArrayList;
import java.util.Scanner;

import controle.ProdutoDAO;
import modelo.Bebida;
import modelo.Doce;
import modelo.Salgado;

public class MainSistema {

	private static ProdutoDAO dao = ProdutoDAO.getInstancia();

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String nomeDoProduto = null;
		double precoDoProduto = 0;
		double total = 0.0;
		int escolha;
		int opcao = 0;
		boolean continuar = true;

		// MENU PRINCIPAL:

		do {
			dao.listar();
			System.out.println("======== BEM-VINDO A NOSSA PADARIA! ========");
			System.out.println("Digite 1 para SALGADOS");
			System.out.println("Digite 2 para DOCE");
			System.out.println("Digite 3 para BEBIDA");
			System.out.println("Digite 4 para sair");
			System.out.print("Escolha uma opção: ");
			escolha = Integer.valueOf(scanner.nextLine());
			
			switch (escolha) {
			case 1:
				System.out.println("Você escolheu salgados\n");

				while (opcao != 4) {
					System.out.println("Digite 1 para ver os pasteis");
					System.out.println("Digite 2 para ver o bolhinho de carne");
					System.out.println("Digite 3 para ver a coxinha de frango");
					System.out.println("Digite 4 para voltar ao menu principal");
					System.out.print("Escolha uma opção: ");
					opcao = Integer.valueOf(scanner.nextLine());
					
					if (opcao == 1) {
						//verPasteis();
						total += 6.00;
					} else if (opcao == 2) {
						//verBolinho();
						total += 4.00;
					} else if (opcao == 3) {
						//verCoxinha();
						total += 5.00;
					} else if (opcao == 4) {
						opcao = 4;
						break;
					} else {
						System.out.println("Opção inválida. Tente novamente.");
					}
				}
				break;

			case 2:
				System.out.println("Você escolheu doces\n");

				while (opcao != 3) {
					System.out.println("Digite 1 para ver os brigadeiros");
					System.out.println("Digite 2 para ver o açaí");
					System.out.println("Digite 3 para ver o bolo");
					System.out.print("Escolha uma opção: ");
					opcao = Integer.valueOf(scanner.nextLine());
					
					if (opcao == 1) {
						total += 3.00;
						total =verBrigadeiros(total);
						
					} else if (opcao == 2) {
						total += 6.00;
						total =verAcai(total);
					} else if (opcao == 3) {
						total += 6.00;
						total =verBolo(total);
					} else if (opcao == 4) {
						continuar = false;

					} else {
						System.out.println("Opção inválida. Tente novamente.");
					}
				}
				break;

			case 3:

				while (opcao != 3) {
					System.out.println("Digite 1 para ver os refrigerantes");
					System.out.println("Digite 2 para ver os cafes");
					System.out.println("Digite 3 para ver as águas");
					System.out.print("Escolha uma opção: ");
					opcao = Integer.valueOf(scanner.nextLine());

					if (opcao == 1) {
						//verRefrigerantes();
						total += 5.00;
					} else if (opcao == 2) {
						//verCafes();
						total += 3.00;
					} else if (opcao == 3) {
						//verAguas();
						total += 2.00;
					} else if (opcao == 4) {
						continuar = false;
					} else {
						System.out.println("Opção inválida. Tente novamente.");
					}
				}
				break;
				
			case 4:
				formaPagamento(total);
				System.out.println("Fechando o sistema!");
				
				break;
				
			default:
				System.out.println("Opção inválida. Por favor, escolha uma opção válida.");

			}
			
		} 
		
		while (escolha != 4);

		scanner.close();

	}

	// METODOS:
/*
	private static void verAguas() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Você escolheu ver as águas\n");
		System.out.println("Digite 1 para água com gás");
		System.out.println("Digite 2 para água sem gás");
		System.out.println("Escolha uma opção: ");

		int opcao = Integer.valueOf(scanner.nextLine());

		ArrayList<Bebida> bebidas = dao.listarBebidas();
		if (opcao == 1) {

			for (Bebida bebida : bebidas) {
				if (bebida.getTipo().equals("Agua com gás")) {
					System.out.println("Bebida: " + bebida.getNome());
					System.out.println("Sabor: " + bebida.getSabor());
					System.out.println("Ingredientes: " + bebida.getDescricao());
					System.out.println("Preço: R$" + bebida.getPreco());
					// System.out.println("Tipo: " + bebida.getTipo());
				}
			}
		} else if (opcao == 2) {
			for (Bebida bebida : bebidas) {
				if (bebida.getTipo().equals("Agua sem gás")) {
					System.out.println("Bebida: " + bebida.getNome());
					System.out.println("Sabor: " + bebida.getSabor());
					System.out.println("Ingredientes: " + bebida.getDescricao());
					System.out.println("Preço: R$" + bebida.getPreco());
					// System.out.println("Tipo: " + bebida.getTipo());
				}
			}
		}

		// TROCAR BEBIDAS
		System.out.println("Deseja mais alguma coisa?\n");
		System.out.println("Digite 1 para para inserir algum novo item");
		System.out.println("Digite 2 para delertar algum item selecinado");
		System.out.println("Digite 3 para alteara algum item selecinado");
		System.out.println("Digite 4 para ir para o pagamento");

		int op = Integer.valueOf(scanner.nextLine());

		if (op == 1) {
			ProdutoDAO dao = ProdutoDAO.getInstancia();
			Bebida b = new Bebida();
			// pedir para ele cadastrar uma bebida nova
			
			dao.inserirBebida(b);

		} else if (op == 2) {
			ProdutoDAO dao = ProdutoDAO.getInstancia();
			dao.excluirBebida(null);

		} else if (op == 3) {
			ProdutoDAO dao = ProdutoDAO.getInstancia();
			dao.alterarBebida(null);
		}

		else if (op == 4) {
			formaPagamento();
		} else {
			System.out.println("Opção invalida");
		}
	}

	private static void verCafes() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Você escolheu ver os cafes\n");
		System.out.println("Digite 1 para café com leite");
		System.out.println("Digite 2 para café puro");
		System.out.println("Escolha sua opção: ");

		int opcao = Integer.valueOf(scanner.nextLine());
		ArrayList<Bebida> bebidas = dao.listarBebidas();
		if (opcao == 1) {
			for (Bebida bebida : bebidas) {
				if (bebida.getTipo().equals("Café com leite")) {
					System.out.println("Bebida: " + bebida.getNome());
					System.out.println("Sabor: " + bebida.getSabor());
					System.out.println("Ingredientes: " + bebida.getDescricao());
					System.out.println("Preço: R$" + bebida.getPreco());
					// System.out.println("Tipo: " + bebida.getTipo());
				}
			}
		} else if (opcao == 2) {
			for (Bebida bebida : bebidas) {
				if (bebida.getTipo().equals("Café sem leite")) {
					System.out.println("Bebida: " + bebida.getNome());
					System.out.println("Sabor: " + bebida.getSabor());
					System.out.println("Ingredientes: " + bebida.getDescricao());
					System.out.println("Preço: R$" + bebida.getPreco());
					// System.out.println("Tipo: " + bebida.getTipo());
				}
			}
		}
		// TROCAR BEBIDAS
		System.out.println("Deseja mais alguma coisa?\n");
		System.out.println("Digite 1 para para inserir algum novo item");
		System.out.println("Digite 2 para deletar algum item selecinado");
		System.out.println("Digite 3 para altearar algum item selecinado");
		System.out.println("Digite 4 para ir para o pagamento");

		int op = Integer.valueOf(scanner.nextLine());

		if (op == 1) {
			ProdutoDAO dao = ProdutoDAO.getInstancia();
			dao.inserirBebida(null);

		} else if (op == 2) {
			ProdutoDAO dao = ProdutoDAO.getInstancia();
			dao.excluirBebida(null);

		} else if (op == 3) {
			ProdutoDAO dao = ProdutoDAO.getInstancia();
			dao.alterarBebida(null);
		}

		else if (op == 4) {
			formaPagamento();
		} else {
			System.out.println("Opção invalida");
		}
	}

	private static void verRefrigerantes() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Você escolheu ver os refrigerantes\n");
		System.out.println("Digite 1 para Guarana");
		System.out.println("Digite 2 para Coca-cola");

		int opcao = Integer.valueOf(scanner.nextLine());
		ArrayList<Bebida> bebidas = dao.listarBebidas();
		if (opcao == 1) {
			for (Bebida bebida : bebidas) {
				if (bebida.getTipo().equals("Guarana")) {
					System.out.println("Bebida: " + bebida.getNome());
					System.out.println("Sabor: " + bebida.getSabor());
					System.out.println("Ingredientes: " + bebida.getDescricao());
					System.out.println("Preço: R$" + bebida.getPreco());
					// System.out.println("Tipo: " + bebida.getTipo());
				}
			}
		} else if (opcao == 2) {
			for (Bebida bebida : bebidas) {
				if (bebida.getTipo().equals("CocaCola")) {
					System.out.println("Bebida: " + bebida.getNome());
					System.out.println("Sabor: " + bebida.getSabor());
					System.out.println("Ingredientes: " + bebida.getDescricao());
					System.out.println("Preço: R$" + bebida.getPreco());
					// System.out.println("Tipo: " + bebida.getTipo());
				}
			}
		}
		// TROCAR BEBIDAS
				System.out.println("Deseja mais alguma coisa?\n");
				System.out.println("Digite 1 para para inserir algum novo item");
				System.out.println("Digite 2 para deletar algum item selecinado");
				System.out.println("Digite 3 para altearar algum item selecinado");
				System.out.println("Digite 4 para ir para o pagamento");

				int op = Integer.valueOf(scanner.nextLine());

				if (op == 1) {
					ProdutoDAO dao = ProdutoDAO.getInstancia();
					dao.inserirBebida(null);

				} else if (op == 2) {
					ProdutoDAO dao = ProdutoDAO.getInstancia();
					dao.excluirBebida(null);

				} else if (op == 3) {
					ProdutoDAO dao = ProdutoDAO.getInstancia();
					dao.alterarBebida(null);
				}

				else if (op == 4) {
					formaPagamento();
				} else {
					System.out.println("Opção invalida");
				}
	}
*/
	
	private static Double verBolo(Double total) {
		int alterar=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Você escolheu ver bolo\n");
		System.out.println("Digite 1 para Bolo de chocolate");
		System.out.println("Digite 2 para Bolo de cenoura");

		int opcao = Integer.valueOf(scanner.nextLine());
		ArrayList<Doce> doces = dao.listarDoces();
		if (opcao == 1) {
			
			Doce BoloChoco = new Doce();
			BoloChoco.setCodBarras(888);
			BoloChoco.setNome("Bolo");
			BoloChoco.setSabor("Sabor chocolate");
			BoloChoco.setDescricao("ovos, manteiga, açucar, leite, chocolate em pó, farinha de trigo e fermento");
			BoloChoco.setPreco(6.00);
			BoloChoco.setTipo("Bolo de chocolate");
			alterar = 888;
		    dao.inserirDoce(BoloChoco);
		    
		   
		} else if (opcao == 2) {
			
			Doce BoloCeno = new Doce();
			BoloCeno.setCodBarras(999);
			BoloCeno.setNome("Bolo");
			BoloCeno.setSabor("Sabor cenoura");
			BoloCeno.setDescricao("ovos, manteiga, açucar, leite, chocolate em pó, farinha de trigo e fermento");
			BoloCeno.setPreco(6.00);
			BoloCeno.setTipo("Bolo de cenoura");
			alterar = 999;
		    dao.inserirDoce(BoloCeno);
		}
		// TROCAR DOCES
				dao.listar();
				System.out.println("Deseja mais alguma coisa?\n");
				System.out.println("Digite 1 para para inserir algum novo item");
				System.out.println("Digite 2 para deletar algum item selecinado");
				System.out.println("Digite 3 para altearar algum item selecinado");
				System.out.println("Digite 4 para ir para o pagamento");
               
				int op = Integer.valueOf(scanner.nextLine());
				if (op == 1) {
					ProdutoDAO dao = ProdutoDAO.getInstancia();
					//dao.inserirDoce(null);
					

				} else if (op == 2) {
					ProdutoDAO dao = ProdutoDAO.getInstancia();
					System.out.println("Digite o CodBarras do produto: ");
					int CodBarras= Integer.valueOf(scanner.nextLine());
					dao.excluirDoce(CodBarras);
					total -= 6.00;
				} else if (op == 3) {
					ProdutoDAO dao = ProdutoDAO.getInstancia();
					dao.alterarDoce(alterar);
					total -= 6.00;
					
					
				}

				else if (op == 4) {
					formaPagamento(total);
				} else {
					System.out.println("Opção invalida");
				}
				return total;
	}

	private static double verAcai(Double total) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Você escolheu ver o açaí\n");
		ArrayList<Doce> doces = dao.listarDoces();
		
			Doce Acai = new Doce();
			Acai.setCodBarras(777);
			Acai.setNome("Açaí");
			Acai.setSabor("Sabor açaí");
			Acai.setDescricao(" fruta açaí e açucar.");
			Acai.setPreco(6.00);
			Acai.setTipo("Açaí");
			
			dao.inserirDoce(Acai);

		
		
		// TROCAR DOCES
		dao.listar();
		System.out.println("Deseja mais alguma coisa?\n");
		System.out.println("Digite 1 para para inserir algum novo item");
		System.out.println("Digite 2 para deletar algum item selecinado");
		System.out.println("Digite 3 para altearar algum item selecinado");
		System.out.println("Digite 4 para ir para o pagamento");
		
		int op = Integer.valueOf(scanner.nextLine());

		if (op == 1) {
			ProdutoDAO dao = ProdutoDAO.getInstancia();
			dao.inserirDoce(null);

		} else if (op == 2) {
			ProdutoDAO dao = ProdutoDAO.getInstancia();
			System.out.println("Digite o CodBarras do produto: ");
			int CodBarras= Integer.valueOf(scanner.nextLine());
			dao.excluirDoce(CodBarras);
			total -= 6.00;

		} else if (op == 3) {
			ProdutoDAO dao = ProdutoDAO.getInstancia();
			dao.alterarDoce(1);
		}

		else if (op == 4) {
			formaPagamento(total);
		} else {
			System.out.println("Opção invalida");
		}
		return total;
	}

	private static double verBrigadeiros(Double total) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Você escolheu ver os brigadeiros\n");
		System.out.println("Digite 1 para brigadeiro de chocolate");
		System.out.println("Digite 2 para brigadeiro de doce de leite");

		int opcao = Integer.valueOf(scanner.nextLine());
		ArrayList<Doce> doces = dao.listarDoces();
		if (opcao == 1) {
			
			Doce Brigadeiro = new Doce();
			Brigadeiro.setCodBarras(555);
			Brigadeiro.setNome("Brigadeiro");
			Brigadeiro.setSabor("Sabor Chocolate");
			Brigadeiro.setDescricao("leite condensado, manteiga, e Nescau.");
			Brigadeiro.setPreco(3.00);
			Brigadeiro.setTipo("Brigadeiro de chocolate");
			
			dao.inserirDoce(Brigadeiro);
			
		} else if (opcao == 2) {
			Doce BrigadeiroLeite = new Doce();
			BrigadeiroLeite.setCodBarras(666);
			BrigadeiroLeite.setNome("Brigadeiro");
			BrigadeiroLeite.setSabor("Doce de Leite");
			BrigadeiroLeite.setDescricao("leite condensado, manteiga, e Nescau.");
			BrigadeiroLeite.setPreco(3.00);
			BrigadeiroLeite.setTipo("Brigadeiro de doce de leite");
			
			dao.inserirDoce(BrigadeiroLeite);
		}
		dao.listar();
		System.out.println("Deseja mais alguma coisa?\n");
		System.out.println("Digite 1 para para inserir algum novo item");
		System.out.println("Digite 2 para deletar algum item selecinado");
		System.out.println("Digite 3 para altearar algum item selecinado");
		System.out.println("Digite 4 para ir para o pagamento");
        
		//DOCES TROCAR
		int op = Integer.valueOf(scanner.nextLine());

		if (op == 1) {
			ProdutoDAO dao = ProdutoDAO.getInstancia();
			dao.inserirDoce(null);

		} else if (op == 2) {
			ProdutoDAO dao = ProdutoDAO.getInstancia();
			System.out.println("Digite o CodBarras do produto: ");
			int CodBarras= Integer.valueOf(scanner.nextLine());
			dao.excluirDoce(CodBarras);
			total -= 3.00;
			
		} else if (op == 3) {
			ProdutoDAO dao = ProdutoDAO.getInstancia();
			dao.alterarDoce(1);
		}

		else if (op == 4) {
			formaPagamento(total);
		} else {
			System.out.println("Opção invalida");
		}
		return total;
	}

	/*
	private static void verCoxinha() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Você escolheu ver a coxinha de frango\n");
		ArrayList<Salgado> salgados = dao.listarSalgados();
		for (Salgado salgado : salgados) {
			if (salgado.getTipo().equals("Coxinha de frango")) {
				System.out.println("Salgado: " + salgado.getNome());
				System.out.println("Sabor: " + salgado.getSabor());
				System.out.println("Ingrediente: " + salgado.getDescricao());
				System.out.println("Preço: R$ " + salgado.getPreco());
				// System.out.println("Salgado: " + salgado.getTipo());

			}
		}
		System.out.println("Deseja mais alguma coisa?\n");
		System.out.println("Digite 1 para para inserir algum novo item");
		System.out.println("Digite 2 para deletar algum item selecinado");
		System.out.println("Digite 3 para altearar algum item selecinado");
		System.out.println("Digite 4 para ir para o pagamento");

		int op = Integer.valueOf(scanner.nextLine());

		if (op == 1) {
			ProdutoDAO dao = ProdutoDAO.getInstancia();
			dao.inserirSalgado(null);

		} else if (op == 2) {
			ProdutoDAO dao = ProdutoDAO.getInstancia();
			dao.excluirSalgado(null);

		} else if (op == 3) {
			ProdutoDAO dao = ProdutoDAO.getInstancia();
			dao.alterarSalgado(null);
		}

		else if (op == 4) {
			formaPagamento();
		} else {
			System.out.println("Opção invalida");
		}
	}

	private static void verBolinho() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Você escolheu ver o bolhinho de carne\n");
		ArrayList<Salgado> salgados = dao.listarSalgados();
		for (Salgado salgado : salgados) {
			if (salgado.getTipo().equals("bolinho de carne")) {
				System.out.println("Salgado: " + salgado.getNome());
				System.out.println("Sabor: " + salgado.getSabor());
				System.out.println("Ingredientes: " + salgado.getDescricao());
				System.out.println("Preço: R$" + salgado.getPreco());
				// System.out.println(salgado.getTipo());

			}

		}
		System.out.println("Deseja mais alguma coisa?\n");
		System.out.println("Digite 1 para para inserir algum novo item");
		System.out.println("Digite 2 para deletar algum item selecinado");
		System.out.println("Digite 3 para altearar algum item selecinado");
		System.out.println("Digite 4 para ir para o pagamento");

		int op = Integer.valueOf(scanner.nextLine());

		if (op == 1) {
			ProdutoDAO dao = ProdutoDAO.getInstancia();
			dao.inserirSalgado(null);

		} else if (op == 2) {
			ProdutoDAO dao = ProdutoDAO.getInstancia();
			dao.excluirSalgado(null);

		} else if (op == 3) {
			ProdutoDAO dao = ProdutoDAO.getInstancia();
			dao.alterarSalgado(null);
		}

		else if (op == 4) {
			formaPagamento();
		} else {
			System.out.println("Opção invalida");
		}
	}

	private static void verPasteis() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Você escolheu ver os pasteis\n");
		System.out.println("Digite 1 para Pastel de Frango");
		System.out.println("Digite 2 para Pastel de Carne");

		int opcao = Integer.valueOf(scanner.nextLine());
		ArrayList<Salgado> salgados = dao.listarSalgados();
		if (opcao == 1) {
			for (Salgado salgado : salgados) {
				if (salgado.getTipo().equals("pastel de frango")) {
					System.out.println("Bebida: " + salgado.getNome());
					System.out.println("Sabor: " + salgado.getSabor());
					System.out.println("Ingredientes: " + salgado.getDescricao());
					System.out.println("Preço: R$" + salgado.getPreco());
					// System.out.println("Tipo: " + bebida.getTipo());
				}
			}
		} else if (opcao == 2) {
			for (Salgado salgado : salgados) {
				if (salgado.getTipo().equals("pastel de carne")) {
					System.out.println("salgado: " + salgado.getNome());
					System.out.println("Sabor: " + salgado.getSabor());
					System.out.println("Ingredientes: " + salgado.getDescricao());
					System.out.println("Preço: R$" + salgado.getPreco());
					// System.out.println("Tipo: " + bebida.getTipo());
				}
			}
		}
		System.out.println("Deseja mais alguma coisa?\n");
		System.out.println("Digite 1 para para inserir algum novo item");
		System.out.println("Digite 2 para deletar algum item selecinado");
		System.out.println("Digite 3 para altearar algum item selecinado");
		System.out.println("Digite 4 para ir para o pagamento");

		int op = Integer.valueOf(scanner.nextLine());

		if (op == 1) {
			ProdutoDAO dao = ProdutoDAO.getInstancia();
			dao.inserirSalgado(null);

		} else if (op == 2) {
			ProdutoDAO dao = ProdutoDAO.getInstancia();
			dao.excluirSalgado(null);

		} else if (op == 3) {
			ProdutoDAO dao = ProdutoDAO.getInstancia();
			dao.alterarSalgado(null);
		}

		else if (op == 4) {
			formaPagamento();
		} else {
			System.out.println("Opção invalida");
		}
	}

	*/
	
	private static void formaPagamento(Double total) {
		// FORMA DE PAGAMENTO:
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lista de Compras:");
		
		dao.listar();

		System.out.println("Volte sempre!!");
		System.out.println("Compra finalizada. Total a pagar;R$" + total);
		System.out.println("Escolha a forma de pagamento\n: ");
		System.out.println("Digite 1 para cartão de crédito");
		System.out.println("Digite 2 para cartão de débito");
		System.out.println("Digite 3 para pix");
		System.out.println("Digite 4 para dinheiro");

		int opcao = Integer.valueOf(scanner.nextLine());

		if (opcao == 1) {
			System.out.println("Pagamento concluido!");
		} else if (opcao == 2) {
			System.out.println("Pagamento concluido!");
		} else if (opcao == 3) {
			System.out.println("Pagamento concluido!");
		} else if (opcao == 4) {
			System.out.println("Pagamento concluido!");
		}
		

	}

}