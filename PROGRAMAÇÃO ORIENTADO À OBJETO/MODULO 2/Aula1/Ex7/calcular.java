package Ex7;

public class calcular {
    public static double calcularDivida(double valor, double taxa) {
        double juros = (valor * (taxa + 100)) / 100;
        return juros;
    }

    public static double fahrenheit(double celsius) {
        double FAR = (9 * celsius + 160) / 5;
        return FAR;
    }

    public static double numero(double numero) {
        int retorno = 0;
        for (int i = 0; i <= numero; i++) {
            retorno = retorno + i;
        }
        return retorno;
    }

    public static double maior(double num1, double num2) {
        double maior = 0;
        if (num1 > num2) {
            maior = num1;
        } else {
            maior = num2;
        }
        return maior;
    }

    public static double par(double numero) {
        double resultado = 0;
        if (numero % 2 == 0) {
            resultado = 1;
        } else {
            resultado = 0;
        }
        return resultado;
    }

    public static double primo(double numero) {
        double divisao = 0;
        double resultado = 0;

        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                divisao = 1;
                break;
            }
        }
        if (numero > 1 && divisao == 1) {
            resultado = 0;
        } else {
            resultado = 1;
        }
        return resultado;
    }

    public static String condicao(double escolha) {
        String retorno = "";
            if (escolha == 'F' || escolha == 'f') {
                double num = leitor.lerDouble("Insira um número: ");
                double fatorial = numero(num);
                String mensagem = "O fatorial do numero: " + num + " é: " + fatorial;
                retorno = mensagem;
            }
            if (escolha == 'M' || escolha == 'm') {
                double num1 = leitor.lerDouble("Insira o primeiro numero: ");
                double num2 = leitor.lerDouble("Insira o segundo número");
                double maior = maior(num1, num2);
                String mensagem = "O maior numero é: " + maior;

                retorno = mensagem;
            }
            if (escolha == 'P' || escolha == 'p') {
                double num = leitor.lerDouble("Insira um número: ");
                double resultado = par(num);
                String mensagem = "";
                if (resultado == 1) {
                    mensagem = "PAR";
                } else {
                    mensagem = "IMPAR";
                }

                retorno = mensagem;
            }

            if (escolha == 'R' || escolha == 'r') {
                double numero = leitor.lerDouble("Insira um número: ");
                double resultado = primo(numero);
                String mensagem = "";
                if (resultado == 1) {
                    mensagem = "O número " + numero + " é primo";
                } else {
                    mensagem = "O número " + numero + " NÃO é primo";
                }
                retorno = mensagem;
            }        

        return retorno;
    }

    public static double soma(double num) {
            double s =  1;
            double somador = 0;

        for(int i = 1; i <= num; i++){
            somador += s/i;
        }
        return somador + 1;
    }


    
}
