package guru.springframework.petclinic.services.map.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import guru.springframework.petclinic.model.Owner;
import guru.springframework.petclinic.repositories.OwnerRepository;
import guru.springframework.petclinic.repositories.PetRepository;
import guru.springframework.petclinic.repositories.PetTypeRepository;
import guru.springframework.petclinic.services.OwnerService;

@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnerService{
	
	private final OwnerRepository ownerRepository;
	private final PetRepository petRepository;
	private final PetTypeRepository petTypeRepository;
	
	

	public OwnerSDJpaService(OwnerRepository ownerRepository, PetRepository petRepository,
			PetTypeRepository petTypeRepository) {
		this.ownerRepository = ownerRepository;
		this.petRepository = petRepository;
		this.petTypeRepository = petTypeRepository;
	}

	@Override
	public Set<Owner> findAll() {
		Set<Owner> owners = new HashSet<>();
		ownerRepository.findAll().forEach(owners::add);
		
		return owners;
	}

	@Override
	public Owner findById(Long aLong) {
		// TODO Auto-generated method stub
		
		return ownerRepository.findById(aLong).orElse(null);
	}

	@Override
	public Owner save(Owner object) {
		// TODO Auto-generated method stub
		return ownerRepository.save(object);
	}

	@Override
	public void delete(Owner object) {
		// TODO Auto-generated method stub
		ownerRepository.delete(object);
	}

	@Override
	public void deleteById(Long aLong) {
		// TODO Auto-generated method stub
		ownerRepository.deleteById(aLong);
	}

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return ownerRepository.findByLastName(lastName);
	}

}