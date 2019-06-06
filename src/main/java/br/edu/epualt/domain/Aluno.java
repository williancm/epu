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
    @ManyToOne
    private @Valid Turma turma;

    @ManyToOne
    private @Valid Responsavel responsavel;

    //1:N
    @OneToMany(mappedBy = "aluno")
    @JsonIgnore
    private Set<Autorizado> autorizados;

    @OneToMany(mappedBy = "aluno")
    @JsonIgnore
    private Set<Registro> registros;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

    public Set<Autorizado> getAutorizados() {
        return autorizados;
    }

    public void setAutorizados(Set<Autorizado> autorizados) {
        this.autorizados = autorizados;
    }

    public Set<Registro> getRegistros() {
        return registros;
    }

    public void setRegistros(Set<Registro> registros) {
        this.registros = registros;
    }
}
