package guru.springframework.petclinic.services.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import guru.springframework.petclinic.model.Specialty;
import guru.springframework.petclinic.services.SpecialtyService;

@Service
@Profile({"default", "map"})
public class SpecialityMapService extends AbstractMapService<Specialty, Long> implements SpecialtyService{

	@Override
	public Set<Specialty> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Specialty findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Specialty save(Specialty object) {
		// TODO Auto-generated method stub
		return super.save(object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

	@Override
	public void delete(Specialty object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}

	
}
