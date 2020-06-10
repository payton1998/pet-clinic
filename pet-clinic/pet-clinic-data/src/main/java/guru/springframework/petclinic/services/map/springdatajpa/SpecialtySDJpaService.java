package guru.springframework.petclinic.services.map.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import guru.springframework.petclinic.model.Specialty;
import guru.springframework.petclinic.repositories.SpecialtyRepository;
import guru.springframework.petclinic.services.SpecialtyService;

@Service
@Profile("springdatajpa")
public class SpecialtySDJpaService implements SpecialtyService{
	
	private final SpecialtyRepository specialtyRepository;
	

	public SpecialtySDJpaService(SpecialtyRepository specialtyRepository) {
		super();
		this.specialtyRepository = specialtyRepository;
	}

	@Override
	public Set<Specialty> findAll() {
		// TODO Auto-generated method stub
		Set<Specialty> specialties = new HashSet<>();
		specialtyRepository.findAll().forEach(specialties::add);
		
		return specialties;
	}

	@Override
	public Specialty findById(Long aLong) {
		// TODO Auto-generated method stub
		return specialtyRepository.findById(aLong);
	}

	@Override
	public Specialty save(Specialty object) {
		// TODO Auto-generated method stub
		return specialtyRepository.save(object);
	}

	@Override
	public void delete(Specialty object) {
		// TODO Auto-generated method stub
		specialtyRepository.delete(object);
	}

	@Override
	public void deleteById(Long aLong) {
		// TODO Auto-generated method stub
		specialtyRepository.deleteById(aLong);
	}

}
