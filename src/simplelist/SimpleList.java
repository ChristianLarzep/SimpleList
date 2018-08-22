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
public class SimpleList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List list = new List();
       
        System.out.println("Esta vacia "+list.estaVacio());
        
        list.addPrimero("Jorge");
        list.addPrimero(22);
        list.addPrimero("que onda perro");
        list.addPrimero(3);
        
        System.out.println("Primer elemento: "+list.obtener(0));
        System.out.println("Ultimo: "+list.obtener(list.size()-1));
        System.out.println("Index 2: "+list.obtener(2));
        
        System.out.println("Esta vacia: "+list.estaVacio());
        System.out.println("Tamaño: "+list.size());
        list.eliminarPrimero();
        list.eliminar(2);
        System.out.println("Tamaño: "+list.size());
    }
    
}
