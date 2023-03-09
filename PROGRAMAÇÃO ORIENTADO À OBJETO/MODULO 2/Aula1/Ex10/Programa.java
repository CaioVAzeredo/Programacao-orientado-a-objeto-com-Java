public class Programa {
    public static void main(String[] args) {
        int quantidade = leitor.lerInt("Insira aquantidade de pilotos: ");
        Piloto[] p = leitor.criarPiloto(quantidade);
        
        String pilotos = leitor.Resultado(p);

        leitor.print(pilotos);
    }
}

class Piloto {
    String nome;
    String escudaria;
    double tmpVoo;
}