package edu.tallerweb.pptls;


/**
 * Representa una de las Manos involucradas en el juego
 */

public class Mano {

	/**
	 * Toda Mano debe crearse con una forma dada, que será
	 * la que determine su condición en el juego.
	 * @param forma, la Forma que adopta la Mano.
	 */

	/** Almacena la forma de la mano actual */
	private Forma forma;

	/** Almacena la matriz con las reglas del
	 * juego y sus posibles combinaciones 
	 */
	private Resultado matriz[][];

	public Mano(final Forma forma) {
		this.forma = forma;
		this.matriz = new Resultado[][] {
				{ Resultado.EMPATA,	Resultado.PIERDE,	Resultado.PIERDE,	Resultado.GANA,		Resultado.GANA 		},
				{ Resultado.GANA,	Resultado.EMPATA,	Resultado.PIERDE,	Resultado.PIERDE,	Resultado.GANA 		},
				{ Resultado.GANA,	Resultado.GANA,		Resultado.EMPATA,	Resultado.PIERDE,	Resultado.PIERDE 	},
				{ Resultado.PIERDE,	Resultado.GANA,		Resultado.GANA,		Resultado.EMPATA,	Resultado.PIERDE 	},
				{ Resultado.PIERDE,	Resultado.PIERDE,	Resultado.GANA,		Resultado.GANA,		Resultado.EMPATA 	} };

		/** throw new RuntimeException("No implementado aún"); */
	}

	/**
	 * Evaluará el resultado de la partida según las reglas
	 * del juego.
	 * @param otra, la otra Mano.
	 * @return un Resultado, de acuerdo al estado del juego.
	 */

	public Resultado jugarCon(final Mano otra) {

		/** Retorna un valor de los posibles Resultados 
		 * desde la matriz en base a las 
		 * formas que se enfrentan en ambas manos
		 */
		return this.matriz[this.forma.getValor()][otra.forma.getValor()];

		/** throw new RuntimeException("No implementado aún"); */
	}

}