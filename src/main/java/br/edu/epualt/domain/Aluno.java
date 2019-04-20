package br.edu.epualt.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.Date;
import java.util.Set;


@Entity(name = "aluno")
public @Data class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotBlank
    @Column(nullable = false, length = 100)
    private String nome;

    @NotBlank
    @Column(nullable = false)
    private Date nascimento;

    @NotBlank
    @Column(nullable = false, length = 20)
    private String matricula;

    @NotBlank
    @Column(unique = true)
    private byte[] foto;

    //Relacionamentos:
    //N:1
    @ManyToOne(cascade = CascadeType.PERSIST)
    private @Valid Turma turma;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private @Valid Responsavel responsavel;

    //1:N
    @OneToMany(mappedBy = "aluno")
    @JsonIgnore
    private Set<Autorizado> autorizados;

    @OneToMany(mappedBy = "aluno")
    @JsonIgnore
    private Set<Registro> registros;
}
