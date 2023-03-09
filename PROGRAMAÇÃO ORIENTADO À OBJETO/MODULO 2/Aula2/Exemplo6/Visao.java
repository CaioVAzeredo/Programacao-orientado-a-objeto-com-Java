package Aula2.Exemplo6;

import java.util.ArrayList;

import Atividade3.pessoa;
import Atividade4.Pessoa;
import Ex1.leitor;

public class Visao {

    public static habitante lerHabitante() {
        habitante h = new habitante();
        h.setNome(leitor.lerString("Insira o nome do habitante: "));
        h.setAnoNasc(leitor.lerInt("Insira o ano de nascimento do(a) " + h.getNome(),
                "Insira um ano de nascimento válido", 1920, 2022));
        h.setSalario(leitor.lerDouble("Informe o valor do salário do " + h.getNome() + ": ",
                "Coloque um número de salário válido: ", 0, Double.MAX_VALUE));
        return h;
    }

    public static void imprimir(habitante h) {
        System.out.println("Nome: " + h.getNome());
        System.out.println("Ano de Nascimento: " + h.getAnoNasc());
        System.out.println("Salário do(a): " + h.getNome() + ": " + h.getSalario());
        System.out.println("Classe social do(a) " + h.getNome() + ": " + h.getClasseSocial());

    }

    public static void imprimir(ArrayList<habitante> h) {
        for (habitante ha : h) {
            imprimir(ha);
        }

    }

    public static Pessoa lerPessoa() {
        Pessoa p = new Pessoa();
        p.setNome(leitor.lerString("Insira o nome da pessoa: "));
        p.setSalario(leitor.lerDouble("Insira o salrio do(a) " + p.getNome() + ": ", "Insira um valor válido!!", 0,
                999999999));
        p.setCodigo(leitor.lerDouble("Insira o valor do código do(a) " + p.getNome() + ": ", "Insira um valor válido",
                0, 999999999));
        return p;
    }

    

}
