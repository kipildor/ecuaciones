package ar.edu.unlam.tallerweb.ecuaciones;

public class EcuacionCuadratica implements Ecuacion {
	private Double a = 0.00;
	private Double b = 0.00;
	private Double c = 0.00;
	private Double y = 0.00;

	public final Double getA() {
		return a;
	}

	public final void setA(final Double a) {
		this.a = a;
	}

	public final Double getB() {
		return b;
	}

	public final void setB(final Double b) {
		this.b = b;
	}

	public final Double getC() {
		return c;
	}

	public final void setC(final Double c) {
		this.c = c;
	}
	/**
	 * Constructor parametrizado.
	 *
	 * @param a
	 * @param b
	 * @param c
	 *
	 */
	public EcuacionCuadratica(final Double a, final Double b, final Double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	/**
	 * Devuelve el resultado de evaluar f(x).
	 *
	 * @param x la variable
	 *
	 */
	public final Double resolver(final Double x) {
		y = ((a * (x * x)) + (b * x) + c);
		return y;
	}
}
