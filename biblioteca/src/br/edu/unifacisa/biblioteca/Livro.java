package br.edu.unifacisa.biblioteca;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    // Construtor padrão
    public Livro() {
        this.titulo = "Título Desconhecido";
        this.autor = "Autor Desconhecido";
        this.anoPublicacao = 2000; // Um valor padrão
    }

    // Construtor completo
    public Livro(String titulo, String autor, int anoPublicacao) {
        setTitulo(titulo);
        setAutor(autor);
        setAnoPublicacao(anoPublicacao);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isEmpty()) {
            throw new IllegalArgumentException("Título não pode ser vazio.");
        }
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (autor == null || autor.isEmpty()) {
            throw new IllegalArgumentException("Autor não pode ser vazio.");
        }
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        if (anoPublicacao < 0 || anoPublicacao > 2024) { // Supondo que 2024 seja o ano atual
            throw new IllegalArgumentException("Ano de publicação inválido.");
        }
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Ano: " + anoPublicacao;
    }
}
