package es.mde.acing.motor;

import java.util.Comparator;

public interface Identificable<T extends Comparable<T>> extends Comparable<Identificable<T>>{
	
	//Comparator<Identificable<T>> comparador = (o1, o2) -> o2.getId() - o1.getId();
	default Comparator<Identificable<T>> getComparador(){
		return (o1, o2) -> o1.compareTo(o2);
	}
	
	T getId();
	
	@Override
	default int compareTo(Identificable<T> elOtro) {
		return getId().compareTo(elOtro.getId());
	}
}
