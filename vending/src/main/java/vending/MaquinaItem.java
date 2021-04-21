package vending;

public class MaquinaItem {

	private Producto producto;
	private Integer cantidad;

	public MaquinaItem(Producto producto, Integer cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * Metodo que retorna un String el cual contiene la info del producto tal que:
	 * {NombreProducto Precio Cantidad}
	 *
	 * @return La info del producto
	 */
	public String getInfoProducto() {
		return this.producto.getNombre() + "\t" + this.producto.getValor() + "\t" + this.cantidad;
	}

}
