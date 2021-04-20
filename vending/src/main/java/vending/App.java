package vending;

import java.util.Random;
import java.util.Scanner;

public class App {

	static Scanner stdin = new Scanner(System.in);
	static Random rnd = new Random();

	public static void main(String[] args) {

		// INSTANCIADO DE MAQUINAITEMS (PRODUCTOS Y PRECIOS)
		String[] nombreProductos = { "Coca-Cola", "Huesitos", "Agua de 1L", "Sandwich ", "Pepinillos", "Red-Bull",
				"License W10 " };
		Integer[] precioProductos = { 120, 200, 250, 150, 100, 230, 10000 };
		MaquinaItem[] itemsMaquina = new MaquinaItem[7];
		// INSTANCIADO DE MONEDERO (MONEDAS Y VALOR)
		// String[] nombreMonedas = { "1 EURO", "2 EUROS", "10 Centimos", "20 Centimos",
		// "50 Centimos" };

		// ESTO ESTA PARA USAR EL FOR EACH (ASIGNA AL ARRAY DE MAQUINAITEM SU OBJETO
		// PRODUCTO Y CANTIDAD POR CADA REPETICION DEL FOR EACH)
		int i = 0;
		for (String nombreProducto : nombreProductos) {
			itemsMaquina[i] = new MaquinaItem(new Producto(nombreProducto, precioProductos[i]), rnd.nextInt(16) + 5);
			i++;
		}
		Maquina maquina = new Maquina(itemsMaquina);
		System.out.println(maquina.menuText());
		System.out.println("================================================================");
		System.out.println("Elige un producto: ");
		int option = stdin.nextInt();
		maquina.buyItem(option);

		System.out.println(maquina.menuText());
		System.out.println("================================================================");
		// TODO: Añadir parte contraseñas 0740

		System.out.println("FIN DEL PROGRAMA");
	}

	public static void imprimir(String msg) {
		System.out.println(msg);
	}
}
