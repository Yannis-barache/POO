import java.util.Arrays;

public class Executable {
    public static void main(String[] args){
        RepertoireMap rep = new RepertoireMap();
        rep.initRepertoire();
        rep.ajouteContact("Maman", "07 45 21 58 63");
        rep.ajouteContact("Papa", "06 82 41 47 76");
        rep.ajouteContact("Papa", "06 12 34 56 78");
        assert rep.getNoms().size() == 2;
        assert rep.getNoms().equals(Arrays.asList("Papa", "Maman"));
        assert rep.getNumeros("Papa").size() == 2;
        assert rep.getNumeros("Papa").equals(Arrays.asList("06 12 34 56 78", "06 82 41 47 76"));
        System.out.println(rep.getNoms());
        try{
            rep.modifieContact("Papa", "Père");
            assert rep.getNoms().size() == 2;
            assert rep.getNoms().equals(Arrays.asList("Père", "Maman"));
        } catch (PasDeContactException e){
            System.out.println("Le nom rentré n'existe pas");
        }
    }
    
}
