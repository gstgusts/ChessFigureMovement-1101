package com.company;

public class Position {
    private int positionX;
    private int positionY;

    public Position() {
    }

    public Position(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public boolean isValid() {
        return positionX <= 7 && positionX >= 0 && positionY <= 7 && positionY >= 0;
    }
}