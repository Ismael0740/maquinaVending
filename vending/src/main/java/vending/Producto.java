package vending;

public class Producto {

	private String nombre;
	private double valor;

	public Producto(String nombre, double valor) {
		this.nombre = nombre;
		this.valor = valor;
	}

	public String getNombre() {
		return nombre;
	}

	public double getValor() {
		return valor;
	}
}
