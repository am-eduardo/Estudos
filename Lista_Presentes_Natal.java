package Desafios;

import java.util.Scanner;

public class Lista_Presentes_Natal {
    public static void main(String[] args) {

        //Inicializando o Sacanner
        Scanner scanner = new Scanner(System.in);

        boolean menu = true;

        while (menu) {

            int opcao = 0;
            int numMax;
            int presentesCadastrados = 0;
            System.out.println("\n\n***** HO HO HO *****");
            System.out.println("O Natal está chegando...");
            System.out.println("Faça logo sua lista!") ;
            System.out.println("------------------------------------------------------------------");
            System.out.println("Digite abaixo a quantidade de opções de presentes você deseja cadastrar: ");
            numMax = scanner.nextInt();
            scanner.nextLine();
            boolean menuCadastro = true;

            String[] presentes= new String[numMax];

            while (menuCadastro) {
                System.out.println("\n======== Menu ========");
                System.out.println("1. Cadastrar Presente");
                System.out.println("2. Listar Presentes");
                System.out.println("3. Remover Presente");
                System.out.println("4. Reiniciar");
                System.out.println("5. Sair");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        if (presentesCadastrados < numMax) {
                            System.out.println("Digite o nome de um presente que você deseja receber no natal");
                            String nomePresente = scanner.nextLine();
                            presentes[presentesCadastrados] = nomePresente;
                            presentesCadastrados++;
                            System.out.println("Opção de presente cadastrada com sucesso");
                        } else {
                            System.out.println("A lista já está cheia");
                        }
                        break;
                    case 2:
                        if (presentesCadastrados == 0) {
                            System.out.println("Sua lista de presentes ainda está vazia");
                        } else {
                            System.out.println("===== Lista de presentes! =====");
                            for (int i = 0; i < presentes.length; i++) {
                                System.out.println(i+1 + "º " +presentes[i]);
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Digite o número do presente que deseja remover?");
                        int op = scanner.nextInt();
                        presentes[op-1] = null;
                        scanner.nextLine();
                        break;
                    case 4:
                        System.out.println("--- Voltando para alterar a quantidade de presentes ---");
                        menuCadastro = false;
//                        menu = true;
                        break;
                    case 5:
                        System.out.println("----- Saindo do programa -----");
                        menuCadastro = false;
                        menu = false;
                        break;
                    default:
                        System.out.println("Opção inválida");
                        break;
                }
            }
        }

        //fechando o scanner
        scanner.close();
    }
}
