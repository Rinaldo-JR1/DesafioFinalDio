package principal.digitalinnovation.run.services;

import lombok.AllArgsConstructor;
import principal.digitalinnovation.run.dto.mapper.PersonMapper;
import principal.digitalinnovation.run.dto.request.PersonDTO;
import principal.digitalinnovation.run.dto.response.MessageResponseDTO;
import principal.digitalinnovation.run.entities.Person;
import principal.digitalinnovation.run.exception.PersonNotFoundException;
import principal.digitalinnovation.run.repositories.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

@Service

public class PersonService {

	private final PersonRepository personRepository = null;

	private final PersonMapper personMapper = null;

	public PersonDTO findById(Long id) throws PersonNotFoundException {
		Person person = personRepository.findById(id).orElseThrow(() -> new PersonNotFoundException(id));

		return personMapper.toDTO(person);
	}

	public List<PersonDTO> listAll() {
		List<Person> people = personRepository.findAll();
		return people.stream().map(personMapper::toDTO).collect(Collectors.toList());
	}

	public void delete(Long id) throws PersonNotFoundException {
		personRepository.findById(id).orElseThrow(() -> new PersonNotFoundException(id));

		personRepository.deleteById(id);
	}

	public MessageResponseDTO create(@Valid PersonDTO personDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	public MessageResponseDTO update(Long id, @Valid PersonDTO personDTO) {
		// TODO Auto-generated method stub
		return null;
	}

}
