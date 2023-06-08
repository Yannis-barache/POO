import java.sql.Array;

import java.util.ArrayList;
import java.util.List;

public abstract class CalculPoidsSac extends ArrayList<Cadeau>{

    private int poidsMax;


    public CalculPoidsSac(int poidsMax) {
        super();
        this.poidsMax = poidsMax;
    }
    

    public void recevoir(Cadeau cadeau) {
        if (getPoids()+cadeau.getPoids()<=poidsMax) {
            this.add(cadeau);
        } else {
            System.out.println("Je n'ai plus de place dans mon sac!");
        }
    
    }

    public int getPoidsMax() {
        return poidsMax;
    }

    public int getPoids() {
        int res=0;
        for (Cadeau cadeau : this) {
            res+=cadeau.getPoids();
        }
        return res;
    }

    
}
