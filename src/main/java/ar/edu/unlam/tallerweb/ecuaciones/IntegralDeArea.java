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
	public final Double calcular(final Ecuacion ecuacion,
			final Double inicio, final Double fin,
			final Double incremento) {
		if (inicio > fin) {
			 throw new RuntimeException("Rango invalido");
		} else {
			Double areaIzq = 0.00;
			Double areaDer = 0.00;
			Double areaTotal = 0.00;
			Double anteAltura = 0.00;
			Double altura = 0.00;
			try {
				rango(inicio, fin);
			} catch (ExcepcionIntervalo ex) {
				System.out.println(ex.getMessage());
	        }
			for (Double i = inicio; i < fin; i += incremento) {
				anteAltura = ecuacion.resolver(i);
				if (anteAltura < 0.00) {
					anteAltura *= -1;
				}
				altura += anteAltura;
			}
			areaIzq = altura * incremento;
			anteAltura = 0.00;
			altura = 0.00;
			for (Double j = (inicio + incremento);
					j <= fin; j += incremento) {
				anteAltura = ecuacion.resolver(j);
				if (anteAltura < 0.00) {
					anteAltura *= -1.00;
				}
				altura += anteAltura;
			}
			areaDer = altura * incremento;
			areaTotal = ((areaDer + areaIzq) / 2);
			areaTotal = redondeo(areaTotal);
			return areaTotal;
		}
	}
	public static Double redondeo(final Double areaObtenidaa) {
		Double areaObtenida = areaObtenidaa;
		double areaDoble1 = 0.000;
		Double areaDoble2 = 0.000;
		final Double correrIzq = 100.000;
		final Double correrDer = 0.01;
		final Double valorDeQuiebre = 0.005;
		final Double sumar = 0.01;
		int areaEntera = 0;
		areaDoble1 = areaObtenida * correrIzq;
		areaEntera = (int) areaDoble1;
		areaDoble1 = areaEntera * correrDer;
		areaDoble2 = areaObtenida - areaDoble1;
		if (areaDoble2 >= valorDeQuiebre) {
			areaObtenida = 0.0000;
			areaObtenida = areaDoble1 + sumar;
		}
		return areaObtenida;
	}
	public static void rango(final Double inicio,
			final Double fin)throws ExcepcionIntervalo {
		if (inicio > fin) {
			throw new ExcepcionIntervalo("El rango esta invertido");
		}
	}
}
