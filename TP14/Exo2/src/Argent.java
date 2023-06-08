

public class Argent implements Cadeau{
    private int nbPieces;

    public Argent(int nbPieces){
        this.nbPieces=nbPieces;
    }

    public int getNbPieces(){
        return this.nbPieces;
    }


    @Override
    public int getPoids(){
        return this.nbPieces*5;
    }
    

    @Override 
    public String toString(){
        return this.nbPieces+" pièces de 5g chacune";
    }
}
