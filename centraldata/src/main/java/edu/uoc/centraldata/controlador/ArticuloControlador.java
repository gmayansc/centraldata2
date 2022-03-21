package edu.uoc.centraldata.controlador;

import edu.uoc.centraldata.modelo.*;
import java.util.Iterator;

public class ArticuloControlador {

    public static ListaDatos<Articulo> listaArticulos = new ListaDatos();

    public static void cargarArticulos() {
        Articulo art = new Articulo(1234, "Mochila Verde", 10.54, 1.31, 20);
        Articulo art1 = new Articulo(2324, "iPhone", 998.54, 6.31, 20);
        Articulo art2 = new Articulo(2423, "Lápiz", 107.54, 1.31, 20);
        Articulo art3 = new Articulo(3343, "Mochila Roja", 1077.54, 1.31, 20);
        listaArticulos.agregar(art);
        listaArticulos.agregar(art1);
        listaArticulos.agregar(art2);
        listaArticulos.agregar(art3);

    }

    public static void anadirArticulo(int codigo, String descripcion, float precio, float gastosEnvio, int tiempo) {

        //INSTANCIAMOS UN OBJETO ARTÍCULO
        Articulo art = new Articulo(codigo, descripcion, precio, gastosEnvio, tiempo);
        listaArticulos.agregar(art);

    }

    public static void leerLista() {
        for (int i = 0; i < listaArticulos.getSize(); i++) {
            System.out.println("El articulo " + listaArticulos.getAt(i).getCodigo() + " es:  " + listaArticulos.getAt(i).getDescripcion());
        }
    }

}

//existeArticulo(Codigo: int): boolean
//añadirArticulo(Codigo: int, Descripcion: String, Precio: float, GastosEnvio: float, Tiempo: int): void
//eliminarArticulo(Articulo: Articulo): void
//mostrarArticulos(Articulo: Articulo): void
