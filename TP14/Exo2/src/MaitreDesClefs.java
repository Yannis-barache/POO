public class MaitreDesClefs {
    private String motDePasse;

    public MaitreDesClefs(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public void interagir(Ronin ronin) {
        ronin.setMotDePasse(motDePasse);
    }

    public int hashCode() {
        return motDePasse.hashCode();
    }

    @Override
    public String toString(){
        return "Moi Maître des clefs! \nJe suis sourd je refuse les cadeaux! \nVoici mon mot de passe codé " + hashCode()*312548895;
    }
    
}
