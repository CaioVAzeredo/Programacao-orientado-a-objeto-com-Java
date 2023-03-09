import java.util.Calendar;

import EXEMPLOS.Administrativo;

public class main2 {
    public static void main(String[] args) {
        Professor2 p = new Professor2();
        p.setNome("Caio");
        p.setCpf("123.456.789-55");
        p.setTitulacao("MESTRE");
        p.setSalario(5000);

        System.out.println("***********PROFESSOR***********");
        System.out.println(p.getNome());
        System.out.println(p.getCpf());
        System.out.println(p.getTitulacao());
        System.out.println(p.getSalario());
        System.out.println(p.getImpostoRenda2());
        System.out.println(p.getGratificacao());


        // DATA DE ADMISSAO
        Calendar dataAdmiss = Calendar.getInstance();
        dataAdmiss.set(Calendar.DAY_OF_MONTH, 1);
        dataAdmiss.set(Calendar.MONTH, Calendar.MARCH);
        dataAdmiss.set(Calendar.YEAR, 2000);
        // 01/03/2000
        Administrativo adm = new Administrativo();
        
        adm.setDataAdmis(dataAdmiss);
        adm.setNome("Felipe");
        adm.setCpf("123.456.789-55");
        adm.setDependentes(2);
        adm.setSalario(5000);

        System.out.println("***********ADMINISTRADOR***********");

        System.out.println("Nome: " + adm.getNome());
        System.out.println("CPF: " + adm.getCpf());
        System.out.println("Dependentes: " + adm.getDependentes());
        System.out.println("Salario: " + adm.getSalario());
        System.out.println("Dias trabalhados: " + adm.getDataAdmissao());
        System.out.println("Contribuiçao: " + adm.getContribuicaoSindical());
        System.out.println("Gratificação: " + adm.getGratificao());
    }
}