package br.com.meli.mod14_aula3.repositories;

import br.com.meli.mod14_aula3.models.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends MongoRepository<Patient, String> {
}
