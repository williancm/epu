package br.edu.epualt.repository;

import br.edu.epualt.domain.Registro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroRepository extends
        JpaRepository<Registro, Integer> {

}
