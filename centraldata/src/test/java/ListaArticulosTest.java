
import org.junit.Test;
import static org.junit.Assert.*;

import edu.uoc.centraldata.modelo.*;

public class ListaArticulosTest {
    
    private Articulo articulo;
    
    public ListaArticulosTest () {
        this.articulo = new Articulo(1234, "iPhone", 999.89, 34.23, 43);
    }
        
    @Test
    public void testGetCodigo() {
        assertEquals(1234, this.articulo.getCodigo());
    }
}
