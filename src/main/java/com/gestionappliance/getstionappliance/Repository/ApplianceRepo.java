package com.gestionappliance.getstionappliance.Repository;

import com.gestionappliance.getstionappliance.Model.Appliance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplianceRepo  extends JpaRepository<Appliance, Long> {
}
