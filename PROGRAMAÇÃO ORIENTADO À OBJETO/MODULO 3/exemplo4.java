public class exemplo4 {
        public static void main(String[] args) {
          Aluno aluno = new Aluno("Pedro Brito", 10, 6);
          System.out.println(aluno.toString());
        }
      }
      class Aluno{
        private String nome;
        private double notaUm;
        private double notaDois;
      
        public double getMedia(){
          return (getNotaUm() + getNotaDois()) / 2;
        }
          
        public Aluno(String nome, double notaUm, double notaDois) {
          setNome(nome);
          setNotaUm(notaUm);
          setNotaDois(notaDois);
        }
        
        public String getNome() {
          return nome;
        }
        public void setNome(String nome) {
          this.nome = nome;
        }
        public double getNotaUm() {
          return notaUm;
        }
        public void setNotaUm(double notaUm) {
          this.notaUm = notaUm;
        }
        public double getNotaDois() {
          return notaDois;
        }
        public void setNotaDois(double notaDois) {
          this.notaDois = notaDois;
        }
        //toString para representação do objeto em forma de String.
        @Override
        public String toString() {
          String texto = "\nNome: "+getNome()+"\n"
            +"\nNota 1: "+getNotaUm()+"\n"
            +"\nNota 2: "+getNotaDois()+"\n"
            +"\nMedia : "+getMedia()+"\n"
            +"\nStatus: "+(getMedia() > 7 ? "Aprovado":"Reprovado")+"\n";
          return texto;
        }
        //sobrescrita do construtor
      }

