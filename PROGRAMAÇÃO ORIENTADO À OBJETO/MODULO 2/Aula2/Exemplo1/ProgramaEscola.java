package Aula2.Exemplo1;

public class ProgramaEscola {

    public static void main(String args[]) {
        Turma t = new Turma();
        t.turma = "6° A";
        t.professor = new Professor();
        t.professor.nome = "José da Silva";
        t.professor.matricula = "123456";

        // fim
        System.out.println("Turma: " + t.turma + "\nProfessor conselheiro: " + t.professor.nome);
    }
}

class Turma {
    String turma;
    Professor professor;
    boolean isLaboratorio;
    Aluno[] alunos;
}

class Professor {
    String nome;
    String matricula;
    double salario;
}

class Aluno {
    String nome;
    String matricula;
    double notaUm;
    double notaDois;
}
