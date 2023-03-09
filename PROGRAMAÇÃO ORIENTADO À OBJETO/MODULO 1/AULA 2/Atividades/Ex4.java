import java.util.Scanner;

/*Escreva um programa em Java que leia a idade e a altura de 10 pessoas. Calcule e informe a média das alturas das pessoas com mais de 50 anos. Para isso, use for. */
public class Ex4 {

    public static final Scanner Scanner = new Scanner(System.in);

    public static void main(String args[]) {

        int contador = 0;
        double alturas = 0;

        for (int i = 0; i <= 10; i++) {
            System.out.println("Insira a idade: ");
            int idade = Scanner.nextInt();
            if (idade > 50) {
                System.out.println("Insira a sua altura: ");
                double altura2 = Scanner.nextDouble();

                alturas += altura2;
                contador++;
            }
        }
        double media = alturas / contador;
        System.out.println("A média de altura das pessoas acima de 50 anos é: " + media + "metros");
    }
}
