package es.mde.acing.motor;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class EjecutarTaller {

	public static void main(String[] args) {
		Modelo modelo1 = new Modelo("Mercedes");
		Modelo modelo2 = new Modelo("Audi");
		Color colorRojo = new Color(255,0,0);
		Color colorAzul = new Color(0,0,255);	
		Color colorVerde = new Color(0,255,0);
		Matricula matricula1 = new Matricula("1111CCC");
		Matricula matricula2 = new Matricula("2222DCC");
		Matricula matricula3 = new Matricula("3333FFF");
		
		Coche coche1 = new Coche(4, modelo1,colorRojo);
		coche1.setMatricula(matricula1);
		Coche coche2 = new Coche(4, modelo2,colorAzul);
		coche2.setMatricula(matricula2);
		Coche coche3 = new Coche(4, modelo2,colorVerde);
		coche3.setMatricula(matricula3);
		
		System.out.println (coche1.toString());		
		
		System.out.println (coche2.toString());		
		
		System.out.println (coche3.toString());		

		Repuesto repuesto1 = new Repuesto("bateria",100,1);
		Repuesto repuesto2 = new Repuesto("freno", 400,6);
		Repuesto repuesto3 = new Repuesto("rueda", 50,1);
		
		Collection <Repuesto> listaRepuestos1= new ArrayList<>();
		listaRepuestos1.add(repuesto1);
		
		Collection <Repuesto> listaRepuestos2= new ArrayList<>();
		listaRepuestos2.add(repuesto2);
		listaRepuestos2.add(repuesto3);
		
		
		Averia averia1 = new Averia("Fallo, en la bateria",listaRepuestos1);
		Averia averia2 = new Averia("frenado irregular, rueda pinchada",listaRepuestos2);
		
		Collection<Averia> averiasCoche1 = new ArrayList<>();
		
		averiasCoche1.add(averia1);
		averiasCoche1.add(averia2);
		
		coche1.setAverias(averiasCoche1);
		
			
		Mecanico mecanico1 = new Mecanico();
		Mecanico mecanico2 = new Mecanico();
		
		Collection<Mecanico> mecanicosTaller= new ArrayList<>();
		mecanicosTaller.add(mecanico1);
		mecanicosTaller.add(mecanico2);
		
		Taller miTaller = new Taller(20.5,mecanicosTaller);
		
		System.out.println ("Podemos admitir vehiculo " + coche1.matricula + " "+ miTaller.admitirVehiculo(coche1));
		
		miTaller.entradaVehiculoTaller(coche1);
		
		
		System.out.println ("El presupuesto para "+ coche1.matricula + " es: " + miTaller.getPresupuesto(coche1) + "€");		

		miTaller.repararVehiculo(coche1);
		
		miTaller.entregarVehiculo(coche1);
		
		
		System.out.println ("Podemos admitir vehiculo " + coche1.matricula + " "+ miTaller.admitirVehiculo(coche1));
		

		averiasCoche1.add(averia2);
		
		coche1.setAverias(averiasCoche1);
		
		System.out.println ("Podemos admitir vehiculo " + coche1.matricula + " "+ miTaller.admitirVehiculo(coche1));


	}

}
