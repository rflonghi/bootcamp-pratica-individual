package br.com.meli.mod13aula3.repositories;


import br.com.meli.mod13aula3.models.Dentist;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DentistRepository extends MongoRepository<Dentist, String> {
}

