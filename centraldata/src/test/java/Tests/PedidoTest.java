package Tests;


import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDate;
import java.time.LocalTime;

import edu.uoc.centraldata.modelo.*;

public class PedidoTest {
    
    private Pedido ped;
    private Cliente cli = new ClientePremium("35634544R", "Sofia", "Calle de Serrano, 12", "sofia@uoc.edu", "PREMIUM");
    private Articulo art = new Articulo(1234, "Mochila Verde", 10, 5, 20);

    
    public PedidoTest () {
        this.ped = new Pedido(0004, cli , art, 2, LocalDate.now(), LocalTime.now());
        ped.setEnvio(true);
    }
        
    @Test
    
    //TEST INCORRECTO PARA REPLICAR UN ERROR
    public void testGetEnvio() {
        assertTrue(this.ped.getEnvio());
    }
    
        @Test
    public void testgetCliente() {
        assertEquals(cli, this.ped.getCliente());
    }
   
}
