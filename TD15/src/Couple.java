public class Couple<T extends Comparable<? super T>> implements Comparable<Couple<T>> {
    private T first,second;
    
    public Couple(){
        this.first=null;
        this.second=null;
    }

    public Couple(T first , T second){
        this.first=first;
        this.second=second;
    }

    public T getFirst(){
        return this.first;
    }

    public T getSecond(){
        return this.second;
    }

    public void setFirst(T elem){
        this.first=elem;
    }

    public void setSecond(T elem){
        this.second=elem;
    }
    
    @Override
    public boolean equals(Object obj){
        if (obj == this){
            return true;
        }

        if (obj == null){ 
            return false;
        }
        if (obj instanceof Couple<?>){
            Couple<?> couple = (Couple<?>) obj;
            return this.first.equals(couple.first) && this.second.equals(couple.second);
        }
        return false;

    }


    @Override
    public int compareTo(Couple<T> couple){
        if (this.first.equals(this.second)){
            return this.second.compareTo(couple.second);
        }
        return this.first.compareTo(couple.first);

    }
    
}
