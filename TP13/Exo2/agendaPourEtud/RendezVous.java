import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.Serializable;
import java.lang.Comparable;
import java.text.ParseException;

class RendezVous implements 
{ 
    private Date debut;
    private Date fin;
    
    public RendezVous(String deb, String fin) throws ParseException{
        SimpleDateFormat lecteur = new SimpleDateFormat("HH:mm/dd/MM/yyyy");
        this.debut = lecteur.parse(deb);
        this.fin = lecteur.parse(fin);
	
    }
    @Override
    public String toString(){
 
    }
    @Override
    public int         
    {
        return this.debut.compareTo(v.debut);
    }

    /**
     * permet de savoir si deux rendez-vous s'intersectent
     * @param rendezVous le rendez vous 
     * @return un booléen indiquant si les 
     *         rendez-vous s'intersectent
     */
    public boolean intersecte(RendezVous rendezVous)
    {
    }
}
