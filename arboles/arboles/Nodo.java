public class Nodo<T> {
private T info; 
Nodo<T> izq; der;

public Nodo(T info){
    this.info = info; 
} 


    /**
     * @return T return the info
     */
    public T getInfo() {
        return info;
    }

    /**
     * @param info the info to set
     */
    public void setInfo(T info) {
        this.info = info;
    }

    public Nodo<T> getDer(){
        return der;
    }

    public Nodo<T> setDer(Nodo<T> der){
        this.der = der;
    }

    public Nodo<T> getIzq(){
        return izq;
    }

    public Nodo<T> setIzq(Nodo<T> izq){
        this.izq = izq;
    }
}
