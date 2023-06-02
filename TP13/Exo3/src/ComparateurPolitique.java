import java.util.Comparator;

import java.util.Comparator;

public class ComparateurPolitique implements Comparator<Etudiant> {

    @Override
    public int compare(Etudiant e1, Etudiant e2){
        int telepathie1 = e1.getTelepathie();
        int telepathie2 = e2.getTelepathie();
        int precognition1 = e1.getPrecognition();
        int precognition2 = e2.getPrecognition();
        double calcul1 = telepathie1 + 0.5 * precognition1;
        double calcul2 = telepathie2 + 0.5 * precognition2;
        if (calcul1 > calcul2){
            return -1;
        }
        else if (calcul1 < calcul2){
            return 1;
        }
        else{
            return 0;
        }
    }
    
}
