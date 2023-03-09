package EXEMPLOS.Exemplo3;

public class pessoaJuridica extends pessoa{
    public pessoaJuridica(String nome) {
        super(nome);
        
        //TODO Auto-generated constructor stub
    }

    private String cnpj;
    private double lucroBruto;

    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getLucroBruto() {
        return lucroBruto;
    }
    public void setLucroBruto(double lucroBruto) {
        this.lucroBruto = lucroBruto;
    }

    public double getImpostoEspesical(){
        return getLucroBruto() * 0.13;
    }
}
