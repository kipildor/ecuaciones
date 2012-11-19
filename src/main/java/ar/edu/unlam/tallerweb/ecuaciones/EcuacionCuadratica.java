package ar.edu.unlam.tallerweb.ecuaciones;

public class EcuacionCuadratica implements Ecuacion {
	private Double a = 0.00;
	private Double b = 0.00;
	private Double c = 0.00;
	private Double y = 0.00;

	public final Double getA() {
		return a;
	}

	public final void setA(final Double aa) {
		this.a = aa;
	}

	public final Double getB() {
		return b;
	}

	public final void setB(final Double bb) {
		this.b = bb;
	}

	public final Double getC() {
		return c;
	}

	public final void setC(final Double cc) {
		this.c = cc;
	}
	/**
	 * Constructor parametrizado.
	 *
	 * @param a
	 * @param b
	 * @param c
	 *
	 */
	public EcuacionCuadratica(final Double aa, final Double bb, final Double cc) {
		super();
		this.a = aa;
		this.b = bb;
		this.c = cc;
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
