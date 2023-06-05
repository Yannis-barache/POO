public class ExecutableAjout {
    public static void main(String[] args){
        Entier entier1 = new Entier(5);
        Entier entier2 = new Entier(10);
        Entier entier3 = entier1.ajouter(entier2);
        System.out.println(entier3.getElem());
        Chaine chaine1 = new Chaine("toto");
        Chaine chaine2 = new Chaine("titi");
        Chaine chaine3 = chaine1.ajouter(chaine2);
        System.out.println(chaine3.getChaine());
    }
    
}
