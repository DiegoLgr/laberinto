package com.diegoripoll.laberinto.MazeGenerator;

import com.diegoripoll.laberinto.maze.MazeGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

class MazeGeneratorTest {
    private final MazeGenerator mazeGenerator = new MazeGenerator();

    @Test
    void test() {
        int width = 10;
        int height = 10;

        assertNotEquals(mazeGenerator.generateRandomMaze(width, height), mazeGenerator.generateRandomMaze(width, height));
    }

}