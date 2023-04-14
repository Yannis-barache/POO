public class ExecutableMagasin {
    public static void main(String[] args){
        Magasin fleurus= new Magasin("Fleurus",true, false);
        Magasin baracheclub= new Magasin("baracheclub",false, true);
        Ville trainou= new Ville("Trainou");
        trainou.ajouteMagasin("BeauMagasin",true,true);
        trainou.ajouteMagasin("Venir",false,false);
        trainou.ajouteMagasin("Magnifique",false,true);
        trainou.ajouteMagasin("Bauchamp",true,false);
        assert trainou.getMagasins().size()==4;
        trainou.ajouteMagasin("Venir",false,false);
        assert trainou.getMagasins().size()==4;

        assert trainou.getNom()== "Trainou";
        assert baracheclub.getNom()=="baracheclub";
        assert baracheclub.ouvertDimanche();
        assert !baracheclub.ouvertLundi();
        assert fleurus.ouvertLundi();
        Magasin baracheclub2= new Magasin("dhrytuikl",false, true);;
        System.out.println(baracheclub.equals(baracheclub2));
        System.out.println(baracheclub.hashCode()==baracheclub2.hashCode()); 

        baracheclub2=new Magasin("baracheclub",false, true);;
        System.out.println(baracheclub.equals(baracheclub2));
        System.out.println(baracheclub.hashCode()==baracheclub2.hashCode());

        System.out.println(" ");
        System.out.println("Liste des magasins de Trainou ouverts le lundi : ");
        System.out.println(trainou.ouvertsLeLundi());
        System.out.println(" ");
        System.out.println("Liste des magasins de Trainou : ");
        System.out.println(trainou.toString());

    }
}
