package ar.edu.unlam.tallerweb.ecuaciones;

/**
 * Abstracción que representa todo tipo de ecuación con
 * una incógnita
 *
 */
public interface Ecuacion {

	/**
	 * Devuelve el resultado de evaluar f(x)
	 * 
	 * @param x la variable
	 * 
	 */
	public Double resolver(Double x);
	
}
