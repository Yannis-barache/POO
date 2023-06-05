public class Chaine implements Ajoutable<Chaine>{

    private String chaine;

    public Chaine(){
        this.chaine="";
    }

    public Chaine(String chaine){
        this.chaine=chaine;
    }

    public void setChaine(String chaine){
        this.chaine=chaine;
    }

    public String getChaine(){
        return this.chaine;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == this){
            return true;
        }

        if (obj == null){ 
            return false;
        }
        if (obj instanceof Chaine){
            Chaine chaine = (Chaine) obj;
            return this.chaine.equals(chaine.chaine);
        }
        return false;

    }

    @Override
    public Chaine ajouter(Chaine chaine){
        return new Chaine(this.chaine+chaine.chaine);}

    
}
