public class ExecutableMagasin {
    public static void main(String[] args){
        Magasin fleurus= new Magasin("Fleurus",true, false);
        Magasin baracheclub= new Magasin("baracheclub",false, true);
        Ville trainou= new Ville("Trainou");
        trainou.ajouteMagasin("BeauMagasin",true,true);
        trainou.ajouteMagasin("Venir",false,false);
        trainou.ajouteMagasin("Magnifique",false,true);
        trainou.ajouteMagasin("Bauchamp",true,false);
        
        assert trainou.getNom()== "Trainou";
        assert baracheclub.getNom()=="baracheclub";
        assert baracheclub.ouvertDimanche();
        assert !baracheclub.ouvertLundi();
        assert fleurus.ouvertLundi();
        System.out.println(trainou.toString());

    }
}
