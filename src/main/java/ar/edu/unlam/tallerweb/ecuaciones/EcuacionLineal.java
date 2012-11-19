package ar.edu.unlam.tallerweb.ecuaciones;

public class EcuacionLineal implements Ecuacion {
	private Double m = 0.00;
	private Double b = 0.00;
	private Double y = 0.00;

	public EcuacionLineal (final Double mm, final Double bb) {
		super();
		this.m = mm;
		this.b = bb;
		//throw new RuntimeException("No implementado");
	}
	public final Double resolver (final Double x) {
		y = ((m * x) + b);
		// TODO Auto-generated method stub
		return y;
		//throw new RuntimeException("No implementado");
	}
}
