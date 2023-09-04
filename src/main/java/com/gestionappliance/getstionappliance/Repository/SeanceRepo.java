package com.gestionappliance.getstionappliance.Repository;

import com.gestionappliance.getstionappliance.Model.Seance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeanceRepo extends JpaRepository<Seance, Long> {
}
