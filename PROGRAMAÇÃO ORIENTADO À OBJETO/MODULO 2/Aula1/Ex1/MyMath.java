package Ex1;

public class MyMath {

    public static void main(String[] args) {
        char escolha;
        String operacao = "";

        do {
            escolha = leitor.lerChar("Escolha uma opção:\n(Fatorial(F)/ Maior(M)/ Par(P)/ Primo(R)): ");
            if (escolha == 'F' || escolha == 'f' || escolha == 'M' || escolha == 'm' || escolha == 'P' || escolha == 'p'|| escolha == 'R' || escolha == 'r') {
                operacao = calcular.condicao(escolha);
                print.printnumeros(operacao);
            }
        } while (escolha != 'F' && escolha != 'f' && escolha != 'M' && escolha != 'm' && escolha != 'P' && escolha != 'p' && escolha != 'R' && escolha != 'r');
    }
}
