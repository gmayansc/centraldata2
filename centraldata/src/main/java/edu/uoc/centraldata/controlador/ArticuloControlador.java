package edu.uoc.centraldata.controlador;

import edu.uoc.centraldata.dao.DAOException;
import edu.uoc.centraldata.dao.hibernate.HibernateArticuloDAO;
import edu.uoc.centraldata.modelo.Articulo;

public class ArticuloControlador {

    public static void anadirArticulo(String descripcion, double precio, double gastosEnvio, int tiempo) throws DAOException {

        //INSTANCIAMOS UN OBJETO ARTÍCULO
        Articulo art = new Articulo(descripcion, precio, gastosEnvio, tiempo);
        HibernateArticuloDAO.insertar(art);

    }

    public static void eliminarArticulo(Articulo a) throws DAOException {
        HibernateArticuloDAO.eliminar(a);
    }

    public static Articulo getArticulo(int codigo) {
        Articulo art = HibernateArticuloDAO.getArticulo(codigo);
        if (art == null) {
            return null;
        } else {
            return art;
        }
    }

    public static void leerLista() {
        HibernateArticuloDAO.getAllArticulos();
    }

}
