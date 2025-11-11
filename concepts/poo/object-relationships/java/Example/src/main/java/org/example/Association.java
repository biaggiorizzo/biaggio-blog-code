package org.example;

class Professor {
    String nome;

    Professor(String nome) {
        this.nome = nome;
    }
}

class Aluno {
    String nome;
    Professor professor; // Associação

    Aluno(String nome) {
        this.nome = nome;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor; // Associação sendo formada
    }
}

public class Association {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Maria");
        Professor professor = new Professor("João");
        aluno.setProfessor(professor);
    }
}
