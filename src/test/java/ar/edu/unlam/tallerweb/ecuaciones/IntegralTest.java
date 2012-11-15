package ar.edu.unlam.tallerweb.ecuaciones;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * Agregue los tests que considere necesarios. Se proporciona un test a modo de
 * testigo.
 * 
 */
public class IntegralTest
{
	@Test
	public void areaBajoLaIdentidad()
	{
		Ecuacion ecuacion = new EcuacionLineal(1.0, 0.0);

		IntegralDeArea integral = new IntegralDeArea();
		Double incremento = 0.01;
		Double areaObtenida = integral.calcular(ecuacion, 0.0, 1.0, incremento);

		
		Double precision = 0.01;
		Double areaEsperada = 0.5;
		assertEquals(
				"Se espera que el Ã¡rea bajo la recta identidad entre 0 y 1 sea 1/2",
				areaEsperada, areaObtenida.doubleValue(), precision);

	}
/*
 package ar.edu.unlam.tallerweb.ecuaciones;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntegralTest {

@Test
public void areaBajoLaIdentidad() {

Ecuacion ecuacion = new EcuacionLineal(1.0, 0.0);

IntegralDeArea integral = new IntegralDeArea();
Double incremento = 0.01;
Double areaObtenida = integral.calcular(ecuacion, 0.0, 1.0, incremento);


Double precision = 0.01;
Double areaEsperada = 0.5;
assertEquals(
"Se espera que el área bajo la recta identidad entre 0 y 1 sea 1/2",
areaEsperada, areaObtenida.doubleValue(), precision);

}

} 
 */
	@Test
	public void areaBajoLaIdentidad2()
	{
		Ecuacion ecuacion = new EcuacionLineal(1.0, 0.0);

		IntegralDeArea integral = new IntegralDeArea();
	
		Double incremento = 0.5;
		Double areaObtenida = integral.calcular(ecuacion, 0.0, 1.0, incremento);
		
		Double precision = 0.01;
		Double areaEsperada = 0.5;
		
		assertEquals("Se espera que el Area bajo la recta identidad entre 0 y 1 sea 1/2",
				areaEsperada, areaObtenida, precision);
	}
/*	
	@Test
	public void areaBajoLaIdentidadConPrimitivos()
	{
		Ecuacion ecuacion = new EcuacionLineal(1.0, 0.0);

		IntegralDeArea integral = new IntegralDeArea();
		//double incremento = 0.01;
		double incremento = 0.5;
		double areaObtenida = integral.calcular(ecuacion, 0.0, 1.0, incremento);

		
		double precision = 0.01;
		double areaEsperada = 0.5;
		
		//assertEquals("Se espera que el Area bajo la recta identidad entre 0 y 1 sea 1/2",
		//		areaEsperada, areaObtenida.doubleValue(), precision);
		
		assertEquals("Se espera que el Area bajo la recta identidad entre 0 y 1 sea 1/2",
				areaEsperada, areaObtenida, precision);
	}
*/	
	@Test
	public void areaBajoLaIdentidad3()
	{
		Ecuacion ecuacion = new EcuacionCuadratica(0.5, 0.0, 0.0);

		IntegralDeArea integral = new IntegralDeArea();
	
		Double incremento = 0.5;
		Double areaObtenida = integral.calcular(ecuacion, 1.0, 3.0, incremento);
		
		//Double precision = 0.01;
		//Double areaEsperada = 0.5;
		
		System.out.println("Las sumas de Riemann dan (cuadratica) : "+ areaObtenida);
	}

