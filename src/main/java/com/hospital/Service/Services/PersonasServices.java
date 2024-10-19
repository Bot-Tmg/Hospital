package com.hospital.Service.Services;

import com.hospital.hospital.entitys.Medicamento;
import com.hospital.hospital.entitys.Persona;
import com.hospital.request.PersonaRequest;
import com.hospital.response.Centro_atencionResponse;
import com.hospital.response.PersonaResponse;

import java.util.List;

public interface PersonasServices {

    List<Persona> getListPerson();
    void DeletePersona(Long id);
    PersonaResponse searchPersona(Long id);
    void savePersona(PersonaRequest personaRequest);
    void updatePersona(PersonaRequest personaRequest);



}