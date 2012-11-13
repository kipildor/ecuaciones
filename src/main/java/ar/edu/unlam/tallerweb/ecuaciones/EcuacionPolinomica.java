package ar.edu.unlam.tallerweb.ecuaciones;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa una ecuación polinómica del tipo
 * f(x) = n + (n-1) × x + (n-2) × x^2 + ...
 *
 */
public class EcuacionPolinomica implements Ecuacion
{
	private List<Double> coeficientes = new ArrayList<Double>();
	private Double y = 0.0;

	/**
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
	public EcuacionPolinomica(List<Double> coeficientes)
	{
		super();
		this.coeficientes = coeficientes;
		//throw new RuntimeException("No implementado");
	}
	
/**
	Definimos una ArrayList
	List<String> list = new ArrayList<String>();
	
	 A�adimos elementos
	list.add("Andrea");
	list.add("Amaya");
	list.add("Julio");

	 Obtenemos un Iterador y recorremos la lista.
		el m�todo hasNext() nos dice si hay m�s elementos y que el m�todo .next() nos permite movernos al siguiente elemento.	
	Iterator iter = list.iterator();
	while (iter.hasNext())
	  System.out.println(iter.next());
	}	
*/
	/**
	 * Devuelve el resultado de evaluar f(x)
	 *
	 * @param x la variable
	 *
	 */
	public Double resolver(Double x)
	{
		y = 0.0;
		
		Double valorActual = 0.0;
		
		//System.out.println("Cantidad de elementos: "+coeficientes.size());
		
		//int exponente = coeficientes.size() - 1;	primer linea para recorrer al revez
		
		for(int i = 0; i < coeficientes.size(); i++)
		{
			valorActual = coeficientes.get(i);

			//y = y + (valorActual * (Elevar(x, exponente)));	segunda linea
			y = y + (valorActual * (Elevar(x, i)));
			
			//System.out.println("Iteracion numero: "+ i +" X:"+x+"  valor: "+ valorActual+" exponente:"+exponente+" y: "+ y);
			
			/*
			for(int j = 0; j < i; j++)
			{
				y = y + (valorActual * x);
			}
			*/
			//exponente--;	tercer linea
		}

		return y;
		//throw new RuntimeException("No implementado");
	}
	
	public Double Elevar(Double x, int exponente)
	{
		Double resultado = 1.0;
		
		for(int i = 0; i < exponente; i++)
		{
			resultado = resultado * x; 
		}
		
		return resultado;
	}

}
