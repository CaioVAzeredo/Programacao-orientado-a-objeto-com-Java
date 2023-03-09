import java.util.Scanner;

public class prova {
    public static void main(String[] args) {
        System.out.println(maior(30, 10));
        System.out.println(isPar(22));

    }

    private static int maior(int i, int j) {
        return (i > j) ? i : j;
    }

    public static boolean isPar(int n) {
        return (n % 2) == 0;
    }
}