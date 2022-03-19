
package edu.uoc.centraldata.controlador;
import edu.uoc.centraldata.modelo.*;

public class ArticuloControlador {

    public static void anadirArticulo (int codigo, String descripcion, float precio, float gastosEnvio, int tiempo){
        //INSTANCIAMOS UN OBJETO ARTÍCULO
        Articulo art = new Articulo(codigo, descripcion, precio, gastosEnvio, tiempo);
        ListaArticulos listArt = new ListaArticulos();
        System.out.print(art.toString());
        
        //AÑADIMOS ESTE OBJETO A LA LISTA DE ARTICULOS
        listArt.anadir(art);
        System.out.println(listArt.getSize());
        
    }
    
}

//existeArticulo(Codigo: int): boolean
//añadirArticulo(Codigo: int, Descripcion: String, Precio: float, GastosEnvio: float, Tiempo: int): void
//eliminarArticulo(Articulo: Articulo): void
//mostrarArticulos(Articulo: Articulo): void
