package com.example.carpetasyarchivos;
import org.junit.jupiter.api.Test;


public class ArchivoBaseTests {
    @Test
    public void crearArchivoBase(){
        ArchivoBase a1 = new ArchivoBase("Prueba1.txt",10);
        assert a1.getNombre().equals("Prueba1.txt");
        assert a1.getTamanio() == 10;
    }

    @Test
    public void crearCapetaConUnArchivoDe10Kb(){	
        ArchivoBase c1 = new ArchivoBase("Carpeta1");  
        ArchivoBase a1 = new ArchivoBase("Prueba1.txt",10);
        assert c1.getTamanio() == 64 * 1024;
        assert a1.getTamanio() == 10;
    }
}