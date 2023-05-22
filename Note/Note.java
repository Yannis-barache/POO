public class Note{
    private int frequence, duree;

    public Note(int frequence,int duree){
        this.frequence=frequence;
        this.duree=duree;
    }

    public int getDuree(){
        return this.duree;
    }

    public int getFrequence(){
        return this.frequence;
    }


    @Override
    public void jouer(){
        System.out.println("Dolélo")
    }

    public int hashCode(){
        return this.frequence*31 + this.duree*63;
    }

    
}