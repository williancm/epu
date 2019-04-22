package br.edu.epualt.resource;

import br.edu.epualt.domain.Aluno;
import br.edu.epualt.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
}

