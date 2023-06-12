public class Executable {
    public static void main (String[] args){
        Compteur<String> c = new Compteur<>();
        c.incremente("toto");
        c.incremente("titi");
        c.incremente("toto");
        c.incremente("toto");
        System.out.println(c.get("toto"));
        System.out.println(c.get("titi"));
        System.out.println(c.get("tutu"));

    }
    
}
