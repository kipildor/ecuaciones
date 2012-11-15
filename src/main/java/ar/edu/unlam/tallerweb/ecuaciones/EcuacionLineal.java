package ar.edu.unlam.tallerweb.ecuaciones;

/**
 * Representa una ecuación lineal del tipo f(x) = m × x + b
 *
 */
public class EcuacionLineal implements Ecuacion
{
	private Double m = 0.0;
	private Double b = 0.0;
	private Double y = 0.0;

	public Double getM() {
		return m;
	}

	public void setM(Double m) {
		this.m = m;
	}

	public Double getB() {
		return b;
	}

	public void setB(Double b) {
		this.b = b;
	}

	/**
	 * Constructor parametrizado
	 *
	 * @param m la pendiente
	 * @param b la ordenada al orígen
	 *
	 */
	public EcuacionLineal(Double m, Double b)
	{
		super();
		this.m = m;
		this.b = b;
		//throw new RuntimeException("No implementado");
	}

	/**
	 * Devuelve el resultado de evaluar f(x)
	 *
	 * @param x la variable
	 *
	 */
	public Double resolver(Double x)
	{
		y = ((m * x) + b);
		// TODO Auto-generated method stub
		return y;
		//throw new RuntimeException("No implementado");
	}

}
