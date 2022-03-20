
import static org.junit.Assert.*;

public class ListaArticulosTest {
        
    @Test
    public void testGetCodigo() {
        assertEquals("1234", edu.uoc.centraldata.modelo.Articulo.getCodigo());
    }
}
