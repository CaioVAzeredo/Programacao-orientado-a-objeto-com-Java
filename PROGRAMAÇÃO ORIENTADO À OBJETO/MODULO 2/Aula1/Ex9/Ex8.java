package Ex9;

public class Ex8 {
    public static void main(String[] args) {
      
        int quantidade =leitor.lerInt("Insira a quantidade de pilotos: ");
        Piloto [] p = leitor.criarPiloto(quantidade);
    }
}
class Piloto{
   String piloto;
   double tempo;
   
}
