package com.example.carpetasyarchivos;

import org.junit.jupiter.api.Test;

public class ArchivoTests {
    @Test
    public void crearArchivo(){
        ArchivoBase a1 = new ArchivoBase("Prueba1.txt",10);
        assert a1.getNombre().equals("Prueba1.txt");
        assert a1.getTamanio() == 10;
    }
}
