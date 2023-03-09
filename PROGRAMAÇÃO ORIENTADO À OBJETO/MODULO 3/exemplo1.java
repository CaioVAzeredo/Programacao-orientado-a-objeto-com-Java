//programa atendeu aos pilares da abstração, encapsulamento e herança.
public class exemplo1 {
    public static void main(String args[]) {
        Professor prof = new Professor();
        prof.setNome("João da Silva");// método acessor herdado
        prof.setCpf("165.812.493-60");// método acessor herdado
        prof.setSalario(8000); // método acessor herdado
        prof.setTitulacao("MESTRE"); // método acessor de professor
        double ir = prof.getImpostoRenda();
        System.out.println("Sr(a) " + prof.getNome() + " irá pagar de imposto no valor de: R$ " + ir + "\n");

        Administracao adm = new Administracao();
        adm.setNome("Caio V. Azeredo");// método acessor herdado
        adm.setCpf("179.558.123-35");// método acessor herdado
        adm.setSalario(8000); // método acessor herdado
        adm.setDependentes2("FILHO"); // método acessor de professor
        double contri = adm.getContribuicaoSindical();
        System.out.println("Sr(a) " + adm.getNome() + " irá pagar a contribuição sindical no valor de: R$ " + contri);

        
        
    }

    

}

class Funcionario {
    private String nome;
    private String cpf;
    private double salario1;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setSalario(double salario) {
        this.salario1 = salario;
    }

    public double getSalario() {
        return salario1;
    }
}

class Professor extends Funcionario {// vinculo de herança
    private String titulacao;

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public double getImpostoRenda() {
        return getSalario() * 0.15; // taxa fixa de 15% do salário
    }
}

class Administracao extends Funcionario {// vínculo de herança
    private String dependentes;

    public void setDependentes2(String dependentes) {
        this.dependentes = dependentes;
    }

    public String getDependentes() {
        return dependentes;
    }

    public double getContribuicaoSindical() {
        return getSalario() * 0.01; // taxa fixa de 1% do salario
    }

    
    
}