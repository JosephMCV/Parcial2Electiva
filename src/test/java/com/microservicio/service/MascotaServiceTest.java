package com.microservicio.service;

import com.microservicio.model.Mascota;
import com.microservicio.repository.MascotaRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MascotaServiceTest {
    @Mock
    private MascotaRepository mascotaRepository;

    @InjectMocks
    private MascotaService mascotaService;

    @Test
    void listarMascotas() {
        Mascota mascota1 = new Mascota();
        mascota1.setNombre("Pancho");
        mascota1.setRaza("Pubg");

        Mascota mascota2 = new Mascota();
        mascota2.setNombre("Lupe");
        mascota2.setRaza("Pubg");

        when(mascotaRepository.findAll()).thenReturn(Arrays.asList(mascota1, mascota2));

        List<Mascota> mascotas = mascotaService.listarMascotas();

        assertEquals(2, mascotas.size());
    }
}
