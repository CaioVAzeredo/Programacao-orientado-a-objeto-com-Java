
import java.util.Scanner;

public class Ex1 {
    private static final Scanner Scanner = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("Salário de um professor: ");
        double salario = Scanner.nextDouble();
        System.out.println(salario);

        System.out.println("Idade de uma criança: ");
        int idade = Scanner.nextInt();

        if (idade < 13) {
            System.out.println("CRIANÇA");
        } else {
            System.out.println("ADULTO");
        }

        System.out.println("O servidor publico tem plano de saúde? (s/n)");
        char plano = Scanner.next().charAt(0);

        if (plano == 's' || plano == 'n') {
            if (plano == 'n') {
                System.out.println("NAO");
            } else {
                System.out.println("SIM");
            }
        }
        if (plano != 's' && plano != 'n') {
            System.out.println("INFORMAÇÃO INVALIDA");
        }

        System.out.println("Informe se é casado ou não. Casado(c) Solteiro(s)");
        char casado = Scanner.next().charAt(0);

        if (casado == 'c' || casado == 's') {
            if (casado == 'c') {
                System.out.println("CASADO(A)");
            } else {
                System.out.println("SOLTEIRO(A)");
            }
        }
        if (casado != 'c' && casado != 's') {
            System.out.println("INFORMAÇÃO INVÁLIDA");
        }

        System.out.println("Qual o nome do aluno?");
        String nome = Scanner.next();
        System.out.println(nome);

    }
}
