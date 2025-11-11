package org.example;

class Escola {
    public void fornecerMaterial() {
        System.out.println("Material fornecido pela escola.");
    }
}

class AlunoD {
    public void estudar(Escola escola) { // Dependência: usa Escola como parâmetro
        escola.fornecerMaterial();
        System.out.println("Aluno estudando...");
    }
}
public class Dependency {
    public static void main(String[] args) {
        Escola escola = new Escola();
        AlunoD aluno = new AlunoD();
        aluno.estudar(escola);
    }
}