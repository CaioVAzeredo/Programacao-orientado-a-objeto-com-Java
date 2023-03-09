import java.util.Scanner;

public class leitor {

    public static Piloto[] criarPiloto(int quantidade) {
        Piloto[] p = new Piloto[quantidade];
        for (int i = 0; i < p.length; i++) {
            p[i] = lerPiloto();
        }
        return p;
    }

    public static Piloto lerPiloto() {
        Piloto p = new Piloto();
        p.nome = lerString("Insira o nome do piloto: ");
        p.escudaria = lerString("Insira a escudaria do piloto" + p.nome + ": ");
        p.tmpVoo = lerTmpMin("Insira o tempo de voo do piloto em minutos: ");

        return p;
    }

    private static double lerTmpMin(String msg) {
        double tempo = 0;
        do {
            System.out.println(msg);
            tempo = lerDouble();
        } while (tempo < 1 || tempo > 59);

        return tempo;
    }

    private static double lerDouble(String msg) {
        System.out.println(msg);
        return lerDouble();
    }

    private static double lerDouble() {
        return new Scanner(System.in).nextDouble();
    }

    private static String lerString(String msg) {
        System.out.println(msg);
        return lerString();
    }

    private static String lerString() {
        return new Scanner(System.in).next();
    }

    public static int lerInt(String msg) {
        System.out.println(msg);
        return lerInt();
    }

    public static int lerInt() {
        return new Scanner(System.in).nextInt();
    }

    public static String Resultado(Piloto[] p) {
        String resultado = melhor(p); 
        double media = mediaTemp(p);

        String resultadoFinal = resultado +"\n A media do tempo dos pilotos são de: "+ media;
        return resultadoFinal;
    }

    public static String melhor(Piloto[] p) {

        double maiorTempo = 0;
        String pilotoRapido = "";
        double menorTempo = 0;
        String pilotoLento = "";
        String retorno = "";

        for (int i = 0; i < p.length; i++) {

            if (maiorTempo < p[i].tmpVoo) {
                maiorTempo = p[i].tmpVoo;
                pilotoRapido = p[i].nome;
            }
            if (menorTempo > p[i].tmpVoo) {
                menorTempo = p[i].tmpVoo;
                pilotoLento = p[i].nome;
            }
        }
        retorno = "O piloto mais rápido: " + pilotoRapido + "\nO piloto mais lento : " + pilotoLento;

        return retorno;
    }
    public static double mediaTemp(Piloto[] p){
        double somador = 0;
        double contador = 0;

        for(int i = 0; i < p.length; i++){
            contador++;
            somador += p[i].tmpVoo;
        }
        double media = somador/contador;

        return media;
    }

    public static void print(String pilotos) {
        System.out.println(pilotos);
    }
}