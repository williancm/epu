package br.edu.epualt.repository;

import br.edu.epualt.domain.Turma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurmaRepository extends
        JpaRepository<Turma, Integer> {

}
