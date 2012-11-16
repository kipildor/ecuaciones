package ar.edu.unlam.tallerweb.ecuaciones;

public class EcuacionLineal implements Ecuacion {
	private Double m = 0.0;
	private Double b = 0.0;
	private Double y = 0.0;

	public final Double getM() {
		return m;
	}

	public final void setM(final Double m) {
		this.m = m;
	}

	public final Double getB() {
		return b;
	}

	public final void setB(final Double b) {
		this.b = b;
	}

	public EcuacionLineal(final Double m, final Double b) {
		super();
		this.m = m;
		this.b = b;
		//throw new RuntimeException("No implementado");
	}

	public final Double resolver(final Double x) {
		y = ((m * x) + b);
		// TODO Auto-generated method stub
		return y;
		//throw new RuntimeException("No implementado");
	}

}
