package com.gestionappliance.getstionappliance.Repository;

import com.gestionappliance.getstionappliance.Model.Suivi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuiviRepo extends JpaRepository<Suivi, Long> {
}
