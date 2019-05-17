package br.edu.epualt.resource;

import br.edu.epualt.domain.Autorizado;
import br.edu.epualt.domain.Registro;
import br.edu.epualt.repository.RegistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping ("/registro")
public class RegistroResource {

    @Autowired
    RegistroRepository registroRepository;

    @GetMapping
    public List<Registro> listAll(){
        return registroRepository.findAll();
    }

    @GetMapping ("/{id}")
    public Registro findOne(@PathVariable int id){
        return registroRepository.findById(id).get();
    }

    @PostMapping
    public Registro save(@Valid @RequestBody Registro registro){ return registroRepository.save(registro);}

    @DeleteMapping("/{id}")
    public void remover(@PathVariable int id) {
        Registro uc = registroRepository.findById(id).get();
        registroRepository.delete(uc);
    }

    @PutMapping
    public ResponseEntity<Registro> editar(@Valid @RequestBody Registro registro) {
        Registro content = registroRepository.save(conteudo);
        return new ResponseEntity<Registro>(content, HttpStatus.OK);

    }
}
