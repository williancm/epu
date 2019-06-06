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
    @ManyToOne
    private @Valid Aluno aluno;

    @ManyToOne
    private @Valid Autorizado autorizado;

    @ManyToOne
    private @Valid Prof prof;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getDia() {
        return dia;
    }

    public void setDia(Timestamp dia) {
        this.dia = dia;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Autorizado getAutorizado() {
        return autorizado;
    }

    public void setAutorizado(Autorizado autorizado) {
        this.autorizado = autorizado;
    }

    public Prof getProf() {
        return prof;
    }

    public void setProf(Prof prof) {
        this.prof = prof;
    }
}
