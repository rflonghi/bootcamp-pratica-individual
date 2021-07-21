package br.com.meli.aula2107hql.repositories;

import br.com.meli.aula2107hql.models.Dentist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DentistRepository extends JpaRepository<Dentist, Long> {
}

