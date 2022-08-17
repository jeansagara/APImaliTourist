package com.ami.Apigestion.Services;

import com.ami.Apigestion.Entity.NombrePopulation;
import com.ami.Apigestion.repository.populationDAO;
import com.ami.Apigestion.repository.regionDAO;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class populationService implements populationService1{
    private final populationDAO populationDAO;
    @Override
    public NombrePopulation creerPop(NombrePopulation NombrePopulation) {

        return populationDAO.save(NombrePopulation);
    }

    @Override
    public List<NombrePopulation> lirePop() {

        return populationDAO.findAll();
    }

    @Override
    public NombrePopulation modifierPop(int id_pop, NombrePopulation NombrePopulation) {
        return populationDAO.findById(id_pop)
                .map(p-> {
                    p.setAnnee(NombrePopulation.getAnnee());
                    p.setChiffrePopulation(NombrePopulation.getChiffrePopulation());
                    return populationDAO.save(p);
                }).orElseThrow(()-> new RuntimeException("Population non trouvée"));
    }


    @Override
    public String supprimerPop(int id_pop) {
        populationDAO.deleteById(id_pop);
        return "Population supprimée avec succès";
    }
}
