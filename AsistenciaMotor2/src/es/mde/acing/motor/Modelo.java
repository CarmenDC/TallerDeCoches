package es.mde.acing.motor;

public class Modelo {
	String modelo;
	
	
	
	public Modelo(String modelo) {
		super();
		this.modelo = modelo;
	}



	public String getModelo() {
		return modelo;
	}



	@Override
	public String toString() {
		return "Modelo [modelo=" + modelo + "]";
	}
	
	
	
}

