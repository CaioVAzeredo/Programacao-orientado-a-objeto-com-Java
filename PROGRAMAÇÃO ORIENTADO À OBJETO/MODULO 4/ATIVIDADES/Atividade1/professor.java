package Atividade1;

class professor extends funcionario {

    private String titulacao;
    public double getImpostorenda() {
        return getSalario() * 0.23;
    }


    public professor() {
    }
    public professor(String nome, String cpf, double salario, String titulacao) {
        setNome(nome);
        setCpf(cpf);
        setSalario(salario);
        setTitulacao(titulacao);
    }

    public String getTitulacao() {
        return titulacao;
    }
    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String toString(){
        return "\nNome: " + getNome() + "\tCPF: " + getCpf() + "\tSalario: " + getSalario() + "\tTitulação: " + getTitulacao() + "\n\tImposto de renda: " + getImpostorenda();
    }

}
