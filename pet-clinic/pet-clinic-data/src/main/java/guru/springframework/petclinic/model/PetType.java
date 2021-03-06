package guru.springframework.petclinic.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import guru.springframework.petclinic.model.Owner.OwnerBuilder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "types")
public class PetType extends BaseEntity{
	
	@Builder
	public PetType(Long id, String name) {
		super(id);
		this.name = name;
	}
	
	@Column(name = "name")
	private String name;

	@Override
	public String toString() {
		return name;
	}
	
	

}
