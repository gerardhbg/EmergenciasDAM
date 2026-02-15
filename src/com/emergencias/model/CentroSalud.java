package com.emergencias.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CentroSalud {
    //Usamos @JsonProperty para decirle al programa qué campo del Json corresponde a cada atributo de CentroSalud
    @JsonProperty("Código")
    private String codigo;

    @JsonProperty("Nombre")
    private String nombre;

    @JsonProperty("Dirección")
    private String direccion;

    @JsonProperty("C.P.")
    private String cp;

    @JsonProperty("Municipio")
    private String municipio;

    @JsonProperty("Pedanía")
    private String pedania;

    @JsonProperty("Teléfono")
    private String telefono;

    @JsonProperty("Fax")
    private String fax;

    @JsonProperty("Email")
    private String email;

    @JsonProperty("URL Real")
    private String urlreal;

    @JsonProperty("URL Corta")
    private String urlcorta;

    @JsonProperty("Latitud")
    private String latitud;

    @JsonProperty("Longitud")
    private String longitud;

    @JsonProperty("Foto 1")
    private String foto1;

    @JsonProperty("Foto 2")
    private String foto2;

    public CentroSalud() {}

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCp() {
        return cp;
    }

    public String getMunicipio() {
        return municipio;
    }

    public String getPedania() {
        return pedania;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getFax() {
        return fax;
    }

    public String getEmail() {
        return email;
    }

    public String getUrlreal() {
        return urlreal;
    }

    public String getUrlcorta() {
        return urlcorta;
    }

    public String getLatitud() {
        return latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public String getFoto1() {
        return foto1;
    }
    public String getFoto2() {
        return foto2;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public void setPedania(String pedania) {
        this.pedania = pedania;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUrlreal(String urlreal) {
        this.urlreal = urlreal;
    }

    public void setUrlcorta(String urlcorta) {
        this.urlcorta = urlcorta;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public void setFoto1(String foto1) {
        this.foto1 = foto1;
    }

    public void setFoto2(String foto2) {
        this.foto2 = foto2;
    }

    @Override
    public String toString() {
        return "CentroSalud{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", cp='" + cp + '\'' +
                ", municipio='" + municipio + '\'' +
                ", pedania='" + pedania + '\'' +
                ", telefono='" + telefono + '\'' +
                ", fax='" + fax + '\'' +
                ", email='" + email + '\'' +
                ", urlreal='" + urlreal + '\'' +
                ", urlcorta='" + urlcorta + '\'' +
                ", latitud='" + latitud + '\'' +
                ", longitud='" + longitud + '\'' +
                ", foto1='" + foto1 + '\'' +
                ", foto2='" + foto2 + '\'' +
                '}';
    }
}
