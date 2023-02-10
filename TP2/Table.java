// import à ajouter

public class Table{
    private List<Personne> lesConvives;
    public Table(){
        this.lesConvives = new ArrayList<>();
    }
    public void ajouteConvive(String nom, int age){
        Personne convive = new Personne(nom, age);
        this.lesConvives.add(convive);
    }
    public double mystere(){
        double somme = 0;
        for (Personne convive : this.lesConvives){
            somme += convive.getAge();        
        }
        return somme/this.lesConvives.size();
    }
}
