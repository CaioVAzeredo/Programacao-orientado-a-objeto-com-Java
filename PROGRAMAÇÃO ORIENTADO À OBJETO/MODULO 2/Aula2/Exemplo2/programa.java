package Aula2.Exemplo2;



public class programa {
    public static void main(String[] args) {
        Aluno a = new Aluno();
        
            a.setNome("Caio");
            a.setNota1(10);
            a.setNota2(6);
           
        
        
        
        System.out.println("Nome: " + a.getNome());
        System.out.println("\nPrimeria nota: " + a.getNota1());
        System.out.println("\nSegunda nota: " + a.getNota2());
        System.out.println("\nMédia das notas: " + a.getMedia());
    }
}
