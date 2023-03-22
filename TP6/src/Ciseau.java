public class Ciseau implements Outils {
    private String marque ;
    public Ciseau ( String marque ) { this.marque=marque ;}
    public void couper () {System.out.print (" couper ") ;}
    public void utiliser (){
        System.out.print("mes ciseaux"+ marque +" permettent de ") ;
        this.couper () ;
        System.out.println () ;
    }
}
