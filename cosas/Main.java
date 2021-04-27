package cosas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// INSTANCIADO DE MONEDAS Y ITEM MONEDAS

		Moneda euro2 = new Moneda("2euros", 200);
		ItemMoneda e2 = new ItemMoneda(euro2, 40);
		Moneda euro1 = new Moneda("1euro", 100);
		ItemMoneda e1 = new ItemMoneda(euro1, 40);
		Moneda cent50 = new Moneda("50centimos", 50);
		ItemMoneda c50 = new ItemMoneda(cent50, 40);
		Moneda cent20 = new Moneda("20centimos", 20);
		ItemMoneda c20 = new ItemMoneda(cent20, 40);
		Moneda cent10 = new Moneda("10centimos", 10);
		ItemMoneda c10 = new ItemMoneda(cent10, 40);

		// INSTANCIADO DE PRODUCTOS Y ITEMPRODUCTOS

		Producto cocaCola = new Producto("Coca-cola", 120);
		ItemProducto p1 = new ItemProducto(cocaCola, 10);
		Producto huesitos = new Producto("Huesitos", 200);
		ItemProducto p2 = new ItemProducto(huesitos, 10);
		Producto aguaDe1L = new Producto("Agua de 1L", 250);
		ItemProducto p3 = new ItemProducto(aguaDe1L, 10);
		Producto sandwich = new Producto("Sandwich", 150);
		ItemProducto p4 = new ItemProducto(sandwich, 10);
		Producto pepinillos = new Producto("Pepinillos", 100);
		ItemProducto p5 = new ItemProducto(pepinillos, 10);
		Producto redBull = new Producto("Red-Bull", 230);
		ItemProducto p6 = new ItemProducto(redBull, 10);
		Producto licenseW10 = new Producto("License W10", 10000);
		ItemProducto p7 = new ItemProducto(licenseW10, 10);

		// CREACION DE ARRAY DE ITEMMONEDAS Y DE ITEMPRODUCTOS

		ItemMoneda[] listaMonedas = { e1, e2, c50, c20, c10 };
		ItemProducto[] listaProductos = { p1, p2, p3, p4, p5, p6, p7 };

		// INSTANCIADO DE COMPROBADOR

		int[] listaValores = { 200, 100, 50, 20, 10 };
		Comprobador comprobador = new Comprobador(listaValores);

		// INSTANCIADO DE **MAQUINA**

		Maquina maquinaExpendedora = new Maquina(listaMonedas, listaProductos, comprobador);


		//COMIENZO DEL PROGRAMA

		Scanner entrada = new Scanner(System.in);

		System.out.println(maquinaExpendedora.mostrarProductos());

		int eleccion = entrada.nextInt();
		maquinaExpendedora.buyItems(eleccion);




		System.out.println(maquinaExpendedora.mostrarProductos());

	}

}
