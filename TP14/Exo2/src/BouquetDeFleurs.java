public class BouquetDeFleurs implements Cadeau{

    private int nbDalhias;
    private int nbRoses;

    public BouquetDeFleurs(int nbDalhias, int nbRoses){
        this.nbDalhias=nbDalhias;
        this.nbRoses=nbRoses;
    }

    public int getNbDalhias(){
        return this.nbDalhias;
    }

    public int getNbRoses(){
        return this.nbRoses;
    }

    @Override
    public int getPoids(){
        return this.nbDalhias*5+this.nbRoses*3;
    }

    @Override
    public String toString(){
        return "Bouquet de " + this.nbDalhias + " dalhias et " + this.nbRoses + " roses";
    }


}