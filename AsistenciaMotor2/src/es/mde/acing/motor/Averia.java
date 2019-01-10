package es.mde.acing.motor;

import java.util.Collection;

public class Averia {
	String descripcion;
	double horasReparacion;
	Collection <Repuesto> piezasNecesarias;
	
	public Averia(String descripcion, Collection<Repuesto> piezasNecesarias) {
		super();
		this.descripcion = descripcion;
		this.piezasNecesarias = piezasNecesarias;
		this.horasReparacion = horasTotalReparacion();
	}
	
	

	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public double getHorasReparacion() {
		return horasTotalReparacion();
	}



	int horasTotalReparacion() {
		int horasTotal = 0;
		for (Repuesto repuesto: piezasNecesarias) {
			horasTotal += repuesto.getTiempoReparacion();
		}
//		System.out.println ("horas averia " + horasTotal);
		return horasTotal;
	}
	
	int precioTotalRepuestosAveria() {
		int precioRep = 0;
		for (Repuesto repuesto: piezasNecesarias) {
			precioRep += repuesto.precio;
		}
//		System.out.println("precio repustos " + precioRep);
		return precioRep;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		long temp;
		temp = Double.doubleToLongBits(horasReparacion);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((piezasNecesarias == null) ? 0 : piezasNecesarias.hashCode());
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
		Averia other = (Averia) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (Double.doubleToLongBits(horasReparacion) != Double.doubleToLongBits(other.horasReparacion))
			return false;
		if (piezasNecesarias == null) {
			if (other.piezasNecesarias != null)
				return false;
		} else if (!piezasNecesarias.equals(other.piezasNecesarias))
			return false;
		return true;
	}
	
	
	
}
