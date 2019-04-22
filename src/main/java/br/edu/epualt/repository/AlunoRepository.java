package br.edu.epualt.repository;

import br.edu.epualt.domain.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends
        JpaRepository<Aluno, Integer> {

}

