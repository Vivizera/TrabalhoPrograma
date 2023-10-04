package ifsc;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaMain {
	public static void main(String[] args) {

		Integer opcaoSelecionada = Integer.MAX_VALUE;
		Scanner leitura = new Scanner(System.in);
		ArrayList<Salgado> salgados = new ArrayList<>();
		double total = 0.0;

		while (opcaoSelecionada != 0) {

			/**
			 * Esta é so uma proposta de menu de sistema.
			 * 
			 * Voce nao precisa seguir esta ordem, desde que seu sistema respeite a logica
			 * de incluir, alterar, listar e excluir de alguma forma.
			 */
			System.out.println("BEM-VINDO A NOSSA PADARIA!");
			
			System.out.println("Qual é o seu pedido: ");	
			System.out.println("- MENU EXEMPLO -");
			System.out.println("0 SAIR");
			System.out.println("1 SALGADO");
			System.out.println("2 DOCE");
			System.out.println("3 BEBIDA");

			opcaoSelecionada = Integer.valueOf(leitura.nextLine());

			switch (opcaoSelecionada) {
			case 0: {
				// Fecha sistema
				break;
			}
			case 1: {
				// Leitura de dados (input)

				System.out.println("O tipo de produto foi Salgado ");

				System.out.println("- MENU EXEMPLO -");
				System.out.println("0 SAIR");
				System.out.println("1 PASTEIS - R$6.00");
				System.out.println("2 BOLINHO DE CARNE - R$4.00");
				System.out.println("3 COXINHA DE FRANGO - R$5.00");
				
				int opção = Integer.valueOf(leitura.nextLine());
				
				switch (opção) {
				case 0: {
					// Fecha sistema
					break;
				}
		        case 1:
		            System.out.print("Você escolheu pastel");
		            System.out.println("0 SAIR");
					System.out.println("1 PASTEL DE FRANGO - R$6.00");
					System.out.println("2 PASTEL DE CARNE - R$6.00");
					
					int op = Integer.valueOf(leitura.nextLine());
					
					if (op == 1) {
						System.out.println("Você escolheu pastel de frango");
					}else {
				        System.out.println("Você escolheu pastel de carne");
					}
		            break;
		            
	            case 2:
		            System.out.print("Você escolheu bolinho de carne");
		            break;
		            
		        case 3:
		            System.out.print("Você escolheu coxinha de frango");
		            break;


				System.out.println("Pastel");
				String nome = leitura.nextLine();
				System.out.println("Sabor: Frango ou Carne");
				String sabor = leitura.nextLine();
				System.out.println("Descrição: Pastel de frango muito saboroso feito com uma massa bem fina!");
				String descrição = leitura.nextLine();
				System.out.println("Preço: 6.00f");
				Float preco = Float.valueOf(leitura.nextLine());

				Salgado p = new Salgado();
				p.setNome(nome);
				p.setSabor(sabor);
				p.setDescricao(descrição);
				p.setPreco(preco);

				salgados.add(p);

			    }
			case 2: {
				System.out.println("O tipo de produto foi doce");
				
				System.out.println("- MENU EXEMPLO -");
				System.out.println("0 SAIR");
				System.out.println("1 BRIGADEIRO - R$3.00");
				System.out.println("2 AÇAÍ - R$5.00 ");
				System.out.println("3 BOLO DE CHOCOLATE - R$6.00");
				
				int opção = Integer.valueOf(leitura.nextLine());
				
				switch (opção) {
				case 0: {
					// Fecha sistema
					break;
				}
		        case 1:
		            System.out.print("Você escolheu brigadeiro");
					break;
		            
	            case 2:
		            System.out.print("Você escolheu açaí");
		            break;
		            
		        case 3:
		            System.out.print("Você escolheu bolo de chocolate");
		            break;
			    }
			case 3: {
				System.out.println("O tipo de produto foi bebidas");
				
				System.out.println("- MENU EXEMPLO -");
				System.out.println("0 SAIR");
				System.out.println("1 REFRIGERANTE - R$4.00");
				System.out.println("2 CAFÉ - R$3.00");
				System.out.println("3 ÁGUA - R$2.00");
				
                int opção = Integer.valueOf(leitura.nextLine());
				
				switch (opção) {
				case 0: {
					// Fecha sistema
					break;
				}
		        case 1:
		            System.out.print("Você escolheu refrigerante");
		            
		            System.out.println("- MENU EXEMPLO -");
					System.out.println("1 COCA-COLA - R$3.00");
					System.out.println("2 GUARANA - R$5.00 ");
					
                    int opc = Integer.valueOf(leitura.nextLine());
					
					if (opc == 1) {
						System.out.println("Você escolheu coca-cola");
					}else {
				        System.out.println("Você escolheu guarana");
					}
		            break;
					
		            
	            case 2:
		            System.out.print("Você escolheu café");
		            
		            System.out.println("- MENU EXEMPLO -");
					System.out.println("1 CAFÉ COM LEITE - R$3.00");
					System.out.println("2 CAFÉ PURO - R$5.00 ");
					
                    int op = Integer.valueOf(leitura.nextLine());
					
					if (op == 1) {
						System.out.println("Você escolheu café com leite");
					}else {
				        System.out.println("Você escolheu café puro");
					}
		            break;
		            
		            
		        case 3:
		            System.out.print("Você escolheu água");
		            
		            System.out.println("- MENU EXEMPLO -");
					System.out.println("1 ÁGUA COM GÁS - R$3.00");
					System.out.println("2 ÁGUA SEM GÁS - R$5.00 ");
					
                    int o = Integer.valueOf(leitura.nextLine());
					
					if (o == 1) {
						System.out.println("Você escolheu água com gás");
					}else {
				        System.out.println("Você escolheu água sem gás");
					}
		            break;
			    }
			}
			System.out.println("Deseja adicionar mais alguma coisa?");
			
			System.out.println("- MENU EXEMPLO -");
			System.out.println("0 SIM");
			System.out.println("1 NÂO");
			
			int opção = Integer.valueOf(leitura.nextLine());
			
			switch (opção) {
			case 0: {
				// volta para o menu do cardápio
				break;
			}
	        case 1:
	            // exibe a soma dos preços
				break;
			

			}
			
			//exibe a forma de pagamento 
			
			// fim do programa 

		}

		leitura.close();
	}
}
		
