package ATIVIDADES_ARRAY;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class leitor {
    public static final Scanner Scanner = new Scanner(System.in);

    // ler String
    public static String lerString(String msg) {
        System.out.println(msg);
        return lerString();
    }

    public static String lerString() {
        return Scanner.next();
    }

    // ler Caracter
    public static char lerCaracter(String msg) {
        System.out.println(msg);
        return lerCaracter();
    }

    public static char lerCaracter() {
        return Scanner.next().charAt(0);
    }

    // ler numero inteiro
    public static int lerInt(String msg) {
        System.out.println(msg);
        return lerInt();
    }

    public static int lerInt() {
        return Scanner.nextInt();
    }

    public static double lerDouble(String msg) {
        System.out.println(msg);
        return lerDouble();
    }

    public static double lerDouble() {
        return new Scanner(System.in).nextDouble();
    }

    public static String criarAluno() {
        String nome = lerString("Insira um nome");

        return nome;
    }

    public static String Media2(ArrayList<Double> nota, ArrayList<String> aluno) {

        double somador = 0;
        String Alf = "";
        String Resultado = "";
        
        int i = 0;
        for(String elemento: aluno){
            
            Alf = Alf +" Nome: " + aluno.get(i) + " Nota: " + nota.get(i);
            i++;
        }
       
        for (double elemento : nota) {
            somador = somador + elemento;
        }
        double mediaTur = somador / aluno.size();

        Resultado = Alf + "\n Media da turma: " + mediaTur + "\nQuantidade de alunos: " + aluno.size();

        return Resultado;
    }

    public static Double criarNota() {
        double nota1 = lerDouble("Insira uma nota");
        double nota2 = lerDouble("Insira a segunda nota");
        double media = Media(nota1, nota2);

        return media;
    }

    public static double Media(double nota1, double nota2) {
        double media = (nota1 + nota2) / 2;
        return media;
    }

}
