public class ExecutableTable {
    public static void main(String[] args){
        Table diner = new Table();
        diner.ajouteConvive("Albert", 25);
        diner.ajouteConvive("Belle", 85);
        diner.ajouteConvive("Charles", 63);
        diner.ajouteConvive("David", 2);
        diner.ajouteConvive("Elise", 16);
        diner.ajouteConvive("Franck", 47);
        System.out.println("Moyenne d'age: " + diner.moyenneAge());
        System.out.println("Nombre d'adultes: " + diner.nombreDAdultes());
        System.out.println("Le plus jeune: " + diner.lePlusJeune());
        assert diner.sontACote("Albert", "Belle");
        assert diner.lePlusJeune().getNom().equals("David");
        assert diner.nombreDAdultes() == 4;
        diner.echange("Albert", "David");
        assert !diner.sontACote("Albert", "Belle");
        assert diner.sontACote("David", "Belle");
    }
}
