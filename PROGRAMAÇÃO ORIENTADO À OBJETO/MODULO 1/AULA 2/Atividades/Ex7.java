import java.util.Scanner;

public class Ex7 {
    public static final Scanner Scanner = new Scanner(System.in);

    public static void main(String[] arg) {
        double nota1;
        double nota2;
        do {
            System.out.println("Adicione a primeira nota:");
            nota1 = Scanner.nextDouble();
            if (nota1 < 0 || nota1 > 10) {
                System.out.println("VALOR INVALIDO");
            }
        } while (nota1 < 0 || nota1 > 10);
        do {
            System.out.println("Adicione a segunda nota: ");
            nota2 = Scanner.nextDouble();
            if (nota2 < 0 || nota2 > 10) {
                System.out.println("VALOR INVALIDO");
            }
        } while (nota2 < 0 || nota2 > 10);
        double media = (nota1 + nota2) / 2;
        if (media >= 6) {
            System.out.println("\nPrimeira nota: " + nota1 + "\nSegunda nota: " + nota2 + "\nMédia: " + media + "\nSituação: APROVADO");
        } else {
            System.out.println("\nPrimeira nota: " + nota1 + "\nSegunda nota: " + nota2 + "\nMédia: " + media + "\nSituação: REPROVADO");
        }
    }
}
