public class ExecutablePokemon {
public static void main ( String [] args ) {
    Pokemon poke ;
    Pokemon Arbre;
    poke = new Pokemon ( " Bulbizarre " , 30) ;
    poke.evolue ( " Herbizarre " , 37) ;
    poke.evolue ( " Florizarre " ) ;
    System.out.println(poke.toString()) ; // (1)


    Arbre = new Pokemon (" Abo " , 10 ) ;  
    Arbre.evolue ("Arbok" , 27);
    System.out.println(Arbre.toString());
    }
}
