import java.util.List;


import java.util.ArrayList;
import java.util.List;

public class Ronin {

    List<Cadeau> sac;
    String motDePasse;

    public Ronin() {
        this.sac = new ArrayList<Cadeau>();
        this.motDePasse = null;
    }

    public void recevoir(Cadeau cadeau) {
        sac.add(cadeau);
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    @Override 
    public String toString(){
        String s = "Je suis un Ronin ";
        if (motDePasse != null) {
            s += "mon mot de passe est " + motDePasse + "\n";
        } else {
            s += "mais je n'ai pas encore de mot de passe!\n";
        }
        s += "Et mon sac : " + sac;
        return s;
    }
    
}
