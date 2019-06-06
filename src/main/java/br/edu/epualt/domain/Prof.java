package br.edu.epualt.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Set;


@Entity(name = "prof")
public @Data class Prof{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotBlank
    @Column(nullable = false, length = 100)
    private String nome;

    @NotBlank
    @Column(nullable = false, length = 100)
    private String emailInst;

    @NotBlank
    @Column(nullable = false, length = 20)
    private String senha;

    @NotBlank
    @Column(nullable = false, length = 14)
    private String cpf;

    @NotBlank
    @Column(nullable = false, length = 11)
    private String telefone;

    @NotBlank
    @Column(unique = true)
    private byte[] foto;

    //Relacionamentos:
    //1:N
    @OneToMany(mappedBy = "prof")
    @JsonIgnore
    private Set<Registro> registros;

    //N:N
    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER) //solucao erro tabela registro. fetch = FetchType.EAGER
    @JoinTable(
            name = "prof_turma",
            joinColumns = {@JoinColumn(name = "prof_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "turma_id", referencedColumnName = "id")}
    )
    private List<Turma> turmas;

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

    public String getEmailInst() {
        return emailInst;
    }

    public void setEmailInst(String emailInst) {
        this.emailInst = emailInst;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public Set<Registro> getRegistros() {
        return registros;
    }

    public void setRegistros(Set<Registro> registros) {
        this.registros = registros;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }
}
