package com.hospital.Service;

import com.hospital.Service.Services.PersonasServices;
import com.hospital.hospital.entitys.Persona;
import com.hospital.hospital.entitys.repository.PersonaRepository;
import com.hospital.request.PersonaRequest;
import com.hospital.response.PersonaResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class PersonaServiceImplement implements PersonasServices{

    private final PersonaRepository personaRepository;


    @Override
    public List<Persona> getListPerson() {
        var listPersons = personaRepository.listPersonas();
        return listPersons;

    }
    @Override
    public void DeletePersona(Long id){
        personaRepository.deleteById(id);
    }

    @Override
    public PersonaResponse searchPersona(Long id){
        Persona persona = personaRepository.searchPersonas(id);
        return Objects.nonNull(persona)?
                buildPersonaResponse(persona) :
                 PersonaResponse.builder().build();

    }

    private static PersonaResponse buildPersonaResponse(Persona persona){
        return PersonaResponse.builder()
                .id(persona.getId())
                .nombre(persona.getNombre())
                .apellido(persona.getApellido())
                .build();
    }
    @Override
    public void savePersona(PersonaRequest personaRequest){
        Persona persona = new Persona();
        if(Objects.nonNull(personaRequest)){
            persona.setNombre(personaRequest.getNombre());
            persona.setApellido(personaRequest.getApellido());

        }
    }

    @Override
    public void updatePersona(PersonaRequest personaRequest){
        PersonaRequest.builder()
                .nombre(personaRequest.getNombre())
                .nombre(personaRequest.getApellido())
                .build();




    }

}
