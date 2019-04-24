package br.edu.epualt.resource;

import br.edu.epualt.domain.Turma;
import br.edu.epualt.repository.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/turma")
public class TurmaResource {

    @Autowired
    TurmaRepository turmaRepository;

    @GetMapping
    public List<Turma> listAll(){
        return turmaRepository.findAll();
    }

    @GetMapping ("/{id}")
    public Turma findOne(@PathVariable int id){
        return turmaRepository.findById(id).get();
    }
}
