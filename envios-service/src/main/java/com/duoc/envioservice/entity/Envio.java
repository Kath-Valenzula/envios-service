package com.duoc.envioservice.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;

@Entity
@Table(name = "ENVIO")
public class Envio {

    @Id
    @NotNull(message = "El ID no puede ser nulo")
    private Long id;

    @NotBlank(message = "El origen es obligatorio")
    private String origen;

    @NotBlank(message = "El destino es obligatorio")
    private String destino;

    @NotNull(message = "La fecha de envío es obligatoria")
    @Column(name = "fecha_envio")
    private LocalDate fechaEnvio;

    @NotNull(message = "El costo no puede ser nulo")
    @Positive(message = "El costo debe ser mayor que cero")
    private Double costo;

    public Envio() {}

    public Envio(Long id, String origen, String destino, LocalDate fechaEnvio, Double costo) {
        this.id = id;
        this.origen = origen;
        this.destino = destino;
        this.fechaEnvio = fechaEnvio;
        this.costo = costo;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getOrigen() { return origen; }
    public void setOrigen(String origen) { this.origen = origen; }

    public String getDestino() { return destino; }
    public void setDestino(String destino) { this.destino = destino; }

    public LocalDate getFechaEnvio() { return fechaEnvio; }
    public void setFechaEnvio(LocalDate fechaEnvio) { this.fechaEnvio = fechaEnvio; }

    public Double getCosto() { return costo; }
    public void setCosto(Double costo) { this.costo = costo; }
}
