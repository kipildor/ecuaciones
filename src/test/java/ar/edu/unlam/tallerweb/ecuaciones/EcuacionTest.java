package ar.edu.unlam.tallerweb.ecuaciones;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Agregue los tests que considere necesarios. Se proporciona un test
 * a modo de testigo.
 *
 */
public class EcuacionTest
{
	/*
	@Test
	public void test() {
		fail("No implementado");
	}
	*/
	Double puntoObtenido = 0.0;
	
	@Test
	public void calcularEcuacionLineal()
	{
		Double m = 6.0;
		Double b = 8.0;
		Ecuacion lineal = new EcuacionLineal(m, b); 
		
		Double punto = 3.0;
		puntoObtenido= lineal.resolver(punto);
		Double precision = 0.01;
		Double puntoEsperado = 26.0;
		
		assertEquals("Se espera que dado x="+ punto +" y la funcion "+ m +"x + ("+ b +") sea Y="+ puntoObtenido +".  ",
				puntoEsperado, puntoObtenido, precision);
	}
	
	@Test
	public void calcularEcuacionCuadratica()
	{
		Double a = 3.0;
		Double b = 4.0;
		Double c = 6.0;
		
		Ecuacion cuadratica = new EcuacionCuadratica(a, b, c);
		
		Double punto = 5.0;
		puntoObtenido= cuadratica.resolver(punto);
		Double precision = 0.01;
		Double puntoEsperado = 101.0;
		
		assertEquals("Se espera que dado x="+ punto +" y la funcion "+ a +"x^2 + ("+ b +")x + ("+ c +") sea Y="+ puntoObtenido +".  ",
				puntoEsperado, puntoObtenido, precision);
	}
	
	@Test
	public void calcularEcuacionCuadratica2()
	{
		Double a = 2.0;
		Double b = 6.0;
		Double c = 10.0;
		
		Ecuacion cuadratica = new EcuacionCuadratica(a, b, c);
		
		Double punto = 3.0;
		puntoObtenido= cuadratica.resolver(punto);
		Double precision = 0.01;
		Double puntoEsperado = 46.0;
		
		assertEquals("Se espera que dado x="+ punto +" y la funcion "+ a +"x^2 + ("+ b +")x + ("+ c +") sea Y="+ puntoObtenido +".  ",
				puntoEsperado, puntoObtenido, precision);
		//System.out.println("La altura del eje Y es "+ cuadratica.resolver(3.0));
	}
	
	@Test
	public void calcularEcuacionPolinomica()
	{
		List<Double> lista = new ArrayList<Double>();
		
		lista.add(1.0);
		lista.add(0.0);
		lista.add(2.0);
		lista.add(1.0);
		lista.add(-1.0);
		
		Ecuacion polinomica = new EcuacionPolinomica(lista);
		
		//System.out.println("La altura del eje Y es "+ polinomica.resolver(6.0));
		
	}
}
