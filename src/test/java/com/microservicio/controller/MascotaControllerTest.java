package com.microservicio.controller;

import com.microservicio.model.Mascota;
import com.microservicio.service.MascotaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;
import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.fasterxml.jackson.databind.ObjectMapper;

public class MascotaControllerTest {

    // private MascotaService mascotaService;
    // private MockMvc mockMvc;

    // @BeforeEach
    // void setup() {
    //     mascotaService = mock(MascotaService.class);
    //     MascotaController controller = new MascotaController(mascotaService);
    //     mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    // }

    // @Test
    // void testListarMascotas() throws Exception {
    //     when(mascotaService.listarMascotas()).thenReturn(
    //             Arrays.asList(new Mascota(1L, "Luna", "Poodle"))
    //     );

    //     mockMvc.perform(get("/mascotas"))
    //             .andExpect(status().isOk())
    //             .andExpect(jsonPath("$[0].nombre").value("Luna"));
    // }

    // @Test
    // void testObtenerMascotaPorId() throws Exception {
    //     when(mascotaService.obtenerMascota(1L)).thenReturn(
    //             Optional.of(new Mascota(1L, "Luna", "Poodle"))
    //     );

    //     mockMvc.perform(get("/mascotas/1"))
    //             .andExpect(status().isOk())
    //             .andExpect(jsonPath("$.nombre").value("Luna"));
    // }

    // @Test
    // void testGuardarMascota() throws Exception {
    //     Mascota mascota = new Mascota(1L, "Luna", "Poodle");
    //     when(mascotaService.guardarMascota(any())).thenReturn(mascota);

    //     mockMvc.perform(post("/mascotas")
    //             .contentType(MediaType.APPLICATION_JSON)
    //             .content(new ObjectMapper().writeValueAsString(mascota)))
    //             .andExpect(status().isOk())
    //             .andExpect(jsonPath("$.nombre").value("Luna"));
    // }

    // @Test
    // void testActualizarMascota() throws Exception {
    //     Long id = 1L;

    //     Mascota existente = new Mascota(id, "Luna", "Poodle");
    //     Mascota actualizada = new Mascota(id, "Luna", "Golden");

    //     when(mascotaService.obtenerMascota(id)).thenReturn(Optional.of(existente));
    //     when(mascotaService.guardarMascota(any())).thenReturn(actualizada);

    //     mockMvc.perform(put("/mascotas/{id}", id)
    //             .contentType(MediaType.APPLICATION_JSON)
    //             .content(new ObjectMapper().writeValueAsString(actualizada)))
    //             .andExpect(status().isOk())
    //             .andExpect(jsonPath("$.raza").value("Golden"));
    // }

    // @Test
    // void testEliminarMascota() throws Exception {
    //     Long id = 1L;
    //     doNothing().when(mascotaService).eliminarMascota(id);

    //     mockMvc.perform(delete("/mascotas/{id}", id))
    //             .andExpect(status().isOk());
    // }
}
