package com.ami.Apigestion.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class NombrePopulation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_pop;
    private int annee;
    private int chiffrePopulation;

    @ManyToOne
    @JoinColumn(name = "nombrepopulation_id_pop")
    private NombrePopulation nombrepopulation;
}
