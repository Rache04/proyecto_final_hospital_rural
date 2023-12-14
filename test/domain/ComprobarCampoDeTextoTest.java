/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import Vistas.ValidarCampos;
import static org.junit.Assert.*;
import org.junit.Test;

public class ComprobarCampoDeTextoTest {

    @Test
    public void testComprobarCampoTexto1() {
        // Arrange (Preparación)

        // Act (Acción)
        boolean test = ValidarCampos.comprobarCamposTexto("Lolo");

        // Assert (Verificación)
        assertTrue(test == true);
    }
    @Test
    public void testComprobarCampoTexto2() {
        // Arrange (Preparación)

        // Act (Acción)
        boolean test = ValidarCampos.comprobarCamposTexto("Juan Alverto");

        // Assert (Verificación)
        assertTrue(test == true);
    }
    @Test
    public void testComprobarCampoTexto3() {
        // Arrange (Preparación)

        // Act (Acción)
        boolean test = ValidarCampos.comprobarCamposTexto("Migel_*");

        // Assert (Verificación)
        assertTrue(test == false);
    }
    @Test
    public void testComprobarCampoTexto4() {
        // Arrange (Preparación)

        // Act (Acción)
        boolean test = ValidarCampos.comprobarCamposTexto("568 72");

        // Assert (Verificación)
        assertTrue(test == false);
    }
    @Test
    public void testComprobarCampoTexto5() {
        // Arrange (Preparación)

        // Act (Acción)
        boolean test = ValidarCampos.comprobarCamposTexto("Juan");

        // Assert (Verificación)
        assertTrue(test == true);
    }
    @Test
    public void testComprobarCampoTexto6() {
        // Arrange (Preparación)

        // Act (Acción)
        boolean test = ValidarCampos.comprobarCamposTexto("@# */");

        // Assert (Verificación)
        assertTrue(test == false);
    }
}