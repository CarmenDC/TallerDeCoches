package es.mde.acing.motor;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;

public abstract class Vehiculo implements Coloreable, Identificable<Matricula>, Reparable, Diagnosticable {
	Modelo modelo;
	Color color;
	Collection<Averia> averias = new ArrayList<>();
	Collection<Averia> averiasReparadas= new ArrayList<>();
	
	Modelo getModelo() {
		return modelo;
	}

	
	
	
	public Collection<Averia> getAveriasReparadas() {
		return averiasReparadas;
	}




	public void setAveriasReparadas(Collection<Averia> averiasReparadas) {
		this.averiasReparadas = averiasReparadas;
	}




	public Collection<Averia> getAverias() {
		return averias;
	}


	public void setAverias(Collection<Averia> averias) {
		this.averias = averias;
	}

	public Vehiculo(Modelo modelo, Color color) {
		this.color = color;
		this.modelo = modelo;
	}

	
	@Override
	public double gethorasReparacion() {
		double horasAveria =0;
			for (Averia averia: averias) {
			horasAveria += averia.horasReparacion;
			}
//			System.out.println("horas total averias " + horasAveria);
		return horasAveria;
	}
		
	@Override
	public boolean estaAveriado() {
			return (getAverias()==null)? false : true;
	}


}
