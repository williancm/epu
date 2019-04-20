package br.edu.epualt.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.*;
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
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "prof_turma",
            joinColumns = {@JoinColumn(name = "prof_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "turma_id", referencedColumnName = "id")}
    )
    private Set<Turma> turmas;
}
