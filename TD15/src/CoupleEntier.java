public class CoupleEntier {
    private int first,second;


    public CoupleEntier(int x,int y){
        this.first = x;
        this.second = y;
    }

    public int getFirst(){
        return this.first;
    }


    public int getSecond(){
        return this.second;

    }

    public boolean equals(Object o){
        if(o==null){return false;}
        if(o==this){return true;}
        if (o instanceof CoupleEntier){
            CoupleEntier couple= (CoupleEntier) o;
            return this.first == couple.getFirst() && this.second == couple.getSecond(); 
        }
        return false;
    }

}
