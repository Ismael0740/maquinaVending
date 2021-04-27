package vending;

import java.util.List;

public class Comprobador {
	private List<Moneda> monedas;

	/**
	 * Metodo que valida si la moneda esta en el array de monedas
	 *
	 * @param coin La moneda a validar de tipo Moneda
	 * @return `True` si la moneda es valida y `False` en caso contrario
	 */
	boolean checkCoin(Moneda coin) {
		return this.monedas.contains(coin);
	}

	/**
	 *
	 * @param monedasValidas El array de monedas que acepta el comprobador
	 */
	public Comprobador(List<Moneda> monedasValidas) {
		this.monedas = monedasValidas;
	}
}
