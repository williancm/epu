package br.edu.epualt.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import sun.security.provider.certpath.OCSPResponse;

import javax.persistence.*;
import javax.print.attribute.DateTimeSyntax;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;


@Entity(name = "registro")
public @Data class Registro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotBlank
    @Column(nullable = false, length = 100)
    private Timestamp dia;

    //Relacionamentos:
    //N:1
    @ManyToOne(cascade = CascadeType.PERSIST)
    private @Valid Aluno aluno;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private @Valid Autorizado autorizado;

    @ManyToOne
    private @Valid Prof prof;

}
