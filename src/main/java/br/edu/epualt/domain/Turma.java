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
    @JsonIgnore
    private Set<Prof> profs;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public Set<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(Set<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Set<Prof> getProfs() {
        return profs;
    }

    public void setProfs(Set<Prof> profs) {
        this.profs = profs;
    }
}
