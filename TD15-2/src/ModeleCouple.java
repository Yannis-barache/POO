public class ModeleCouple<T> {
    private T first;
    private int second;

    public ModeleCouple(T first, int second){
        this.first = first;
        this.second = second;
    }

    public T getFirst(){
        return first;
    }

    public int getSecond(){
        return second;
    }

    public void setSecond(int second){
        this.second = second;
    }

    @Override
    public boolean equals(Object o){
        if (o == this) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if(o instanceof ModeleCouple){
            ModeleCouple<?> c = (ModeleCouple<?>) o;
            return c.getFirst().equals(first) && c.second == second;
        }
        return false;
    }

}