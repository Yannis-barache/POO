import java.util.List; 
import java.util.Arrays;
public class Executable {
    public static void main(String [] args) {
        List<Cadeau> sac = 
            Arrays.asList(new Diamant(7), 
                          new BouquetDeFleurs(1, 3),
                          new Argent(5)
                          ); 
        System.out.println(sac);
        // [Diamant de 7g, Bouquet de 1 Dalhia(s) et de 3 Rose(s), 
        //  5 pièce(s) de 5 g chacune]

        MaitreDesClefs maitre = new MaitreDesClefs("saloir");
        System.out.println("\n" +maitre+" \n");
        // Moi Maître des clefs je suis sourd 
        // je refuse les cadeaux! 
        // voici mon mot de passe codé 
        // 186388748118638874631863887474186388747718638874711863887480
 
        Ronin ronin = new Ronin();
        ronin.recevoir(new Diamant(4)); 
        ronin.recevoir(new BouquetDeFleurs(2, 1)); 
        ronin.recevoir(new Argent(3));
        System.out.println(ronin + "\n");
        // Je suis un Ronin mais je n'ai pas encore de mot de passe!
        // Et mon sac : [Diamant de 4g, 
        //               Bouquet de 2 dalhia(s) et de 1 rose(s)]
 

        maitre.interagir(ronin);
        System.out.println("Après interaction avec le Maître des clefs \n" 
                           + ronin + "\n");
        // Après interaction avec le Maître des clefs
        // Je suis un Ronin mon mot de passe est saloir
        // Et mon sac : [Diamant de 4g, 
        //               Bouquet de 2 dalhia(s) et de 1 rose(s)]

        Yakuza yakuza = new Yakuza();
        yakuza.recevoir(new Argent(2));
        yakuza.recevoir(new Diamant(3));
        yakuza.recevoir(new BouquetDeFleurs(5, 3));
        System.out.println(yakuza+"\n"); 
        // Je suis un Yakuza 
        // Et mon sac : [2 pièce(s) de 5g chacune, 
        //               Diamant de 3g, 
        //               Bouquet de 5 dalhia(s) et de 3 rose(s)]

        yakuza.interagir(ronin); 
        System.out.println("Après interaction avec un yakuza \n" + ronin + "\n");
        // Après interaction avec un yakuza 
        // Je suis un Ronin mon mot de passe est saloir
        // Et mon sac : [Diamant de 4g, 
        //               Bouquet de 2 dalhia(s) et de 1 rose(s), 
        //               2 pièce(s) de 5g chacune]

        System.out.println("Après interaction avec un ronin \n" + yakuza + "\n");
        // Après interaction avec un ronin 
        // Je suis un Yakuza Et mon sac : 
        //      [Diamant de 3g, 
        //       Bouquet de 5 dalhia(s) et de 3 rose(s)]

        yakuza.interagir(maitre); 
        System.out.println("Après interaction avec un yakuza \n" + maitre   + "\n");
        // Après interaction avec un yakuza
        // Moi Maître des clefs je suis sourd je refuse les cadeaux! 
        // voici mon mot de passe codé 
        // 186388748118638874631863887474186388747718638874711863887480

        System.out.println("Après interaction avec le Maître des clefs \n" + yakuza + "\n");
        // Après interaction avec le Maître des clefs
        // Je suis un Yakuza Et mon sac : 
        //      [Bouquet de 5 dalhia(s) et de 3 rose(s)]


        ronin.interagir(yakuza);
        System.out.println("Après interaction avec un ronin \n" + yakuza + "\n");
        // Après interaction avec un ronin
        // Je suis un Yakuza Et mon sac :
        //      [Bouquet de 5 dalhia(s) et de 3 rose(s),
        //               2 pièce(s) de 5g chacune]

        System.out.println("Après interaction avec un yakuza \n" + ronin + "\n");

        // Après interaction avec un yakuza
        // Je suis un Ronin mon mot de passe est saloir
        // Et mon sac : [Diamant de 4g,
        //               Bouquet de 2 dalhia(s) et de 1 rose(s)]


    }
}