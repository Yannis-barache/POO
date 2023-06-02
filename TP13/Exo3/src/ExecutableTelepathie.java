import java.util.Arrays;
import java.util.List;
public class ExecutableTelepathie {
    public static void main(String [] args) {
        Etudiant luke = new Etudiant("Skywalker", 
                                     "Luke",
                                     2, 8, 14);
        System.out.println(luke);
        // Luke Skywalker - Notes : télépathie = 2 
        // précognition = 8 télékinésie = 14
        Etudiant leia = new Etudiant("Organa", "Leia");
        System.out.println(leia); 
        // Leia Organa - Il manque des notes
        leia.setTelepathie(15);
        System.out.println(leia);
        // Leia Organa - Il manque des notes
        leia.setTelekinesie(12);
        leia.setPrecognition(17);
        System.out.println(leia);
        // Leia Organa - Notes : télépathie = 15 
        // précognition = 17 télékinésie = 12  
        Etudiant solo = new Etudiant("Solo", "Han", 
                                     15, 10, 10);
        Etudiant chewie = new Etudiant("WaoWaaoWaooo", 
                                       "Chewbaka",
                                       2, 11, 18);
        Etudiant yoda = new Etudiant("Yoda", "Maitre",
                                     13, 15, 20);
        List<Etudiant> listeEtudiants = 
                     Arrays.asList(luke, solo, chewie,
                                   yoda, leia);
        
        Etablissement ecoleDesMines = 
             new EcoleDeBTP("Ecole des Mines", 3);
        System.out.println("Sélection de l'école des mines");
        System.out.println(ecoleDesMines.getSelection(listeEtudiants));
        // Sélection de l'école des mines
        // [Han Solo - télépathie : 10 précognition : 10 
        //  telekinésie : 15, 
        //  Maitre Yoda - télépathie : 15 précognition : 20
        //  telekinésie : 13, 
        //  Leia Organa - télépathie : 15 précognition : 17
        //  telekinésie : 12, 
        //  Luke Skywalker - télépathie : 8 précognition : 14 
        //  telekinésie : 2, 
        //  Chewbaka WaoWaaoWaooo - télépathie : 11 précognition : 18
        //  telekinésie : 2]
        System.out.println();

        Etablissement ecoleDesBeauxArts = 
                new EcoleDeBTP("Les beaux arts", 5);
        
        Etablissement sciencePoRennes = 
                new EcolePolitique("Science Po Rennes");       
        
        Etablissement sciencePoParis = 
                new EcolePolitique("Science Po Paris");

        System.out.println("Sélection de science po paris");
        System.out.println(sciencePoParis.getSelection(listeEtudiants));
        System.out.println();
        // Sélection de science po paris
        // [Maitre Yoda - télépathie : 15 précognition : 20
        //  telekinésie : 13,
        //  Leia Organa - télépathie : 15 précognition : 17 
        //  telekinésie : 12, 
        //  Chewbaka WaoWaaoWaooo - télépathie : 11 précognition : 18
        //  telekinésie : 2, 
        //  Luke Skywalker - télépathie : 8 précognition : 14 
        //  telekinésie : 2, 
        //  Han Solo - télépathie : 10 précognition : 10 
        //  telekinésie : 15]

        List<Etablissement> lesEcoles = Arrays.asList(ecoleDesMines, 
                     sciencePoParis, sciencePoRennes, ecoleDesBeauxArts);

        // System.out.println("Liste Principale");
        // System.out.println(Attribution.listePrincipale(listeEtudiants,
        //                    lesEcoles));
        // System.out.println();
        // // Liste Principale
        // // {Chewbaka WaoWaaoWaooo - télépathie : 11 précognition : 18 
        // //  telekinésie : 2 = [Les beaux arts (5 places)], 
        // //  Leia Organa - télépathie : 15 précognition : 17 
        // //  telekinésie : 12 = [Ecole des Mines (3 places), 
        // //                      Les beaux arts (5 places)],
        // //  Han Solo - télépathie : 10 précognition : 10
        // //  telekinésie : 15 = [Ecole des Mines (3 places), 
        // //                      Les beaux arts (5 places)],
        // //  Luke Skywalker - télépathie : 8 précognition : 14 
        // //  telekinésie : 2 = [Les beaux arts (5 places)],
        // //  Maitre Yoda - télépathie : 15 précognition : 20 
        // //  telekinésie : 13 = [Ecole des Mines (3 places),
        // //                      Science Po Rennes (1 place), 
        // //                      Science Po Paris (1 place), 
        // //                      Les beaux arts (5 places)]}
        // System.out.println(); 
        // try {
        //     System.out.println("Le meilleur en télépathie");
        //     System.out.println(Attribution.maximum(listeEtudiants));
        //     // Le meilleur en télépathie
        //     // Maitre Yoda - télépathie : 15 précognition : 20 
        //     // telekinésie : 13
        // }
        // catch (PasDeTelEtudiant excep) {
        //     System.out.println("Il n'y en a pas \n");
        // }
    }
}