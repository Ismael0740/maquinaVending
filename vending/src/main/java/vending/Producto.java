package vending;

public class Producto {

	private String nombre;
	private Integer valor;

	public Producto(String nombre, Integer valor) {
		this.nombre = nombre;
		this.valor = valor;
	}

	public String getNombre() {
		return nombre;
	}

	public Integer getValor() {
		return valor;
	}
}
