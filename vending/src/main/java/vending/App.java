package vending;

import java.util.Random;
import java.util.Scanner;

public class App {

	static Scanner entrada = new Scanner(System.in);
	static Random rnd = new Random();

	public static void main(String[] args) {

		// INSTANCIADO DE MAQUINAITEMS (PRODUCTOS Y PRECIOS)

		String[] nombreProductos = {"Coca-Cola", "Huesitos", "Agua 1L", "Sandwich de atun", "Pepinillos", "Red-Bull", "Licencia Windows10 pro"};
		Integer[] precioProductos = {120, 200, 250, 150, 100, 230, 10000};
		MaquinaItem[] itemsMaquina = new MaquinaItem[7];



		// INSTANCIADO DE MONEDERO (MONEDAS Y VALOR)
		String[] nombreMonedas = {"1 EURO", "2 EUROS", "10 Centimos", "20 Centimos", "50 Centimos"};
		Integer[] valorMonedas = {100, 200, 10, 20, 50};
		MaquinaMonedero[] itemsMonedero = new MaquinaMonedero[5];

		//ESTO ESTA PARA USAR EL FOR EACH (ASIGNA AL ARRAY DE MAQUINAITEM SU OBJETO PRODUCTO Y CANTIDAD POR CADA REPETICION DEL FOR EACH)

		int i = 0;
		for (String nombreProducto : nombreProductos) {
			itemsMaquina[i] = new MaquinaItem(new Producto(nombreProducto, precioProductos[i]), rnd.nextInt(16) + 5);
			i++;
		}

		i = 0;
		for (String nombreMoneda : nombreMonedas) {
			itemsMonedero[i] = new MaquinaMonedero(new Moneda(nombreMoneda, valorMonedas[i]), 20);
			i++;
		}

		// ----------------------------------------------------------------------------------

		boolean bloqueador = false;

		while (bloqueador == false) {

			int eleccion = entrada.nextInt();

			switch (eleccion) {
			case 0: {
				bloqueador = true;
				break;
			}

			case 1: {

				break;
			}

			case 2: {

				break;
			}

			case 3: {

				break;
			}

			case 4: {

				break;
			}

			case 0740: {

				break;
			}

			default:
				throw new IllegalArgumentException("Valor inesperado: " + eleccion);
			}
		}

		System.out.println("FIN DEL PROGRAMA");

	}

}
