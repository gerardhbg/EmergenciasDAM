package com.emergencias.model;

public class UserData {
    String nombre;
    String apellidos;
    String telefono;

    // Constructor, getters/setters
    public UserData(String nombre, String apellidos, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        setTelefono(telefono);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (validarTelefono(telefono)) {
            this.telefono = telefono;
        } else {
            System.err.println("⚠️ Teléfono no válido. Debe contener exactamente 9 dígitos.");
            this.telefono = "No disponible";
        }
    }

    private boolean validarTelefono(String telefono) {
        return telefono != null && telefono.matches("\\d{9}");
    }

    @Override
    public String toString() {
        return "UserData{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}

