package EXEMPLOS;
public class ExemploEntidade {
    public static void main(String args[]) {

        Aluno  al = new Aluno();

        al.nome = "João da Silva";
        al.matricula = "UC17000000";
        al.situacao = 'B';

        System.out.print("\nO nome do estudante: " + al.nome);

        String texto;
         if(al.situacao == 'B' ){
            texto = "BOLSISTA";
         }else{
            texto = "REGULAR";
         }

        System.out.print("\nSituação do aluno: " + texto);
    }
}

class Aluno {
    String nome;
    String matricula;
    char situacao;
}
