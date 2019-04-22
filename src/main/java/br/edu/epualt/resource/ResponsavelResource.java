package br.edu.epualt.resource;

import br.edu.epualt.domain.Responsavel;

import br.edu.epualt.repository.ResponsavelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/responsavel")
public class ResponsavelResource {

    @Autowired
    public ResponsavelRepository responsavelRepository;

    @GetMapping
    public List<Responsavel> listAll(){
        return responsavelRepository.findAll();
    }
}

