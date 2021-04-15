package vending;

import java.util.Scanner;

public class App {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		
		//INSTANCIADO DE PRODUCTOS Y LISTA DE PRODUCTOS
		
		Producto cocaCola = new Producto("Coca-Cola", 1.20);
		Producto huesitos = new Producto("Huesitos", 1);
		Producto agua = new Producto("Agua 1L", 2);
		Producto sandwichDeAtun = new Producto("Sandwich de atun", 1.50);
		
		Producto[] productos = {cocaCola, huesitos, agua, sandwichDeAtun};
		int[] cantidad = {5, 10, 5, 4};
		
		Maquina tablaProductos = new Maquina(productos, cantidad);
		
		//----------------------------------------------------------------------------------
		

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