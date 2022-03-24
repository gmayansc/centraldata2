package edu.uoc.centraldata.modelo;

public class ListaArticulos extends ListaDatos<Articulo> {

    @Override
    public void agregar(Articulo articulo) {
        if (!existeArticulo(articulo)) {
            this.lista.add(articulo);
        } else {
            System.out.println("Este Articulo ya existe");
        }
    }

    public void borrarArticulo(int codigo) {
        Articulo art = getArticulo(codigo);
        if (existeArticulo(art)) {
            this.lista.remove(art);
        } else {
            System.out.println("El artículo no existe y, por tanto, no se puede borrar.");
        }
    }

    public boolean existeArticulo(Articulo art) {

        if (art != null) {

            for (int i = 0; i < this.lista.size(); i++) {
                Articulo art2 = this.lista.get(i);
                if (art2.getCodigo() == art.getCodigo()) {
                    return true;
                }
            }
        }
        return false;
    }

    public Articulo getArticulo(int codigo) {
        for (int i = 0; i < this.lista.size(); i++) {
            Articulo art = this.lista.get(i);
            if (art.getCodigo() == codigo) {
                return art;
            }
        }
        return null;
    }

}
