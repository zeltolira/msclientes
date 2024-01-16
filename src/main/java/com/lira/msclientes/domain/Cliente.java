package com.lira.msclientes.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String cpf;
    @Column
    private String nome;
    @Column
    private Integer idade;

    public Cliente(String cpf, String nome, Integer idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
    }
}
