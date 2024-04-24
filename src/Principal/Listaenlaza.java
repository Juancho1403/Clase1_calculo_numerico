package Principal;

public class Listaenlaza {
    Nodo cabeza; 
    int size;
    
    public Listaenlaza(){
        cabeza = null;
        size = 0;
    }
    
    public void agregando (Object obj){
        if (cabeza == null) {
            cabeza = new Nodo (obj);
        }else{
            Nodo temp = cabeza;
            Nodo nuevo = new Nodo (obj);
            nuevo.enlazarsiguiente(temp);
            cabeza = nuevo;
        }
        size++;
    }
    
    public int size(){
        return size; 
    }
    
    public Object obtener (int index){
        int contador = 0;
        Nodo temporal = cabeza;
        while (contador<index) {
            temporal = temporal.obtenersiguiente();
            contador++;
        }
        return temporal.obtenervalor();
    }
    
    public void eliminar (int index){
        if (index == 0) {
            cabeza = cabeza.obtenersiguiente();
        }else{
            int contador = 0;
            Nodo temp = cabeza;
            while (contador<index-1) {
                temp = temp.obtenersiguiente();
                contador++;
            }temp.enlazarsiguiente(temp.obtenersiguiente().obtenersiguiente());
        }
        size--;
    }
}
