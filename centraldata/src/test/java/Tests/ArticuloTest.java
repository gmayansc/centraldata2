package Tests;


import org.junit.Test;
import static org.junit.Assert.*;

import edu.uoc.centraldata.modelo.*;

public class ArticuloTest {
    
    private Articulo articulo;
    
    public ArticuloTest () {
        this.articulo = new Articulo(1234, "iPhone", 999.89, 34.23, 43);
    }
        
    @Test
    public void testGetCodigo() {
        assertEquals(1234, this.articulo.getCodigo());
    }
    
        @Test
    public void getDescripcion() {
        assertEquals("iPhone", this.articulo.getDescripcion());
    }
    
    
    
}
