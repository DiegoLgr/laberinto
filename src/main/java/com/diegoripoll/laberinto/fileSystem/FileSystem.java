package com.diegoripoll.laberinto.fileSystem;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@Service
public class FileSystem {
    public List<String> readFile(Path filePath) {
        try {
            return Files.readAllLines(filePath);
        } catch (IOException e) {
            throw new RuntimeException("Error reading file: " + e.getMessage(), e);
        }
    }

    public Path createFile(List<String> lines) {
        try {
            Path filePath = Files.createTempFile("laberinto", ".maze");
            var content = String.join("\n", lines);
            Files.write(filePath, content.getBytes());

            return filePath;
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }

    }
}

