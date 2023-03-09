package ATIVIDADES_ARRAY;

public class visao {

    public static Aluno lerAluno() {
        Aluno a = new Aluno(); // criação do espaço da memoria
        a.nome = leitor.lerString("Insira o nome do aluno: "); // ler nome do aluno
        a.matricula = leitor.lerString("Insira a matricula do aluno(a) " + a.nome + ": ");// ler matricula do aluno
        a.situacao = leitor.lerCaracter("Insira a situação do(a) " + a.nome + " (B/F): ");// ler situacao do aluno

        return a;
    }

    public static Aluno[] criarAlunos(int quantidade) {

        Aluno[] alunos = new Aluno[quantidade];
        for (int i = 0; i < alunos.length; i++) {
            alunos[i] = lerAluno();
        }
        return alunos;
    }

    public static void println(Aluno aluno) {
        System.out.println("Nome: " + aluno.nome);
        System.out.println("Matricula: " + aluno.matricula);
        System.out.println("Situação: " + aluno.situacao);
        System.out.println("\n");
    }

    public static void print(Aluno[] aluno) {
        for(int i = 0; i< aluno.length; i++){
            System.out.println(aluno);
        }
    }

    

}
