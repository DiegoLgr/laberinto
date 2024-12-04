package com.diegoripoll.laberinto.maze;

public class Maze {
    private int width;
    private int height;
    protected boolean[][] cells;
    protected Cell start;
    protected Cell end;

    private Maze() {
    }

    public static Maze ofSize(int width, int height) {
        var maze = new Maze();
        maze.width = width;
        maze.height = height;
        maze.cells = new boolean[width][height];
        return maze;
    }

    public String toString(){
        var sb = new StringBuilder();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                sb.append(cells[j][i] ? "X" : "O");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}

