package org.example;

import java.util.ArrayList;
import java.util.List;

class Livro {
    String titulo;

    Livro(String titulo) {
        this.titulo = titulo;
    }
}

class Biblioteca {
    List<Livro> livros = new ArrayList<>(); // Agregação: coleção de Livros

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Livro l1 = new Livro("Dom Casmurro");
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(l1);
        // O livro l1 pode continuar existindo mesmo sem a biblioteca
    }
}
