package com.diegoripoll.laberinto.maze;

public class MazeGenerator {
    public Maze generateRandomMaze(int width, int height) {
        var maze = Maze.ofSize(width, height);
        maze.start = randomCell(width, height);
        maze.end = randomCell(width, height);
        for (var row : maze.cells) {
            for (int j = 0;  j<row.length; j++) {
                row[j] = Math.random() < 0.5;
            }
        }
        return maze;
    }

    private Cell randomCell(int width, int height) {
        var x = (int) (Math.random() * width);
        var y = (int) (Math.random() * height);
        return new Cell(x, y);
    }
}
