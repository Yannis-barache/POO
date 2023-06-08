public class Yakuza  extends CalculPoidsSac{

    public Yakuza() {
        super(50);
    }

    public void interagir(Ronin ronin) {
        ronin.recevoir(this.get(0));
        this.remove(0);

    }

    public void interagir(MaitreDesClefs maitreDesClefs) {
        maitreDesClefs.interagir(this);
    }

    public void perdTout() {
        this.clear();
    }

    @Override
    public String toString() {
        return "Je suis un Yakuza et mon sac : " + super.toString();
    }




    
}
