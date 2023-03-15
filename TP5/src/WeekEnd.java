import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class WeekEnd {
    private String dateDuWeekEnd;
    private List<Depense> lesDepenses;
    private List<Personne> participants;


    public WeekEnd(String date){
        this.dateDuWeekEnd=date;
        this.lesDepenses= new ArrayList<>();
        this.participants= new ArrayList<>();
    }

    public void ajouteParticipant(String prenom, int age){
        this.participants.add(new Personne(prenom, age));
    }

    public void ajouteParticipant(Personne personne){
        this.participants.add(personne);
    }

    public void ajouteDepense(double montant, String produit, Personne personne){
        this.lesDepenses.add(new Depense(personne, montant, produit));
    }

    public double totalDepense(Personne personne){
        double somme=0;
        for (Depense depense:this.lesDepenses){
            if (depense.getPersonne().equals(personne)){
                somme+=depense.getMontant();
            }
        }
        return somme;
    }

    public double totalDepense(){
        double somme=0;
        for (Depense depense:this.lesDepenses){
            somme+=depense.getMontant();
        }
        return somme;
    }

    public double totalDepense(String produit){
        double somme=0;
        for (Depense depense:this.lesDepenses){
            if (depense.getProduit().equals(produit)){
                somme+=depense.getMontant();
            }
        }
        return somme;
        
    }

    public double avoirPersonne(Personne personne){
        if (this.lesDepenses.size()==0){
            return 0.0;
        }
        double depensePersonne=this.totalDepense(personne);
        double moyenne=this.totalDepense()/this.participants.size();
        return Math.round((depensePersonne-moyenne)*100.0)/100.0;
    }
    
}
