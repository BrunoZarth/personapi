package one.digitalinnovation.personapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import one.digitalinnovation.personapi.dto.MessageResponseDTO;
import one.digitalinnovation.personapi.entity.Person;
import one.digitalinnovation.personapi.repository.PersonRepository;

@RestController
@RequestMapping(path = "/api/v1/people")
public class PersonController {
	
	private PersonRepository personRepository;
	
	@Autowired
	public PersonController(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	public MessageResponseDTO createPerson(@RequestBody Person person) {
		Person savedPerson = personRepository.save(person);
		return MessageResponseDTO
				.builder()
				.message("Created person with id " + savedPerson.getId())
				.build();
	}
	
	@GetMapping
	public String getBook() {
		return "<h1>it's working!";
	}
}
