/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplelist;

/**
 *
 * @author christian
 */
public class List {
    
    Nodo cabeza;
    int size;
    
    public List(){
        cabeza = null;
        size = 0;
    }
    
    public Object obtener(int index){
        int contador = 0;
        Nodo temporal = cabeza;
        while(contador < index){
            temporal = temporal.obtenerSiguiente();
            contador++;
        }
        return temporal.obtenerValor();
    }
    
    public void addPrimero(Object obj){
        if(cabeza == null){
            cabeza = new Nodo(obj);
        }else{
            Nodo temp = cabeza;
            Nodo nuevo = new Nodo(obj);
            nuevo.enlazarSiguiente(temp);
            cabeza = nuevo;
        }
        size++;
    }
    
    void cortar(int index){
        int contador = 0;
        Nodo temp = cabeza;
        while(contador < index -1){
            temp = temp.obtenerSiguiente();
            contador++;
        }
        temp.enlazarSiguiente(null);
        size = index;
    }
    
    void eliminar(int index){
        if(index == 0){
            cabeza = cabeza.obtenerSiguiente();
        }else{
            int contador = 0;
            Nodo temp = cabeza;
            while(contador < index - 1){
                temp = temp.obtenerSiguiente();
                contador++;
            }
            temp.enlazarSiguiente(temp.obtenerSiguiente().obtenerSiguiente());
        }
        size--;
    }
    
    void eliminarPrimero(){
        cabeza = cabeza.obtenerSiguiente();
        size--;
    }
    
    public int size(){
        return size;
    }
    
    public boolean estaVacio(){
        return (cabeza == null)?true:false;
    }
    
}
