public class Simple<T> {
    private T elem;

    public Simple(){
        this.elem=null;
    }

    public Simple(T elem){
        this.elem=elem;
    }

    public void setElem(T elem){
        this.elem=elem;
    }

    public T getElem(){
        return this.elem;
    }
    
}
