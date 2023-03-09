package Aula2.Exemplo1;

public class Programa {
    public static void main(String[] args) {
        AlunoTeste a = new AlunoTeste();
        a.nome = "Caio";
        a.nota1 = 10;
        a.nota2 = 5;
        double media = a.getMedia();

        

        System.out.println("A media dos numeros sao: " + media);
    }
}
