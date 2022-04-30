package edu.uoc.centraldata.controlador;

import edu.uoc.centraldata.dao.DAOException;
import edu.uoc.centraldata.dao.hibernate.HibernateArticuloDAO;
import edu.uoc.centraldata.modelo.Articulo;
import edu.uoc.centraldata.modelo.ListaArticulos;


public class ArticuloControlador {


    public static void anadirArticulo(String descripcion, double precio, double gastosEnvio, int tiempo) throws DAOException {

        //INSTANCIAMOS UN OBJETO ARTÍCULO
        Articulo art = new Articulo(descripcion, precio, gastosEnvio, tiempo);
        HibernateArticuloDAO.insertar(art);

    }
    public static void eliminarArticulo(Articulo a) throws DAOException{
        HibernateArticuloDAO.eliminar(a);
    }
    
    
    /*public static void leerLista() {
        for (int i = 0; i < listaArticulos.getSize(); i++) {
            System.out.println("El articulo " + listaArticulos.getAt(i).getCodigo() + " es:  " + listaArticulos.getAt(i).getDescripcion());
        }
    }
    

    
    public static Articulo getArticulo(int codigo) {
        for (int i = 0; i < listaArticulos.getSize(); i++) {
            Articulo art = listaArticulos.getAt(i);
            if (codigo == art.getCodigo()) {
                return art;
            }
        }
        return null;
    }*/
    

}
