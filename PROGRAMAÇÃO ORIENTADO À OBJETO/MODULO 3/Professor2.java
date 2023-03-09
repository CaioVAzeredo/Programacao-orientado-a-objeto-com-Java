import EXEMPLOS.Funcionario;

public class Professor2 extends Funcionario{
    private String titulacao;

    public double getImpostoRenda2(){
        return getSalario()*0.15;
    }

    public double getGratificacao(){
        if(getTitulacao().equalsIgnoreCase("ESPECIALISATA")){
            return getSalario()*0.1;
        }else  if(getTitulacao().equalsIgnoreCase("MESTRE")){
            return getSalario()*0.12;
        }else if(getTitulacao().equalsIgnoreCase("DOUTOR")){
            return getSalario()*0.15;
        }else{
            return 0;
        }
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
}
