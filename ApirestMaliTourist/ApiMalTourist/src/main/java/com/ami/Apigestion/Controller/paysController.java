package com.ami.Apigestion.Controller;

import com.ami.Apigestion.Entity.Message;
import com.ami.Apigestion.Entity.Pays;
import com.ami.Apigestion.Services.paysService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@Api(value = "hello", description = "Notre première API")
@RequestMapping(path = "/api/pays")
@AllArgsConstructor
public class paysController {
    private paysService paysService;

    @ApiOperation(value = "Création d'un pays de l'API")
    @PostMapping("/create")
    public Pays CreatePays(@RequestBody Pays Pays){
        return paysService.creerPays(Pays);
    }

    @ApiOperation(value = "Liste des Pays de l'API")
    @GetMapping("/read")
    public List<Pays> readPays(){
        return paysService.lirePays();
    }

    @ApiOperation(value = "Modification des Pays de l'API")
    @PutMapping("/update/{IdPays}")
    public Pays updatePays(@PathVariable int IdPays,@RequestBody Pays Pays){
        return paysService.modifierPays(IdPays,Pays);
    }

    @ApiOperation(value = "Suppression des Pays de l'API")
    @DeleteMapping("/delete/{IdPays}")
    public Object deletePays(@PathVariable int IdPays){

        try {
            return paysService.supprimerPays(IdPays);
        }catch (Exception e){
            return Message.ErreurDeReponse("Ce pays existe déja",HttpStatus.OK,null);
        }

    }

}
