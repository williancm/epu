package br.edu.epualt.resource;

import br.edu.epualt.domain.Aluno;
import br.edu.epualt.domain.Prof;
import br.edu.epualt.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping ("/aluno")
public class AlunoResource {

    @Autowired
    AlunoRepository alunoRepository;

    @GetMapping
    public List<Aluno> listAll(){
        return alunoRepository.findAll();
    }

    @GetMapping ("/{id}")
    public Aluno findOne(@PathVariable int id){
        return alunoRepository.findById(id).get();
    }

    @PostMapping
    public Aluno save(@Valid @RequestBody Aluno aluno){ return alunoRepository.save(aluno);}

    @DeleteMapping("/{id}")
    public void remover(@PathVariable int id) {
        Aluno uc = alunoRepository.findById(id).get();
        alunoRepository.delete(uc);
    }

    @PutMapping
    public ResponseEntity<Aluno> editar(@Valid @RequestBody Aluno aluno) {
        Aluno content = alunoRepository.save(aluno);
        return new ResponseEntity<Aluno>(content, HttpStatus.OK);

    }
/*
    @GetMapping ("/{id}")
    public Aluno findOneByNome(@PathVariable String nome){
        return alunoRepository.findByNome(nome).get();
    }

 */
}

