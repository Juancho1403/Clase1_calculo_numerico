package Principal;

public class Nodo {
    Object valor;
    Nodo siguiente;
    
    public Nodo(Object valor){
        this.valor = valor;
        this.siguiente = null;
    }
    public Nodo(){
    }
    
    public Object obtenervalor (){
        return valor;
    }
    
    public void enlazarsiguiente (Nodo n){
        siguiente = n;
    }
    
    public Nodo obtenersiguiente(){
        return siguiente;
    }
}
