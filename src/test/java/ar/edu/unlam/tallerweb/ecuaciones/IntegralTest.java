package ar.edu.unlam.tallerweb.ecuaciones;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Agregue los tests que considere necesarios. Se proporciona un test a modo de
 * testigo.
 * 
 */
public class IntegralTest {

	@Test
	public void areaBajoLaIdentidad() {

		Ecuacion ecuacion = new EcuacionLineal(0.0, 1.0);

		IntegralDeArea i = new IntegralDeArea();
		Double area = i.calcular(ecuacion, 0.0, 1.0, 0.01);

		assertEquals(
				"Se espera que el área bajo la recta identidad entre 0 y 1 sea 1/2",
				0.5, area.doubleValue(), 0.01);

	}

}
