package gestionMaquinas;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class NegocioMejoradoTest {

    @Test
    public void probarGenerarCodigo() {
        NegocioMejorado negocio = new NegocioMejorado();

        String codigo = negocio.generarCodigo();

        assertTrue(codigo.contains("M-"));
    }
}