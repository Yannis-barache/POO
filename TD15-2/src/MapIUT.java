import java.util.ArrayList;
import java.util.List;

public class MapIUT {

    private List<Couple> couples;

    public MapIUT(List<Couple> couples){
        this.couples = couples;
    }

    public MapIUT(){
        this.couples = new ArrayList<>();
    }

    public boolean contains(String clef){
        for (Couple couple : this.couples){
            if (couple.getFirst().equals(clef)){
                return true;
            }
        }
        return false;
    }

    public Integer get(String clef)throws ClefInconnueException{
        for (Couple couple : this.couples){
            if (couple.getFirst().equals(clef)){
                return couple.getSecond();
            }
        }
        throw new ClefInconnueException();
    }

    public Integer put(String cle, Integer valeur){
        for (Couple couple :this.couples){
            if (couple.getFirst().equals(cle)){
                Integer precVal = couple.getSecond();
                couple.setSecond(valeur);
                return precVal;

            }
        }
        this.couples.add(new Couple(cle,valeur));
        return null;
    }
}

class ClefInconnueException extends Exception{
    public ClefInconnueException(){

    }
}
