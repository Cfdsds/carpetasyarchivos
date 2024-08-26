package com.example.carpetasyarchivos;

import org.junit.jupiter.api.Test;

public class CarpetaTests {
    int tamanioCarpeta = 64 * 1024;
    @Test
    public void crearCarpeta() {
        ArchivoBase c1 = new ArchivoBase("Carpeta1");
        assert c1.getNombre().equals("Carpeta1");
        assert c1.getTamanio() == tamanioCarpeta;
    }
}
