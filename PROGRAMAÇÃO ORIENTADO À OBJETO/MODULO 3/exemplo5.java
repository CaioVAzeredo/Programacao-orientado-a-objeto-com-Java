public class exemplo5 {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("José Silva", "123.456.789-10");
        Pessoa p2 = new Pessoa("José Silva", "124.456.789-10");
        if (p1.equals(p2)) {
            System.out.println("As pessoas são iguais!");
        } else {
            System.out.println("As pessoas são diferentes!");
        }
    }
}

class Pessoa{
    private String nome;
    private String cpf;
    //sobre carga do método construtor
    public Pessoa() {}
    public Pessoa (String nome, String cpf){
      setNome(nome);
      setCpf(cpf);
    }
    //métodos acessores
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
    @Override
    public boolean equals(Object obj) {
      if(obj instanceof Pessoa){// obj é uma pessoa?
        //casting de Object para Pessoa.
        Pessoa param = (Pessoa) obj;
        //usando o equals de String, não confunda.
        if(getCpf().equals(param.getCpf())){
          return true;//são iguais
        }else
        return false;//são diferentes
      }
      return false;//Se não for pessoa já retorna.
    }
  }
