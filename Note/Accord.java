import java.util.HashSet;


public class Accord extends HashSet<Note> implements Musique{
    // public Accord(){
    //     super();
    // }


    public int duree(){
        int max=0;
        for (Note note;this){
            if (note.getDuree()>max){
                max= note.getDuree();
            }
        }
        return max;

    }


    public static int log2(int x) {
        return (int) (Math.log(x) / Math.log(2));
    }


    public boolean estHarmonieux(){
        for (Note note;this){
            if (log2(note.getFrequence())==0){
                return false;
            }
        }
        return true;
    }


    @Override
    public void jouer(){
        for (Note note; this){
            note.jouer();
        }
    }
}