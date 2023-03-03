public class ExecutableTexte {
    public static void main(String[] args ) {
        Texte t = new Texte("BONJOUR");
        Texte test = new Texte("HOLA");
        assert t.toString().equals("BONJOUR");
        assert t.toMorse().equals("===_=_=_= ===_===_=== ===_= =_===_===_=== ===_===_=== =_=_=== =_===_= ");
        assert t.contient(new Lettre('B'));
        assert !t.contient(new Lettre('Z'));
        assert t.decode("===_=_=_= ===_===_=== ===_= =_===_===_=== ===_===_=== =_=_=== =_===_= ").equals("BONJOUR");
        assert t.decode("=_===").equals("A");
        assert !t.decode("=_===").equals("B");
        assert t.decode("===_=_===_=").equals("C");
        t.toSon();
        System.out.println("Tous les tests sont passés");

    }
}
