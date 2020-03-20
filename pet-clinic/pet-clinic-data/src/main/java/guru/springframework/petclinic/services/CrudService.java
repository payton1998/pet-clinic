package guru.springframework.petclinic.services;

import java.util.Set;

public interface CrudService<T, ID> {
	
	Iterable<T> findAll();
	
	T findById(ID id);
	
	T save(T object);
	
	void delete(T object);
	
	void deleteById(ID id);

}
