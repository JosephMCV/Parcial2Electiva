package com.microservicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.microservicio.model.Mascota;

public interface MascotaRepository extends JpaRepository<Mascota, Long>{
    
}
