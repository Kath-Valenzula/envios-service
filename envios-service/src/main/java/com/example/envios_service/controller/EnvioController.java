package com.example.envios_service.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.envios_service.model.Envio;

@RestController
@RequestMapping("/envios")
public class EnvioController {
    private final List<Envio> envios = new ArrayList<>();

    public EnvioController() {
        envios.add(new Envio(1, "Chile", "En tránsito", "Santiago"));
        envios.add(new Envio(2, "Argentina", "Entregado", "Buenos Aires"));
        envios.add(new Envio(3, "Perú", "Pendiente", "Lima"));
    }

    @GetMapping
    public List<Envio> getEnvios() {
        return envios;
    }

    @GetMapping("/{id}")
    public Envio getEnvioById(@PathVariable int id) {
        return envios.stream()
                     .filter(envio -> envio.getId() == id)
                     .findFirst()
                     .orElse(null);
    }
}
