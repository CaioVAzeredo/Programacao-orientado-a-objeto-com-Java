package Atividade3;

public class pessoa {
    private String nome;
    private double salario;
    private int codigo;

    

    public String getClasSocial() {

        if (getSalario() > 400 && getSalario() < 950) {
            return "Classe F";
        } else if (getSalario() > 950 && getSalario() < 1400) {
            return "Classe E";
        } else if (getSalario() > 1400 && getSalario() < 2300) {
            return "Classe D";
        } else if (getSalario() > 2300 && getSalario() < 4600) {
            return "Classe C";
        } else if (getSalario() > 4600 && getSalario() < 8100) {
            return "Classe B";

        } else if (getSalario() > 8100 && getSalario() < 14400) {
            return "Classe A2";
        } else {
            return "Classe A1";
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String toString(){
        return "Nome: "+getNome()+ "\tClasse social: " + 
        getClasSocial() + "\tCódigo: " + getCodigo();
    }


    

}
