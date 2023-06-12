public class Compteur<T> extends ModeleMap<T> implements CompteurInterface<T>{

    public Compteur(){
        super();
    }

    @Override
    public void incremente(T cle){
        this.put(cle, this.get(cle)+1);
    }

    /** Retourne la valeur associée à cle dans le compteur
     * @param cle la cle dont on veut la valeur
     * @return La valeur associée à cle dans le compteur, 0 si cle n'est pas dans la map
     */
    @Override
    public Integer get(T cle){
        try{
            return super.get(cle);
        } catch (ClefInconnueException e){
            return 0;
        }
    }
}
