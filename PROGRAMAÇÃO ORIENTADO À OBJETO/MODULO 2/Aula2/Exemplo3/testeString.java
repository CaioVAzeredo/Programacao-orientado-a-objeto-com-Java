package Aula2.Exemplo3;

public class testeString {
    public static void main(String[] args) {
        String a = "teste";
        a = a + " outro teste";
        System.out.println(a);

        double num = 10;

        StringBuilder sb = new StringBuilder();
        sb.append(num);
        sb.append(" outro teste");
        System.out.println(sb);
        
        StringBuffer sbuf = new StringBuffer();
        sbuf.append("teste");
        sbuf.append(" outro teste");
        System.out.println(sbuf);
    }
}
