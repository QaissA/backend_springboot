package com.gestionappliance.getstionappliance.Repository;

import com.gestionappliance.getstionappliance.Model.POV;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PovRepo extends JpaRepository<POV, Long> {
}
