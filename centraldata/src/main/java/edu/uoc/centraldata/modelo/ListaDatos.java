package edu.uoc.centraldata.modelo;

import java.util.ArrayList;

public class ListaDatos<T> {
    protected  ArrayList<T> ListaDatos;

    public ListaDatos() {
     ListaDatos = new ArrayList<>();
    }
    
    public int getSize(){
        return this.ListaDatos.size();
    }
    
    public void anadir(T t) {
        this.ListaDatos.add(t);
    }
    
    public void borrar(T t){
        this.ListaDatos.remove(t);
    }
    
    public ArrayList<T> getArrayList(){
        ArrayList<T> aList = new ArrayList<>(ListaDatos);
        return aList;
    }

    public void añadir(T t) throws Exception {
        this.ListaDatos.add(t);
    }

    public void esborrar(T t) {
        this.ListaDatos.remove(t); 
    }
    
    public T getAt(int position) {
       return this.ListaDatos.get(position);
    }

    public void clear() {
        this.ListaDatos.clear();
    }
    
    public boolean isEmpty() {
        return ListaDatos.isEmpty();
    }
    
}
