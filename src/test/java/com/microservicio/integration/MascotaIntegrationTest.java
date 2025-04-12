package com.microservicio.integration;

import com.microservicio.model.Mascota;
import com.microservicio.repository.MascotaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.*;

@SpringBootTest
public class MascotaIntegrationTest {

    @Autowired
    private MascotaRepository mascotaRepository;

    // @Test
    // void testGuardarYObtenerMascota() {
    //     Mascota mascota = new Mascota();
    //     mascota.setNombre("Luna");
    //     mascota.setRaza("Golden");

    //     Mascota guardada = mascotaRepository.save(mascota);
    //     Mascota encontrada = mascotaRepository.findById(guardada.getId()).orElse(null);

    //     assertThat(encontrada).isNotNull();
    //     assertThat(encontrada.getNombre()).isEqualTo("Luna");
    // }
}
