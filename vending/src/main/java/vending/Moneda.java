package vending;

public class Moneda {

	private String nombre;
	private Integer valor;

	public Moneda(String nombre, Integer valor) {
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
