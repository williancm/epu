package br.edu.epualt.resource;

import br.edu.epualt.domain.Registro;
import br.edu.epualt.repository.RegistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
}
