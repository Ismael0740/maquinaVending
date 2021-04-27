package cosas;

public class Comprobador {

	private int[] listaValores;
	private int valorIntroducido;

	public Comprobador(int[] listaValores) {
		this.listaValores = listaValores;
	}

	public int[] getListaValores() {
		return listaValores;
	}

	public int getValorIntroducido() {
		return valorIntroducido;
	}

	public void setValorIntroducido(int valorIntroducido) {
		this.valorIntroducido = valorIntroducido;
	}

	// DEVUELVE VERDADERO O FALSO EN UN BOOLEANO DEPENDIENDO DE SI EL VALOR QUE SE
	// HA INTRODUCIDO ES EL DE UNA MONEDA VALIDA
	public boolean verificarValor(int valor) {

		boolean verificacion = false;

		for (int i = 0; i < listaValores.length; i++) {
			if (valor == listaValores[i]) {
				verificacion = true;
			}
		}

		return verificacion;
	}

}
