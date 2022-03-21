package edu.uoc.centraldata.modelo;

import java.util.ArrayList;

public class ListaDatos<T> {
    protected  ArrayList<T> lista;

    public ListaDatos() {
     lista = new ArrayList<>();
    }
    
    public int getSize(){
        return this.lista.size();
    }
    
    public void agregar(T t) {
        this.lista.add(t);
    }
    
    public void borrar(T t){
        this.lista.remove(t);
    }
    
    public ArrayList<T> getArrayList(){
        ArrayList<T> aList = new ArrayList<>(lista);
        return aList;
    }

    public void añadir(T t) throws Exception {
        this.lista.add(t);
    }

    public void esborrar(T t) {
        this.lista.remove(t); 
    }
    
    public T getAt(int position) {
       return this.lista.get(position);
    }

    public void clear() {
        this.lista.clear();
    }
    
    public boolean isEmpty() {
        return lista.isEmpty();
    }
    
}
