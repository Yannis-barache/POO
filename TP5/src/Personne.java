public class Personne {
    private String prenom;
    private int age;

    public Personne(String prenom,int age){
        this.prenom=prenom;
        this.age=age;
    }

    public String getNom(){
        return this.prenom;
    }
    
}
