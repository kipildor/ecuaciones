package ar.edu.unlam.tallerweb.ecuaciones;

public class EcuacionCuadratica implements Ecuacion {
	private Double a = 0.0;
	private Double b = 0.0;
	private Double c = 0.0;
	private Double y = 0.0;

	public final Double getA() {
		return a;
	}

	public final void setA(Double a) {
		this.a = a;
	}

	public final Double getB() {
		return b;
	}

	public final void setB(Double b) {
		this.b = b;
	}

	public final Double getC() {
		return c;
	}

	public final void setC(Double c) {
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
//		throw new RuntimeException("No implementado");
	}

	/**
	 * Devuelve el resultado de evaluar f(x)
	 *
	 * @param x la variable
	 *
	 */
	public final Double resolver(Double x) {
		y = ((a * (x * x)) + (b * x) + c);

		return y;
		//throw new RuntimeException("No implementado");
	}

}
