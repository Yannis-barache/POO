public class Executable {
    public static void main(String[] args){
        Maison griffondor = new Maison("Griffondor");
        Maison serpentard = new Maison("Serpentard");
        Maison poufsouffle = new Maison("Poufsouffle");
        Maison serdaigle = new Maison("Serdaigle");
        Ecole Poudlard = new Ecole("Poudlard");

        Sorcier adrian = new Sorcier("Adrian" ,9,7);
        serpentard.ajoute("Adrian" ,9,7);

        Sorcier hermione = new Sorcier("Hermione" ,8,6);
        griffondor.ajoute("Hermione" ,8,6);

        Sorcier  luna= new Sorcier("Luna" ,2,9);
        serdaigle.ajoute("Luna" ,2,9);

        Sorcier drago = new Sorcier("Drago" ,6,5);
        serpentard.ajoute("Drago" ,6,5);

        Sorcier norbert = new Sorcier("Norbert" ,3,7);
        poufsouffle.ajoute("Norbert" ,3,7);

        Sorcier neuville = new Sorcier("Neuville" ,10,4);
        griffondor.ajoute("Neuville" ,10,4);

        Sorcier pansy = new Sorcier("Pansy" ,4,10);
        serpentard.ajoute("Pansy" ,4,10);

        Sorcier gregory = new Sorcier("Gregory" ,6,7);
        serpentard.ajoute("Gregory" ,6,7);

        Sorcier gilderoy = new Sorcier("Gilderoy" ,7,9);
        serdaigle.ajoute("Gilderoy" ,7,9);

        Sorcier dean = new Sorcier("Dean" ,9,4);
        griffondor.ajoute("Dean" ,9,4);

        Poudlard.ajouter(griffondor);
        Poudlard.ajouter(serpentard);
        Poudlard.ajouter(poufsouffle);
        Poudlard.ajouter(serdaigle);


        assert adrian.getNom().equals("Adrian");

        assert dean.getCourage()==9;

        assert hermione.getSagesse()==6;

        assert !gilderoy.estCourageux();

        assert neuville.estCourageux();

        assert serpentard.nombreEleve()==4;

        assert griffondor.contientCourageux();

        assert poufsouffle.leMoinsCourageux().equals(new Sorcier("Norbert" ,3,7));

        assert serpentard.lePlusSage().equals(pansy);

        assert Poudlard.lesCourageux().size()==3;
        assert Poudlard.lesCourageux().contains(neuville);
        assert Poudlard.lesCourageux().contains(adrian);
        assert Poudlard.lesCourageux().contains(dean);

        System.out.println("Test trie par courage d'une maison ");
        System.out.println(serpentard.getEleves());
        serpentard.trierParCourage();
        System.out.println(serpentard.getEleves());
        System.out.println(" ");
        System.out.println("Test trie par courage d'une école ");
        System.out.println(Poudlard.elevesTriesParCourage());
        System.out.println(" ");
        System.out.println("Test ok ");
        

    }
    
}
