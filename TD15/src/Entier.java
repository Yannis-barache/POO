public class Entier implements Ajoutable<Entier>{
    private int elem;

    public Entier(){
        this.elem=0;
    }

    public Entier(int elem){
        this.elem=elem;
    }

    public void setElem(int elem){
        this.elem=elem;
    }

    public int getElem(){
        return this.elem;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == this){
            return true;
        }

        if (obj == null){ 
            return false;
        }
        if (obj instanceof Entier){
            Entier entier = (Entier) obj;
            return this.elem == entier.elem;
        }
        return false;

    }

    @Override
    public Entier ajouter(Entier entier){
        return new Entier(this.elem+entier.elem);}

    
}
