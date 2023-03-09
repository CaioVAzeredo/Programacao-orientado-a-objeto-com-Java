package EXEMPLOS;
public class ExemploEntidadeArray {
    public static void main(String args[]) {
       Aluno[] alunos = Visao.criarAluno(1);
       Visao.print(alunos);
    }
}

class Aluno {
    String nome;
    String matricula;
    char situacao;
}
