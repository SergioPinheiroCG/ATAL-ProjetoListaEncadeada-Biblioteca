package br.edu.unifacisa.biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada listaLivros = new ListaEncadeada();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Listar Livros");
            System.out.println("3. Ordenar Livros por Título");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ano de Publicação: ");
                    int ano = scanner.nextInt();
                    listaLivros.adicionarLivro(new Livro(titulo, autor, ano));
                    break;
                case 2:
                    listaLivros.listarLivros();
                    break;
                case 3:
                    listaLivros.ordenarPorTitulo();
                    System.out.println("Livros ordenados por título.");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
