public class Couple{

    private String first;
    private Integer second;

    public Couple(String first, Integer second){
        this.first = first;
        this.second = second;
    }

    public String getFirst(){
        return first;
    }

    public Integer getSecond(){
        return second;
    }

    public void setSecond(Integer integer){
        this.second = integer;
    }

    @Override
    public boolean equals(Object o){
        if (o == this) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if(o instanceof Couple){
            Couple c = (Couple) o;
            return c.getFirst().equals(first) && c.second.equals(second);
        }
        return false;
    }

}
