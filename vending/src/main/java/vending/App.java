package vending;

import java.util.Random;
import java.util.Scanner;

public class App {

	static Scanner entrada = new Scanner(System.in);
	static Random rnd = new Random();

	public static void main(String[] args) {

		// INSTANCIADO DE MAQUINAITEMS (PRODUCTOS Y PRECIOS)
		String[] nombreProductos = { "Coca-Cola", "Huesitos", "Agua de 1L", "Sandwich ", "Pepinillos", "Red-Bull",
				"License W10 " };
		Integer[] precioProductos = { 120, 200, 250, 150, 100, 230, 10000 };
		MaquinaItem[] itemsMaquina = new MaquinaItem[7];
		// INSTANCIADO DE MONEDERO (MONEDAS Y VALOR) ****** NO EXISTE MONEDERO. LA
		// MAQUINA TIENE UN HASHMAP QUE ASIGNA POR CONSTRUCTOR UNA CANTIDAD A CADA TIPO
		// DE MONEDAS(10, 20, 50....). ASIGNA A TODOS LOS TIPOS DE MONEDAS 20
		// UNIDADES(VER EN EL METODO setHashMap de MaquinaJava)

		// ESTO ESTA PARA USAR EL FOR EACH (ASIGNA AL ARRAY DE MAQUINAITEM SU OBJETO
		// PRODUCTO Y CANTIDAD POR CADA REPETICION DEL FOR EACH)
		int i = 0;
		for (String nombreProducto : nombreProductos) {
			itemsMaquina[i] = new MaquinaItem(new Producto(nombreProducto, precioProductos[i]), 10);
			i++;
		}
		Maquina maquina = new Maquina(itemsMaquina);
		System.out.println(maquina.menuText());
		System.out.println("================================================================");
		System.out.println("Elige un producto: ");
		int option = entrada.nextInt();
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
