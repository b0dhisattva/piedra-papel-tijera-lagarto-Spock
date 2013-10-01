package edu.tallerweb.pptls;


public class Mano {


	private Forma forma;
	
	private Resultado matriz[][];

	public Mano(final Forma forma) {
		this.forma = forma;
		this.matriz = new Resultado[][] {
				{ Resultado.EMPATA,	Resultado.PIERDE,	Resultado.PIERDE,	Resultado.GANA,		Resultado.GANA 		},
				{ Resultado.GANA,	Resultado.EMPATA,	Resultado.PIERDE,	Resultado.PIERDE,	Resultado.GANA 		},
				{ Resultado.GANA,	Resultado.GANA,		Resultado.EMPATA,	Resultado.PIERDE,	Resultado.PIERDE 	},
				{ Resultado.PIERDE,	Resultado.GANA,		Resultado.GANA,		Resultado.EMPATA,	Resultado.PIERDE 	},
				{ Resultado.PIERDE,	Resultado.PIERDE,	Resultado.GANA,		Resultado.GANA,		Resultado.EMPATA 	} };

	}


	public Resultado jugarCon(final Mano otra) {

		return this.matriz[this.forma.getValor()][otra.forma.getValor()];

	}

}