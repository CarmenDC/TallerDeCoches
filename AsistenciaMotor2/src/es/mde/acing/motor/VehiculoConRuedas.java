package es.mde.acing.motor;

import java.awt.Color;
import java.util.Collection;

public abstract class VehiculoConRuedas extends Vehiculo {
	

    Matricula matricula;
    
    protected abstract int getNumeroDeRuedas();	
    
	
	
	public Matricula getMatricula() {
		return matricula;
	}

	void setMatricula(String matricula) {
        this.matricula = new Matricula(matricula);     
    }
    
	void setMatricula(Matricula matricula) {
        this.matricula = matricula;     
    }
	
	@Override
	public Matricula getId() {
		
		return getMatricula();
	}


	public VehiculoConRuedas () {
        this(null, null);
    	
    }
      
    public VehiculoConRuedas(Modelo modelo, Color color) {
	   	super(modelo, color);
//	   	numeroDeRuedas = 4;
	}
    
    
	@Override
    public String toString() {
        return "Placa " + getMatricula().toString() + " - " + modelo + " (" + getColor().toString() + "), " + getNumeroDeRuedas() + " ruedas";
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
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
		VehiculoConRuedas other = (VehiculoConRuedas) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		return true;
	}

    
    
}
