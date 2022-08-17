package com.ami.Apigestion.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Pays {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdPays")
    private int idPays;
    @Column(unique = true)
    private String nomPays;


}

