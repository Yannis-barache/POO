public class Coupant implements Outils{
    private String marque ;
    public Coupant ( String marque ) { this.marque = marque ;}
    public void couper () {System.out.print (" couper ") ;}

    @Override 
    public void utiliser (){
        System.out.print("Outil "+ this.marque + " permettent de ") ;
        this.couper () ;
        System.out.println () ;
    }
}
