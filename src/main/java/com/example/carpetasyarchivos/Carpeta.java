package com.example.carpetasyarchivos;

public class Carpeta extends ArchivoBase{
    int tamanioCarpeta = 64 * 1024;

    @Override
    public ArchivoBase(String nombre) {
        this.setNombre(nombre);
        this.tamanio = setTamanio();
    }

    @Override
    public void setTamanio() {
        this.tamanio = tamanioCarpeta;
    }

    @Override
    public int getTamanio() {
        return tamanio;
    }
}
