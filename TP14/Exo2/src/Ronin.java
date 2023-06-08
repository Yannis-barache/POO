import java.util.List;


import java.util.ArrayList;
import java.util.List;

public class Ronin extends CalculPoidsSac{

    String motDePasse;

    public Ronin() {
        super(30);
        this.motDePasse = null;
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
        s += "Et mon sac : " + super.toString();
        return s;
    }

    public void interagir(Yakuza yakuza) {
        if (super.getPoids()>20){
            yakuza.recevoir(this.get(this.size()-1));
        }
    }
    
}
