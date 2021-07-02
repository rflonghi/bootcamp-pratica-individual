package br.com.meli.starwars.repository;

import br.com.meli.starwars.entity.Personagem;
import br.com.meli.starwars.entity.dto.PersonagemDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class PersonagemRespository {

    private List<Personagem> fileToList() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        TypeReference<List<Personagem>> typeReference = new TypeReference<List<Personagem>>(){};
        InputStream inputStream = TypeReference.class.getResourceAsStream("/json/starwars.json");
        List<Personagem> personagens = mapper.readValue(inputStream,typeReference);
        return personagens;
    }

    public List<PersonagemDTO> getPersonagens(String name) throws IOException  {
        List<PersonagemDTO> todosPersonagens = fileToList().stream().map(Personagem::toDTO).collect(Collectors.toList());
        List<PersonagemDTO> personagens = new ArrayList<PersonagemDTO>();
        for (PersonagemDTO p : todosPersonagens ) {
            if (p.getName().toUpperCase().startsWith(name.toUpperCase()))
                personagens.add(p);
        }
        return personagens;
    }
}
