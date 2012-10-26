package ar.edu.unlam.tallerweb.ecuaciones;

import java.util.List;

/**
 * Representa una ecuación polinómica del tipo
 * f(x) = n + (n-1) × x + (n-2) × x^2 + ...
 *
 */
public class EcuacionPolinomica implements Ecuacion {

	/**
	 * Constructor parametrizado
	 *
	 * @param coeficientes siendo coeficientes[0] el valor que
	 * corresponde al término independiente.
	 *
	 * e.g.
	 *
	 * f(x) = coeficientes[0]
	 * 		+ coeficientes[1] × x
	 * 		+ coeficientes[2] × x^2
	 * 		+ ...
	 *
	 * coeficientes = [1, 0, 2, 1, -1]
	 * f(x) = 1 × x^0 + 0 × x^1 + 2 × x^2 + 1 × x^3 - 1 × x^4
	 *
	 */
	public EcuacionPolinomica(List<Double> coeficientes) {

		throw new RuntimeException("No implementado");

	}

	/**
	 * Devuelve el resultado de evaluar f(x)
	 *
	 * @param x la variable
	 *
	 */
	public Double resolver(Double x) {

		throw new RuntimeException("No implementado");

	}

}
