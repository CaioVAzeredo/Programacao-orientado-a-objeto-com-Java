package exemplo6;

public class professor {
    private String nome;
    private String titulacao;
    private double salario;
    private String matricula;


    public boolean equals(Object obj){
        if(obj instanceof professor){
            professor temp = (professor) obj;
            if(getMatricula().equalsIgnoreCase(temp.getMatricula())){
                return true;
            }else{
                return false;
            }
        }
        return super.equals(obj);
    }

    public String toString() {
        return "nome: " + getNome() + "\tTitulação: " + getTitulacao() + "\tSalario: " + getSalario();
    }

    public professor() {

    }

    public professor(String nome, String titulacao, double salario, String matricula) {
        setNome(nome);
        setTitulacao(titulacao);
        setSalario(salario);
        setMatricula(matricula);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}
