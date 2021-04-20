package vending;

public class MaquinaMonedero {

	private Moneda moneda;
	private Integer cantidad;

	public MaquinaMonedero(Moneda moneda, Integer cantidad) {
		this.moneda = moneda;
		this.cantidad = cantidad;
	}

	public Moneda getMoneda() {
		return moneda;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

}
