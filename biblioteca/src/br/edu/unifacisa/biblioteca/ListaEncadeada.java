package br.edu.unifacisa.biblioteca;

public class ListaEncadeada {
    private Nodo head; // Referência para o primeiro nó

    // Adiciona um livro à lista
    public void adicionarLivro(Livro livro) {
        Nodo novoNodo = new Nodo(livro);
        if (head == null) {
            head = novoNodo; // Se a lista estiver vazia, o novo nó é o head
        } else {
            Nodo atual = head;
            while (atual.getProximo() != null) {
                atual = atual.getProximo(); // Percorre a lista até o último nó
            }
            atual.setProximo(novoNodo); // Adiciona o novo nó no final da lista
        }
    }

    // Lista todos os livros
    public void listarLivros() {
        Nodo atual = head;
        while (atual != null) {
            System.out.println(atual.getLivro());
            atual = atual.getProximo();
        }
    }

    // Ordena a lista de livros por título usando Bubble Sort
    public void ordenarPorTitulo() {
        if (head == null || head.getProximo() == null) {
            return; // Lista vazia ou com apenas um elemento
        }

        boolean trocou;
        do {
            trocou = false;
            Nodo atual = head;

            while (atual.getProximo() != null) {
                // Use os métodos getters para acessar os livros
                if (atual.getLivro().getTitulo().compareTo(atual.getProximo().getLivro().getTitulo()) > 0) {
                    // Troca os livros usando os setters
                    Livro temp = atual.getLivro();
                    atual.setLivro(atual.getProximo().getLivro());
                    atual.getProximo().setLivro(temp);
                    trocou = true;
                }
                atual = atual.getProximo(); // Avança para o próximo nodo
            }
        } while (trocou); // Continue enquanto houver trocas
    }
 }
