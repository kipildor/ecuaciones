package ar.edu.unlam.tallerweb.ecuaciones;
import java.util.ArrayList;
import java.util.List;
/**
 * Representa una ecuación polinómica del tipo
 * f(x) = n + (n-1) × x + (n-2) × x^2 + ...
 *
 */
public class EcuacionPolinomica implements Ecuacion {
	private List<Double> coeficientes = new ArrayList<Double>();
	private Double y = 0.00;
/**.
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
	public EcuacionPolinomica (final List<Double> coeficiente) {
		super();
		this.coeficientes = coeficiente;
		//throw new RuntimeException("No implementado");
	}
	/**
	 * Devuelve el resultado de evaluar f(x)
	 *
	 * @param x la variable
	 *
	 */
	public final Double resolver (final Double x) {
		y = 0.00;
		Double valorActual = 0.00;
		for (int i = 0; i < coeficientes.size(); i++) {
			valorActual = coeficientes.get(i);
			y = y + (valorActual * (elevar(x, i)));
		}
		return y;
		//throw new RuntimeException("No implementado");
	}
	public final Double elevar (final Double x, final int exponente) {
		Double resultado = 1.00;
		for (int i = 0; i < exponente; i++) {
		resultado = resultado * x; 
		}
		return resultado;
	}
}
