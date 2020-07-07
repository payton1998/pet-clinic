package guru.springframework.petclinic.controllers;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import guru.springframework.petclinic.model.Owner;
import guru.springframework.petclinic.services.OwnerService;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;




@ExtendWith(MockitoExtension.class)
class OwnerControllerTest {
	
	@Mock
	OwnerService ownerService;
	
	@InjectMocks
	OwnerController controller;
	
	Set<Owner> owners;
	
	MockMvc mockMVC;

	@BeforeEach
	void setUp() throws Exception {
		owners = new HashSet<>();
		owners.add(Owner.builder().id(1L).build());
		owners.add(Owner.builder().id(2L).build());
		
		mockMVC = MockMvcBuilders
				.standaloneSetup(controller).build();
	}

	@Test
	void testListOwners() throws Exception{
		when(ownerService.findAll()).thenReturn(owners);
		
		mockMVC.perform(get("/owners"))
			.andExpect(status().isOk())
			.andExpect(view().name("owners/index"))
			.andExpect(model().attribute("owners", hasSize(2)));
	}
	
	@Test
	void testListOwnersByIndex() throws Exception{
		when(ownerService.findAll()).thenReturn(owners);
		
		mockMVC.perform(get("/owners"))
			.andExpect(status().isOk())
			.andExpect(view().name("owners/index"))
			.andExpect(model().attribute("owners", hasSize(2)));
	}

	@Test
	void testFindOwners() throws Exception{
		mockMVC.perform(get("/owners/find"))
		.andExpect(status().isOk())
		.andExpect(view().name("notimplemented"));
		
		verifyZeroInteractions(ownerService);
	}

}
