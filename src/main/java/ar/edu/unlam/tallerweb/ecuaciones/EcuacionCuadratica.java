package ar.edu.unlam.tallerweb.ecuaciones;

/**
 * Representa una ecuación cuadrática del tipo
 * f(x) = a × x^2 + b × x + c
 *
 */
public class EcuacionCuadratica implements Ecuacion
{
	private Double a = 0.0;
	private Double b = 0.0;
	private Double c = 0.0;
	private Double y = 0.0;

	public Double getA() {
		return a;
	}

	public void setA(Double a) {
		this.a = a;
	}

	public Double getB() {
		return b;
	}

	public void setB(Double b) {
		this.b = b;
	}

	public Double getC() {
		return c;
	}

	public void setC(Double c) {
		this.c = c;
	}

	/**
	 * Constructor parametrizado
	 *
	 * @param a
	 * @param b
	 * @param c
	 *
	 */
	public EcuacionCuadratica(Double a, Double b, Double c)
	{
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
	public Double resolver(Double x)
	{
		y = ((a * (x * x)) + (b *x) + c);

		return y;
		//throw new RuntimeException("No implementado");
	}

}
