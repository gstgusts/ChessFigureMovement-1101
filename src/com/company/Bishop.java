package com.company;

import java.util.ArrayList;
import java.util.List;

public class Bishop extends Figure {

    private List<Position> bishopPositions = new ArrayList<>();

    @Override
    public List<Position> getPossiblePositions() {

        bishopPositions.clear();

        int posX = getPosition().getPositionX();
        int posY = getPosition().getPositionY();

        for (int i = 1; i < 8; i++) {
            addPosition(posX + i, posY + i);
            addPosition(posX - i, posY + i);
            addPosition(posX - i, posY - i);
            addPosition(posX + i, posY - i);
        }
        return bishopPositions;
    }

    private void addPosition(int x, int y) {
        Position position = new Position(x, y);
        if (position.isValid())
            bishopPositions.add(position);
    }
}