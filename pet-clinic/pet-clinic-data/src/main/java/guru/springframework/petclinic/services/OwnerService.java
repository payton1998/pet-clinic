package guru.springframework.petclinic.services;


import java.util.List;

import guru.springframework.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
	
	Owner findByLastName(String lastName);
	
	List<Owner> findAllByLastNameLike(String lastName);

}
