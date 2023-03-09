package Atividade1;

public class administrativo extends funcionario {
    private double dependentes;

    public double getContribuicaoSind() {
        return getSalario() * 0.01;
    }

    public administrativo() {
    }

    public administrativo(String nome, String cpf, double salario, double dependentes) {
        setNome(nome);
        setCpf(cpf);
        setSalario(salario);
        setDependentes(dependentes);
    }

    public double getDependentes() {
        return dependentes;
    }

    public void setDependentes(double dependentes) {
        this.dependentes = dependentes;
    }

    public String toString(){
        return "\nNome: " + getNome() + "\tCPF: " + getCpf() + "\tSalario: " + getSalario() + "\tTitulação: " + getDependentes() + "\n\tImposto de renda: " + getContribuicaoSind();
    }

}
