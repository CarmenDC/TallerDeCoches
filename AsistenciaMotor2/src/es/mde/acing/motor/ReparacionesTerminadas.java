package es.mde.acing.motor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class ReparacionesTerminadas {
	
	Mecanico mecanico;
	
	Collection <Averia> averiasReparadas = new ArrayList<>();
	
	Vehiculo vehiculo;
	
	Date fechaEntrega;

	Mecanico getMecanico() {
		return mecanico;
	}

	Collection<Averia> getAveriasReparadas() {
		return averiasReparadas;
	}

	void setAveriasReparadas(Collection<Averia> averiasReparadas) {
		this.averiasReparadas = averiasReparadas;
	}

	Vehiculo getVehiculo() {
		return vehiculo;
	}

	void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	Date getFechaEntrega() {
		return fechaEntrega;
	}

	void setFechaEntrega(Date fecha) {
		this.fechaEntrega = fecha;
	}

	void setMecanico(Mecanico mecanico) {
		this.mecanico = mecanico;
	}

	
	
	
	

}
