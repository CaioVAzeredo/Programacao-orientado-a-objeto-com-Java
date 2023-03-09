package Aula2.Exemplo6;

import java.util.ArrayList;

public class Prefeitura {
    private ArrayList<habitante> habitantes;

    
    
    
    public Prefeitura(){
        setHabitantes(new ArrayList<habitante>());
    }
     
    public void adicionar(habitante h) {
        getHabitantes().add(h);
    }

    
    public ArrayList<habitante> buscarPorAnoNasc(int anoNasc){
        ArrayList<habitante> HabitantesFiltrados = new ArrayList<habitante> ();
        for(habitante habitante : getHabitantes()){
            if(habitante.getAnoNasc() > anoNasc){
                HabitantesFiltrados.add(habitante);
            }
        }
        return HabitantesFiltrados;
    }

    public ArrayList<habitante> buscarPorClasse(char classe){
        ArrayList<habitante> HabitantesFiltrados = new ArrayList<habitante> ();
        for(habitante habitante : getHabitantes()){
            if(habitante.getClasseSocial() == classe){
                HabitantesFiltrados.add(habitante);
            }
        }
        return HabitantesFiltrados;
    }

    public habitante buscarPorMaioS(){
       habitante rico = getHabitantes().get(0);
       for(habitante habitante : getHabitantes()){
        if(habitante.getSalario() > rico.getSalario()){
            rico = habitante;
        }

       }
        return rico;
    }



    
    public ArrayList<habitante> getHabitantes() {
        return habitantes;
    }
    public void setHabitantes(ArrayList<habitante> habitantes) {
        this.habitantes = habitantes;
    }


    
    
}
