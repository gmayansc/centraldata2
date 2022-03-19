package edu.uoc.centraldata.modelo;
import java.util.ArrayList;

public class ListaArticulos extends ListaDatos <Articulo>{
    
    @Override
    public void anadir(Articulo art){
            this.lista.add(art);
    }

    
    
    
}
