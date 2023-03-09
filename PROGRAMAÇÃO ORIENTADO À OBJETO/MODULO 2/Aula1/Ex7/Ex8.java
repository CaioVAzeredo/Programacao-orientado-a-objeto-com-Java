package Ex7;

public class Ex8 {
    public static void main(String[] args) {
        Aluno a = leitor.lerAluno1();
        String calculo = leitor.calculoAprovado(a.aluno, a.nota1, a.nota2, a.aprovado);
        System.out.println(calculo);

    }
    
}
class Aluno{
    String aluno;
    double nota1;
    double nota2;
    String media;
    String resultado;
    String aprovado;
}