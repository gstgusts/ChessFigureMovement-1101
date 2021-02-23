package com.company;

import java.util.ArrayList;
import java.util.List;

public class Knight extends  Figure{
    @Override
    public List<Position> getPossiblePositions() {
        int currentPositionX = super.getPosition().getPositionX();
        int currentPositionY = super.getPosition().getPositionY();
        List<Position> knightPositions = new ArrayList<>();
        int [] newX = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int [] newY = { 1, 2, 2, 1, -1, -2, -2, -1 };
        for (int i = 0; i < newX.length ; i++) {
            Position newPosition = new Position(currentPositionX + newX [i], currentPositionY + newY[i]);
            if (newPosition.isValid()){
                knightPositions.add(newPosition);
            }
        }
        return knightPositions;
    }
}
