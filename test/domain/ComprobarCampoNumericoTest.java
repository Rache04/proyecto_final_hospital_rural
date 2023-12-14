/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import Vistas.ValidarCampos;
import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class ComprobarCampoNumericoTest {
    @Test
    public void testComprobarCampoNumerico1() {
        // Arrange (Preparación)

        // Act (Acción)
        boolean test = ValidarCampos.comprobarCamposNumericos("456");

        // Assert (Verificación)
        assertTrue(test == true);
    }
    @Test
    public void testComprobarCampoNumerico2() {
        // Arrange (Preparación)

        // Act (Acción)
        boolean test = ValidarCampos.comprobarCamposNumericos("dos");

        // Assert (Verificación)
        assertTrue(test == false);
    }
    @Test
    public void testComprobarCampoNumerico3() {
        // Arrange (Preparación)

        // Act (Acción)
        boolean test = ValidarCampos.comprobarCamposNumericos("4.23");

        // Assert (Verificación)
        assertTrue(test == false);
    }
    @Test
    public void testComprobarCampoNumerico4() {
        // Arrange (Preparación)

        // Act (Acción)
        boolean test = ValidarCampos.comprobarCamposNumericos("56 78 56");

        // Assert (Verificación)
        assertTrue(test == false);
    }
    @Test
    public void testComprobarCampoNumerico5() {
        // Arrange (Preparación)

        // Act (Acción)
        boolean test = ValidarCampos.comprobarCamposNumericos("00000");

        // Assert (Verificación)
        assertTrue(test == true);
    }
    
}
