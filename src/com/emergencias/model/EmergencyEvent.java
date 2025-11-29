package com.emergencias.model;

public class EmergencyEvent {
    private String tipo;
    private String ubicacion;
    private double latitud;
    private double longitud;
    private String nivelGravedad;

    // Constructor, getters/setters

    public EmergencyEvent(String tipo, String ubicacion, double latitud, double longitud, String nivelGravedad) {
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.nivelGravedad = nivelGravedad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getNivelGravedad() {
        return nivelGravedad;
    }

    public void setNivelGravedad(String nivelGravedad) {
        this.nivelGravedad = nivelGravedad;
    }

    @Override
    public String toString() {
        return "EmergencyEvent{" +
                "tipo='" + tipo + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", latitud=" + latitud +
                ", longitud=" + longitud +
                ", nivelGravedad='" + nivelGravedad + '\'' +
                '}';
    }
}