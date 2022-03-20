
package edu.uoc.centraldata.controlador;
import edu.uoc.centraldata.modelo.*;


public class ArticuloControlador {
    
    public static ListaDatos<Articulo> lista;
    
     public static ListaDatos crearLista(){
           ListaArticulos listArt = new ListaArticulos();
           return listArt;
    }
    
    public static void anadirArticulo (Articulo art ){
        
        //INSTANCIAMOS UN OBJETO ARTÍCULO
      //  Articulo art = new Articulo(codigo, descripcion, precio, gastosEnvio, tiempo);
        System.out.print(art.toString());
        
        //AÑADIMOS ESTE OBJETO A LA LISTA DE ARTICULOS
        lista.anadir(art);
    }
    
}

//existeArticulo(Codigo: int): boolean
//añadirArticulo(Codigo: int, Descripcion: String, Precio: float, GastosEnvio: float, Tiempo: int): void
//eliminarArticulo(Articulo: Articulo): void
//mostrarArticulos(Articulo: Articulo): void
