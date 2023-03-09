package Atividade4;

public class Pessoa {

private String nome; 
private double salario; 
private double codigo;


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
public double getCodigo() {
    return codigo;
}
public void setCodigo(double codigo) {
    this.codigo = codigo;
}

public String toString(){
    return "Nome: " + getNome();
}


}
