package edu.uoc.centraldata.modelo;

import java.util.ArrayList;

public class ListaDatos<T> {
    public ArrayList<T> lista;

public ListaDatos() {
    lista = new ArrayList<>();
}

public int getSize() {
        return this.lista.size();
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
    
    public ArrayList<T> getArrayList() {
        ArrayList<T> aList = new ArrayList<>(lista);
        return aList;
    }
    
}
