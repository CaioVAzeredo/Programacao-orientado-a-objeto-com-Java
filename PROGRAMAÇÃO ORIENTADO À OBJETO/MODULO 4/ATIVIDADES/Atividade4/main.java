package Atividade4;
import java.util.ArrayList;

import Aula2.Exemplo6.Visao;
import Ex1.leitor;
public class main {
    public static void main(String[] args) {
        anonimousti anon = new anonimousti();

        char condicao;
        do{
            Pessoa p = Visao.lerPessoa();
            anon.adicionar(p);
            condicao = leitor.lerChar("Deseja adicionar uma pessoa? s - sim, n - não");
        }while(condicao == 's'|| condicao == 'S');

        
    }
}
