package com.sergiojavierre.lector;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class LectorTXT implements Lector {
    @Override
    public String lee(String recurso) {
        String texto = null;
        try {
            texto = new String(Files.readAllBytes(Path.of("recursos/" + recurso)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return texto;
    }
}
