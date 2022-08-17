package com.ami.Apigestion.repository;
import com.ami.Apigestion.Entity.region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface regionDAO extends JpaRepository<region,Integer> {
    @Query(value = "SELECT region.nom_region FROM region, pays where region.id_pays = pays.id_pays", nativeQuery = true )
    public Iterable<Object[]> MesRegionSansPays();
}
