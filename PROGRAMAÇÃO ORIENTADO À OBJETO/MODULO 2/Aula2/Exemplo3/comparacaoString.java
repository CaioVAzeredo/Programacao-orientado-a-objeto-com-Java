package Aula2.Exemplo3;

public class comparacaoString {
    public static void main(String[] args) {
        String a = new String("Java");
        String b = new String("Java");

        if(a.equals(b)){ //VARIAVEL.equals() => .equals é para comparar duas variaveis de valor String
            System.out.println("Iguais");
        }else{
            System.out.println("diferentes");
        }
    }
}
