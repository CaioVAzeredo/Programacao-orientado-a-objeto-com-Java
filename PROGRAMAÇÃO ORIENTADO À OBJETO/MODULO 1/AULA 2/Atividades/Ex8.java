import java.util.Scanner;

public class Ex8 {
    private static final Scanner Scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] nums = new int[5];
        int contador = 0;
        int somador = 0;
        double media = 0;
        int impar = 0;

        for (int i = 0; i < nums.length; i++) {
            System.out.println("informe o numero positivo");
            nums[i] = Scanner.nextInt();

            if (nums[i] < 0) {
                System.out.println("\nNÚMERO NEGATIVO\n");
                contador = 0;
                somador = 0;
                media = 0;
                impar = 0;
                nums = new int[0];
                break;
            } else {
                if (nums[i] % 2 != 0) {
                    impar++;
                }

                contador++;
                somador += nums[i];
            }
        }

        System.out.println("\nOs numeros inseridos sao: ");
        for (int y = 0; y < nums.length; y++) {
            System.out.println(nums[y]);
        }

        if (somador != 0 || contador != 0) {
            media = somador / contador;
        }

        System.out.println("\nMédia: " + media + "\nnúmeros impares: " + impar + "\nFIM");

    }

}