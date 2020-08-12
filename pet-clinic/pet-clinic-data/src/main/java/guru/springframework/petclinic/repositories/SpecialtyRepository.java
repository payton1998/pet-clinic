package guru.springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.petclinic.model.Specialty;
import guru.springframework.petclinic.services.CrudService;

public interface SpecialtyRepository  extends CrudRepository<Specialty, Long>{

}
