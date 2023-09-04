package com.gestionappliance.getstionappliance.Repository;

import com.gestionappliance.getstionappliance.Model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepo extends JpaRepository<Client, Long> {
}
