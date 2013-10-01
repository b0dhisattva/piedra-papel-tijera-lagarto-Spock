package edu.tallerweb.pptls;

/**
 * Representa una de las Manos involucradas en el juego
 */
public class Mano {

	private Forma forma;
	private Resultado[][] matriz;

	public Mano(final Forma forma){

		this.forma = forma;

		this.matriz = new Resultado[][] {
				{ Resultado.EMPATA, Resultado.PIERDE, Resultado.PIERDE, Resultado.GANA, Resultado.GANA},
				{ Resultado.GANA, Resultado.EMPATA, Resultado.PIERDE, Resultado.PIERDE, Resultado.GANA},
				{ Resultado.GANA, Resultado.GANA, Resultado.EMPATA, Resultado.PIERDE, Resultado.PIERDE},
				{ Resultado.PIERDE, Resultado.GANA, Resultado.GANA, Resultado.EMPATA, Resultado.PIERDE},
				{ Resultado.PIERDE, Resultado.PIERDE, Resultado.GANA, Resultado.GANA, Resultado.EMPATA}
			};
	}

	/**
	 * Evaluará el resultado de la partida según las reglas
	 * del juego.
	 * @param otra, la otra Mano.
	 * @return un Resultado, de acuerdo al estado del juego.
	 */

	public Resultado jugarCon(final Mano otra) {

		return this.matriz[this.forma.getValor()][otra.forma.getValor()];

	}

}