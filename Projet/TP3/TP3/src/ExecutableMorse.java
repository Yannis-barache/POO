public class ExecutableMorse {
         public static void main(String[] args ) {
         Lettre n = new Lettre('N') ;
         assert n.toChar ()=='N';
         assert n.toNumero() == 13;
         assert n.toMorse ().equals ("===_=") ;
         Lettre a = new Lettre("=_===");
         assert a.toNumero() == 0;
         assert a.toMorse().equals ("=_===") ;
         assert a.toChar()== 'A';
         System.out.println("Tous les tests sont passés");
        }
    }