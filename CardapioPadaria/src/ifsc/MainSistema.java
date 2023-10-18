package ifsc;

import java.util.ArrayList;
import java.util.Scanner;

public class MainSistema {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        ArrayList<Salgado> salgado = new ArrayList<>();
		        ArrayList<Doce> doce = new ArrayList<>();
		        ArrayList<Bebida> bebida = new ArrayList<>();
		        double total = 0.0;
		        int escolha;
		        int opcao = 0;
		        do {
	
		            System.out.println("======== BEM-VINDO A NOSSA PADARIA! ========");
		            System.out.println("Digite 1 para SALGADOS");
		            System.out.println("Digite 2 para DOCE");
		            System.out.println("Digite 3 para BEBIDA");
		            System.out.println("4. Sair");
		            System.out.print("Escolha uma opção: ");
		            escolha = scanner.nextInt();

		            switch (escolha) {
		                case 1:
		                    System.out.println("Você escolheu salgados");
	    		            
	    		            while (opcao != 3) {
	    		                System.out.println("Digite 1 para ver os pasteis");
	    		                System.out.println("Digite 2 para ver o bolhinho de carne");
	    		                System.out.println("Digite 3 para ver a coxinha de frango");
	    		                System.out.print("Escolha uma opção: ");
	    		                opcao = scanner.nextInt();
	    		                
	    		                if (opcao == 1) {
	    		                    System.out.println("Você escolheu ver os pasteis");
	    		                    
	    		                    Produto pastelFrango = new Produto();
	    		                    pastelFrango .setNome("Pastel");
	    		                    pastelFrango .setSabor("Sabor Frango");
	    		                    pastelFrango .setDescricao("Ingredientes: frango, molho, farinha de trigo, óleo, sal, ovo e água.");
	    		                    pastelFrango .setPreco("R$6.00");
	    		                    
	    		                    Produto pastelCarne = new Produto();
	    		                    pastelCarne .setNome("Pastel");
	    		                    pastelCarne .setSabor("Sabor Carne");
	    		                    pastelCarne .setDescricao("Ingredientes: carne, molho, farinha de trigo, óleo, sal, ovo e água.");
	    		                    pastelCarne .setPreco("R$6.00");
	    		                    
	    		                } 
	    		                else if (opcao == 2)  {
	    		                    System.out.println("Você escolheu ver o bolhinho de carne");
	    		                    
	    		                    Produto bolinhoCarne = new Produto();
	    		                    bolinhoCarne .setNome("Bolinho");
	    		                    bolinhoCarne .setSabor("Sabor Carne");
	    		                    bolinhoCarne .setDescricao("Ingredientes: carne moída, cebola, ovo, farinha de trigo e alho");
	    		                    bolinhoCarne .setPreco("R$4.00");
	    		                } 
	    		                else if (opcao == 3) {
	    		                    System.out.println("Você escolheu ver a coxinha de frango");
	    		                    
	    		                    Produto coxinhaFrango = new Produto();
	    		                    coxinhaFrango .setNome("Coxinha");
	    		                    coxinhaFrango .setSabor("Sabor Frango");
	    		                    coxinhaFrango .setDescricao("Ingredientes: água, manteiga, sal, cubinhos de caldo de galinha esfarelados, farinha de trigo, azeite, alho, peito de frango, salsinha picadinha, ovo, leite e farinha de rosca");
	    		                    coxinhaFrango .setPreco("R$5.00");
	    		                }
	    		                else {
	    		                    System.out.println("Opção inválida. Tente novamente.");
	    		                }
	    		            }
	    		            
		                    break;
		                    
		                case 2:
		                	System.out.println("Você escolheu doces");
	    		            
	    		            while (opcao != 3) {
	    		                System.out.println("Digite 1 para ver os brigadeiros");
	    		                System.out.println("Digite 2 para ver o açaí");
	    		                System.out.println("Digite 3 para ver o bolo de chocolate");
	    		                System.out.print("Escolha uma opção: ");
	    		                opcao = scanner.nextInt();
	    		                
	    		                if (opcao == 1) {
	    		                    System.out.println("Você escolheu ver os brigadeiros");
	    		                    
	    		                    Produto Brigadeiro = new Produto();
	    		                    Brigadeiro .setNome("Brigadeiro");
	    		                    Brigadeiro .setSabor("Sabor Chocolate");
	    		                    Brigadeiro .setDescricao("Ingredientes: leite condensado, manteiga, e Nescau.");
	    		                    Brigadeiro .setPreco("R$3.00");
	    		                    
	    		                } 
	    		                else if (opcao == 2)  {
	    		                    System.out.println("Você escolheu ver o açaí");
	    		                    
	    		                    Produto Acai = new Produto();
	    		                    Acai .setNome("Açaí");
	    		                    Acai .setSabor("Sabor açaí");
	    		                    Acai .setDescricao("Ingredientes: fruta açaí e açucar.");
	    		                    Acai .setPreco("R$6.00");
	    		                    
	    		                } 
	    		                else if (opcao == 3) {
	    		                    System.out.println("Você escolheu ver o bolo de chocolate");
	    		                    
	    		                    Produto Bolo = new Produto();
	    		                    Bolo .setNome("Bolo");
	    		                    Bolo .setSabor("Sabor chocolate");
	    		                    Bolo .setDescricao("Ingredientes: ovos, manteiga, açucar, leite, chocolate em pó, farinha de trigo e fermento");
	    		                    Bolo .setPreco("R$6.00");
	    		                }
	    		                else {
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
	    		                opcao = scanner.nextInt();
	    		                
	    		                if (opcao == 1) {
	    		                    System.out.println("Você escolheu ver os refrigerantes");
	    		                    
	    		                    Produto Guarana = new Produto();
	    		                    Guarana .setNome("Refrigerantes");
	    		                    Guarana .setSabor("Sabor Guarana");
	    		                    Guarana .setPreco("R$5.00");
	    		                    
	    		                    Produto CocaCola = new Produto();
	    		                    CocaCola .setNome("Refrigerantes");
	    		                    CocaCola .setSabor("Sabor Coca-Cola");
	    		                    CocaCola .setPreco("R$5.00");
	    		                    
	    		                } 
	    		                else if (opcao == 2)  {
	    		                    System.out.println("Você escolheu ver os cafes");
	    		                    
	    		                    Produto CafeLeite = new Produto();
	    		                    CafeLeite .setNome("Cafe");
	    		                    CafeLeite .setSabor("Com leite");
	    		                    CafeLeite .setDescricao("Ingredientes: leite e cafe.");
	    		                    CafeLeite .setPreco("R$3.00");
	    		                    
	    		                    Produto CafePuro = new Produto();
	    		                    CafePuro .setNome("Cafe");
	    		                    CafePuro .setSabor("Puro");
	    		                    CafePuro .setDescricao("Ingredientes: cafe.");
	    		                    CafePuro .setPreco("R$3.00");
	    		                    
	    		                } 
	    		                else if (opcao == 3) {
	    		                    System.out.println("Você escolheu ver as águas");
	    		                    
	    		                    Produto AguaGas = new Produto();
	    		                    AguaGas .setNome("Água");
	    		                    AguaGas .setSabor("Com gas");
	    		                    AguaGas .setDescricao("Ingredientes: água e gas.");
	    		                    AguaGas .setPreco("R$2.00");
	    		                    
	    		                    Produto AguaSem = new Produto();
	    		                    AguaSem .setNome("Água");
	    		                    AguaSem .setSabor("Sem gas");
	    		                    AguaSem .setDescricao("Ingredientes: água.");
	    		                    AguaSem .setPreco("R$2.00");
	    		                }
	    		                else {
	    		                    System.out.println("Opção inválida. Tente novamente.");
	    		                }
	    		            }
		                    
		                    break;
		                case 4:
		                    System.out.println("Fechando o sistema!");
		                    break;
		                default:
		                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
		                    break;
		            }
		        } while (escolha != 4);

		        scanner.close();
		    }
		
	}