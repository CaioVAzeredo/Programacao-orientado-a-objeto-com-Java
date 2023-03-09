import java.util.Scanner;

public class Ex3 {

    private static final Scanner Scanner = new Scanner(System.in);

    public static void main(String[] arg) {
        System.out.print("Insira uma nota: ");
        double nota1 = Scanner.nextDouble();
        System.out.print("Insira a segunda nota: ");
        double nota2 = Scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 7) {
            System.out.printf("Nota: " + media + "\nAPROVADO");
        } else {
            System.out.printf("Nota: " + media + "\nREPROVADO");
        }
    }
}
