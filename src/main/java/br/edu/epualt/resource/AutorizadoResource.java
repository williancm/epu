package br.edu.epualt.resource;

import br.edu.epualt.domain.Autorizado;
import br.edu.epualt.domain.Prof;
import br.edu.epualt.repository.AutorizadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping ("/autorizado")
public class AutorizadoResource {

    @Autowired
    AutorizadoRepository autorizadoRepository;

    @GetMapping
    public List<Autorizado> listAll(){
        return autorizadoRepository.findAll();
    }

    @GetMapping ("/{id}")
    public Autorizado findOne(@PathVariable int id){
        return autorizadoRepository.findById(id).get();
    }

    @PostMapping
    public Autorizado save(@Valid @RequestBody Autorizado autorizado){ return autorizadoRepository.save(autorizado);}

    @DeleteMapping("/{id}")
    public void remover(@PathVariable int id) {
        Autorizado uc = autorizadoRepository.findById(id).get();
        autorizadoRepository.delete(uc);
    }

    @PutMapping
    public ResponseEntity<Autorizado> editar(@Valid @RequestBody Autorizado autorizado) {
        Autorizado content = autorizadoRepository.save(autorizado);
        return new ResponseEntity<Autorizado>(content, HttpStatus.OK);

    }
/*
    @RequestMapping(value = "/{nome}", method = RequestMethod.GET)
    public Autorizado findByNome(@PathVariable("nome") String nome){
        return autorizadoRepository.getAutorizadoNome(nome);
    }
    
 */
}
