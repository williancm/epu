package br.edu.epualt.resource;

import br.edu.epualt.domain.Responsavel;
import br.edu.epualt.domain.Turma;
import br.edu.epualt.repository.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

    @PostMapping
    public Turma save(@Valid @RequestBody Turma turma){ return turmaRepository.save(turma);}

    @DeleteMapping("/{id}")
    public void remover(@PathVariable int id) {
        Turma uc = turmaRepository.findById(id).get();
        turmaRepository.delete(uc);
    }

    @PutMapping
    public ResponseEntity<Turma> editar(@Valid @RequestBody Turma turma) {
        Turma content = turmaRepository.save(conteudo);
        return new ResponseEntity<Turma>(content, HttpStatus.OK);

    }
}
