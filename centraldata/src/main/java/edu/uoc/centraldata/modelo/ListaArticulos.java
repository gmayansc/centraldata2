package edu.uoc.centraldata.modelo;
import java.util.ArrayList;

public class ListaArticulos extends ListaDatos <Articulo> {

    public static int bol = 0;
    public static int i=0;

   
 
    public void agregar(Articulo articulo) {
        if (-1!=existeArticulo(articulo.getCodigo())) {
            this.lista.add(articulo);
            System.out.println("El Articulo ha sido Creado");
        } else {
            System.out.println("Este Articulo ya existe");
        }
    }
    
    public int existeArticulo(int codigo) {
        for (i = 0; i < this.lista.size(); i++) {
            Articulo art =  this.lista.get(i);
            if (codigo == art.getCodigo()) {
                bol = i;
            } else {
                bol = -1;
            }
        }
        return bol;
    }
    /*public Articulo Articulo;
            
    public ArrayList<T> listaArticulo;
    
    private void inicializarValores() {
        listaArticulo.add ((T) new Articulo(1234, "Mochila Verde", 10.54, 1.31, 20));
        listaArticulo.add ((T) new Articulo(45, "Boligrafo Azul", 2.50, 0.25, 8));
    }
    
    public boolean existeArticulo(int Codigo) {
        boolean bol = false;
        for (int i = 0; i < listaArticulo.size(); i++) {
            Articulo = (edu.uoc.centraldata.modelo.Articulo) listaArticulo.get(i);
            if (Codigo == Articulo.getCodigo()) {
                bol = true;
            } else {
                bol = false;
            }
        }
        return bol;
    }
    

    
    
    
    public void eliminarArticulo(Articulo Articulo) {
        if (existeArticulo(Articulo.getCodigo()) == true) {
            this.listaArticulo.remove((T) Articulo);
            System.out.println("El Cliente ha sido Articulo");
        } else {
            System.out.println("No existe el Articulo");
        }
    }
     
    public void listarArticulos(Articulo Articulo) {
        if (existeArticulo(Articulo.getCodigo()) == true) {
            System.out.println("Listado de Articulos (" + this.Articulo.getCodigo() + "):");
        } else {
            System.out.println("No existe el Articulos");
        }    
    }
*/
}
