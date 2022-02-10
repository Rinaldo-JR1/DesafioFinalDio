package principal.digitalinnovation.run.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import principal.digitalinnovation.run.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
