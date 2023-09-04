package com.gestionappliance.getstionappliance.Repository;

import com.gestionappliance.getstionappliance.Model.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeRepo extends JpaRepository<Type, Long> {
}
