package ATIVIDADES_ARRAY;

public class array {
    public static void main(String[] args) {
        // criação da array
        Aluno[] alunos = new Aluno[4];

        // criação do espaço da memoria
        alunos[0] = new Aluno();
        // posição 1 da array
        alunos[0].nome = "Ana";
        alunos[0].matricula = "UC4234235";
        alunos[0].situacao = 'B';

        // criação do espaço da memoria
        alunos[1] = new Aluno();
        // posição 2 da array
        alunos[1].nome = "joao";
        alunos[1].matricula = "UC12398";
        alunos[1].situacao = 'B';

        // criação do espaço da memoria
        alunos[2] = new Aluno();
        // posição 3 da array
        alunos[2].nome = "Maria";
        alunos[2].matricula = "UC12397";
        alunos[2].situacao = 'B';

        // objeto ALUNO
        // criação do espaço na memoria
        Aluno a = new Aluno();
        a.nome = "Caio";
        a.matricula = "UC123456";
        a.situacao = 'B';

        // posição 4 da array
        alunos[3] = a;

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Nome: " + alunos[i].nome + "; Matricula: " + alunos[i].matricula + "; Situação: " + alunos[i].situacao);
        }

    }
}

class Aluno {
    String nome;
    String matricula;
    char situacao;
}