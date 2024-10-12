package com.example.recyclerview;

public class item {
    public String Nombre;
    public String puntos;
    public String juegosJugados;
    public String JuegosGanados;
    public String JuegosEmpatados;
    public String contactoE;

    public item(String puntos, String nombre, String juegosJugados, String juegosGanados, String juegosEmpatados, String contactoE) {
        this.puntos = puntos;
        Nombre = nombre;
        this.juegosJugados = juegosJugados;
        JuegosGanados = juegosGanados;
        JuegosEmpatados = juegosEmpatados;
        this.contactoE = contactoE;
    }

    public String getContactoE() {
        return contactoE;
    }

    public void setContactoE(String contactoE) {
        this.contactoE = contactoE;
    }

    public String getJuegosEmpatados() {
        return JuegosEmpatados;
    }

    public void setJuegosEmpatados(String juegosEmpatados) {
        JuegosEmpatados = juegosEmpatados;
    }

    public String getJuegosGanados() {
        return JuegosGanados;
    }

    public void setJuegosGanados(String juegosGanados) {
        JuegosGanados = juegosGanados;
    }

    public String getJuegosJugados() {
        return juegosJugados;
    }

    public void setJuegosJugados(String juegosJugados) {
        this.juegosJugados = juegosJugados;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getPuntos() {
        return puntos;
    }

    public void setPuntos(String puntos) {
        this.puntos = puntos;
    }
}
