package guru.springframework.petclinic.services.map;

import java.util.Set;

import guru.springframework.petclinic.model.Pet;
import guru.springframework.petclinic.services.PetService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

	@Override
	public Set<Pet> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Pet findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Pet save(Pet object) {
		// TODO Auto-generated method stub
		return super.save(object.getId(), object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

	@Override
	public void delete(Pet object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}

	
}
