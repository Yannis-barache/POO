public class ExecutableTexte {
    public static void main(String[] args ) {
        Texte bonjour = new Texte("BONJOUR");
        Texte hola = new Texte("HOLA");
        assert bonjour.toString().equals("BONJOUR");
        assert bonjour.toMorse().equals("===_=_=_= ===_===_=== ===_= =_===_===_=== ===_===_=== =_=_=== =_===_= ");
        assert bonjour.contient(new Lettre('B'));
        assert !bonjour.contient(new Lettre('Z'));
        assert bonjour.decode("===_=_=_= ===_===_=== ===_= =_===_===_=== ===_===_=== =_=_=== =_===_= ").equals("BONJOUR");
        assert bonjour.decode("=_===").equals("A");
        assert !bonjour.decode("=_===").equals("B");
        assert bonjour.decode("===_=_===_=").equals("C");
        bonjour.toSon();
        System.out.println("Tous les tests sont passés");

    }
}
