public class Executable {
    public static void main(String[] args){
        Maison griffondor = new Maison("Griffondor");
        Maison serpentard = new Maison("Serpentard");
        Maison poufsouffle = new Maison("Poufsouffle");
        Maison serdaigle = new Maison("Serdaigle");

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
        griffondor.ajoute("Pansy" ,4,10);

        Sorcier gregory = new Sorcier("Gregory" ,6,7);
        serpentard.ajoute("Gregory" ,6,7);

        Sorcier gilderoy = new Sorcier("Gilderoy" ,7,9);
        serdaigle.ajoute("Gilderoy" ,7,9);

        Sorcier dean = new Sorcier("Dean" ,9,4);
        griffondor.ajoute("Dean" ,9,4);

        assert adrian.getNom().equals("Adrian");
        assert dean.getCourage()==9;
        assert hermione.getSagesse()==6;
        assert !adrian.estCourageux();
        assert neuville.estCourageux();
        assert serpentard.nombreEleve()==4;
        assert griffondor.contientCourageux();
        assert poufsouffle.leMoinsCourageux().equals(norbert);
        assert serpentard.lePlusSage().equals(pansy);
        

    }
    
}
