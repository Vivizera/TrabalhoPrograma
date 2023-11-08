package visao;

import java.util.ArrayList;
import java.util.Scanner;

import controle.ProdutoDAO;
import modelo.Bebida;
import modelo.Doce;
import modelo.Salgado;

public class MainSistema {

	private static ProdutoDAO dao = ProdutoDAO.getInstancia();
	private static ArrayList<Salgado> salgados = dao.listarSalgados();
	private static ArrayList<Doce> doces = dao.listarDoces();
	private static ArrayList<Bebida> bebidas = dao.listarBebidas();

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
						verPasteis();
					} else if (opcao == 2) {
						verBolinho();
					} else if (opcao == 3) {
						verCoxinha();
					} else if (opcao == 4) {
						opcao = 4;
						break;
					} else {
						System.out.println("Opção inválida. Tente novamente.");
					}
				}

			case 2:
				System.out.println("Você escolheu doces\n");

				while (opcao != 3) {
					System.out.println("Digite 1 para ver os brigadeiros");
					System.out.println("Digite 2 para ver o açaí");
					System.out.println("Digite 3 para ver o bolo");
					System.out.print("Escolha uma opção: ");
					opcao = Integer.valueOf(scanner.nextLine());

					if (opcao == 1) {
						verBrigadeiros();
					} else if (opcao == 2) {
						verAcai();
					} else if (opcao == 3) {
						verBolo();
					} else if (opcao == 4) {
						continuar = false;

					} else {
						System.out.println("Opção inválida. Tente novamente.");
					}
				}

			case 3:

				while (opcao != 3) {
					System.out.println("Digite 1 para ver os refrigerantes");
					System.out.println("Digite 2 para ver os cafes");
					System.out.println("Digite 3 para ver as águas");
					System.out.print("Escolha uma opção: ");
					opcao = Integer.valueOf(scanner.nextLine());

					if (opcao == 1) {
						verRefrigerantes();
					} else if (opcao == 2) {
						verCafes();
					} else if (opcao == 3) {
						verAguas();
					} else if (opcao == 4) {
						continuar = false;
					} else {
						System.out.println("Opção inválida. Tente novamente.");
					}
				}

			case 4:
				System.out.println("Fechando o sistema!");
				break;
			default:
				System.out.println("Opção inválida. Por favor, escolha uma opção válida.");

			}

		} while (escolha != 3);

		scanner.close();

	}

	// METODOS:

	private static void verAguas() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Você escolheu ver as águas\n");
		System.out.println("Digite 1 para água com gás");
		System.out.println("Digite 2 para água sem gás");
		System.out.println("Escolha uma opção: ");

		int opcao = Integer.valueOf(scanner.nextLine());

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

		System.out.println("Deseja mais alguma coisa?\n");
		System.out.println("Digite 1 para sim");
		System.out.println("DIgite 2 para não");

		int op = Integer.valueOf(scanner.nextLine());

		if (op == 1) {

		} else if (op == 2) {
			formaPagamento();
		}
	}

	private static void verCafes() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Você escolheu ver os cafes\n");
		System.out.println("Digite 1 para café com leite");
		System.out.println("Digite 2 para café puro");
		System.out.println("Escolha sua opção: ");

		int opcao = Integer.valueOf(scanner.nextLine());

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
		System.out.println("Deseja mais alguma coisa?\n");
		System.out.println("Digite 1 para sim");
		System.out.println("DIgite 2 para não");

		int op = Integer.valueOf(scanner.nextLine());

		if (op == 1) {

		} else if (op == 2) {
			formaPagamento();
		}
	}

	private static void verRefrigerantes() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Você escolheu ver os refrigerantes\n");
		System.out.println("Digite 1 para Guarana");
		System.out.println("Digite 2 para Coca-cola");

		int opcao = Integer.valueOf(scanner.nextLine());

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
		System.out.println("Deseja mais alguma coisa?\n");
		System.out.println("Digite 1 para sim");
		System.out.println("DIgite 2 para não");

		int op = Integer.valueOf(scanner.nextLine());

		if (op == 1) {

		} else if (op == 2) {
			formaPagamento();
		}
	}

	private static void verBolo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Você escolheu ver bolo\n");
		System.out.println("Digite 1 para Bolo de chocolate");
		System.out.println("Digite 2 para Bolo de cenoura");

		int opcao = Integer.valueOf(scanner.nextLine());

		if (opcao == 1) {
			for (Doce doce : doces) {
				if (doce.getTipo().equals("Bolo de chocolate")) {
					System.out.println("Bebida: " + doce.getNome());
					System.out.println("Sabor: " + doce.getSabor());
					System.out.println("Ingredientes: " + doce.getDescricao());
					System.out.println("Preço: R$" + doce.getPreco());
					// System.out.println("Tipo: " + bebida.getTipo());
				}
			}
		} else if (opcao == 2) {
			for (Doce doce : doces) {
				if (doce.getTipo().equals("Bolo de cenoura")) {
					System.out.println("Bebida: " + doce.getNome());
					System.out.println("Sabor: " + doce.getSabor());
					System.out.println("Ingredientes: " + doce.getDescricao());
					System.out.println("Preço: R$" + doce.getPreco());
					// System.out.println("Tipo: " + bebida.getTipo());
				}
			}
		}
		System.out.println("Deseja mais alguma coisa?\n");
		System.out.println("Digite 1 para sim");
		System.out.println("DIgite 2 para não");

		int op = Integer.valueOf(scanner.nextLine());

		if (op == 1) {

		} else if (op == 2) {
			formaPagamento();
		}
	}

	private static void verAcai() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Você escolheu ver o açaí\n");

		for (Doce doce : doces) {
			if (doce.getTipo().equals("Açaí")) {
				System.out.println("Doce: " + doce.getNome());
				System.out.println("Sabor: " + doce.getSabor());
				System.out.println("Ingredientes: " + doce.getDescricao());
				System.out.println("Preço: R$" + doce.getPreco());
				// System.out.println(doce.getTipo());

			}

		}
		System.out.println("Deseja mais alguma coisa?\n");
		System.out.println("Digite 1 para sim");
		System.out.println("DIgite 2 para não");

		int op = Integer.valueOf(scanner.nextLine());

		if (op == 1) {

		} else if (op == 2) {
			formaPagamento();
		}
	}

	private static void verBrigadeiros() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Você escolheu ver os brigadeiros\n");
		System.out.println("Digite 1 para brigadeiro de chocolate");
		System.out.println("Digite 2 para brigadeiro de doce de leite");

		int opcao = Integer.valueOf(scanner.nextLine());

		if (opcao == 1) {
			for (Doce doce : doces) {
				if (doce.getTipo().equals("Brigadeiro de chocolate")) {
					System.out.println("Doce: " + doce.getNome());
					System.out.println("Sabor: " + doce.getSabor());
					System.out.println("Ingredientes: " + doce.getDescricao());
					System.out.println("Preço: R$" + doce.getPreco());
					// System.out.println("Tipo: " + bebida.getTipo());
				}
			}
		} else if (opcao == 2) {
			for (Doce doce : doces) {
				if (doce.getTipo().equals("Brigadeiro de doce de leite")) {
					System.out.println("Doce: " + doce.getNome());
					System.out.println("Sabor: " + doce.getSabor());
					System.out.println("Ingredientes: " + doce.getDescricao());
					System.out.println("Preço: R$" + doce.getPreco());
					// System.out.println("Tipo: " + bebida.getTipo());
				}
			}
		}
		System.out.println("Deseja mais alguma coisa?\n");
		System.out.println("Digite 1 para sim");
		System.out.println("DIgite 2 para não");

		int op = Integer.valueOf(scanner.nextLine());

		if (op == 1) {

		} else if (op == 2) {
			formaPagamento();
		}
	}

	private static void verCoxinha() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Você escolheu ver a coxinha de frango\n");

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
		System.out.println("Digite 1 para sim");
		System.out.println("DIgite 2 para não");

		int op = Integer.valueOf(scanner.nextLine());

		if (op == 1) {

		} else if (op == 2) {
			formaPagamento();
		}
	}

	private static void verBolinho() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Você escolheu ver o bolhinho de carne\n");

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
		System.out.println("Digite 1 para sim");
		System.out.println("DIgite 2 para não");

		int op = Integer.valueOf(scanner.nextLine());

		if (op == 1) {

		} else if (op == 2) {
			formaPagamento();
		}
	}

	private static void verPasteis() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Você escolheu ver os pasteis\n");
		System.out.println("Digite 1 para Pastel de Frango");
		System.out.println("Digite 2 para Pastel de Carne");

		int opcao = Integer.valueOf(scanner.nextLine());

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
					System.out.println("Bebida: " + salgado.getNome());
					System.out.println("Sabor: " + salgado.getSabor());
					System.out.println("Ingredientes: " + salgado.getDescricao());
					System.out.println("Preço: R$" + salgado.getPreco());
					// System.out.println("Tipo: " + bebida.getTipo());
				}
			}
		}
		System.out.println("Deseja mais alguma coisa?\n");
		System.out.println("Digite 1 para sim");
		System.out.println("DIgite 2 para não");

		int op = Integer.valueOf(scanner.nextLine());

		if (op == 1) {

		} else if (op == 2) {
			formaPagamento();
		}
	}

	private static void formaPagamento() {
		// FORMA DE PAGAMENTO:
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lista de Compras:");

		double total = 0;

		System.out.println("Total: R$" + total);
		System.out.println("Volte sempre!!");

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