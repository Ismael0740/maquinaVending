package vending;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Maquina {

	private MaquinaItem[] tablaProductos;
	private Comprobador comprobador;

	/**
	 * Representa la cantidad de monedas que hay para un tipo de moneda determinada,
	 * valores aceptados: centimosAceptados[]
	 */
	HashMap<Integer, Integer> monedasCantidad = new HashMap<>();

	Maquina(MaquinaItem[] tablaProductos, List<Moneda> monedasValidas) {
		this.tablaProductos = tablaProductos;
		this.comprobador = new Comprobador(monedasValidas);
	}

	public MaquinaItem[] getTablaProductos() {
		return this.tablaProductos;
	}

	public void buyItem(int i) {
		// Lanzar excepción si no existe el producto
		if (i < 6) {
			MaquinaItem product = this.tablaProductos[i];
			Integer costoProduct = product.getProducto().getValor();
			Integer moneyGiven = 0;
			Scanner stdin = new Scanner(System.in);

			while (moneyGiven < costoProduct) {
				App.imprimir("Te faltan " + (costoProduct - moneyGiven) + " centimos");
				Integer coinInt = stdin.nextInt();

				// TODO: Hacer nueva función check coin que tenga como parametro un integer y
				// busque en la lista de monedas permitidas si hay alguna con ese valor (En
				// Comprobador.java obviamente)
				if (comprobador.checkCoin(new Moneda("e", 2))) {
					moneyGiven += coin;
				} else {
					App.imprimir("Introduce un valor valido");
				}
			}
			Integer sobrante = moneyGiven - costoProduct;

			// TODO: Realizar bucle que te devuelva la cantidad sobrante del Integer
			// (sobrante), pero que te obligue a volver a introducir las monedas si no tiene
			// cambio para igualar el Integer (sobrante)

			product.setCantidad(product.getCantidad() - 1);
		} else {
			App.imprimir("Producto no existente");
		}

	}

	/**
	 * Metodo que obtiene la cantidad de un tipo de moneda determinada, el tipo de
	 * moneda es introducido por parametro.
	 *
	 * @param valorMoneda El tipo de moneda de la que se quiere saber la cantidad
	 * @return La cantidad que tiene la maquina de esa moneda en especifico.
	 */
	Integer getMonedaCantidad(int valorMoneda) {
		return monedasCantidad.get(valorMoneda);
	}

	/**
	 * Retorna un texto el cual se puede imprimir por pantalla, correctamente
	 * formateado de los items, costo y unidades de estos
	 *
	 * @return
	 */
	String menuText() {
		String msg = "";
		int i = 0;
		for (MaquinaItem producto : tablaProductos) {
			msg += i + " " + producto.getInfoProducto() + "\n";
			i++;
		}

		return msg;
	}
}
