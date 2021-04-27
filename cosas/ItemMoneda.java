package cosas;

public class ItemMoneda {

	private Moneda moneda;
	private int cantidad;

	public ItemMoneda(Moneda moneda, int cantidad) {
		this.moneda = moneda;
		this.cantidad = cantidad;
	}

	public Moneda getMoneda() {
		return moneda;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
