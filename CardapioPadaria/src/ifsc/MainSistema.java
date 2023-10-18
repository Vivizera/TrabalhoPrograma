package ifsc;

import java.util.ArrayList;
import java.util.Scanner;

public class MainSistema {

	private static ArrayList<Salgado> salgados = new ArrayList<>();
	private static ArrayList<Doce> doces = new ArrayList<>();
	private static ArrayList<Bebida> bebidas = new ArrayList<>();

	private static ArrayList<Produto> produtosComprados = new ArrayList<>();

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double total = 0.0;
		int escolha;
		int opcao = 0;
		boolean continuar = true;

		criaEstoque();

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
				System.out.println("Você escolheu salgados");

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
						voltarMenu();
					} else if (opcao == 4) {
						continuar = false;
					} else {
						System.out.println("Opção inválida. Tente novamente.");
					}
				}
				while (continuar)
					;
				continuar = true;
				break;

			case 2:
				System.out.println("Você escolheu doces");

				while (opcao != 3) {
					System.out.println("Digite 1 para ver os brigadeiros");
					System.out.println("Digite 2 para ver o açaí");
					System.out.println("Digite 3 para ver o bolo de chocolate");
					System.out.print("Escolha uma opção: ");
					opcao = Integer.valueOf(scanner.nextLine());

					if (opcao == 1) {
						System.out.println("Você escolheu ver os brigadeiros");

						for (Doce doce : doces) {
							if (doce.getTipo().equals("Brigadeiro")) {
								System.out.println(doce.getNome());
								// todos os Brigadeiro aqui

								opcao = Integer.valueOf(scanner.nextLine());

								for (Doce Brigadeiro : doces) {
									System.out.println(Brigadeiro.getNome());
									System.out.println(Brigadeiro.getSabor());
									System.out.println(Brigadeiro.getDescricao());
									System.out.println(Brigadeiro.getPreco());
									System.out.println(Brigadeiro.getTipo());
								}

							}
						}

					} else if (opcao == 2) {
						System.out.println("Você escolheu ver o açaí");

						for (Doce doce : doces) {
							if (doce.getTipo().equals("Açaí")) {
								System.out.println(doce.getNome());
								// todos os Açaí aqui

								System.out.println(doce.getNome());
								System.out.println(doce.getSabor());
								System.out.println(doce.getDescricao());
								System.out.println(doce.getPreco());
								System.out.println(doce.getTipo());

							}

//							opcao = Integer.valueOf(scanner.nextLine());
						}

					} else if (opcao == 3) {
						System.out.println("Você escolheu ver o bolo de chocolate");

						for (Doce doce : doces) {
							if (doce.getTipo().equals("Bolo de chocolate")) {
								System.out.println(doce.getNome());
								// todos os Bolo de chocolate aqui

								opcao = Integer.valueOf(scanner.nextLine());

								for (Doce Bolo : doces) {
									System.out.println(Bolo.getNome());
									System.out.println(Bolo.getSabor());
									System.out.println(Bolo.getDescricao());
									System.out.println(Bolo.getPreco());
									System.out.println(Bolo.getTipo());

								}
							}
						}
					} else if (opcao == 4) {
						continuar = false;
					} else {
						System.out.println("Opção inválida. Tente novamente.");
					}
				}
				while (continuar)
					;
				continuar = true;
				break;

			case 3:

				while (opcao != 3) {
					System.out.println("Digite 1 para ver os refrigerantes");
					System.out.println("Digite 2 para ver os cafes");
					System.out.println("Digite 3 para ver as águas");
					System.out.print("Escolha uma opção: ");
					opcao = Integer.valueOf(scanner.nextLine());

					if (opcao == 1) {
						System.out.println("Você escolheu ver os refrigerantes");

						for (Bebida bebida : bebidas) {
							if (bebida.getTipo().equals("Refrigerante")) {
								System.out.println(bebida.getNome());
								// todos os Refrigerante aqui

								System.out.println("Digite 1 para Guarana");
								System.out.println("Digite 2 para Coca-cola");
								opcao = Integer.valueOf(scanner.nextLine());

								if (opcao == 1) {
									for (Bebida Guarana : bebidas) {
										System.out.println(Guarana.getNome());
										System.out.println(Guarana.getSabor());
										System.out.println(Guarana.getDescricao());
										System.out.println(Guarana.getPreco());
										System.out.println(Guarana.getTipo());

									}
								} else {
									for (Bebida CocaCola : bebidas) {
										System.out.println(CocaCola.getNome());
										System.out.println(CocaCola.getSabor());
										System.out.println(CocaCola.getDescricao());
										System.out.println(CocaCola.getPreco());
										System.out.println(CocaCola.getTipo());
									}
								}
							}
						}
					} else if (opcao == 2) {
						System.out.println("Você escolheu ver os cafes");

						for (Bebida bebida : bebidas) {
							if (bebida.getTipo().equals("Cafes")) {
								System.out.println(bebida.getNome());
								// todos os Cafes aqui

								System.out.println("Digite 1 para café com leite");
								System.out.println("Digite 2 para café puro");
								opcao = Integer.valueOf(scanner.nextLine());

								if (opcao == 1) {
									for (Bebida CafeLeite : bebidas) {
										System.out.println(CafeLeite.getNome());
										System.out.println(CafeLeite.getSabor());
										System.out.println(CafeLeite.getDescricao());
										System.out.println(CafeLeite.getPreco());
										System.out.println(CafeLeite.getTipo());

									}
								} else {
									for (Bebida CafePuro : bebidas) {
										System.out.println(CafePuro.getNome());
										System.out.println(CafePuro.getSabor());
										System.out.println(CafePuro.getDescricao());
										System.out.println(CafePuro.getPreco());
										System.out.println(CafePuro.getTipo());
									}
								}
							}
						}
					} else if (opcao == 3) {
						System.out.println("Você escolheu ver as águas");

						for (Bebida bebida : bebidas) {
							if (bebida.getTipo().equals("Aguas")) {
								System.out.println(bebida.getNome());
								// todos os Aguas aqui

								System.out.println("Digite 1 para água com gás");
								System.out.println("Digite 2 para água sem gás");
								opcao = Integer.valueOf(scanner.nextLine());

								if (opcao == 1) {
									for (Bebida AguaGas : bebidas) {
										System.out.println(AguaGas.getNome());
										System.out.println(AguaGas.getSabor());
										System.out.println(AguaGas.getDescricao());
										System.out.println(AguaGas.getPreco());
										System.out.println(AguaGas.getTipo());

									}
								} else {
									for (Bebida AguaSem : bebidas) {
										System.out.println(AguaSem.getNome());
										System.out.println(AguaSem.getSabor());
										System.out.println(AguaSem.getDescricao());
										System.out.println(AguaSem.getPreco());
										System.out.println(AguaSem.getTipo());
									}
								}

							}
						}
					} else if (opcao == 4) {
						continuar = false;
					} else {
						System.out.println("Opção inválida. Tente novamente.");
					}
				}
				while (continuar)
					;
				continuar = true;
				break;
			case 4:
				System.out.println("Fechando o sistema!");
				break;
			default:
				System.out.println("Opção inválida. Por favor, escolha uma opção válida.");

			}

		} while (escolha != 4);

		scanner.close();

		System.out.println("Escolha a forma de pagamento: ");
		System.out.println("Digite 1 para cartão de crédito");
		System.out.println("Digite 2 para cartão de débito");
		System.out.println("Digite 3 para pix");
		System.out.println("Digite 4 para dinheiro");

		opcao = Integer.valueOf(scanner.nextLine());

		if (opcao == 1) {
			System.out.println("Pagamento concluido!");
		} else if (opcao == 2) {
			System.out.println("Pagamento concluido!");
		} else if (opcao == 3) {
			System.out.println("Pagamento concluido!");
		} else if (opcao == 4) {
			System.out.println("Pagamento concluido!");
		}

		System.out.println("Volte sempre!!");
	}

	private static void voltarMenu() {
		// TODO Auto-generated method stub
		
	}

	private static void verCoxinha() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Você escolheu ver a coxinha de frango");

		for (Salgado salgado : salgados) {
			if (salgado.getTipo().equals("Coxinha de frango")) {
				System.out.println(salgado.getNome());
				// todos os coxinha aqui

				int opcao = Integer.valueOf(scanner.nextLine());

				for (Salgado coxinhaFrango : salgados) {
					System.out.println(coxinhaFrango.getNome());
					System.out.println(coxinhaFrango.getSabor());
					System.out.println(coxinhaFrango.getDescricao());
					System.out.println(coxinhaFrango.getPreco());
					System.out.println(coxinhaFrango.getTipo());

				}
			}
		}
	}

	private static void verBolinho() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Você escolheu ver o bolhinho de carne");
		for (Salgado salgado : salgados) {
			if (salgado.getTipo().equals("bolinho de carne")) {
				System.out.println(salgado.getNome());
				// todos os bolinho aqui

				int opcao = Integer.valueOf(scanner.nextLine());

				for (Salgado bolinhoCarne : salgados) {
					System.out.println(bolinhoCarne.getNome());
					System.out.println(bolinhoCarne.getSabor());
					System.out.println(bolinhoCarne.getDescricao());
					System.out.println(bolinhoCarne.getPreco());
					System.out.println(bolinhoCarne.getTipo());

				}

			}
		}

	}

	private static void verPasteis() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Você escolheu ver os pasteis");

		for (Salgado salgado : salgados) {
			if (salgado.getTipo().equals("pastel")) {
				System.out.println(salgado.getNome());
				// todos os pastelzinho aqui

				System.out.println("Digite 1 para Pastel de Frango");
				System.out.println("Digite 2 para Pastel de Carne");
				int opcao = Integer.valueOf(scanner.nextLine());

				if (opcao == 1) {
					for (Salgado pastelFrango : salgados) {
						System.out.println(pastelFrango.getNome());
						System.out.println(pastelFrango.getSabor());
						System.out.println(pastelFrango.getDescricao());
						System.out.println(pastelFrango.getPreco());
						System.out.println(pastelFrango.getTipo());

					}
				} else {
					for (Salgado pastelCarne : salgados) {
						System.out.println(pastelCarne.getNome());
						System.out.println(pastelCarne.getSabor());
						System.out.println(pastelCarne.getDescricao());
						System.out.println(pastelCarne.getPreco());
						System.out.println(pastelCarne.getTipo());
					}
				}
			}
		}

	}

	public static void criaEstoque() {
		Salgado pastelFrango = new Salgado();
		pastelFrango.setNome("Pastel");
		pastelFrango.setSabor("Sabor Frango");
		pastelFrango.setDescricao("Ingredientes: frango, molho, farinha de trigo, óleo, sal, ovo e água.");
		pastelFrango.setPreco(6.00);
		pastelFrango.setTipo("pastel de frango");

		Salgado pastelCarne = new Salgado();
		pastelCarne.setNome("Pastel");
		pastelCarne.setSabor("Sabor Carne");
		pastelCarne.setDescricao("Ingredientes: carne, molho, farinha de trigo, óleo, sal, ovo e água.");
		pastelCarne.setPreco(6.00);
		pastelCarne.setTipo("pastel de carne");

		Salgado bolinhoCarne = new Salgado();
		bolinhoCarne.setNome("Bolinho");
		bolinhoCarne.setSabor("Sabor Carne");
		bolinhoCarne.setDescricao("Ingredientes: carne moída, cebola, ovo, farinha de trigo e alho");
		bolinhoCarne.setPreco(4.0);
		bolinhoCarne.setTipo("bolinho de carne");

		Salgado coxinhaFrango = new Salgado();
		coxinhaFrango.setNome("Coxinha");
		coxinhaFrango.setSabor("Sabor Frango");
		coxinhaFrango.setDescricao(
				"Ingredientes: água, manteiga, sal, cubinhos de caldo de galinha esfarelados, farinha de trigo, azeite, alho, peito de frango, salsinha picadinha, ovo, leite e farinha de rosca");
		coxinhaFrango.setPreco(5.00);
		coxinhaFrango.setTipo("coxinha de frango");

		salgados.add(pastelFrango);
		salgados.add(pastelCarne);
		salgados.add(bolinhoCarne);

		Doce Brigadeiro = new Doce();
		Brigadeiro.setNome("Brigadeiro");
		Brigadeiro.setSabor("Sabor Chocolate");
		Brigadeiro.setDescricao("Ingredientes: leite condensado, manteiga, e Nescau.");
		Brigadeiro.setPreco(3.00);
		Brigadeiro.setTipo("Brigadeiro de chocolate");

		Doce Acai = new Doce();
		Acai.setNome("Açaí");
		Acai.setSabor("Sabor açaí");
		Acai.setDescricao("Ingredientes: fruta açaí e açucar.");
		Acai.setPreco(6.00);
		Acai.setTipo("Açaí");

		Doce Bolo = new Doce();
		Bolo.setNome("Bolo");
		Bolo.setSabor("Sabor chocolate");
		Bolo.setDescricao("Ingredientes: ovos, manteiga, açucar, leite, chocolate em pó, farinha de trigo e fermento");
		Bolo.setPreco(6.00);
		Bolo.setTipo("Bolo de chocolate");

		doces.add(Brigadeiro);
		doces.add(Acai);
		doces.add(Bolo);

		Bebida Guarana = new Bebida();
		Guarana.setNome("Refrigerantes");
		Guarana.setSabor("Sabor Guarana");
		Guarana.setPreco(5.00);
		Guarana.setTipo("Guarana");

		Bebida CocaCola = new Bebida();
		CocaCola.setNome("Refrigerantes");
		CocaCola.setSabor("Sabor Coca-Cola");
		CocaCola.setPreco(5.00);
		CocaCola.setTipo("CocaCola");

		Bebida CafeLeite = new Bebida();
		CafeLeite.setNome("Cafe");
		CafeLeite.setSabor("Com leite");
		CafeLeite.setDescricao("Ingredientes: leite e cafe.");
		CafeLeite.setPreco(3.00);
		CafeLeite.setTipo("Café com leite");

		Bebida CafePuro = new Bebida();
		CafePuro.setNome("Cafe");
		CafePuro.setSabor("Puro");
		CafePuro.setDescricao("Ingredientes: cafe.");
		CafePuro.setPreco(3.00);
		CafePuro.setTipo("Café sem leite");

		Bebida AguaGas = new Bebida();
		AguaGas.setNome("Água");
		AguaGas.setSabor("Com gas");
		AguaGas.setDescricao("Ingredientes: água e gas.");
		AguaGas.setPreco(2.00);
		AguaGas.setTipo("Agua com gás");

		Bebida AguaSem = new Bebida();
		AguaSem.setNome("Água");
		AguaSem.setSabor("Sem gas");
		AguaSem.setDescricao("Ingredientes: água.");
		AguaSem.setPreco(2.00);
		AguaSem.setTipo("Agua sem gás");

		bebidas.add(Guarana);
		bebidas.add(CocaCola);
		bebidas.add(CafeLeite);
		bebidas.add(CafePuro);
		bebidas.add(AguaGas);
		bebidas.add(AguaSem);

	}

}