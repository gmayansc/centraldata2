package edu.uoc.centraldata.modelo;


public class ListaPedidos extends ListaDatos<Pedido> {

    @Override
    public void agregar(Pedido ped) {
        if (!existePedido(ped.getNumero())) {
            this.lista.add(ped);
        } else {
            System.out.println("Este pedido ya está registrado");
        }
    }

    public boolean existePedido(int numero) {
        Pedido ped = getPedido(numero);
        if (ped != null) {
            for (int i = 0; i < this.lista.size(); i++) {
                Pedido ped2 = this.lista.get(i);
                if (ped2.getNumero() == ped.getNumero()) {
                    return true;
                }
            }
        }
        return false;
    }

    public Pedido getPedido(int numero) {
        for (int i = 0; i < this.lista.size(); i++) {
            Pedido ped = this.lista.get(i);
            if (numero == ped.getNumero()) {
                return ped;
            }
        }
        return null;
    }

    public void borrarPedido(int codigo) {
        Pedido ped = getPedido(codigo);
        if (ped != null) {
            if (existePedido(ped.getNumero())) {
                if (ped.getEnvio() == true) {
                    System.out.println("El pedido ya se ha enviado y, por tanto, no se puede borrar.");
                } else {
                    this.lista.remove(ped);
                }
            }
        } else {
            System.out.println("El pedido no existe y no se puede borrar");
        }
    }
}
