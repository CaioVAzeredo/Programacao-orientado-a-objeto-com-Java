package Ex9;

public class criarAluno {
 
    public static void main(String[] args) {
        
        int quantidade = leitor.lerInt("insira a quantidade de alunos na turma: ");
        Aluno[] al = leitor.criarAluno(quantidade);
        String resultado = leitor.criarResultado(al);
        print.printResultado(resultado);
        
    
    }

}

class Aluno {
    String nome;
    String matricula;
    char situacao;
}