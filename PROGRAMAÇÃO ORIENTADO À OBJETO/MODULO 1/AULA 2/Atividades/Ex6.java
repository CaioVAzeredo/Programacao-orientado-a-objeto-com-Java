import java.util.Scanner;

public class Ex6 {
    public static final Scanner Scanner = new Scanner(System.in);

    public static void main(String[] arg) {
        double num1;
        double num2;
        System.out.println("DIGITE QUALQUER LETRA OU NÚMERO QUE PARA SAIR");
        do {
            System.out.println("Deseja adicionar aluno?\n s: para sim\n n: para não");
            char letra = Scanner.next().charAt(0);
            if (letra == 'n' && letra == 'N' || letra != 's' && letra != 'S') {
                if (letra != 'n' && letra != 's') {
                    System.out.println("INFORMAÇÃO INVÁLIDA");
                }
                break;
            } else {
                System.out.println("Insira o nome do aluno: ");
                String nome = Scanner.next();
                do {
                    System.out.println(" INSIRA AS NOTAS ENTRE 0(ZRERO) E 10\n Insira o primeiro número: ");
                    num1 = Scanner.nextDouble();
                    if (num1 < 0 || num1 > 10) {
                        System.out.println("NÚMERO INVÁLIDO");
                    }
                } while (num1 < 0 || num1 > 10);
                do {
                    System.out.println("Insira o segundo número");
                    num2 = Scanner.nextDouble();
                    if (num2 < 0 || num2 > 10) {
                        System.out.println("NÚMERO INVÁLIDO");
                    }
                } while (num2 < 0 || num2 > 10);
                double media = (num1 + num2) / 2;
                if (media > 6) {
                    System.out.println("\nAluno: " + nome + "\nPrimeira nota: " + num1 + "\nSegunda nota: " + num2
                            + "\nMédia: " + media + "\nSituação: APROVADO\n");
                } else {
                    System.out.println("\nAluno: " + nome + "\nPrimeira nota: " + num1 + "\nSegunda nota: " + num2
                            + "\nMédia: " + media + "\nSituação: REPROVADO\n");
                }
            }
        } while (true);
        System.out.println("ADEUS!");
    }
}