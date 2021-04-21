package vending;

import java.util.HashMap;
import java.util.Scanner;

public class Maquina {

	private int[] centimosAceptados = { 10, 20, 50, 100, 200 };

	private MaquinaItem[] tablaProductos;

	/**
	 * Representa la cantidad de monedas que hay para un tipo de moneda determinada,
	 * valores aceptados: centimosAceptados[]
	 */
	HashMap<Integer, Integer> monedasCantidad = new HashMap<>();

	Maquina(MaquinaItem[] tablaProductos) {
		this.tablaProductos = tablaProductos;
		setHashMap();
	}

	public int[] getCentimosAceptados() {
		return this.centimosAceptados;
	}

	public MaquinaItem[] getTablaProductos() {
		return this.tablaProductos;
	}

	public void buyItem(int i) {
		// Lanzar excepción si no existe el producto
		if(i < 6){
			MaquinaItem product = this.tablaProductos[i];
			Integer costoProduct = product.getProducto().getValor();
			Integer moneyGiven = 0;
			Scanner stin = new Scanner(System.in);
			// TODO: Corregir
			while (moneyGiven < costoProduct) {
				App.imprimir("Te faltan " + (costoProduct - moneyGiven) + " centimos");
				Integer monedaIntroducida = stin.nextInt();
				if(monedaIntroducida == 10 || monedaIntroducida == 20 || monedaIntroducida == 50 || monedaIntroducida == 100 || monedaIntroducida == 200){
					moneyGiven += monedaIntroducida;
				} else{
					App.imprimir("Introduce un valor valido");
				}
			}
			Integer sobrante = moneyGiven - costoProduct;

					// TODO: Realizar bucle que te devuelva la cantidad sobrante del Integer (sobrante), pero que te obligue a volver a introducir las monedas si no tiene cambio para igualar el Integer (sobrante)

			product.setCantidad(product.getCantidad() - 1);
		} else{
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
	 * Metodo el cual es accedido unicamente por el constructor para inicializar el
	 * hashmap con la cantidad de monedas de cada tipo indicado en centimosAceptados
	 * (Mas correcto un enum)
	 */
	private void setHashMap() {
		for (int moneda : centimosAceptados) {
			monedasCantidad.put(moneda, 20);
		}
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
