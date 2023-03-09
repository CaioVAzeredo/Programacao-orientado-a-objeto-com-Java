package Ex9;

import java.util.Scanner;

public class leitor {
    public static final Scanner Scanner = new Scanner(System.in);

    // leitor de String
    public static String lerString(String msg) {
        System.out.println(msg);
        return lerString();
    }

    public static String lerString() {
        return Scanner.next();
    }

    // leitor de Character
    public static char lerChar(String msg) {
        System.out.println(msg);
        return lerChar();
    }

    public static char lerChar() {
        return Scanner.next().charAt(0);
    }

    // ler numero inteiro
    public static int lerInt(String msg) {
        System.out.println(msg);
        return lerInt();
    }

    public static int lerInt() {
        return Scanner.nextInt();
    }

    public static Aluno lerAluno() {
        Aluno a = new Aluno(); // criação do espaço da memoria
        a.nome = leitor.lerString("Insira o nome do aluno: "); // ler nome do aluno
        a.matricula = leitor.lerString("Insira a matricula do aluno(a) " + a.nome + ": ");// ler matricula do aluno
        a.situacao = leitor.lerChar("Insira a situação do(a) " + a.nome + " (B/R): ");// ler situacao do aluno
        
        return a;
    }

    public static Aluno[] criarAluno(int quantidade) {

        Aluno[] alunos = new Aluno[quantidade];
        for (int i = 0; i < alunos.length; i++) {
            alunos[i] = lerAluno();
        }
        return alunos;
    }

    public static String criarResultado(Aluno[] al) {
        
        String bolsista = criarBolsa(al);
        String resultado = criarQuantidade(al);
        String Resultado = resultado+bolsista;

        return Resultado;
    }
    public static String criarBolsa(Aluno[] al){
        String retorno = "";
        int bolsista = 0;
        int regular = 0;
        for (int i = 0; i < al.length; i++) {
           
            if(al[i].situacao == 'B'|| al[i].situacao == 'b'){
               bolsista++;
            } else{
               regular++;
            }
            retorno ="\nQuantidade de Bolsistas: " + bolsista+ " Quantidade de regular: " + regular + "\n";
            

       }
        return retorno;
    }
    
    public static String criarQuantidade(Aluno[] al) {
        String resposta = "";

        for (int i = 0; i < al.length; i++) {
            resposta = "\nNome: " + al[i].nome + "\nMatricula: " + al[i].matricula + "\nSituação: " + al[i].situacao+ "\n";     
        }
        return resposta;
    }
    public static String reprovado(Aluno[] al){

        return null;
    }
    public static double lerDouble(String msg) {
        System.out.println(msg);
        return lerDouble();
    }
    public static double lerDouble() {
        return Scanner.nextDouble();
    }

    public static double lerTempMin( String msg){
        double tempo = 0;
        do{
            System.out.println("Insira o tempo em minutos: ");
            tempo = lerDouble();
        }while(tempo<1 ||tempo >60 );
            return tempo;
    }

    public static Piloto lerPiloto(){
        Piloto p = new Piloto();
        p.piloto = lerString("Insira o nome do piloto: ");
        p.tempo = lerTempMin("Insira o tempo do piloto" + p.piloto);
        System.out.println(p.tempo);
        return p;
    }

    public static Piloto[] criarPiloto(int quantidade ) {
        Piloto[ ] pilotos = new Piloto[quantidade];

        for(int i = 0; i< pilotos.length; i++){
            pilotos[i] = lerPiloto();
        }
        return pilotos;
    }

    
}