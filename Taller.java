package es.mde.acing.motor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class Taller {
	
	double precioManoObra;
	
	List<Reparable> vehiculosAveriados = new ArrayList<>();
	
	Collection <ReparacionesTerminadas> reparacionesUnAnno = new ArrayList<>();
	
	Collection<Mecanico> mecanicos = new ArrayList<>();
	
	Date fechaEntregaDate = new Date();
	
	
	public Taller(double precioManoObra, Collection<Mecanico> mecanicos) {
		super();
		this.precioManoObra = precioManoObra;
		this.mecanicos = mecanicos;
		fechaEntregaDate.setTime(29/2/2016);
		}

	public double getPresupuesto (Vehiculo vehiculo) {
		double presupuesto = 0;
		for (Averia averia : vehiculo.averias) {
			presupuesto += averia.horasTotalReparacion()*precioManoObra + averia.precioTotalRepuestosAveria();			
		}
		return presupuesto;		
	}
	
	public void entregarVehiculo (Vehiculo vehiculo) {
		ReparacionesTerminadas reparacionesVehiculo = new ReparacionesTerminadas();
		if (!vehiculo.estaAveriado()) {
			reparacionesVehiculo.setVehiculo(vehiculo);
			reparacionesVehiculo.setAveriasReparadas(vehiculo.getAveriasReparadas());
			reparacionesVehiculo.setFechaEntrega(fechaEntregaDate);	
//			System.out.println (reparacionesVehiculo.getFechaEntrega());
			}
		reparacionesUnAnno.add(reparacionesVehiculo);
	}
	
	
	public boolean admitirVehiculo (Vehiculo vehiculo) {
		System.out.println("esta averiado? " + vehiculo.estaAveriado());
		return vehiculo.estaAveriado()&&!getMalusoFraude(vehiculo);
	}
	
	public void entradaVehiculoTaller(Vehiculo vehiculo) {
		if (admitirVehiculo(vehiculo)) {
			vehiculosAveriados.add(vehiculo);
		}
	}
	public void repararVehiculo (Vehiculo vehiculo) {
		vehiculo.setAveriasReparadas(vehiculo.getAverias());
		vehiculo.setAverias(null);
	}
	
	public boolean getMalusoFraude(Vehiculo vehiculo) {
		Boolean vehiculofraude = false ;
		Date fechaHoy = new Date();
	//	System.out.println(fechaHoy);
		for (ReparacionesTerminadas reparacionHechas: reparacionesUnAnno) {
			if (reparacionHechas.getVehiculo()==vehiculo) {
				for (Averia averiaReparada: reparacionHechas.getAveriasReparadas()) {
					for (Averia averiaVehiculo : vehiculo.getAverias()) {
						Boolean averiasiguales=(averiaReparada.equals(averiaVehiculo));
						Boolean fechaMayorBoolean=(fechaHoy.getTime() >
								reparacionHechas.fechaEntrega.getTime() + 365*24*60*60*1000);
						if (averiasiguales&&fechaMayorBoolean){
							vehiculofraude = true;
							break;	
							}
						}
						
					}
				}	
			}
//		System.out.println(vehiculofraude);
		return vehiculofraude;
	}

}
