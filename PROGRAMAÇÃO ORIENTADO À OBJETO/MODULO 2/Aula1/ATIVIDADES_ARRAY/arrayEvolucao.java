package ATIVIDADES_ARRAY;

public class arrayEvolucao {

    public static void main(String[] args) {

        Aluno a  = visao.lerAluno(); // objeto ALUNO 
        System.out.println(a.nome);
    }
}

class Aluno {
    String nome;
    String matricula;
    char situacao;
}
