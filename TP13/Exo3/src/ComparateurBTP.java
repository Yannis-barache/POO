import java.util.Comparator;

public class ComparateurBTP implements Comparator<Etudiant> {

    /**
     * Compare deux étudiants selon leur score de télékinésie
     * @param e1 Le premier étudiant
     * @param e2 Le deuxième étudiant
     * @return 1 si le premier étudiant a un meilleur score, -1 si le deuxième étudiant a un meilleur score, 0 si les deux étudiants ont le même score
     */
    @Override
    public int compare(Etudiant e1, Etudiant e2){
        if (e1.getTelekinesie()<e2.getTelekinesie()){
            return 1;
        }
        else if (e1.getTelekinesie()>e2.getTelekinesie()){
            return -1;
        }
        else{
            return 0;
        }
    }
}
