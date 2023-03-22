public class Executable {
    public static void main(String [] args){
        


        WeekEnd weekEndMai = new WeekEnd("20-22 Mai");
        
        Personne davy = new Personne("Davy", 24);
        Personne anna = new Personne("Anna",24);
        Personne elie = new Personne("Elie", 30);
        Personne gaby = new Personne("gaby", 20);
        Personne sasha = new Personne("Sasha", 29);
        Personne billy = new Personne("Billy",35);
        weekEndMai.ajouteParticipant("Davy",24 );
        weekEndMai.ajouteParticipant(gaby);
        weekEndMai.ajouteParticipant(anna);
        weekEndMai.ajouteParticipant(elie);
        weekEndMai.ajouteDepense(12, "pain", davy);
        weekEndMai.ajouteDepense(70, "essence", davy);
        weekEndMai.ajouteDepense(10, "vin", davy);
        weekEndMai.ajouteDepense(100, "pizza", elie);
        weekEndMai.ajouteDepense(15, "vin", gaby);

        WeekEnd weekEndjuin= new WeekEnd("20-22 juin");
        weekEndjuin.ajouteParticipant(sasha);
        weekEndjuin.ajouteParticipant(billy);
        weekEndjuin.ajouteParticipant(davy);
        weekEndjuin.ajouteParticipant(anna);
        weekEndjuin.ajouteParticipant(gaby);
        weekEndjuin.ajouteDepense(20, "vin", gaby);
        weekEndjuin.ajouteDepense(34, "glace", gaby);
        weekEndjuin.ajouteDepense(52, "pizza", anna);
        weekEndjuin.ajouteDepense(15, "fromage", davy);
        weekEndjuin.ajouteDepense(12, "pain", davy);
        weekEndjuin.ajouteDepense(8, "film", davy);
        weekEndjuin.ajouteDepense(3, "popcorn", davy);
        weekEndjuin.ajouteDepense(8, "pistaches", billy);
        Depense vin= new Depense(davy, 10.0, "vin");
        assert weekEndMai.totalDepense()==207.0;
        assert weekEndjuin.totalDepense()==152.0;
        assert davy.getNom().equals("Davy");
        assert vin.getMontant()==10.0;
        assert vin.getPersonne().equals(davy);
        assert vin.getProduit().equals("vin");
        assert weekEndMai.totalDepense(elie)== 100.0;
        assert weekEndMai.totalDepense("vin")== 25.0;
        assert weekEndjuin.avoirPersonne(billy)==-22.40;
        assert weekEndjuin.avoirPersonne(davy)== 7.60;
        System.out.println("Tous les tests sont passés avec succès");
    }
    
}
