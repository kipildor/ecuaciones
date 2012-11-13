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
	public Double calcular(Ecuacion ecuacion,Double inicio,Double fin,Double incremento)
	{
		Double areaIzq = 0.0;
		Double areaDer = 0.0;
		Double areaTotal = 0.0;
		
		Double altura = 0.0;
		
		//System.out.println("Areaizq:"+ areaIzq+" AreaDer: "+areaDer+" total:"+areaTotal+" inicio:"+inicio+" fin:"+fin);
		
		for(Double i = inicio; i < fin; i += incremento )
		{
			altura += ecuacion.resolver(i);
			//areaIzq += ((ecuacion.resolver(i)) * incremento);	VIEJO
			//System.out.println("Por IZQ bucle:"+i+" altura de Y:"+altura);
		}
		
		areaIzq = altura * incremento;
		//System.out.println("Area por la izq: "+areaIzq);
		
		altura = 0.0;
		
		for(Double j = (inicio + incremento); j <= fin; j += incremento )
		{
			altura += ecuacion.resolver(j);
			//System.out.println("Por DER bucle:"+j+" altura de Y:"+altura);
		}
		
		areaDer = altura * incremento;
		//System.out.println("Area por la der: "+areaDer);
		
		areaTotal = ((areaDer + areaIzq) / 2);
		
		if(areaTotal < 0)
		{
			areaTotal *= -1;
		}

		//System.out.println("Areaizq:"+ areaIzq+" AreaDer: "+areaDer+" total:"+areaTotal+" inicio:"+inicio+" fin:"+fin);
		return areaTotal;
		//throw new RuntimeException("No implementado");
	}
		
	/*
	public Double calcular(Ecuacion ecuacion, Double inicio, Double fin, int divisiones)
	{
		Double incremento = 0.0;
		Double devolver = 0.0;
		
		incremento = ((fin - inicio) / divisiones);
		
		devolver = calcular(ecuacion, inicio, fin, incremento);
		
		return devolver;
		//throw new RuntimeException("No implementado");
	}
	*/

}
