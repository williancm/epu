package br.edu.epualt.repository;

import br.edu.epualt.domain.Autorizado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorizadoRepository extends
        JpaRepository<Autorizado, Integer> {

    Autorizado getAutorizadoNome(String nome);

}