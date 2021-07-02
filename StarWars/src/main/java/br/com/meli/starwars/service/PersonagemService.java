package br.com.meli.starwars.service;

import br.com.meli.starwars.entity.Personagem;
import br.com.meli.starwars.entity.dto.PersonagemDTO;
import br.com.meli.starwars.repository.PersonagemRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class PersonagemService {

    @Autowired
    PersonagemRespository respository;

    public List<PersonagemDTO> findByName(String name) {
        try {
            List<PersonagemDTO> personagens = respository.getPersonagens(name);
            if (personagens.size() > 0)
                return personagens;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
