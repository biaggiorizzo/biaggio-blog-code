package org.example;

class Coracao {
    public void bater() {
        System.out.println("Coração batendo.");
    }
}

class Corpo {
    private Coracao coracao; // Composição

    Corpo() {
        this.coracao = new Coracao(); // Criado dentro -> não existe fora
    }

    public void viver() {
        coracao.bater();
    }
}

public class Composition {
    public static void main(String[] args) {
        Corpo corpo = new Corpo();
        corpo.viver();
        // Ao final da execução, coracao também deixa de existir junto com corpo
    }
}