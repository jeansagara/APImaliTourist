package com.ami.Apigestion.Controller;

import com.ami.Apigestion.Entity.region;
import com.ami.Apigestion.Services.regionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "hello", description = "Notre première API")
@RestController
@RequestMapping(path = "/api/region")
@AllArgsConstructor
public class regionController {

    private final regionService regionService;

    @ApiOperation(value = "Création de la region de l'API")
    @PostMapping("/create")
    public region Create(@RequestBody region region){
        return regionService.creer(region);
    }

    @ApiOperation(value = "Liste des regions de l'API")
    @GetMapping("/read")
    public List<region> read(){
        return regionService.lire();
    }

    @ApiOperation(value = "Modification de la region de l'API")
    @PutMapping("/update/{CodeRegion}")
    public region update(@PathVariable int CodeRegion,@RequestBody region region){
        return regionService.modifier(CodeRegion,region);}

    @ApiOperation(value = "Suppression de la region de l'API")
    @DeleteMapping("/delete/{CodeRegion}")
    public String delete(@PathVariable int CodeRegion){
        return regionService.supprimer(CodeRegion);
    }

    @ApiOperation(value = "La liste des Regions sans pays")
    @GetMapping("/SansPays")
    public Iterable MesRegionSansPays() {
        return regionService.MesRegionSansPays();
    }
}

