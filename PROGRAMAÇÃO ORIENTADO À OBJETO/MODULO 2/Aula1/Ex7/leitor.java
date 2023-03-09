package Ex7;
import java.util.Scanner;

public class leitor {
    public static final Scanner Scanner = new Scanner(System.in);

    public static Numero lerNum() {

        Numero num = new Numero();
        num.numero = lerDouble("Insira um número: ");

        return num;
    }

    public static Numero[] receberNumero(int valor) {

        Numero[] retorno = new Numero[valor];

        for (int i = 0; i < retorno.length; i++) {
            retorno[i] = lerNum();

        }
        return retorno;
    }

    public static Aluno lerAluno1() {
        Aluno al = new Aluno();

        al.aluno = lerString("Insira o nome do aluo: ");
        al.nota1 = lerDouble("Insira a primeira nota do aluno " + al.aluno + ": ");
        al.nota2 = lerDouble("Insira a segunda nota do aluno " + al.aluno + ": ");

        return al;

    }

    public static String calculoAprovado(String aluno, double nota1, double nota2, String aprovado) {

        double media = calculoMedia(nota1, nota2);

        if (media >= 6) {
            aprovado = "O aluno(a) " + aluno + " Com a média: " + media + " está APROVADO";
        } else {
            aprovado = "O aluno(a) " + aluno + " Com a média: " + media + " está REPROVADO";
        }
        return aprovado;
    }

    public static double calculoMedia(double nota1, double nota2) {
        return ((nota1 + nota2) / 2);
    }

    // leitor de Double
    public static double lerDouble(String msg) {

        System.out.println(msg);
        return lerDouble();
    }

    public static double lerDouble() {
        return Scanner.nextDouble();
    }

    // leitor de Character
    public static char lerChar(String msg) {
        System.out.println(msg);
        return lerChar();
    }

    public static char lerChar() {
        return Scanner.next().charAt(0);
    }

    // leitor de String
    public static String lerString(String msg) {
        System.out.println(msg);
        return lerString();
    }

    public static String lerString() {
        return Scanner.next();
    }

    // ler numero inteiro
    public static int lerInt(String msg) {
        System.out.println(msg);
        return lerInt();
    }

    public static int lerInt() {
        return Scanner.nextInt();
    }

    public static String valorMedia(Numero[] num) {
        int contador = 0;
        double somador = 0;
        String resultadoMedia = "";

        for (int i = 0; i < num.length; i++) {
            somador += num[i].numero;
            contador++;
        }

        resultadoMedia = "\nMédia dos números: " + (somador / contador)+"\n";

        return resultadoMedia;
    }

    public static String valorImpar(Numero[] num) {

        String impar = "";
        double contadorImpar = 0;
        double contadorPar = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i].numero % 2 == 0) {
                contadorImpar++;
            } else {
                contadorPar++;
            }
        }
        impar = "\nQuantidade de números ímpares: " + contadorImpar + "\nQuantidade de números pares: " + contadorPar + "\n";
        return impar;
    }

    public static String valores(Numero[] num) {
        String valores1 = "";
        for (int i = 0; i < num.length; i++) {

                valores1 += num[i].numero + ", ";
            
        }
        String valores = "\nValores informados: " + valores1;
        return valores;
    }

    public static String criarResultado(Numero[] num) {
        String total = "";
        String media = valorMedia(num);
        String impar = valorImpar(num);
        String valores = valores(num);

        total = media + impar + valores;

        return total;
    }

}
