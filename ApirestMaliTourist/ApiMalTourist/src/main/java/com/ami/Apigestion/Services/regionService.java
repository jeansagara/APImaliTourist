package com.ami.Apigestion.Services;

import com.ami.Apigestion.Entity.region;
import com.ami.Apigestion.repository.regionDAO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class regionService implements regionService1 {
private final regionDAO regionDAO;
    @Override
    public region creer(region region) {
        return regionDAO.save(region);
    }

    @Override
    public List<region> lire() {
        return regionDAO.findAll();
    }

    @Override
    public region modifier(int CodeRegion, region region) {
        return regionDAO.findById(CodeRegion)
                .map(r-> {
                    r.setNomRegion(region.getNomRegion());
                    r.setDomaineActivite(region.getDomaineActivite());
                    r.setSuperficie(region.getSuperficie());
                    r.setLangueMaj(region.getLangueMaj());
                    return regionDAO.save(r);
                }).orElseThrow(()-> new RuntimeException("Région non trouvé"));
    }

    @Override
    public String supprimer(int CodeRegion) {
        regionDAO.deleteById(CodeRegion);
        return "Produit Supprimé"+ CodeRegion +" avec succès";
    }

    @Override
    public Iterable MesRegionSansPays() {
        return regionDAO.MesRegionSansPays();
    }
}
