package com.example.demo.domain;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;

}
