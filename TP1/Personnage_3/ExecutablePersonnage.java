public class ExecutablePersonnage {
    public static void main (String[] args){
        Personnage nain = new Personnage("Gimli", 65, 15);
        System.out.println(nain.getNom());
        System.out.println(nain.getTailleOreilles());
        System.out.println(nain.getBarbe());
        Personnage exemple = new Personnage("Robert", 25, 45);
        assert exemple.getBarbe() == 25;
        assert exemple.getNom() == "Robert";
        assert exemple.getTailleOreilles()== 45;

    }
    
}
