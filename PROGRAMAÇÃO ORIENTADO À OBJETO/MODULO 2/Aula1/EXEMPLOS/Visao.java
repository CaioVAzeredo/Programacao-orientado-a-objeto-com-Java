package EXEMPLOS;
public class Visao {
    public static Aluno lerAluno(){
        Aluno al = new Aluno();
        al.nome = leitor.lerString("Informe o nome do aluno: ");
        al.matricula = leitor.lerString("Informe a matrícula do(a) " + al.nome + ": ");
        al.situacao = leitor.operador("Informe a situação: ");

        return al;
    }

    public static Aluno[] criarAluno(int quantidade) {
        Aluno[] alunos = new Aluno[quantidade];
        for (int i = 0; i < alunos.length; i++) {
            alunos[i] = lerAluno();
            
        }
        return alunos;
    }

    public static void print(Aluno[] aluno) {
        for(int i = 0; i< aluno.length; i++){
            System.out.println("\n" + aluno[i].nome + "\n" + aluno[i].matricula + "\n" + aluno[i].situacao+"\n");
        }
    }
}
