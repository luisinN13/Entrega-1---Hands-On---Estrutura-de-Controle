import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Scanner;
public class Exercícios_OO {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int opcao;
		
		do {
			System.out.println("\n1. EXERCÍCIO 1");
			System.out.println("2. EXERCÍCIO 2");
			System.out.println("3. EXERCÍCIO 3");
			System.out.println("4. EXERCÍCIO 4");
			System.out.println("5. EXERCÍCIO 5");
			System.out.println("6. EXERCÍCIO 6");
			System.out.println("7. EXERCÍCIO 7");
			System.out.println("0. SAIR");
			System.out.print("\nEscolha uma das opções acima: ");
			opcao = sc.nextInt();
			sc.nextLine();
			
			switch(opcao) {
			case 1:
				ArrayList<String> prod = new ArrayList<>();
				prod.add("Feijão");
				prod.add("Arros");
				prod.add("Tomate");
				prod.add("Alface");
				prod.add("Milho");
		
				System.out.println("\nProdutos cadastrados: " + prod);
				System.out.println("Quantidade de produtos cadastrados: " + prod.size());
				break;
				
			case 2:
				ArrayList<Double> notas = new ArrayList<>();
				notas.add(10.0);
				notas.add(05.0);
				notas.add(08.0);
				notas.add(09.0);
				double soma = 0;
				double media = 0;
				
				for (double nota : notas) {
					soma += nota;
					media = soma / notas.size();
				}
				System.out.println("\nMédia da turma: " + media);
				if (media > 7) {
					System.out.println("A média da turma ficou acima de 7.");
				} else if (media == 7) {
					System.out.println("A média da turma é igual a 7.");
				} else {
					System.out.println("A média da turma ficou abaixo de 7.");
				}
				break;
				
			case 3:
				HashSet<String> aluno = new HashSet<>();
				aluno.add("Luis");
				aluno.add("Clara");
				aluno.add("Luis");
				aluno.add("Clara");
				aluno.add("Felipe");
				aluno.add("Elaine");
				
				System.out.println("\nAlunos Presentes: " + aluno);
				System.out.println("Quantidade de alunos presentes: " + aluno.size());
				break;
				
			case 4:
				HashMap<Integer,String> dados = new HashMap<>();
				int alternativa = 0;
				
				do {
					System.out.println("\n1. Cadastrar aluno");
					System.out.println("2. Buscar aluno");
					System.out.println("3. Remover aluno");
					System.out.println("4. Mostrar alunos cadastrados");
					System.out.print("Escolha uma das opções disponíveis: ");
					alternativa = sc.nextInt();
					
					switch (alternativa) {
					case 1:
						System.out.print("\nInforme sua matrícula: ");
						int mat = sc.nextInt();
						sc.nextLine();
						System.out.print("Informe seu nome: ");
						String nome = sc.nextLine();
						System.out.println("Aluno Cadastrado!");
						dados.put(mat, nome);
						break;
						
					case 2:
						System.out.print("\nInforme o número da matrícula para realizar a busca: ");
						int busca = sc.nextInt();
						
						if (dados.containsKey(busca)) {
							System.out.println("Aluno: " + dados.get(busca));
						} else {
							System.out.println("Matrícula não encontrada!");
						}
						break;
						
					case 3:
						System.out.print("\nInforme o número da matrícula para remover: ");
						int remover = sc.nextInt();
						
						if (dados.containsKey(remover)) {
							dados.remove(remover);
							System.out.println("Aluno Removido!");
						} else {
							System.out.println("Matrícula não encontrada!");
						}
						break;
						
					case 4:
						System.out.println("\nAlunos cadastrados: ");
			            for (Integer matricula : dados.keySet()) {

			                System.out.println("Matrícula: " + matricula + " | Nome: " + dados.get(matricula));
			            }
			            break;
			            
					case 0:
						System.out.println("Programa encerrado!");
						break;
						
						default:
							System.out.println("Opção inválida. Tente novamente.");
					}
					
				}while (alternativa != 0);
				break;
				
			case 5:
				Queue<String> fila = new LinkedList<>();
				fila.add("Luis");
				fila.add("Clara");
				fila.add("Luisa");
				fila.add("Elaine");
				fila.add("Nilton");
				System.out.println("\nPessoas na fila: " + fila);
				System.out.println("\nPróximo a ser atendido: " + fila.peek());
				System.out.println("Cliente atendido: " + fila.poll());
				System.out.println("Fila atualizada: " + fila);
				System.out.println("\nPróximo a ser atendido: " + fila.peek());
				System.out.println("Cliente atendido: " + fila.poll());
				System.out.println("Fila atualizada: " + fila);
				break;
				
			case 6:
				ArrayList<Livro> lista = new ArrayList<>();
				
				do {

		            System.out.println("\n===== SISTEMA BIBLIOTECA =====");
		            System.out.println("1 - Cadastrar livro");
		            System.out.println("2 - Listar livros");
		            System.out.println("3 - Emprestar livro");
		            System.out.println("4 - Devolver livro");
		            System.out.println("0 - Sair");
		            System.out.print("Escolha uma opção: ");
		            opcao = sc.nextInt();
		            sc.nextLine();

		            switch (opcao) {

		            case 1:
		                System.out.print("Código: ");
		                int codigo = sc.nextInt();
		                sc.nextLine();
		                System.out.print("Título: ");
		                String titulo = sc.nextLine();
		                
		                System.out.print("Autor: ");
		                String autor = sc.nextLine();

		                Livro livro = new Livro(codigo, titulo, autor, true);

		                lista.add(livro);
		                System.out.println("Livro cadastrado com sucesso!");
		                break;

		            case 2:
		                if (lista.isEmpty()) {
		                    System.out.println("Nenhum livro cadastrado.");
		                } else {
		                    for (Livro l : lista) {
		                        l.exibirInformacoes();
		                    }
		                }
		                break;

		            case 3:
		                System.out.print("Digite o código do livro: ");
		                int codEmprestimo = sc.nextInt();
		                boolean encontrado = false;

		                for (Livro l : lista) {
		                    if (l.getCodigo() == codEmprestimo) {
		                        encontrado = true;

		                        if (l.isDisponivel()) {
		                            l.setDisponivel(false);
		                            System.out.println("Livro emprestado com sucesso!");
		                        } else {
		                            System.out.println("Livro indisponível.");
		                        }
		                    }
		                }
		                if (!encontrado) {
		                    System.out.println("Livro não encontrado.");
		                }
		                break;

		            case 4:
		                System.out.print("Digite o código do livro: ");
		                int codDevolucao = sc.nextInt();
		                boolean achou = false;

		                for (Livro l : lista) {
		                    if (l.getCodigo() == codDevolucao) {
		                        achou = true;
		                        if (!l.isDisponivel()) {
		                            l.setDisponivel(true);
		                            System.out.println("Livro devolvido com sucesso!");
		                        } else {
		                            System.out.println("Este livro já está disponível.");
		                        }
		                    }
		                }
		                if (!achou) {
		                    System.out.println("Livro não encontrado.");
		                }
		                break;

		            case 0:
		                System.out.println("Sistema encerrado.");
		                break;

		            default:
		                System.out.println("Opção inválida.");
		            }
		        } while (opcao != 0);
				break;
				
			case 7:
				 ArrayList<Pedido> list = new ArrayList<>();
			        int op;

			        do {
			            System.out.println("\n===== LANCHONETE =====");
			            System.out.println("1 - Cadastrar pedido");
			            System.out.println("2 - Listar pedidos");
			            System.out.println("3 - Atualizar status");
			            System.out.println("4 - Buscar pedido");
			            System.out.println("5 - Mostrar valor total");
			            System.out.println("0 - Sair");

			            System.out.print("Escolha: ");
			            opcao = sc.nextInt();
			            sc.nextLine();

			            switch (opcao) {

			            case 1:
			                System.out.print("Número do pedido: ");
			                int numero = sc.nextInt();
			                sc.nextLine();

			                System.out.print("Nome do cliente: ");
			                String cliente = sc.nextLine();

			                System.out.print("Item pedido: ");
			                String item = sc.nextLine();

			                System.out.print("Valor: ");
			                double valor = sc.nextDouble();

			                Pedido p = new Pedido(numero, cliente, item, valor);
			                list.add(p);

			                System.out.println("Pedido cadastrado!");
			                break;

			            case 2:
			                if (list.isEmpty()) {
			                    System.out.println("Nenhum pedido cadastrado.");
			                } else {
			                    for (Pedido pedido : list) {
			                        pedido.exibirPedido();
			                    }
			                }
			                break;

			            case 3:
			                System.out.print("Digite o número do pedido: ");
			                int numStatus = sc.nextInt();
			                sc.nextLine();
			                boolean encontrou = false;

			                for (Pedido pedido : list) {

			                    if (pedido.numped == numStatus) {
			                        encontrou = true;

			                        System.out.println("1 - PENDENTE");
			                        System.out.println("2 - PREPARANDO");
			                        System.out.println("3 - FINALIZADO");
			                        System.out.print("Novo status: ");
			                        int status = sc.nextInt();

			                        switch (status) {

			                        case 1:
			                            pedido.status = "PENDENTE";
			                            break;

			                        case 2:
			                            pedido.status = "PREPARANDO";
			                            break;

			                        case 3:
			                            pedido.status = "FINALIZADO";
			                            break;

			                        default:
			                            System.out.println("Status inválido.");
			                        }

			                        System.out.println("Status atualizado!");
			                    }
			                }
			                if (!encontrou) {
			                    System.out.println("Pedido não encontrado.");
			                }
			                break;

			            case 4:
			                System.out.print("Digite o número do pedido: ");
			                int busca = sc.nextInt();
			                boolean achou = false;

			                for (Pedido pedido : list) {
			                    if (pedido.numped == busca) {
			                        pedido.exibirPedido();
			                        achou = true;
			                    }
			                }
			                if (!achou) {
			                    System.out.println("Pedido não encontrado.");
			                }
			                break;

			            case 5:
			                double total = 0;
			                for (Pedido pedido : list) {
			                    total += pedido.valor;
			                }
			                System.out.println("Valor total dos pedidos: R$ " + total);
			                break;

			            case 0:
			                System.out.println("Sistema encerrado.");
			                break;

			            default:
			                System.out.println("Opção inválida.");
			            }

			        } while (opcao != 0);
				break;
				
			case 0:
				System.out.println("\nSaindo...");
				break;
				
			default:
				System.out.println("\nOpção Inválida. Tente novamente.");
			}
		}
		while (opcao != 0);
		System.out.println("ALIUNO: Luis Felipe Oliveira Machado    RA: 42320328");
		sc.close();	
	}
}
