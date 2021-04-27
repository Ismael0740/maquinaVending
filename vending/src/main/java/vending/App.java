package vending;

import java.util.Random;
import java.util.Scanner;

interface ImprimirFn extends Function {
	void imprimir(String x);
}

public class App {

	static Scanner stdin = new Scanner(System.in);
	static Random rnd = new Random();

	public static void main(String[] args) {
		ImprimirFn imprimir = (x) -> {
			System.out.println(x);
		};
		imprimir("hola");
		String[] nombreProductos = { "Coca-Cola", "Huesitos", "Agua de 1L", "Sandwich ", "Pepinillos", "Red-Bull",
				"License W10 " };
		Integer[] precioProductos = { 120, 200, 250, 150, 100, 230, 10000 };
		MaquinaItem[] itemsMaquina = new MaquinaItem[7];

		int i = 0;
		for (String nombreProducto : nombreProductos) {
			itemsMaquina[i] = new MaquinaItem(new Producto(nombreProducto, precioProductos[i]), 10);
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
