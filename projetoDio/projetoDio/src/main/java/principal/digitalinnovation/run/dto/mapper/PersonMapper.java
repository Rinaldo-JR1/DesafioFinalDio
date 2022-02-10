package principal.digitalinnovation.run.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import principal.digitalinnovation.run.dto.request.PersonDTO;
import principal.digitalinnovation.run.entities.Person;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO dto);

    PersonDTO toDTO(Person dto);
}
