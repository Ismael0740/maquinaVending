package vending;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {

	static Scanner stdin = new Scanner(System.in);
	static Random rnd = new Random();

	public static void main(String[] args) {

		String[] nombreProductos = { "Coca-Cola", "Huesitos", "Agua de 1L", "Sandwich ", "Pepinillos", "Red-Bull",
				"License W10 " };
		Integer[] precioProductos = { 120, 200, 250, 150, 100, 230, 10000 };
		Moneda[] monedas = new Moneda[] { new Moneda("1Cefdasntimo", 1), new Moneda("2Cenadfstimos", 2),
				new Moneda("5", 1312), new Moneda("1Cendfsatimo", 1312), new Moneda("1Centimo", 1321) };

		List<Moneda> acceptedCoins = Arrays.stream(monedas).collect(Collectors.toList());

		MaquinaItem[] itemsMaquina = new MaquinaItem[7];

		int i = 0;
		for (String nombreProducto : nombreProductos) {
			itemsMaquina[i] = new MaquinaItem(new Producto(nombreProducto, precioProductos[i]), 10);
			i++;
		}
		Maquina maquina = new Maquina(itemsMaquina, acceptedCoins);

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
