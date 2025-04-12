package com.microservicio.controller;

import com.microservicio.model.Mascota;
import com.microservicio.service.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;



@RestController
@RequestMapping("/mascotas")
public class MascotaController {
    
    private MascotaService mascotaService;

    public MascotaController(MascotaService petsService){
        this.mascotaService = petsService;
    }

    @GetMapping
    public List<Mascota> listarmascotas() {
        return mascotaService.listarMascotas();
    }

    @GetMapping("/{id}")
    public Optional<Mascota>obtenerMascota(@PathVariable Long id) {
        return mascotaService.obtenerMascota(id);
    }

    @PostMapping
    public Mascota guardarMascota(@RequestBody Mascota mascota) {
        return mascotaService.guardarMascota(mascota);
    }
    
    @DeleteMapping("/{id}")
    public void eliminarMascota(@PathVariable Long id){
        mascotaService.eliminarMascota(id);
    }

    @PutMapping("/{id}")
    public Mascota actualizarMascota(@PathVariable Long id, @RequestBody Mascota mascotaActualizada) {
        Optional<Mascota> mascotaOptional = mascotaService.obtenerMascota(id);
        if (mascotaOptional.isPresent()) {
            Mascota mascotaExistente = mascotaOptional.get();
            mascotaExistente.setNombre(mascotaActualizada.getNombre());
            mascotaExistente.setRaza(mascotaActualizada.getRaza());
            return mascotaService.guardarMascota(mascotaExistente);
        } else {
            throw new RuntimeException("Mascota con ID " + id + " no encontrada");
        }
    }
    
    
}
