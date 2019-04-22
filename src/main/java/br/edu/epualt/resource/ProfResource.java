package br.edu.epualt.resource;


import br.edu.epualt.domain.Prof;
import br.edu.epualt.repository.ProfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/prof")
public class ProfResource {

    @Autowired
    ProfRepository profRepository;

    @GetMapping
    public List<Prof> listAll(){
        return profRepository.findAll();
    }
}
