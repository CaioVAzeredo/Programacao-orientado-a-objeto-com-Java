package Ex7;

public class Ex7_1 {

    public static void main(String[] args) {

        Numero [] num = leitor.receberNumero(5000);
        String numero = leitor.criarResultado(num);
        print.printNum(numero);

    }
}

class Numero {
    double numero;
}
