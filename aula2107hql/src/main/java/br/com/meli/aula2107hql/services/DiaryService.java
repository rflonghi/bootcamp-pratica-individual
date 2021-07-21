package br.com.meli.aula2107hql.services;

import br.com.meli.aula2107hql.models.Diary;
import br.com.meli.aula2107hql.repositories.DiaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiaryService {

    @Autowired
    DiaryRepository diaryRepository;

    public List<Diary> getDentistDyarys(Long dentisId) {
        return diaryRepository.findAllByDentist_Id(dentisId);
    }

}
