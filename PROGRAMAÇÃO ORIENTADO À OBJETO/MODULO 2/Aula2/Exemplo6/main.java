package Aula2.Exemplo6;

import java.util.ArrayList;

import Ex1.leitor;

public class main {
    public static void main(String[] args) {
        Prefeitura pref = new Prefeitura();

        char condicao;
        do {
            habitante h = Visao.lerHabitante();
            pref.adicionar(h);
            condicao = leitor.lerChar("Deseja colocar algum cidadao? S - sim N- não");
        } while (condicao == 's');

        

        ArrayList<habitante> habNasc = pref.buscarPorAnoNasc(1970);
        ArrayList<habitante> habClass = pref.buscarPorClasse('B');
        habitante rico = pref.buscarPorMaioS();

               

        
        System.out.println("****** NASCIDOS EM 1970 ******");
        Visao.imprimir(habNasc);
        System.out.println("****** HABITANTE DA CLASSE B ******");
        Visao.imprimir(habClass);
        System.out.println("****** HABITANTE MAIS RICO ******");
        Visao.imprimir(rico);
        
        
        
    }
}
