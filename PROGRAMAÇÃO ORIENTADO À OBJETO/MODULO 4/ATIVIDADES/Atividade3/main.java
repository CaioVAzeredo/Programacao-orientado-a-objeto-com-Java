package Atividade3;

import Ex1.leitor;

public class main {
    public static void main(String[] args) {
        pessoa p = new pessoa();
        p.setNome(leitor.lerString("Insira o nome da pessoa: "));
        p.setSalario(leitor.lerDouble("Insira o valor do salário do(a) " + p.getNome()+ ": ","CODIGO ERRADO!!", 0,10000000));
        p.setCodigo(leitor.lerInt("Insira o codigo da pessoa"+p.getNome() +": ", "CODIGO ERRADO!!", 0,10000000));
        
        System.out.println(p.toString());

    }
}
