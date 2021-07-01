package br.com.meli.obterdiploma.service;

import br.com.meli.obterdiploma.model.dto.AlunoDTO;
import br.com.meli.obterdiploma.model.dto.DiplomaDTO;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    public DiplomaDTO obterDiploma(AlunoDTO alunoDTO) {
        DiplomaDTO diplomaDTO = new DiplomaDTO();
        diplomaDTO.obterMedia(alunoDTO);
        return diplomaDTO;
    }
}
