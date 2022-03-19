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
    
    public void anadir(T t) {
        this.lista.add(t);
    }
    
    public void borrar(T t){
        this.lista.remove(t);
    }
    
    public ArrayList<T> getArrayList(){
        ArrayList<T> aList = new ArrayList<>(lista);
        return aList;
    }

}
