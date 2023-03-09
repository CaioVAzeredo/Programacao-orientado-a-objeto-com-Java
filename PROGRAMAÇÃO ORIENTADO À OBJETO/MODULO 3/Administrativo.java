import java.util.Calendar;

public class Administrativo extends Funcionario {
    private int dependentes;
    private Calendar dataAdmis;

    public int getDiasTrabalhados(){
        Calendar dataAdmis = Calendar.getInstance();
        int MILLIS_IN_DAY = 86400000;
        return (int) ((dataAdmis.getTimeInMillis() - getDataAdmis().getTimeInMillis())/MILLIS_IN_DAY);
    }
    public double getGratificacao(){
        
        return getDiasTrabalhados()*0.30;
    }

    public double getContribuicaoSindical(){
        return getSalario() * 0.01;
    }

    public int getDependentes() {
        return dependentes;
    }
    public void setDependentes(int dependentes) {
        this.dependentes = dependentes;
    }
    public Calendar getDataAdmis() {
        return dataAdmis;
    }
    public void setDataAdmis(Calendar dataAdmis) {
        this.dataAdmis = dataAdmis;
    }
    
}
