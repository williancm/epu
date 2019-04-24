package br.edu.epualt.resource;

import br.edu.epualt.domain.Responsavel;

import br.edu.epualt.repository.ResponsavelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping ("/{id}")
    public Responsavel findOne(@PathVariable int id){
        return responsavelRepository.findById(id).get();
    }
}

