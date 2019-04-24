package br.edu.epualt.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Set;


@Entity(name = "turma")
public @Data class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotBlank
    @Column(nullable = false, length = 45)
    private String nivel;

    @NotBlank
    @Column(nullable = false, length = 10)
    private String sala;

    //Relacionamentos:
    //1:N
    @OneToMany(mappedBy = "turma")
    @JsonIgnore
    private Set<Aluno> alunos;

    //N:N
    @ManyToMany(mappedBy = "turmas")
    private Set<Prof> profs;
}
