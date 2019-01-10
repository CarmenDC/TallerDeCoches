package es.mde.acing.motor;

import java.awt.Color;

public class Coche extends VehiculoConRuedas {

	int numeroDePuertas;	
		
	public Coche(int numeroDePuertas, Modelo modelo, Color color) {
		super(modelo, color);
		this.numeroDePuertas = numeroDePuertas;
	}

	public int getNumeroDePuertas() {
		return numeroDePuertas;
	}

	public void setNumeroDePuertas(int numeroDePuertas) {
		this.numeroDePuertas = numeroDePuertas;
	}




	@Override
	protected int getNumeroDeRuedas() {
		return 4;
	}


	
	
	
}
