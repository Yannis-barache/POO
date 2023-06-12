import java.util.List;
import java.util.ArrayList;

public class ModeleMap<T> {

    private List<ModeleCouple<T>> couples;

    public ModeleMap(List<ModeleCouple<T>> couples){
        this.couples = couples;
    }

    public ModeleMap(){
        this.couples = new ArrayList<>();
    }

    public boolean contains(T clef){
        for (ModeleCouple<T> couple : this.couples){
            if (couple.getFirst().equals(clef)){
                return true;
            }
        }
        return false;
    }


    public Integer get(T clef)throws ClefInconnueException{
        for (ModeleCouple<T> couple : this.couples){
            if (couple.getFirst().equals(clef)){
                return couple.getSecond();
            }
        }
        throw new ClefInconnueException();
    }

    public int put(T cle, int valeur){
        for (ModeleCouple<T> couple :this.couples){
            if (couple.getFirst().equals(cle)){
                int precVal = couple.getSecond();
                couple.setSecond(valeur);
                return precVal;

            }
        }
        this.couples.add(new ModeleCouple<T>(cle,valeur));
        return 0;
    }


    
}
