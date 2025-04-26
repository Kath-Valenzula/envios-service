package com.duoc.envioservice.controller;

import com.duoc.envioservice.entity.Envio;
import com.duoc.envioservice.repository.EnvioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/envios")
public class EnvioController {

    @Autowired
    private EnvioRepository envioRepository;

    @GetMapping
    public List<Envio> obtenerTodosLosEnvios() {
        return envioRepository.findAll();
    }

    @GetMapping("/{id}")
    public Envio obtenerEnvioPorId(@PathVariable Long id) {
        return envioRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Envío no encontrado con ID: " + id
                ));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Envio crearEnvio(@Valid @RequestBody Envio nuevoEnvio) {
        return envioRepository.save(nuevoEnvio);
    }

    @PutMapping("/{id}")
    public Envio actualizarEnvio(@PathVariable Long id, @Valid @RequestBody Envio envioActualizado) {
        Envio envioExistente = envioRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Envío no encontrado con ID: " + id
                ));

        envioExistente.setOrigen(envioActualizado.getOrigen());
        envioExistente.setDestino(envioActualizado.getDestino());
        envioExistente.setFechaEnvio(envioActualizado.getFechaEnvio());
        envioExistente.setCosto(envioActualizado.getCosto());

        return envioRepository.save(envioExistente);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminarEnvio(@PathVariable Long id) {
        if (!envioRepository.existsById(id)) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Envío no encontrado con ID: " + id
            );
        }
        envioRepository.deleteById(id);
    }
}
