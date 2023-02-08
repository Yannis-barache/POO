import java.util.List;
import java.util.ArrayList;

public class Pluviometrie {
    private int annee;
    private int semaine;
    private List<Integer> precipitations;

    public Pluviometrie (int annee , int semaine){
        this.annee=annee;
        this.semaine=semaine;
        this.precipitations= new ArrayList<>();
        for (int i=0 ; i<7;i++){
            this.precipitations.add(0);
        }

    }
    
    public void setPrecipitation(int jour, int pluie) {
        precipitations.set(jour,pluie);

    }

    public int getPluie(int jour){
        return precipitations.get(jour);
    }
    
    public int quantiteTotale (){
        int somme=0;
        for (int i=0 ; i<precipitations.size(); i++){
            if (precipitations.get(i)!= null) {
                somme+=precipitations.get(i);
            }
        }
        return somme;
        
    }

    public int quantiteMax (){
        int max=0;
        for (int i =0 ; i<precipitations.size();i++){
            if (precipitations.get(i)> max){
                max=precipitations.get(i);
            }
        }
        return max;
        
    }

    public boolean estPluvieuse(){
        for (int i=0;i<precipitations.size()-1;i++){
            if (precipitations.get(i)!=null && precipitations.get(i+1)!=null){
                if (precipitations.get(i)!=0 && precipitations.get(i+1)!=0){
                    return true;
                }
            }
        }
        return false;
    }




    
}
