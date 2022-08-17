package com.ami.Apigestion.Services;

import com.ami.Apigestion.Entity.NombrePopulation;
import com.ami.Apigestion.Entity.region;

import java.util.List;

public interface populationService1 {
    NombrePopulation creerPop(NombrePopulation NombrePopulation);
    List<NombrePopulation> lirePop();
    NombrePopulation modifierPop(int id_pop, NombrePopulation NombrePopulation);
    String supprimerPop(int id_pop);
}
