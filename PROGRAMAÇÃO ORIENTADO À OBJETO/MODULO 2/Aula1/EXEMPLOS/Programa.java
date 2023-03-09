package EXEMPLOS;
import java.util.Scanner;

public class Programa {

    public static final Scanner Scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double salario = lerDouble("Informe um salário: ", "OPS! Valo inválido", 0, 2500);
        System.out.println("Seu salário é de: " + salario);
    }

    public static double lerDouble(String mensagem, String erro, double min, double max) {
        double retorno;

        do {
            retorno = mensagem(mensagem);
            if (retorno < min || retorno > max) {
                System.out.println(erro);
            }

        } while (retorno < min || retorno > max);
        return retorno;

    }

    public static double mensagem(String mensagem) {
        System.out.println(mensagem);
        return lerDouble();
    }

    public static double lerDouble() {
        return Scanner.nextDouble();
    }

}