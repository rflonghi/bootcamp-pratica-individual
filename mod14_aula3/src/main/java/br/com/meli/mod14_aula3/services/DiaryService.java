package br.com.meli.mod14_aula3.services;

import br.com.meli.mod14_aula3.models.Diary;
import br.com.meli.mod14_aula3.repositories.DiaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DiaryService {

    @Autowired
    DiaryRepository diaryRepository;

    public List<Diary> getDentistDiarysByDentistId(String dentisId) {
        return diaryRepository.findAllByDentist_Id(dentisId);
    }

}
