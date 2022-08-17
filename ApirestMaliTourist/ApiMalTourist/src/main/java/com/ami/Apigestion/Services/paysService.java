package com.ami.Apigestion.Services;

import com.ami.Apigestion.Entity.NombrePopulation;
import com.ami.Apigestion.Entity.Pays;
import com.ami.Apigestion.repository.paysDAO;
import com.ami.Apigestion.repository.populationDAO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class paysService implements paysService1 {
private final paysDAO paysDAO;
    @Override
    public Pays creerPays(Pays pays) {
        return paysDAO.save(pays);
    }

    @Override
    public List<Pays> lirePays() {
        return paysDAO.findAll();
    }

    @Override
    public Pays modifierPays(int IdPays, Pays pays) {
        return paysDAO.findById(IdPays)
                .map(pA-> {
                    pA.setNomPays(pays.getNomPays());
                   return paysDAO.save(pA);
                }).orElseThrow(()-> new RuntimeException("Pays non trouvée"));
    }


    @Override
    public String supprimerPays(int IdPays) {
        paysDAO.deleteById(IdPays);
        return "Pays supprimé avec succès";
    }
}
