# Ecuaciones

## Consigna
El ejercicio plantea la necesidad de resolver ecuaciones polinómicas y el cálculo de áreas bajo las curvas por el metodo de las [sumas de Riemann](http://es.wikipedia.org/wiki/Suma_de_Riemann).

Para ello se proporcionan las siguientes clases

* EcuacionLineal
* EcuacionCuadratica
* EcuacionPolinomica
* IntegralDeArea

y la interfaz

* Ecuacion

Note que tanto la EcuacionLineal como la EcuacionCuadratica son casos particulares de la EcuacionPolinomica, con lo cual el resultado de de evaluar 

	Ecuacion lineal = new EcuacionLineal(2.0, 1.0);
	lineal.resolver(2.0);

Debería ser igual a 

	Ecuacion polinomica = new EcuacionPolinomica(Arrays.toList(new Double[] {1.0, 2.0})) 
	polinomica.resolver(2.0);

## Consideraciones

1. Recuerde no cambiar la firma de los métodos proporcionados por la cátedra.
2. Puede hacer **tantos tests como considere necesarios**, pero los mismos no se utilizarán para evaluar su código.
