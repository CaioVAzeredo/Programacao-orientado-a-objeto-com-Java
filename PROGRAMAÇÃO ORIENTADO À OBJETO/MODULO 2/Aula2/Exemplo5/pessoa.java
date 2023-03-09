package Aula2.Exemplo5;

public class pessoa {
    private String nome;
    private String cpf;

    public pessoa(String Nome, String CPF){
        setNome(Nome);
        setCpf(CPF);
    }
    public pessoa(){
        
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }    

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
