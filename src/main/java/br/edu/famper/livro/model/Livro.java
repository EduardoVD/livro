package br.edu.famper.livro.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tbl_livro")
@Data
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column
    private Long id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "autor")
    private String autor;

    @Column(name = "ano_publicacao")
    private Integer anoPublicacao;

    @Column(name = "preco")
    private Double preco;
}
