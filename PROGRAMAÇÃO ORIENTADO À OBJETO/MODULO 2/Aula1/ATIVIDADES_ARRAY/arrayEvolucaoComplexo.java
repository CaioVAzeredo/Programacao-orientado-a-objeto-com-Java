package ATIVIDADES_ARRAY;

public class arrayEvolucaoComplexo {
    public static void main(String[] args) {
        int quantidade = leitor.lerInt("Insira a quantidade: ");
        Aluno[] alunos = visao.criarAlunos(quantidade);
        
        visao.print(alunos);
        

    }

}
class Aluno{
    String nome;
    String matricula;
    char situacao;
}
