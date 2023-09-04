package com.gestionappliance.getstionappliance.Repository;

import com.gestionappliance.getstionappliance.Model.TypePrestation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypePrestationRepo extends JpaRepository<TypePrestation, Long> {
}
