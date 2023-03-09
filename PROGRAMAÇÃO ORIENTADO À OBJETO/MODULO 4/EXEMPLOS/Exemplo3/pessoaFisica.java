package EXEMPLOS.Exemplo3;

public class pessoaFisica extends pessoa{
    public pessoaFisica(String nome) {
        super(nome);
        
        //TODO Auto-generated constructor stub
    }

    private String cpf;
    private double salario;

    
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getImpostoEspesical(){
        return getSalario() * 0.10;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "\tCPF: " + getCpf() + "\tSalário: "+ getSalario();
    }

}
