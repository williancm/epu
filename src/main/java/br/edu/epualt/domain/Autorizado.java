package br.edu.epualt.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import sun.security.provider.certpath.OCSPResponse;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.Date;
import java.util.Set;


@Entity(name = "autorizado")
public @Data class Autorizado {

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
    @Column(nullable = false, length = 20)
    private String relacao;

    @NotBlank
    @Column(unique = true)
    private byte[] foto;

    //Relacionamentos:
    //N:1
    @ManyToOne(cascade = CascadeType.PERSIST)
    private @Valid Aluno aluno;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private @Valid Responsavel responsavel;

    //1:N
    @OneToMany(mappedBy = "autorizado")
    @JsonIgnore
    private Set<Registro> registros;

}
