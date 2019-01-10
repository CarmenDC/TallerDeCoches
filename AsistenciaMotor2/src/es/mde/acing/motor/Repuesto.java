package es.mde.acing.motor;

public class Repuesto {
	
	String pieza;
	double precio;
	
	int tiempoReparacion;
	
	
	
	
	protected String getPieza() {
		return pieza;
	}
	protected double getPrecio() {
		return precio;
	}
	protected int getTiempoReparacion() {
		return tiempoReparacion;
	}
	
	
	public Repuesto(String pieza, double precio, int tiempoReparacion) {
		super();
		this.pieza = pieza;
		this.precio = precio;
		this.tiempoReparacion = tiempoReparacion;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pieza == null) ? 0 : pieza.hashCode());
		long temp;
		temp = Double.doubleToLongBits(precio);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + tiempoReparacion;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Repuesto other = (Repuesto) obj;
		if (pieza == null) {
			if (other.pieza != null)
				return false;
		} else if (!pieza.equals(other.pieza))
			return false;
		if (Double.doubleToLongBits(precio) != Double.doubleToLongBits(other.precio))
			return false;
		if (tiempoReparacion != other.tiempoReparacion)
			return false;
		return true;
	}
	
	
	
	
}
