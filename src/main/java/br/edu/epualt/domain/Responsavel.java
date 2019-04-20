package br.edu.epualt.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Set;


@Entity(name = "responsavel")
public @Data class Responsavel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotBlank
    @Column(nullable = false, length = 100)
    private String nome;

    @NotBlank
    @Column(nullable = false, length = 14)
    private String cpf;

    @NotBlank
    @Column(nullable = false, length = 11)
    private String telefone;

    @NotBlank
    @Column(nullable = false, length = 100)
    private String email;

    //Relacionamentos:
    //1:N
    @OneToMany(mappedBy = "responsavel")
    @JsonIgnore
    private Set<Aluno> alunos;

    @OneToMany(mappedBy = "responsavel")
    @JsonIgnore
    private Set<Autorizado> autorizados;
}
