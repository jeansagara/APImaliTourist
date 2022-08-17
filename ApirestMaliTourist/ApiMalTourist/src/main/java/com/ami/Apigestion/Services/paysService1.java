package com.ami.Apigestion.Services;

import com.ami.Apigestion.Entity.NombrePopulation;
import com.ami.Apigestion.Entity.Pays;
import com.ami.Apigestion.Entity.region;

import java.util.List;

public interface paysService1 {
    Pays creerPays(Pays pays);
    List<Pays> lirePays();
    Pays  modifierPays(int IdPays, Pays pays);
    String supprimerPays(int IdPays);
}
