package com.ami.Apigestion.repository;

import com.ami.Apigestion.Entity.Pays;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface paysDAO extends JpaRepository<Pays,Integer> {

}
