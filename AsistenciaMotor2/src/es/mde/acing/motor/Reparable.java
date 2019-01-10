package es.mde.acing.motor;

import java.util.Collection;

public interface Reparable {

	boolean estaAveriado();
	
	Collection<Averia> getAverias();
	
		
}
