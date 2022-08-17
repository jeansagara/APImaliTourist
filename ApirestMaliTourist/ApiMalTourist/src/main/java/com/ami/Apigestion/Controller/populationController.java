package com.ami.Apigestion.Controller;

import com.ami.Apigestion.Entity.NombrePopulation;

import com.ami.Apigestion.Services.populationService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/population")
@Api(value = "hello", description = "Notre première API")
@AllArgsConstructor
public class populationController {

    private final populationService populationService;

    @ApiOperation(value = "Création de la population de l'API")
    @PostMapping("/create")
    public NombrePopulation CreatePop(@RequestBody NombrePopulation NombrePopulation){
        return populationService.creerPop(NombrePopulation);
    }

    @ApiOperation(value = "Liste des populations de l'API")
    @GetMapping("/read")
    public List<NombrePopulation> readPop(){
        return populationService.lirePop();
    }

    @ApiOperation(value = "Modification des populations de l'API")
    @PutMapping("/update/{id_pop}")
    public NombrePopulation updatePop(@PathVariable int id_pop,@RequestBody NombrePopulation NombrePopulation){
        return populationService.modifierPop(id_pop,NombrePopulation);
    }

    @ApiOperation(value = "Suppression d'une population de l'API")
    @DeleteMapping("/delete/{id}")
    public String deletePop(@PathVariable int id){

        return populationService.supprimerPop(id);
    }

}
