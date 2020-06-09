package guru.springframework.petclinic.repositories;

import guru.springframework.petclinic.model.Pet;
import guru.springframework.petclinic.services.CrudService;

public interface PetRepository extends CrudService<Pet, Long> {

}
