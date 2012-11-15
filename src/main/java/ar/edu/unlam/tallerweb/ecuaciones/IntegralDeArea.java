package ar.edu.unlam.tallerweb.ecuaciones;

/**
 * Representa la abstracción del cálculo de la integral bajo
 * la curva proporcionada.
 *
 */
public class IntegralDeArea
{
	/**
	 * Calcula el área bajo la curva, utilizando el método de las sumas
	 * de Riemann entre los dos puntos dados.
	 *
	 * @param ecuacion
	 * @param inicio
	 * @param fin
	 * @param incremento
	 * @return el área bajo la curva
	 */
	public Double calcular(Ecuacion ecuacion,Double inicio,
							Double fin,Double incremento)
	{
		Double areaIzq = 0.00;
		Double areaDer = 0.00;
		Double areaTotal = 0.00;
		
		Double anteAltura = 0.00;
		
		Double altura = 0.00;
		
		for(Double i = inicio; i < fin; i += incremento )
		{
			anteAltura = ecuacion.resolver(i);
			
			if(anteAltura < 0)
			{
				anteAltura *= -1;
			}
			
			altura += anteAltura;
		}
		
		areaIzq = altura * incremento;
		
		anteAltura = 0.00;
		altura = 0.00;
		
		for(Double j=(inicio+incremento);j<=fin;j+=incremento)
		{
			anteAltura = ecuacion.resolver(j);
			
			if(anteAltura < 0)
			{
				anteAltura *= -1;
			}
			
			altura += anteAltura;
		}
		areaDer = altura * incremento;
		
		areaTotal = ((areaDer + areaIzq) / 2);
		
		return areaTotal;
	}
	/*
	public Double calcular(Ecuacion ecuacion,Double inicio,
							Double fin,int divisiones)
	{
		Double incremento = 0.0;
		Double devolver = 0.0;
		
		incremento = ((fin - inicio) / divisiones);
		
		devolver=calcular(ecuacion, inicio, fin, incremento);
		
		return devolver;
		//throw new RuntimeException("No implementado");
	}
	*/
}