	@Test
	public void areaBajoLaIdentidad4()
	{
		List<Double> coeficientes = new ArrayList<Double>();
		coeficientes.add(1.0);
		coeficientes.add(0.0);
		coeficientes.add(1.0);
		
		Ecuacion ecuacion = new EcuacionPolinomica(coeficientes);

		IntegralDeArea integral = new IntegralDeArea();
		
		Double incremento = 0.4;
		Double areaObtenida = integral.calcular(ecuacion, -1.0, 1.0, incremento);
		
		//Double precision = 0.01;
		//Double areaEsperada = 0.5;
		
		System.out.println("Las sumas de Riemann dan (como polinomica): "+ areaObtenida);
	}

	@Test
	public void areaBajoLaIdentidad5()
	{
		List <Double> datos = new ArrayList<Double>();
		
		datos.add(10.0);
		datos.add(0.0);
		datos.add(-6.0);
		datos.add(3.0);
		datos.add(0.0);
		datos.add(1.0);
		
		Ecuacion ecuacion = new EcuacionPolinomica(datos);
	
		IntegralDeArea integral = new IntegralDeArea();
		Double incremento = 0.25;
		Double areaObtenida = integral.calcular(ecuacion, 3.0, 4.0, incremento);
	
	
		Double precision = 0.01;
		Double areaEsperada = 633.23;
		
		assertEquals("Se espera que el área bajo la recta identidad entre 3 y 4 sea 633.23 ",
		areaEsperada, areaObtenida.doubleValue(), precision);
	}
	
	@Test
	public void areaBajoLaIdentidad6()
	{
		Double puntoLineal = 0.0;
		Double puntoPolinomica = 0.0;
		
		Ecuacion lineal = new EcuacionLineal(2.0, 1.0);
		puntoLineal = lineal.resolver(2.0);
		
		Ecuacion polinomica = new EcuacionPolinomica(Arrays.asList(new Double[] {1.0, 2.0}));
		puntoPolinomica = polinomica.resolver(2.0);
		
		assertEquals("Se espera que el valor de sea igual calculado de las 2 formas ",
				puntoLineal, puntoPolinomica, 0.01);
		//System.out.println("Punto Lineal: "+ puntoLineal +" ,  punto Polinomica: "+ puntoPolinomica);
		/*
		List <Double> datos = new ArrayList<Double>();
		
		datos.add(1.0);
		datos.add(0.0);
		datos.add(3.0);
		datos.add(-6.0);
		datos.add(0.0);
		datos.add(10.0);
		
		Ecuacion ecuacion = new EcuacionPolinomica(datos);
	
		IntegralDeArea integral = new IntegralDeArea();
		Double incremento = 0.25;
		Double areaObtenida = integral.calcular(ecuacion, 3.0, 4.0, incremento);
	
	
		Double precision = 0.01;
		Double areaEsperada = 633.23;
		
		assertEquals("Se espera que el área bajo la recta identidad entre 3 y 4 sea 633.23 ",
		areaEsperada, areaObtenida.doubleValue(), precision);
		*/
	}
	
	@Test
	public void areaBajoLaIdentidad7()
	{
		Ecuacion lineal = new EcuacionLineal(1.0, -1.0);
		
		IntegralDeArea integral = new IntegralDeArea();
		
		Double incremento = 0.01;
		Double areaObtenida = integral.calcular(lineal, 0.00, 2.00, incremento);
		Double precision = 0.01;
		
		//System.out.println("El area de y=x-1 es: "+ areaObtenida);
		assertEquals("Se espera que el valor del area sea igual a 1 ",
			areaObtenida, 1.00, precision);
	}
	
	@Test
	public void areaBajoLaIdentidad8()
	{
		Ecuacion ecuacion = new EcuacionLineal(0.0, -2.0);

		IntegralDeArea integral = new IntegralDeArea();
	
		Double incremento = 0.01;
		Double areaObtenida = integral.calcular(ecuacion, 0.0, 2.0, incremento);
		
		Double precision = 0.01;
		Double areaEsperada = 4.00;
		
		assertEquals("Se espera que el Area bajo la recta identidad entre 0 y 2 sea 4",
				areaEsperada, areaObtenida, precision);
	}
}
