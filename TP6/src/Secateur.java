public class Secateur implements Outils {
    private String marque ;
    public Secateur ( String marque ) { this.marque = marque ;}
    public void couper() {System.out.print (" couper ") ;}
    public void utiliser () {
        System.out.print("mon sécateur "+ marque +" permet de ") ;
        this.couper () ;
        System.out.println() ;
    }
}