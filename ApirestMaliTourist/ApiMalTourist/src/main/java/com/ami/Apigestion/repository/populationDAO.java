package com.ami.Apigestion.repository;

import com.ami.Apigestion.Entity.NombrePopulation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface populationDAO extends JpaRepository<NombrePopulation,Integer> {
}
