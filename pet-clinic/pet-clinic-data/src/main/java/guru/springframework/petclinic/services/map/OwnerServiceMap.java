package guru.springframework.petclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import guru.springframework.petclinic.model.Owner;
import guru.springframework.petclinic.services.OwnerService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements OwnerService {


	@Override
	public Set<Owner> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Owner save( Owner object) {
		// TODO Auto-generated method stub
		return super.save(object.getId(), object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

	@Override
	public void delete(Owner object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}
	
	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
