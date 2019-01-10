package es.mde.acing.motor;

public class Matricula implements Comparable<Matricula> {
	String placa;
	
	public String getPlaca() {
		
		return placa;
	}

	
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}



	public Matricula(String placa) {
		super();
		this.placa = placa;
	}



	
	@Override
	public int compareTo(Matricula otraMatricula) {
		
		return getPlaca().compareTo(otraMatricula.getPlaca());
	}



	@Override
	public String toString() {
		return "Matricula [placa=" + placa + "]";
	}
	

	
}
