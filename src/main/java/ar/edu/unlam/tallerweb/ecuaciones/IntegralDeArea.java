package ar.edu.unlam.tallerweb.ecuaciones;

/**
 * Representa la abstracción del cálculo de la integral bajo
 * la curva proporcionada.
 *
 */
public class IntegralDeArea {
	/**
	 * Calcula el área bajo la curva, utilizando el método de las sumas
	 * de Riemann entre los dos puntos dados.
	 *
	 * @param ecuacion
	 * @param inicio
	 * @param fin
	 * @param incremento
	 * @return el área bajo la curva
	 */
	public final Double calcular
	(final Ecuacion ecuacion, 
	 final Double inicio, final Double fin, 
	 final Double incremento) {
		if (inicio > fin) {
			throw new RuntimeException("Rango invalido");}
		else {
		Double areaIzq = 0.00;
		Double areaDer = 0.00;
		Double areaTotal = 0.00;
		Double anteAltura = 0.00;
		Double altura = 0.00;
	/*	
		try{
			
		}catch(TestRango e){
			System.out.println("El rango es invalido");
		}
		*/
		for (Double i = inicio; i < fin; i += incremento) {
			anteAltura = ecuacion.resolver(i);
			if (anteAltura < 0.00)	{
				anteAltura *= -1;
			}
			altura += anteAltura;
		}
		areaIzq = altura * incremento;
		anteAltura = 0.00;
		altura = 0.00;
		for (Double j = (inicio + incremento); j <= fin; j += incremento) {
			anteAltura = ecuacion.resolver(j);
			if (anteAltura < 0.00) {
				anteAltura *= -1.00;
			}
			altura += anteAltura;
		}
		areaDer = altura * incremento;
		areaTotal = ((areaDer + areaIzq) / 2);
		
		areaTotal = Redondeo(areaTotal);//Redondeamos el resultado.
		return areaTotal;
		}
	}
	
	public static Double Redondeo(Double areaObtenida)
	{
		double areaDoble1 = 0.000;
		Double areaDoble2 = 0.000;
		int areaEntera = 0;
		
		areaDoble1 = areaObtenida * 100;
		areaEntera = (int)areaDoble1;
		areaDoble1 = areaEntera * 0.01;
		areaDoble2 = areaObtenida - areaDoble1;
		
		if(areaDoble2 >= 0.005){
			areaObtenida = 0.0000;
			areaObtenida = areaDoble1 + 0.01;
		}
		return areaObtenida;
	}
	/*
	public static boolean RangoValido(final Double inicio, final Double fin) {
		throws TestRango {
			if (inicio > fin) {
				throw new RangoInvertido();
			}
		}
	}*/
}/*
public EcuacionLineal(Double m, Double b) {
if ((m == null) || (b == null)) {
throw new RuntimeException("No implementado");
} else {
this.m = m;
this.b = b;
}
}
*/
