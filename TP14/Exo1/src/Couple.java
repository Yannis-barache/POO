package Exo1.src;
public class Couple implements Contenant<Integer>{
    private Integer ent1,ent2;

    public Couple(Integer entier1, Integer entier2){
        this.ent1=entier1;
        this.ent2=entier2;
    }


    public Integer getFirst(){
        return this.ent1;
    }

    public Integer getSecond(){
        return this.ent2;
    }


    @Override
    public boolean contient(Integer entier){
        return this.ent1==entier || this.ent2 == entier;
    }


    
}
