public class Animaux {
        private String nom;
        private float poids;
        private Enclos enclos;
        private boolean blessure;

        /**
         * @param nom le nom de l'animal
         * @param poids le poids de l'animal en kg
         * @param blessure true si l'animal est blessé, false sinon
         */
        public Animaux(String nom,float poids,boolean blessure){
                this.nom=nom;
                this.poids=poids;
                this.enclos=null;
                this.blessure=blessure;
        }

        /**
         * @return le nom de l'animal
         */
        public String getNom() {
                return this.nom;
        }

        /**
         * @return le poids de l'animal en kg
         */
        public float getPoids() {
                return this.poids;
        }

        /**
         * @return l'enclos de l'animal
         */
        public Enclos getEnclos() {
                return this.enclos;
        }

        /**
         * @return true si l'animal est blessé, false sinon
         */
        public boolean getBlessure() {
                return this.blessure;
        }

        /**
         * @param enclos l'enclos de l'animal
         */
        public void setEnclos(Enclos enclos) {
                this.enclos = enclos;
        }

        /** Modifier l'état de blessure de l'animal
         * @param blessure true si l'animal se blesse, false si on le soigne
         */
        public void setBlessure(boolean blessure) {
                this.blessure = blessure;
        }

        /** Retourne une description de l'animal
         * @return la description de l'animal
         */
        @Override
        public String toString(){
                if (this.blessure) {
                        return this.nom+", blessé, pèse "+this.poids+" kg";
                }
                return this.nom+", non blessé, pèse "+this.poids+" kg";
        }
}
