package br.edu.unifacisa.biblioteca;

public class Nodo {
    private Livro livro;  // Mude este modificador
    private Nodo proximo;

    public Nodo(Livro livro) {
        this.livro = livro;
        this.proximo = null;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Nodo getProximo() {
        return proximo;
    }

    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }
}
