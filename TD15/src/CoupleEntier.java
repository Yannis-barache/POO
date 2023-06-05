public class CoupleEntier<T extends Comparable<? super T>> {
    private T first,second;


    public CoupleEntier(T x, T y){
        this.first = x;
        this.second = y;
    }

    public T getFirst(){
        return this.first;
    }


    public T getSecond(){
        return this.second;

    }

}
