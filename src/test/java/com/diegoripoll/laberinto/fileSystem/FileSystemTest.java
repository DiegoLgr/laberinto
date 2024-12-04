package com.diegoripoll.laberinto.fileSystem;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FileSystemTest {
    @Autowired
    FileSystem fileSystem;

    @Test
    void readFileFromSystem() {
        var input = List.of("xooox");
        List<String> output = this.fileSystem.readFile(fileSystem.createFile(input));
        assertEquals("xooox", output.get(0));
    }

}