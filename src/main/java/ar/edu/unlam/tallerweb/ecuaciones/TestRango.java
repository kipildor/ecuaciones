package ar.edu.unlam.tallerweb.ecuaciones;

public class TestRango extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	public TestRango(){
		super("El rango es invalido");
	}
	
	public TestRango(String msg){
		super(msg);
	}
}
