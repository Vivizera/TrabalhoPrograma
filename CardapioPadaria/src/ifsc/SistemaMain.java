package ifsc;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaMain {
	public static void main(String[] args) {

		Integer opcaoSelecionada = Integer.MAX_VALUE;
		Scanner leitura = new Scanner(System.in);
		ArrayList<Salgado> salgados = new ArrayList<>();

		while (opcaoSelecionada != 0) {

			/**
			 * Esta é so uma proposta de menu de sistema.
			 * 
			 * Voce nao precisa seguir esta ordem, desde que seu sistema respeite a logica
			 * de incluir, alterar, listar e excluir de alguma forma.
			 */
			System.out.println("Qual é o seu pedido: ");
			System.out.println("- MENU EXEMPLO -");
			System.out.println("0 SAIR");
			System.out.println("1 SALGADO");
			System.out.println("2 DOCE");
			System.out.println("3 BEBIDA");
			System.out.println("4 LISTAR");

			opcaoSelecionada = Integer.valueOf(leitura.nextLine());

			switch (opcaoSelecionada) {
			case 0: {
				// Fecha sistema
				break;
			}
			case 1: {
				// Leitura de dados (input)

				System.out.println("O tipo de prouto foi Salgado ");

				System.out.println("- MENU EXEMPLO -");
				System.out.println("0 SAIR");
				System.out.println("1 PASTEIS");
				System.out.println("2 BOLINHO DE CARNE");
				System.out.println("3 COXINHA DE FRANGO");

				System.out.println("Nome: ");
				String nome = leitura.nextLine();
				System.out.println("Sabor: ");
				String sabor = leitura.nextLine();
				System.out.println("Descrição: ");
				String descrição = leitura.nextLine();
				System.out.println("Preço: ");
				Float preco = leitura.nextLine(Float.valueOf(0));

				Salgado s = new Salgado();
				s.setNome(nome);
				s.setSabor(sabor);
				s.setDescricao(descrição);
				s.setPreco(preco);

				salgados.add(s);

			}
			case 2: {
				System.out.println("Digite o cpf da pessoa que deseja alterar:");
				// finalizar codigo
			}
			case 3: {
				System.out.println("Digite o cpf da pessoa que deseja excluir:");
				// finalizar codigo
			}
			case 4: {
				// Saida de dados (output)
				System.out.println("Listagem de pessoas cadastradas: ");
				for (Salgado pessoa : salgados) {
					System.out.println("Cpf: " + pessoa.getCpf());
					System.out.println("Nome: " + pessoa.getNome());
				}
			}

			}

		}

		leitura.close();
	}
}
