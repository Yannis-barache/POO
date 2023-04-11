public class Animaux {
        private String nom;
        private float poids;
        private Enclos enclos;
        private boolean blessure;

        public Animaux(String nom,float poids,boolean blessure){
                this.nom=nom;
                this.poids=poids;
                this.enclos=null;
                this.blessure=blessure;
        }

        public String getNom() {
                return this.nom;
        }

        public float getPoids() {
                return this.poids;
        }

        public Enclos getEnclos() {
                return this.enclos;
        }

        public boolean getBlessure() {
                return this.blessure;
        }

        public void setEnclos(Enclos enclos) {
                this.enclos = enclos;
        }

        public void setBlessure(boolean blessure) {
                this.blessure = blessure;
        }
        @Override
        public String toString(){
                if (this.blessure) {
                        return this.nom+", blessé, pèse "+this.poids+" kg";
                }
                return this.nom+", non blessé, pèse "+this.poids+" kg";
        }

}
