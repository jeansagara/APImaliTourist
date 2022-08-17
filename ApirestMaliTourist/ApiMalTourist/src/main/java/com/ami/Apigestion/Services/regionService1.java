package com.ami.Apigestion.Services;

import com.ami.Apigestion.Entity.region;

import java.util.List;

public interface regionService1 {
    region creer(region region);
    List<region> lire();
    region modifier(int CodeRegion, region region);
    String supprimer(int CodeRegion);

    Iterable MesRegionSansPays();
}
