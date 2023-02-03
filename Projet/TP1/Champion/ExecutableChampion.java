public class ExecutableChampion {
    public static void main(String [] args) {
        /* Création des instances */
        Champion teemo = new Champion("Teemo", 37, 7, 0);
        Champion darius = new Champion("Darius", 38, 11, 0);
        Champion sona = new Champion("Sona", 27, 3, 5);
        System.out.println(sona.toString());
        // Sona : pv=27, attaque=3, soin=3
        teemo.combat(darius);
        teemo.boitUnePotionDeSoin();
        System.out.println("premier combat");
        System.out.println(darius.toString());
        System.out.println(teemo.toString());
        while (teemo.estEnVie() && darius.estEnVie()){
            sona.soigne(teemo);
            teemo.combat(darius);
        }
        System.out.println("fin du combat");
        System.out.println(darius.toString());
        System.out.println(teemo.toString());
        assert teemo.estEnVie() : "Teemo est vivant";
        assert !darius.estEnVie() : "Darius est mort";
        assert teemo.getNom().equals("Teemo") : "Le nom de Teemo est incorrect";
        assert teemo.getPointsDeVie()==1 : "Teemo a 1 point de vie";
        assert 0 == darius.getPointsDeVie() : "Darius a 0 point de vie";

    }
}
