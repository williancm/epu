package br.edu.epualt.repository;

import br.edu.epualt.domain.Responsavel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponsavelRepository extends
        JpaRepository<Responsavel, Integer> {

}

