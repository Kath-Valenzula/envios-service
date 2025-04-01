package com.example.envios_service.model;

public class Envio {
    private int id;
    private String destino;
    private String estado;
    private String ubicacion;

    public Envio(int id, String destino, String estado, String ubicacion) {
        this.id = id;
        this.destino = destino;
        this.estado = estado;
        this.ubicacion = ubicacion;
    }

    // Getters y setters...
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
