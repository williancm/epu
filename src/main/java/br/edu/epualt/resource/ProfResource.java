package br.edu.epualt.resource;


import br.edu.epualt.domain.Prof;
import br.edu.epualt.repository.ProfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

    @GetMapping ("/{id}")
    public Prof findOne(@PathVariable int id){
        return profRepository.findById(id).get();
    }

    @PostMapping
    public Prof save(@Valid @RequestBody Prof prof){ return profRepository.save(prof);}

}
