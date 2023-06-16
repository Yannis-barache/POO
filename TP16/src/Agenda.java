import java.util.Collections;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Agenda  implements Iterable<RendezVous>
{
    private List<RendezVous> contenu;
    public Agenda(){
        this.contenu = new ArrayList<>();
        } 

    public RendezVous getPremier() throws AgendaVideException {
	if(this.contenu.size() == 0)
	    throw new AgendaVideException("Agenda sans rendez vous"); 
        return Collections.min(this.contenu);
    }

    public void ajoute (RendezVous v) throws PasDeDisponibiliteException{
        for(RendezVous existant : this.contenu)
            if(v.intersecte(existant))
                throw new PasDeDisponibiliteException("Déjà un rendez vous à cette heure", v);
        this.contenu.add(v);
    }

    @Override
    public Iterator<RendezVous> iterator(){
        return this.contenu.iterator();
    }


    @Override
    public String toString()
    {
        return this.contenu.toString();
    }
}
