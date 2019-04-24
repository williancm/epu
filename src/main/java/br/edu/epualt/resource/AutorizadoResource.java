package br.edu.epualt.resource;

import br.edu.epualt.domain.Autorizado;
import br.edu.epualt.repository.AutorizadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
}
