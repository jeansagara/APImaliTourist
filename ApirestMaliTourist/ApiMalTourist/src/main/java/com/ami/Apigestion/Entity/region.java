package com.ami.Apigestion.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    private String codeRegion;
    private String nomRegion;
    private String domaineActivite;

    private int superficie;
    private String langueMaj;

    @ManyToOne
    @JoinColumn(name = "id_pays")
    private Pays pays;


}