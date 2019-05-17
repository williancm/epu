package br.edu.epualt.resource;

import br.edu.epualt.domain.Registro;
import br.edu.epualt.domain.Responsavel;

import br.edu.epualt.repository.ResponsavelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

    @PostMapping
    public Responsavel save(@Valid @RequestBody Responsavel responsavel){ return responsavelRepository.save(responsavel);}

    @DeleteMapping("/{id}")
    public void remover(@PathVariable int id) {
        Responsavel uc = responsavelRepository.findById(id).get();
        responsavelRepository.delete(uc);
    }

    @PutMapping
    public ResponseEntity<Responsavel> editar(@Valid @RequestBody Responsavel responsavel) {
        Responsavel content = responsavelRepository.save(conteudo);
        return new ResponseEntity<Responsavel>(content, HttpStatus.OK);

    }
}

