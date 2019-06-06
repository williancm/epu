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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(Set<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Set<Autorizado> getAutorizados() {
        return autorizados;
    }

    public void setAutorizados(Set<Autorizado> autorizados) {
        this.autorizados = autorizados;
    }
}
