import java.util.HashSet;
import java.util.Set;

public class ExecutableMagasin {
    public static void main(String[] args){
        Magasin fleurus= new Magasin("Fleurus",true, false);
        Magasin baracheclub= new Magasin("baracheclub",false, true);
        Magasin beauMagasin= new Magasin("beauMagasin",true, true);
        Magasin magasin= new Magasin("magasin",false, false);
        Set<Magasin> magasins= new HashSet<>();
        magasins.add(fleurus);
        magasins.add(baracheclub);
        magasins.add(beauMagasin);
        magasins.add(magasin);

        Ville trainou= new Ville("Trainou");
        for (Magasin magasin2 : magasins){
            trainou.ajouteMagasin(magasin2.getNom(), magasin2.ouvertLundi(), magasin2.ouvertDimanche());
        }
        assert baracheclub.getNom()=="baracheclub";
        assert baracheclub.ouvertDimanche();
        assert !baracheclub.ouvertLundi();
        assert fleurus.ouvertLundi();
        Magasin baracheclub2= new Magasin("baracheclab",false, true);
        System.out.println(baracheclub.hashCode());
        System.out.println(baracheclub2.hashCode());
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
        System.out.println(magasin.toString());

    }
}
