package com.microservicio.service;

import com.microservicio.model.Mascota;
import com.microservicio.repository.MascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class MascotaService {
    @Autowired
    private MascotaRepository mascotaRepository;

    public List<Mascota> listarMascotas()
    {
        return mascotaRepository.findAll();
    }

    public Optional<Mascota> obtenerMascota(Long id)
    {
        return mascotaRepository.findById(id);
    }

    public Mascota guardarMascota(Mascota usuario)
    {
        return mascotaRepository.save(usuario);
    }

    public void eliminarMascota(Long id)
    {
        mascotaRepository.deleteById(id);
    }
}
