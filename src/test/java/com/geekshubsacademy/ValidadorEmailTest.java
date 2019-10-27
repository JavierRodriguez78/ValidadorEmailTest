package com.geekshubsacademy;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


/**
 * Escribe tests para indagar cómo de bien funciona
 * la clase ValidadorEmail que está en este mismo paquete.
 * @author random
 *
 */
public class ValidadorEmailTest {
    ValidadorEmail validador = ValidadorEmail.getInstance();

    @After
    public void after() {
        validador.reset();
    }

    @Test
    public void emailValido() {
        assertTrue(validador.validarEmail("email@valido.com"));
    }

    @Test
    public void dominioSinTLD() {
        assertTrue(validador.validarEmail("email@novalido"));
    }

    @Test
    public void dominioTerminadoEnPunto() {
        assertFalse(validador.validarEmail("email@novalido."));
    }

}
